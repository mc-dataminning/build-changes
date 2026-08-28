import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface byk {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(ua $$0) {
      $$0.a("AngerTime", this.a());
      $$0.b("AngryAt", ka.a, this.b());
   }

   default void a(dkj $$0, ua $$1) {
      this.a($$1.b("AngerTime", 0));
      if ($$0 instanceof asb $$2) {
         UUID $$4 = $$1.<UUID>a("AngryAt", ka.a).orElse(null);
         this.a($$4);
         if (($$4 != null ? $$2.b($$4) : null) instanceof byf $$6) {
            this.g($$6);
         }
      }
   }

   default void a(asb $$0, boolean $$1) {
      byf $$2 = this.e();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eH()) && $$3 != null && $$0.b($$3) instanceof byh) {
         this.i();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.an() != bxn.bT || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.i();
            }
         }
      }
   }

   default boolean a(byf $$0, asb $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.an() == bxn.bT && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(asb $$0) {
      return $$0.O().c(dkf.Q) && this.ac_() && this.b() == null;
   }

   default boolean ac_() {
      return this.a() > 0;
   }

   default void a_(asb $$0, csi $$1) {
      if ($$0.O().c(dkf.P)) {
         if ($$1.cG().equals(this.b())) {
            this.i();
         }
      }
   }

   default void aa_() {
      this.i();
      this.c();
   }

   default void i() {
      this.a(null);
      this.a(null);
      this.g(null);
      this.a(0);
   }

   @Nullable
   byf er();

   void a(@Nullable byf var1);

   void g(@Nullable byf var1);

   boolean c(byf var1);

   @Nullable
   byf e();
}
