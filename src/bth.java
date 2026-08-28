import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bth {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(tx $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dcf $$0, tx $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqm) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bsg $$3 = ((aqm)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof btd $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cmk $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(aqm $$0, boolean $$1) {
      btb $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof btd) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cA())) {
            this.a($$2.cA());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.al() != bsm.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(btb $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.al() == bsm.by && this.a_($$0.dQ()) ? true : $$0.cA().equals(this.b());
      }
   }

   default boolean a_(dcf $$0) {
      return $$0.ab().b(dcb.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cmk $$0) {
      if ($$0.dQ().ab().b(dcb.N)) {
         if ($$0.cA().equals(this.b())) {
            this.V_();
         }
      }
   }

   default void aa_() {
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
   btb ej();

   void a(@Nullable btb var1);

   void c(@Nullable cmk var1);

   void h(@Nullable btb var1);

   boolean c(btb var1);

   @Nullable
   btb p();
}
