import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bmm {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sl $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cti $$0, sl $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof amz) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            blp $$3 = ((amz)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bmh) {
                  this.a((bmh)$$3);
               }

               if ($$3.ai() == blt.bv) {
                  this.c((cfb)$$3);
               }
            }
         }
      }
   }

   default void a(amz $$0, boolean $$1) {
      bmf $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ew()) && $$3 != null && $$0.a($$3) instanceof bmh) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != blt.bv || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(bmf $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == blt.bv && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(cti $$0) {
      return $$0.Z().b(cte.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cfb $$0) {
      if ($$0.dM().Z().b(cte.N)) {
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
   bmf eh();

   void a(@Nullable bmf var1);

   void c(@Nullable cfb var1);

   void h(@Nullable bmf var1);

   boolean c(bmf var1);

   @Nullable
   bmf q();
}
