import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bls {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sd $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(csf $$0, sd $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof ami) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bkv $$3 = ((ami)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bln) {
                  this.a((bln)$$3);
               }

               if ($$3.ai() == bkz.bt) {
                  this.c((cdz)$$3);
               }
            }
         }
      }
   }

   default void a(ami $$0, boolean $$1) {
      bll $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ex()) && $$3 != null && $$0.a($$3) instanceof bln) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bkz.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(bll $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bkz.bt && this.a_($$0.dN()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(csf $$0) {
      return $$0.Y().b(csb.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cdz $$0) {
      if ($$0.dN().Y().b(csb.N)) {
         if ($$0.cw().equals(this.b())) {
            this.X_();
         }
      }
   }

   default void ab_() {
      this.X_();
      this.c();
   }

   default void X_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bll ei();

   void a(@Nullable bll var1);

   void c(@Nullable cdz var1);

   void h(@Nullable bll var1);

   boolean c(bll var1);

   @Nullable
   bll q();
}
