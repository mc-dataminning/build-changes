import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bwc {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(um $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dgz $$0, um $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arx) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bvb $$3 = ((arx)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bvz $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cpo $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arx $$0, boolean $$1) {
      bvx $$2 = this.O_();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eF()) && $$3 != null && $$0.a($$3) instanceof bvz) {
         this.af_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != bvi.bS || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.af_();
            }
         }
      }
   }

   default boolean a(bvx $$0, arx $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == bvi.bS && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(arx $$0) {
      return $$0.O().b(dgv.P) && this.ad_() && this.b() == null;
   }

   default boolean ad_() {
      return this.a() > 0;
   }

   default void a_(arx $$0, cpo $$1) {
      if ($$0.O().b(dgv.O)) {
         if ($$1.cG().equals(this.b())) {
            this.af_();
         }
      }
   }

   default void ae_() {
      this.af_();
      this.c();
   }

   default void af_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bvx eq();

   void a(@Nullable bvx var1);

   void c(@Nullable cpo var1);

   void h(@Nullable bvx var1);

   boolean c(bvx var1);

   @Nullable
   bvx O_();
}
