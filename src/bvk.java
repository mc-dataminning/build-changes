import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvk {
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

   default void a(dgg $$0, tq $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arc) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            buj $$3 = ((arc)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bvh $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cov $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arc $$0, boolean $$1) {
      bvf $$2 = this.O_();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eF()) && $$3 != null && $$0.a($$3) instanceof bvh) {
         this.ae_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != buq.bR || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.ae_();
            }
         }
      }
   }

   default boolean a(bvf $$0, arc $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == buq.bR && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(arc $$0) {
      return $$0.O().b(dgc.P) && this.ac_() && this.b() == null;
   }

   default boolean ac_() {
      return this.a() > 0;
   }

   default void a_(arc $$0, cov $$1) {
      if ($$0.O().b(dgc.O)) {
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
   bvf eq();

   void a(@Nullable bvf var1);

   void c(@Nullable cov var1);

   void h(@Nullable bvf var1);

   boolean c(bvf var1);

   @Nullable
   bvf O_();
}
