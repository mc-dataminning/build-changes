import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface btt {
   String c_ = "AngerTime";
   String d_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(ub $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dcw $$0, ub $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqu) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bsr $$3 = ((aqu)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof btp $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cmx $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(aqu $$0, boolean $$1) {
      btn $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof btp) {
         this.Z_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cA())) {
            this.a($$2.cA());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.am() != bsx.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.Z_();
            }
         }
      }
   }

   default boolean a_(btn $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.am() == bsx.by && this.a_($$0.dP()) ? true : $$0.cA().equals(this.b());
      }
   }

   default boolean a_(dcw $$0) {
      return $$0.ab().b(dcs.O) && this.ad_() && this.b() == null;
   }

   default boolean ad_() {
      return this.a() > 0;
   }

   default void a_(cmx $$0) {
      if ($$0.dP().ab().b(dcs.N)) {
         if ($$0.cA().equals(this.b())) {
            this.Z_();
         }
      }
   }

   default void ae_() {
      this.Z_();
      this.c();
   }

   default void Z_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   btn ej();

   void a(@Nullable btn var1);

   void c(@Nullable cmx var1);

   void h(@Nullable btn var1);

   boolean c(btn var1);

   @Nullable
   btn p();
}
