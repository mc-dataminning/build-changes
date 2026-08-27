import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bji {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(qu $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cpq $$0, qu $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof akn) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bil $$3 = ((akn)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bjd) {
                  this.a((bjd)$$3);
               }

               if ($$3.ag() == bip.bt) {
                  this.c((cbp)$$3);
               }
            }
         }
      }
   }

   default void a(akn $$0, boolean $$1) {
      bjb $$2 = this.j();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eu()) && $$3 != null && $$0.a($$3) instanceof bjd) {
         this.O_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != bip.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.O_();
            }
         }
      }
   }

   default boolean a_(bjb $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == bip.bt && this.a_($$0.dK()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(cpq $$0) {
      return $$0.X().b(cpm.K) && this.S_() && this.b() == null;
   }

   default boolean S_() {
      return this.a() > 0;
   }

   default void a_(cbp $$0) {
      if ($$0.dK().X().b(cpm.J)) {
         if ($$0.cv().equals(this.b())) {
            this.O_();
         }
      }
   }

   default void T_() {
      this.O_();
      this.c();
   }

   default void O_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bjb ef();

   void a(@Nullable bjb var1);

   void c(@Nullable cbp var1);

   void h(@Nullable bjb var1);

   boolean c(bjb var1);

   @Nullable
   bjb j();
}
