import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bjn {
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

   default void a(cpv $$0, qy $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof akr) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            biq $$3 = ((akr)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bji) {
                  this.a((bji)$$3);
               }

               if ($$3.ag() == biu.bt) {
                  this.c((cbu)$$3);
               }
            }
         }
      }
   }

   default void a(akr $$0, boolean $$1) {
      bjg $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ev()) && $$3 != null && $$0.a($$3) instanceof bji) {
         this.U_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != biu.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.U_();
            }
         }
      }
   }

   default boolean a_(bjg $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == biu.bt && this.a_($$0.dL()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(cpv $$0) {
      return $$0.X().b(cpr.K) && this.X_() && this.b() == null;
   }

   default boolean X_() {
      return this.a() > 0;
   }

   default void a_(cbu $$0) {
      if ($$0.dL().X().b(cpr.J)) {
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
   bjg eg();

   void a(@Nullable bjg var1);

   void c(@Nullable cbu var1);

   void h(@Nullable bjg var1);

   boolean c(bjg var1);

   @Nullable
   bjg q();
}
