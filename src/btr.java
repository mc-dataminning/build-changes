import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface btr {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(ua $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dcu $$0, ua $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqt) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bsq $$3 = ((aqt)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof btn $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cmv $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(aqt $$0, boolean $$1) {
      btl $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof btn) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cA())) {
            this.a($$2.cA());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.am() != bsw.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(btl $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.am() == bsw.by && this.a_($$0.dQ()) ? true : $$0.cA().equals(this.b());
      }
   }

   default boolean a_(dcu $$0) {
      return $$0.ab().b(dcq.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cmv $$0) {
      if ($$0.dQ().ab().b(dcq.N)) {
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
   btl ej();

   void a(@Nullable btl var1);

   void c(@Nullable cmv var1);

   void h(@Nullable btl var1);

   boolean c(btl var1);

   @Nullable
   btl p();
}
