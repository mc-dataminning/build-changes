import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bvc extends buh<clj> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private io e;
   private long f;
   private int g;
   private final List<io> h = Lists.newArrayList();

   public bvc() {
      super(ImmutableMap.of(cbs.n, cbt.b, cbs.m, cbt.b, cbs.f, cbt.a));
   }

   protected boolean a(aqm $$0, clj $$1) {
      if (!$$0.aa().b(dat.c)) {
         return false;
      } else if ($$1.gA().b() != clm.g) {
         return false;
      } else {
         io.a $$2 = $$1.dp().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new io($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private io a(aqm $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(io $$0, aqm $$1) {
      drb $$2 = $$1.a_($$0);
      ddy $$3 = $$2.b();
      ddy $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dft && ((dft)$$3).h($$2) || $$2.i() && $$4 instanceof dgv;
   }

   protected void a(aqm $$0, clj $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dS().a(cbs.n, new buk(this.e));
         $$1.dS().a(cbs.m, new cbv(new buk(this.e), 0.5F, 1));
      }
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      $$1.dS().b(cbs.n);
      $$1.dS().b(cbs.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            drb $$3 = $$0.a_(this.e);
            ddy $$4 = $$3.b();
            ddy $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dft && ((dft)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dgv && $$1.gJ()) {
               bqd $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cto $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awe.by) && $$8.g() instanceof crm $$10) {
                     drb $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dvu.i, this.e, dvu.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avh.gm, avi.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cto.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dft && !((dft)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dS().a(cbs.m, new cbv(new buk(this.e), 0.5F, 1));
                  $$1.dS().a(cbs.n, new buk(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqm $$0, clj $$1, long $$2) {
      return this.g < 200;
   }
}
