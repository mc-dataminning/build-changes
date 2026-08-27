import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface blf {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(rz $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(crs $$0, rz $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof ama) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bki $$3 = ((ama)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bla) {
                  this.a((bla)$$3);
               }

               if ($$3.ag() == bkm.bt) {
                  this.c((cdm)$$3);
               }
            }
         }
      }
   }

   default void a(ama $$0, boolean $$1) {
      bky $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ev()) && $$3 != null && $$0.a($$3) instanceof bla) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != bkm.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bky $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == bkm.bt && this.a_($$0.dL()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(crs $$0) {
      return $$0.X().b(cro.O) && this.Y_() && this.b() == null;
   }

   default boolean Y_() {
      return this.a() > 0;
   }

   default void a_(cdm $$0) {
      if ($$0.dL().X().b(cro.N)) {
         if ($$0.cv().equals(this.b())) {
            this.V_();
         }
      }
   }

   default void Z_() {
      this.V_();
      this.c();
   }

   default void V_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bky eg();

   void a(@Nullable bky var1);

   void c(@Nullable cdm var1);

   void h(@Nullable bky var1);

   boolean c(bky var1);

   @Nullable
   bky q();
}
