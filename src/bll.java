import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bll extends bkq<cba> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private gu e;
   private long f;
   private int g;
   private final List<gu> h = Lists.newArrayList();

   public bll() {
      super(ImmutableMap.of(bsa.n, bsb.b, bsa.m, bsb.b, bsa.f, bsb.a));
   }

   protected boolean a(akk $$0, cba $$1) {
      if (!$$0.X().b(cpi.c)) {
         return false;
      } else if ($$1.gk().b() != cbd.g) {
         return false;
      } else {
         gu.a $$2 = $$1.dk().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dp() + (double)$$3, $$1.dr() + (double)$$4, $$1.dv() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new gu($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private gu a(akk $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.y_().a(this.h.size()));
   }

   private boolean a(gu $$0, akk $$1) {
      dfa $$2 = $$1.a_($$0);
      csm $$3 = $$2.b();
      csm $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cud && ((cud)$$3).h($$2) || $$2.i() && $$4 instanceof cvf;
   }

   protected void a(akk $$0, cba $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dM().a(bsa.n, new bkt(this.e));
         $$1.dM().a(bsa.m, new bsd(new bkt(this.e), 0.5F, 1));
      }
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      $$1.dM().b(bsa.n);
      $$1.dM().b(bsa.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      if (this.e == null || this.e.a($$1.di(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dfa $$3 = $$0.a_(this.e);
            csm $$4 = $$3.b();
            csm $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cud && ((cud)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cvf && $$1.gt()) {
               bgx $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  ciy $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(apt.aU) && $$8.d() instanceof cgr $$10) {
                     dfa $$11 = $$10.e().n();
                     $$0.b(this.e, $$11);
                     $$0.a(djk.i, this.e, djk.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aow.fi, aox.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, ciy.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cud && !((cud)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dM().a(bsa.m, new bsd(new bkt(this.e), 0.5F, 1));
                  $$1.dM().a(bsa.n, new bkt(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(akk $$0, cba $$1, long $$2) {
      return this.g < 200;
   }
}
