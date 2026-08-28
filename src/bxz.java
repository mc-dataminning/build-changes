import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxz {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(tz $$0) {
      $$0.a("AngerTime", this.a());
      $$0.b("AngryAt", jz.a, this.b());
   }

   default void a(djx $$0, tz $$1) {
      this.a($$1.b("AngerTime", 0));
      if ($$0 instanceof ars $$2) {
         UUID $$4 = $$1.<UUID>a("AngryAt", jz.a).orElse(null);
         this.a($$4);
         if (($$4 != null ? $$2.b($$4) : null) instanceof bxu $$6) {
            this.g($$6);
         }
      }
   }

   default void a(ars $$0, boolean $$1) {
      bxu $$2 = this.f();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eH()) && $$3 != null && $$0.b($$3) instanceof bxw) {
         this.aa_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.an() != bxc.bT || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.aa_();
            }
         }
      }
   }

   default boolean a(bxu $$0, ars $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.an() == bxc.bT && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(ars $$0) {
      return $$0.O().c(djt.Q) && this.ae_() && this.b() == null;
   }

   default boolean ae_() {
      return this.a() > 0;
   }

   default void a_(ars $$0, crx $$1) {
      if ($$0.O().c(djt.P)) {
         if ($$1.cG().equals(this.b())) {
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
      this.g(null);
      this.a(0);
   }

   @Nullable
   bxu er();

   void a(@Nullable bxu var1);

   void g(@Nullable bxu var1);

   boolean c(bxu var1);

   @Nullable
   bxu f();
}
