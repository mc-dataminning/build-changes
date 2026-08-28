import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvn {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(tq $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dgj $$0, tq $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof ard) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bum $$3 = ((ard)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bvk $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof coy $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(ard $$0, boolean $$1) {
      bvi $$2 = this.O_();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eE()) && $$3 != null && $$0.a($$3) instanceof bvk) {
         this.ae_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != but.bR || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.ae_();
            }
         }
      }
   }

   default boolean a(bvi $$0, ard $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == but.bR && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(ard $$0) {
      return $$0.O().b(dgf.P) && this.ac_() && this.b() == null;
   }

   default boolean ac_() {
      return this.a() > 0;
   }

   default void a_(ard $$0, coy $$1) {
      if ($$0.O().b(dgf.O)) {
         if ($$1.cG().equals(this.b())) {
            this.ae_();
         }
      }
   }

   default void ad_() {
      this.ae_();
      this.c();
   }

   default void ae_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bvi ep();

   void a(@Nullable bvi var1);

   void c(@Nullable coy var1);

   void h(@Nullable bvi var1);

   boolean c(bvi var1);

   @Nullable
   bvi O_();
}
