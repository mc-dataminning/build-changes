import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bva {
   String c_ = "AngerTime";
   String d_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(uj $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dev $$0, uj $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arm) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            btz $$3 = ((arm)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bux $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof coh $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arm $$0, boolean $$1) {
      buv $$2 = this.m();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eH()) && $$3 != null && $$0.a($$3) instanceof bux) {
         this.aa_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cH())) {
            this.a($$2.cH());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != bug.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.aa_();
            }
         }
      }
   }

   default boolean a_(buv $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == bug.by && this.a_($$0.dX()) ? true : $$0.cH().equals(this.b());
      }
   }

   default boolean a_(dev $$0) {
      return $$0.ac().b(der.O) && this.ae_() && this.b() == null;
   }

   default boolean ae_() {
      return this.a() > 0;
   }

   default void a_(coh $$0) {
      if ($$0.dX().ac().b(der.N)) {
         if ($$0.cH().equals(this.b())) {
            this.aa_();
         }
      }
   }

   default void af_() {
      this.aa_();
      this.c();
   }

   default void aa_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   buv es();

   void a(@Nullable buv var1);

   void c(@Nullable coh var1);

   void h(@Nullable buv var1);

   boolean c(buv var1);

   @Nullable
   buv m();
}
