import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bkq {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(rt $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cqz $$0, rt $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof alq) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bjt $$3 = ((alq)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bkl) {
                  this.a((bkl)$$3);
               }

               if ($$3.ag() == bjx.bt) {
                  this.c((ccx)$$3);
               }
            }
         }
      }
   }

   default void a(alq $$0, boolean $$1) {
      bkj $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ev()) && $$3 != null && $$0.a($$3) instanceof bkl) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != bjx.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bkj $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == bjx.bt && this.a_($$0.dL()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(cqz $$0) {
      return $$0.X().b(cqv.L) && this.Y_() && this.b() == null;
   }

   default boolean Y_() {
      return this.a() > 0;
   }

   default void a_(ccx $$0) {
      if ($$0.dL().X().b(cqv.K)) {
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
   bkj eg();

   void a(@Nullable bkj var1);

   void c(@Nullable ccx var1);

   void h(@Nullable bkj var1);

   boolean c(bkj var1);

   @Nullable
   bkj q();
}
