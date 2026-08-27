import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bmr {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sn $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cto $$0, sn $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof and) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            blu $$3 = ((and)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bmm) {
                  this.a((bmm)$$3);
               }

               if ($$3.ai() == bly.bv) {
                  this.c((cfh)$$3);
               }
            }
         }
      }
   }

   default void a(and $$0, boolean $$1) {
      bmk $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ew()) && $$3 != null && $$0.a($$3) instanceof bmm) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bly.bv || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(bmk $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bly.bv && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(cto $$0) {
      return $$0.Z().b(ctk.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cfh $$0) {
      if ($$0.dM().Z().b(ctk.N)) {
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
   bmk eh();

   void a(@Nullable bmk var1);

   void c(@Nullable cfh var1);

   void h(@Nullable bmk var1);

   boolean c(bmk var1);

   @Nullable
   bmk q();
}
