import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface brk {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(ty $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(czu $$0, ty $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqe) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bql $$3 = ((aqe)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof brg) {
                  this.a((brg)$$3);
               }

               if ($$3.ai() == bqr.bx) {
                  this.c((ckl)$$3);
               }
            }
         }
      }
   }

   default void a(aqe $$0, boolean $$1) {
      bre $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ez()) && $$3 != null && $$0.a($$3) instanceof brg) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cx())) {
            this.a($$2.cx());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bqr.bx || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bre $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bqr.bx && this.a_($$0.dN()) ? true : $$0.cx().equals(this.b());
      }
   }

   default boolean a_(czu $$0) {
      return $$0.aa().b(czq.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(ckl $$0) {
      if ($$0.dN().aa().b(czq.N)) {
         if ($$0.cx().equals(this.b())) {
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
   bre ek();

   void a(@Nullable bre var1);

   void c(@Nullable ckl var1);

   void h(@Nullable bre var1);

   boolean c(bre var1);

   @Nullable
   bre p();
}
