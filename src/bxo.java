import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxo {
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

   default void a(djm $$0, tz $$1) {
      this.a($$1.f("AngerTime"));
      if ($$0 instanceof arq $$2) {
         UUID $$4 = $$1.<UUID>a("AngryAt", jz.a).orElse(null);
         this.a($$4);
         if (($$4 != null ? $$2.b($$4) : null) instanceof bxj $$6) {
            this.g($$6);
         }
      }
   }

   default void a(arq $$0, boolean $$1) {
      bxj $$2 = this.f();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eG()) && $$3 != null && $$0.b($$3) instanceof bxl) {
         this.W_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cF())) {
            this.a($$2.cF());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.an() != bwr.bS || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.W_();
            }
         }
      }
   }

   default boolean a(bxj $$0, arq $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.an() == bwr.bS && this.a_($$1) ? true : $$0.cF().equals(this.b());
      }
   }

   default boolean a_(arq $$0) {
      return $$0.O().c(dji.Q) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(arq $$0, crm $$1) {
      if ($$0.O().c(dji.P)) {
         if ($$1.cF().equals(this.b())) {
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
      this.g(null);
      this.a(0);
   }

   @Nullable
   bxj eq();

   void a(@Nullable bxj var1);

   void g(@Nullable bxj var1);

   boolean c(bxj var1);

   @Nullable
   bxj f();
}
