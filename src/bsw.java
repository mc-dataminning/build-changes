import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bsw {
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

   default void a(daz $$0, ud $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof aqn) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            brw $$3 = ((aqn)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bss) {
                  this.a((bss)$$3);
               }

               if ($$3.ak() == bsc.by) {
                  this.c((cly)$$3);
               }
            }
         }
      }
   }

   default void a(aqn $$0, boolean $$1) {
      bsq $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eB()) && $$3 != null && $$0.a($$3) instanceof bss) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cz())) {
            this.a($$2.cz());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ak() != bsc.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(bsq $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ak() == bsc.by && this.a_($$0.dP()) ? true : $$0.cz().equals(this.b());
      }
   }

   default boolean a_(daz $$0) {
      return $$0.aa().b(dav.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cly $$0) {
      if ($$0.dP().aa().b(dav.N)) {
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
   bsq em();

   void a(@Nullable bsq var1);

   void c(@Nullable cly var1);

   void h(@Nullable bsq var1);

   boolean c(bsq var1);

   @Nullable
   bsq p();
}
