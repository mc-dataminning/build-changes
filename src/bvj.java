import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvj {
   String c_ = "AngerTime";
   String d_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(un $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dff $$0, un $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arq) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bui $$3 = ((arq)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bvg $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cor $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arq $$0, boolean $$1) {
      bve $$2 = this.m();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eI()) && $$3 != null && $$0.a($$3) instanceof bvg) {
         this.aa_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cI())) {
            this.a($$2.cI());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ar() != bup.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.aa_();
            }
         }
      }
   }

   default boolean a_(bve $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ar() == bup.by && this.a_($$0.dY()) ? true : $$0.cI().equals(this.b());
      }
   }

   default boolean a_(dff $$0) {
      return $$0.ac().b(dfb.O) && this.ae_() && this.b() == null;
   }

   default boolean ae_() {
      return this.a() > 0;
   }

   default void a_(cor $$0) {
      if ($$0.dY().ac().b(dfb.N)) {
         if ($$0.cI().equals(this.b())) {
            this.aa_();
         }
      }
   }

   default void af_() {
      this.aa_();
      this.c();
   }

   default void aa_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bve et();

   void a(@Nullable bve var1);

   void c(@Nullable cor var1);

   void h(@Nullable bve var1);

   boolean c(bve var1);

   @Nullable
   bve m();
}
