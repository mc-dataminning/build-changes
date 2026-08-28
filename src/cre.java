import java.util.Optional;
import javax.annotation.Nullable;

public class cre extends cqz {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final brl u = new brz(1) {
      @Override
      public boolean b(int $$0, cvs $$1) {
         return $$1.a(axe.aW);
      }

      @Override
      public int al_() {
         return 1;
      }
   };
   private final cre.a v;
   private final crm w;
   private final crl x;

   public cre(int $$0, brl $$1) {
      this($$0, $$1, new csv(3), crm.a);
   }

   public cre(int $$0, brl $$1, crl $$2, crm $$3) {
      super(csi.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cre.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      if (!$$0.dS().B) {
         cvs $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cnx $$0) {
      return a(this.w, $$0, dho.fO);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.K() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jo<bsw> $$0) {
      return $$0 == null ? 0 : lv.d.t().a($$0) + 1;
   }

   @Nullable
   public static jo<bsw> e(int $$0) {
      return $$0 == 0 ? null : lv.d.t().a($$0 - 1);
   }

   @Nullable
   public jo<bsw> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jo<bsw> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jo<bsw>> $$0, Optional<jo<bsw>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dej::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   class a extends csw {
      public a(final brl $$0, final int $$1, final int $$2, final int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvs $$0) {
         return $$0.a(axe.aW);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
