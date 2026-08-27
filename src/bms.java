import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bms {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sn $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(ctp $$0, sn $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof and) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            blv $$3 = ((and)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bmn) {
                  this.a((bmn)$$3);
               }

               if ($$3.ai() == blz.bv) {
                  this.c((cfi)$$3);
               }
            }
         }
      }
   }

   default void a(and $$0, boolean $$1) {
      bml $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ew()) && $$3 != null && $$0.a($$3) instanceof bmn) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != blz.bv || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(bml $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == blz.bv && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(ctp $$0) {
      return $$0.Z().b(ctl.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cfi $$0) {
      if ($$0.dM().Z().b(ctl.N)) {
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
   bml eh();

   void a(@Nullable bml var1);

   void c(@Nullable cfi var1);

   void h(@Nullable bml var1);

   boolean c(bml var1);

   @Nullable
   bml q();
}
