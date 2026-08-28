import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvf {
   String c_ = "AngerTime";
   String d_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(uk $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dfb $$0, uk $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arn) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bue $$3 = ((arn)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bvc $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof com $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arn $$0, boolean $$1) {
      bva $$2 = this.m();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eH()) && $$3 != null && $$0.a($$3) instanceof bvc) {
         this.aa_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cH())) {
            this.a($$2.cH());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ar() != bul.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.aa_();
            }
         }
      }
   }

   default boolean a_(bva $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ar() == bul.by && this.a_($$0.dX()) ? true : $$0.cH().equals(this.b());
      }
   }

   default boolean a_(dfb $$0) {
      return $$0.ac().b(dex.O) && this.ae_() && this.b() == null;
   }

   default boolean ae_() {
      return this.a() > 0;
   }

   default void a_(com $$0) {
      if ($$0.dX().ac().b(dex.N)) {
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
   bva es();

   void a(@Nullable bva var1);

   void c(@Nullable com var1);

   void h(@Nullable bva var1);

   boolean c(bva var1);

   @Nullable
   bva m();
}
