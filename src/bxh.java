import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxh {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(tz $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(div $$0, tz $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arq $$2) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$4 = $$1.a("AngryAt");
            this.a($$4);
            if ($$2.b($$4) instanceof bxc $$6) {
               this.g($$6);
            }
         }
      }
   }

   default void a(arq $$0, boolean $$1) {
      bxc $$2 = this.f();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eG()) && $$3 != null && $$0.b($$3) instanceof bxe) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != bwm.bS || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a(bxc $$0, arq $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == bwm.bS && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(arq $$0) {
      return $$0.O().c(dir.P) && this.W_() && this.b() == null;
   }

   default boolean W_() {
      return this.a() > 0;
   }

   default void a_(arq $$0, cqy $$1) {
      if ($$0.O().c(dir.O)) {
         if ($$1.cG().equals(this.b())) {
            this.V_();
         }
      }
   }

   default void X_() {
      this.V_();
      this.c();
   }

   default void V_() {
      this.a(null);
      this.a(null);
      this.g(null);
      this.a(0);
   }

   @Nullable
   bxc eq();

   void a(@Nullable bxc var1);

   void g(@Nullable bxc var1);

   boolean c(bxc var1);

   @Nullable
   bxc f();
}
