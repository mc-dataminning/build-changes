import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bjp {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(qy $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cpx $$0, qy $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aks) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bis $$3 = ((aks)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bjk) {
                  this.a((bjk)$$3);
               }

               if ($$3.ag() == biw.bt) {
                  this.c((cbw)$$3);
               }
            }
         }
      }
   }

   default void a(aks $$0, boolean $$1) {
      bji $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ev()) && $$3 != null && $$0.a($$3) instanceof bjk) {
         this.U_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != biw.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.U_();
            }
         }
      }
   }

   default boolean a_(bji $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == biw.bt && this.a_($$0.dL()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(cpx $$0) {
      return $$0.X().b(cpt.K) && this.X_() && this.b() == null;
   }

   default boolean X_() {
      return this.a() > 0;
   }

   default void a_(cbw $$0) {
      if ($$0.dL().X().b(cpt.J)) {
         if ($$0.cv().equals(this.b())) {
            this.U_();
         }
      }
   }

   default void Y_() {
      this.U_();
      this.c();
   }

   default void U_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bji eg();

   void a(@Nullable bji var1);

   void c(@Nullable cbw var1);

   void h(@Nullable bji var1);

   boolean c(bji var1);

   @Nullable
   bji q();
}
