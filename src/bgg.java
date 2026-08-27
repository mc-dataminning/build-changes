import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bgg {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(qr $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cmm $$0, qr $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aif) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bfj $$3 = ((aif)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bgb) {
                  this.a((bgb)$$3);
               }

               if ($$3.ae() == bfn.bt) {
                  this.c((byo)$$3);
               }
            }
         }
      }
   }

   default void a(aif $$0, boolean $$1) {
      bfz $$2 = this.j();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.es()) && $$3 != null && $$0.a($$3) instanceof bgb) {
         this.O_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.ct())) {
            this.a($$2.ct());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ae() != bfn.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.O_();
            }
         }
      }
   }

   default boolean a_(bfz $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ae() == bfn.bt && this.a_($$0.dI()) ? true : $$0.ct().equals(this.b());
      }
   }

   default boolean a_(cmm $$0) {
      return $$0.X().b(cmi.K) && this.S_() && this.b() == null;
   }

   default boolean S_() {
      return this.a() > 0;
   }

   default void a_(byo $$0) {
      if ($$0.dI().X().b(cmi.J)) {
         if ($$0.ct().equals(this.b())) {
            this.O_();
         }
      }
   }

   default void T_() {
      this.O_();
      this.c();
   }

   default void O_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bfz ed();

   void a(@Nullable bfz var1);

   void c(@Nullable byo var1);

   void h(@Nullable bfz var1);

   boolean c(bfz var1);

   @Nullable
   bfz j();
}
