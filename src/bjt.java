import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bjt {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(qw $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cqb $$0, qw $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof akt) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            biw $$3 = ((akt)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bjo) {
                  this.a((bjo)$$3);
               }

               if ($$3.ag() == bja.bt) {
                  this.c((cca)$$3);
               }
            }
         }
      }
   }

   default void a(akt $$0, boolean $$1) {
      bjm $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ev()) && $$3 != null && $$0.a($$3) instanceof bjo) {
         this.U_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cv())) {
            this.a($$2.cv());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ag() != bja.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.U_();
            }
         }
      }
   }

   default boolean a_(bjm $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ag() == bja.bt && this.a_($$0.dL()) ? true : $$0.cv().equals(this.b());
      }
   }

   default boolean a_(cqb $$0) {
      return $$0.X().b(cpx.K) && this.X_() && this.b() == null;
   }

   default boolean X_() {
      return this.a() > 0;
   }

   default void a_(cca $$0) {
      if ($$0.dL().X().b(cpx.J)) {
         if ($$0.cv().equals(this.b())) {
            this.U_();
         }
      }
   }

   default void Y_() {
      this.U_();
      this.c();
   }

   default void U_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bjm eg();

   void a(@Nullable bjm var1);

   void c(@Nullable cca var1);

   void h(@Nullable bjm var1);

   boolean c(bjm var1);

   @Nullable
   bjm q();
}
