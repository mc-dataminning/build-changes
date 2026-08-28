import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxe {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(tx $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dip $$0, tx $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aro $$2) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$4 = $$1.a("AngryAt");
            this.a($$4);
            if ($$2.b($$4) instanceof bwz $$6) {
               this.g($$6);
            }
         }
      }
   }

   default void a(aro $$0, boolean $$1) {
      bwz $$2 = this.f();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eG()) && $$3 != null && $$0.b($$3) instanceof bxb) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != bwj.bS || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a(bwz $$0, aro $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == bwj.bS && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(aro $$0) {
      return $$0.O().c(dil.P) && this.W_() && this.b() == null;
   }

   default boolean W_() {
      return this.a() > 0;
   }

   default void a_(aro $$0, cqs $$1) {
      if ($$0.O().c(dil.O)) {
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
   bwz eq();

   void a(@Nullable bwz var1);

   void g(@Nullable bwz var1);

   boolean c(bwz var1);

   @Nullable
   bwz f();
}
