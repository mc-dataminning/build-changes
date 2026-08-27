import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bpu {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(ta $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cwz $$0, ta $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof apf) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bow $$3 = ((apf)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bpq) {
                  this.a((bpq)$$3);
               }

               if ($$3.ai() == bpc.bx) {
                  this.c((cis)$$3);
               }
            }
         }
      }
   }

   default void a(apf $$0, boolean $$1) {
      bpo $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof bpq) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bpc.bx || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bpo $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bpc.bx && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(cwz $$0) {
      return $$0.Z().b(cwv.O) && this.Y_() && this.b() == null;
   }

   default boolean Y_() {
      return this.a() > 0;
   }

   default void a_(cis $$0) {
      if ($$0.dM().Z().b(cwv.N)) {
         if ($$0.cw().equals(this.b())) {
            this.V_();
         }
      }
   }

   default void Z_() {
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
   bpo ej();

   void a(@Nullable bpo var1);

   void c(@Nullable cis var1);

   void h(@Nullable bpo var1);

   boolean c(bpo var1);

   @Nullable
   bpo p();
}
