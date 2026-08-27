import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bjd {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(qs $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cpk $$0, qs $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aki) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            big $$3 = ((aki)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof biy) {
                  this.a((biy)$$3);
               }

               if ($$3.ag() == bik.bt) {
                  this.c((cbl)$$3);
               }
            }
         }
      }
   }

   default void a(aki $$0, boolean $$1) {
      biw $$2 = this.j();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eu()) && $$3 != null && $$0.a($$3) instanceof biy) {
         this.O_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != bik.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.O_();
            }
         }
      }
   }

   default boolean a_(biw $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == bik.bt && this.a_($$0.dK()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(cpk $$0) {
      return $$0.X().b(cpg.K) && this.S_() && this.b() == null;
   }

   default boolean S_() {
      return this.a() > 0;
   }

   default void a_(cbl $$0) {
      if ($$0.dK().X().b(cpg.J)) {
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
   biw ef();

   void a(@Nullable biw var1);

   void c(@Nullable cbl var1);

   void h(@Nullable biw var1);

   boolean c(biw var1);

   @Nullable
   biw j();
}
