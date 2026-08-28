import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwb extends bvg<cmi> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iz e;
   private long f;
   private int g;
   private final List<iz> h = Lists.newArrayList();

   public bwb() {
      super(ImmutableMap.of(ccr.n, ccs.b, ccr.m, ccs.b, ccr.f, ccs.a));
   }

   protected boolean a(are $$0, cmi $$1) {
      if (!$$0.ab().b(dbs.c)) {
         return false;
      } else if ($$1.gB().b() != cml.g) {
         return false;
      } else {
         iz.a $$2 = $$1.dp().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new iz($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private iz a(are $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(iz $$0, are $$1) {
      dsa $$2 = $$1.a_($$0);
      dex $$3 = $$2.b();
      dex $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dgs && ((dgs)$$3).h($$2) || $$2.i() && $$4 instanceof dhu;
   }

   protected void a(are $$0, cmi $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dS().a(ccr.n, new bvj(this.e));
         $$1.dS().a(ccr.m, new ccu(new bvj(this.e), 0.5F, 1));
      }
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      $$1.dS().b(ccr.n);
      $$1.dS().b(ccr.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dsa $$3 = $$0.a_(this.e);
            dex $$4 = $$3.b();
            dex $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dgs && ((dgs)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dhu && $$1.gK()) {
               brb $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cun $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awx.bx) && $$8.g() instanceof csl $$10) {
                     dsa $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dwt.i, this.e, dwt.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avz.gm, awa.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cun.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dgs && !((dgs)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dS().a(ccr.m, new ccu(new bvj(this.e), 0.5F, 1));
                  $$1.dS().a(ccr.n, new bvj(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(are $$0, cmi $$1, long $$2) {
      return this.g < 200;
   }
}
