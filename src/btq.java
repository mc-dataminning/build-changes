import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface btq {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(ur $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dbt $$0, ur $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arb) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bsp $$3 = ((arb)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof btm $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cms $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arb $$0, boolean $$1) {
      btk $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eB()) && $$3 != null && $$0.a($$3) instanceof btm) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cz())) {
            this.a($$2.cz());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ak() != bsv.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(btk $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ak() == bsv.by && this.a_($$0.dP()) ? true : $$0.cz().equals(this.b());
      }
   }

   default boolean a_(dbt $$0) {
      return $$0.ab().b(dbp.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cms $$0) {
      if ($$0.dP().ab().b(dbp.N)) {
         if ($$0.cz().equals(this.b())) {
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
   btk em();

   void a(@Nullable btk var1);

   void c(@Nullable cms var1);

   void h(@Nullable btk var1);

   boolean c(btk var1);

   @Nullable
   btk p();
}
