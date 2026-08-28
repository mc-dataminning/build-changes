import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvm {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(ul $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dfm $$0, ul $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arp) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bul $$3 = ((arp)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bvj $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cou $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arp $$0, boolean $$1) {
      bvh $$2 = this.aa_();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eE()) && $$3 != null && $$0.a($$3) instanceof bvj) {
         this.ae_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cG())) {
            this.a($$2.cG());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.aq() != bus.bO || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.ae_();
            }
         }
      }
   }

   default boolean a(bvh $$0, arp $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.aq() == bus.bO && this.a_($$1) ? true : $$0.cG().equals(this.b());
      }
   }

   default boolean a_(arp $$0) {
      return $$0.N().b(dfi.O) && this.ac_() && this.b() == null;
   }

   default boolean ac_() {
      return this.a() > 0;
   }

   default void a_(arp $$0, cou $$1) {
      if ($$0.N().b(dfi.N)) {
         if ($$1.cG().equals(this.b())) {
            this.ae_();
         }
      }
   }

   default void ad_() {
      this.ae_();
      this.c();
   }

   default void ae_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bvh ep();

   void a(@Nullable bvh var1);

   void c(@Nullable cou var1);

   void h(@Nullable bvh var1);

   boolean c(bvh var1);

   @Nullable
   bvh aa_();
}
