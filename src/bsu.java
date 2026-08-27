import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bsu {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(uk $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dca $$0, uk $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqt) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            brv $$3 = ((aqt)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bsq) {
                  this.a((bsq)$$3);
               }

               if ($$3.ak() == bsb.bE) {
                  this.c((cly)$$3);
               }
            }
         }
      }
   }

   default void a_(aqt $$0, boolean $$1) {
      bso $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eJ()) && $$3 != null && $$0.a($$3) instanceof bsq) {
         this.W_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cE())) {
            this.a($$2.cE());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ak() != bsb.bE || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.W_();
            }
         }
      }
   }

   default boolean a_(bso $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ak() == bsb.bE && this.a_($$0.dU()) ? true : $$0.cE().equals(this.b());
      }
   }

   default boolean a_(dca $$0) {
      return $$0.ab().b(dbw.P) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cly $$0) {
      if ($$0.dU().ab().b(dbw.O)) {
         if ($$0.cE().equals(this.b())) {
            this.W_();
         }
      }
   }

   default void ab_() {
      this.W_();
      this.c();
   }

   default void W_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bso eu();

   void a(@Nullable bso var1);

   void c(@Nullable cly var1);

   void h(@Nullable bso var1);

   boolean c(bso var1);

   @Nullable
   bso p();
}
