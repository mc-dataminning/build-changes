import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bom {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sw $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cvn $$0, sw $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aov) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bno $$3 = ((aov)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof boi) {
                  this.a((boi)$$3);
               }

               if ($$3.ai() == bnu.bw) {
                  this.c((chh)$$3);
               }
            }
         }
      }
   }

   default void a(aov $$0, boolean $$1) {
      bog $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ex()) && $$3 != null && $$0.a($$3) instanceof boi) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bnu.bw || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(bog $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bnu.bw && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(cvn $$0) {
      return $$0.Z().b(cvj.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(chh $$0) {
      if ($$0.dM().Z().b(cvj.N)) {
         if ($$0.cw().equals(this.b())) {
            this.X_();
         }
      }
   }

   default void ab_() {
      this.X_();
      this.c();
   }

   default void X_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bog ei();

   void a(@Nullable bog var1);

   void c(@Nullable chh var1);

   void h(@Nullable bog var1);

   boolean c(bog var1);

   @Nullable
   bog q();
}
