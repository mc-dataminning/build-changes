import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bup {
   String c_ = "AngerTime";
   String d_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(uf $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(deg $$0, uf $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arh) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bto $$3 = ((arh)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bum $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cnu $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arh $$0, boolean $$1) {
      buk $$2 = this.m();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eB()) && $$3 != null && $$0.a($$3) instanceof bum) {
         this.Y_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cD())) {
            this.a($$2.cD());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ao() != btv.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.Y_();
            }
         }
      }
   }

   default boolean a_(buk $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ao() == btv.by && this.a_($$0.dS()) ? true : $$0.cD().equals(this.b());
      }
   }

   default boolean a_(deg $$0) {
      return $$0.ac().b(dec.O) && this.ac_() && this.b() == null;
   }

   default boolean ac_() {
      return this.a() > 0;
   }

   default void a_(cnu $$0) {
      if ($$0.dS().ac().b(dec.N)) {
         if ($$0.cD().equals(this.b())) {
            this.Y_();
         }
      }
   }

   default void ad_() {
      this.Y_();
      this.c();
   }

   default void Y_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   buk em();

   void a(@Nullable buk var1);

   void c(@Nullable cnu var1);

   void h(@Nullable buk var1);

   boolean c(buk var1);

   @Nullable
   buk m();
}
