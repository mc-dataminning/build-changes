import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class btr extends bsw<cjy> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private im e;
   private long f;
   private int g;
   private final List<im> h = Lists.newArrayList();

   public btr() {
      super(ImmutableMap.of(cah.n, cai.b, cah.m, cai.b, cah.f, cai.a));
   }

   protected boolean a(aqe $$0, cjy $$1) {
      if (!$$0.aa().b(czq.c)) {
         return false;
      } else if ($$1.gA().b() != ckb.g) {
         return false;
      } else {
         im.a $$2 = $$1.dn().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.ds() + (double)$$3, $$1.du() + (double)$$4, $$1.dy() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new im($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private im a(aqe $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(im $$0, aqe $$1) {
      dpy $$2 = $$1.a_($$0);
      dcv $$3 = $$2.b();
      dcv $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof deq && ((deq)$$3).h($$2) || $$2.i() && $$4 instanceof dfs;
   }

   protected void a(aqe $$0, cjy $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dQ().a(cah.n, new bsz(this.e));
         $$1.dQ().a(cah.m, new cak(new bsz(this.e), 0.5F, 1));
      }
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      $$1.dQ().b(cah.n);
      $$1.dQ().b(cah.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dl(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dpy $$3 = $$0.a_(this.e);
            dcv $$4 = $$3.b();
            dcv $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof deq && ((deq)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dfs && $$1.gJ()) {
               boz $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  csd $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.d() && $$8.a(avw.aZ) && $$8.f() instanceof cqb $$10) {
                     dpy $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dur.i, this.e, dur.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), auz.gh, ava.e, 1.0F, 1.0F);
                     $$8.g(1);
                     if ($$8.d()) {
                        $$6.a($$7, csd.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof deq && !((deq)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dQ().a(cah.m, new cak(new bsz(this.e), 0.5F, 1));
                  $$1.dQ().a(cah.n, new bsz(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqe $$0, cjy $$1, long $$2) {
      return this.g < 200;
   }
}
