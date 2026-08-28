import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bus {
   String c_ = "AngerTime";
   String d_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(ug $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dej $$0, ug $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arj) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            btr $$3 = ((arj)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bup $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cnx $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arj $$0, boolean $$1) {
      bun $$2 = this.m();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eC()) && $$3 != null && $$0.a($$3) instanceof bup) {
         this.Z_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cD())) {
            this.a($$2.cD());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ao() != bty.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.Z_();
            }
         }
      }
   }

   default boolean a_(bun $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ao() == bty.by && this.a_($$0.dS()) ? true : $$0.cD().equals(this.b());
      }
   }

   default boolean a_(dej $$0) {
      return $$0.ac().b(def.O) && this.ad_() && this.b() == null;
   }

   default boolean ad_() {
      return this.a() > 0;
   }

   default void a_(cnx $$0) {
      if ($$0.dS().ac().b(def.N)) {
         if ($$0.cD().equals(this.b())) {
            this.Z_();
         }
      }
   }

   default void ae_() {
      this.Z_();
      this.c();
   }

   default void Z_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bun en();

   void a(@Nullable bun var1);

   void c(@Nullable cnx var1);

   void h(@Nullable bun var1);

   boolean c(bun var1);

   @Nullable
   bun m();
}
