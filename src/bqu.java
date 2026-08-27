import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bqu {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(tm $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cyx $$0, tm $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aps) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bpv $$3 = ((aps)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bqq) {
                  this.a((bqq)$$3);
               }

               if ($$3.ai() == bqb.bx) {
                  this.c((cjt)$$3);
               }
            }
         }
      }
   }

   default void a(aps $$0, boolean $$1) {
      bqo $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ey()) && $$3 != null && $$0.a($$3) instanceof bqq) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bqb.bx || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bqo $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bqb.bx && this.a_($$0.dM()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(cyx $$0) {
      return $$0.aa().b(cyt.O) && this.Y_() && this.b() == null;
   }

   default boolean Y_() {
      return this.a() > 0;
   }

   default void a_(cjt $$0) {
      if ($$0.dM().aa().b(cyt.N)) {
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
   bqo ej();

   void a(@Nullable bqo var1);

   void c(@Nullable cjt var1);

   void h(@Nullable bqo var1);

   boolean c(bqo var1);

   @Nullable
   bqo p();
}
