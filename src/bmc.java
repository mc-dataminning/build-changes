import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bmc {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sj $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(csy $$0, sj $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof amp) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            blf $$3 = ((amp)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof blx) {
                  this.a((blx)$$3);
               }

               if ($$3.ai() == blj.bv) {
                  this.c((cer)$$3);
               }
            }
         }
      }
   }

   default void a(amp $$0, boolean $$1) {
      blv $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ew()) && $$3 != null && $$0.a($$3) instanceof blx) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != blj.bv || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(blv $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == blj.bv && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(csy $$0) {
      return $$0.Y().b(csu.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cer $$0) {
      if ($$0.dM().Y().b(csu.N)) {
         if ($$0.cw().equals(this.b())) {
            this.X_();
         }
      }
   }

   default void ab_() {
      this.X_();
      this.c();
   }

   default void X_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   blv eh();

   void a(@Nullable blv var1);

   void c(@Nullable cer var1);

   void h(@Nullable blv var1);

   boolean c(blv var1);

   @Nullable
   blv q();
}
