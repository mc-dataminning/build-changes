import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bmv {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(so $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(ctx $$0, so $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof ane) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            blw $$3 = ((ane)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bmq) {
                  this.a((bmq)$$3);
               }

               if ($$3.ai() == bmc.bw) {
                  this.c((cfq)$$3);
               }
            }
         }
      }
   }

   default void a(ane $$0, boolean $$1) {
      bmo $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ew()) && $$3 != null && $$0.a($$3) instanceof bmq) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bmc.bw || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(bmo $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bmc.bw && this.a_($$0.dL()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(ctx $$0) {
      return $$0.Z().b(ctt.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cfq $$0) {
      if ($$0.dL().Z().b(ctt.N)) {
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
   bmo eh();

   void a(@Nullable bmo var1);

   void c(@Nullable cfq var1);

   void h(@Nullable bmo var1);

   boolean c(bmo var1);

   @Nullable
   bmo q();
}
