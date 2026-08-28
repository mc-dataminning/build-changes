import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface btx {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(us $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(dca $$0, us $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof arf) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bsw $$3 = ((arf)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof btt $$4) {
                  this.h($$4);
                  this.a($$4);
               }

               if ($$3 instanceof cmz $$5) {
                  this.h($$5);
                  this.c($$5);
               }
            }
         }
      }
   }

   default void a(arf $$0, boolean $$1) {
      btr $$2 = this.p();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eB()) && $$3 != null && $$0.a($$3) instanceof btt) {
         this.V_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cz())) {
            this.a($$2.cz());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ak() != btc.by || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.V_();
            }
         }
      }
   }

   default boolean a_(btr $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ak() == btc.by && this.a_($$0.dP()) ? true : $$0.cz().equals(this.b());
      }
   }

   default boolean a_(dca $$0) {
      return $$0.ab().b(dbw.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cmz $$0) {
      if ($$0.dP().ab().b(dbw.N)) {
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
   btr em();

   void a(@Nullable btr var1);

   void c(@Nullable cmz var1);

   void h(@Nullable btr var1);

   boolean c(btr var1);

   @Nullable
   btr p();
}
