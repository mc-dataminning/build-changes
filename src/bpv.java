import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bpv {
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

   default void a(cxb $$0, ta $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof apf) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            box $$3 = ((apf)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bpr) {
                  this.a((bpr)$$3);
               }

               if ($$3.ai() == bpd.by) {
                  this.c((ciu)$$3);
               }
            }
         }
      }
   }

   default void a(apf $$0, boolean $$1) {
      bpp $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof bpr) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bpd.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bpp $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bpd.by && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(cxb $$0) {
      return $$0.Z().b(cwx.O) && this.Y_() && this.b() == null;
   }

   default boolean Y_() {
      return this.a() > 0;
   }

   default void a_(ciu $$0) {
      if ($$0.dM().Z().b(cwx.N)) {
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
   bpp ej();

   void a(@Nullable bpp var1);

   void c(@Nullable ciu var1);

   void h(@Nullable bpp var1);

   boolean c(bpp var1);

   @Nullable
   bpp p();
}
