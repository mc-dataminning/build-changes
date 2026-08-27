import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bsu {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(ud $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dax $$0, ud $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqm) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bru $$3 = ((aqm)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bsq) {
                  this.a((bsq)$$3);
               }

               if ($$3.ak() == bsa.by) {
                  this.c((clw)$$3);
               }
            }
         }
      }
   }

   default void a(aqm $$0, boolean $$1) {
      bso $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eB()) && $$3 != null && $$0.a($$3) instanceof bsq) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cz())) {
            this.a($$2.cz());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ak() != bsa.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bso $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ak() == bsa.by && this.a_($$0.dP()) ? true : $$0.cz().equals(this.b());
      }
   }

   default boolean a_(dax $$0) {
      return $$0.aa().b(dat.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(clw $$0) {
      if ($$0.dP().aa().b(dat.N)) {
         if ($$0.cz().equals(this.b())) {
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
   bso em();

   void a(@Nullable bso var1);

   void c(@Nullable clw var1);

   void h(@Nullable bso var1);

   boolean c(bso var1);

   @Nullable
   bso p();
}
