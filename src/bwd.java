import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bwd {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(tq $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dgz $$0, tq $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof ard $$2) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$4 = $$1.a("AngryAt");
            this.a($$4);
            if ($$2.b($$4) instanceof bvy $$6) {
               this.h($$6);
            }
         }
      }
   }

   default void a(ard $$0, boolean $$1) {
      bvy $$2 = this.f();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eF()) && $$3 != null && $$0.b($$3) instanceof bwa) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cF())) {
            this.a($$2.cF());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != bvi.bR || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a(bvy $$0, ard $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == bvi.bR && this.a_($$1) ? true : $$0.cF().equals(this.b());
      }
   }

   default boolean a_(ard $$0) {
      return $$0.O().b(dgv.P) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(ard $$0, cpr $$1) {
      if ($$0.O().b(dgv.O)) {
         if ($$1.cF().equals(this.b())) {
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
   bvy ep();

   void a(@Nullable bvy var1);

   void h(@Nullable bvy var1);

   boolean c(bvy var1);

   @Nullable
   bvy f();
}
