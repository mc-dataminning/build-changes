import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bqz {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(to $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(czg $$0, to $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof apu) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bqa $$3 = ((apu)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bqv) {
                  this.a((bqv)$$3);
               }

               if ($$3.ai() == bqg.bx) {
                  this.c((cka)$$3);
               }
            }
         }
      }
   }

   default void a(apu $$0, boolean $$1) {
      bqt $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof bqv) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bqg.bx || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bqt $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bqg.bx && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(czg $$0) {
      return $$0.aa().b(czc.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cka $$0) {
      if ($$0.dM().aa().b(czc.N)) {
         if ($$0.cw().equals(this.b())) {
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
   bqt ej();

   void a(@Nullable bqt var1);

   void c(@Nullable cka var1);

   void h(@Nullable bqt var1);

   boolean c(bqt var1);

   @Nullable
   bqt p();
}
