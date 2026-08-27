import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bpd {
   String b_ = "AngerTime";
   String c_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(sy $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(cwe $$0, sy $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof apa) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bof $$3 = ((apa)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof boz) {
                  this.a((boz)$$3);
               }

               if ($$3.ai() == bol.bw) {
                  this.c((cia)$$3);
               }
            }
         }
      }
   }

   default void a(apa $$0, boolean $$1) {
      box $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ev()) && $$3 != null && $$0.a($$3) instanceof boz) {
         this.X_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.ct())) {
            this.a($$2.ct());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bol.bw || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.X_();
            }
         }
      }
   }

   default boolean a_(box $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bol.bw && this.a_($$0.dJ()) ? true : $$0.ct().equals(this.b());
      }
   }

   default boolean a_(cwe $$0) {
      return $$0.Z().b(cwa.O) && this.aa_() && this.b() == null;
   }

   default boolean aa_() {
      return this.a() > 0;
   }

   default void a_(cia $$0) {
      if ($$0.dJ().Z().b(cwa.N)) {
         if ($$0.ct().equals(this.b())) {
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
   box eg();

   void a(@Nullable box var1);

   void c(@Nullable cia var1);

   void h(@Nullable box var1);

   boolean c(box var1);

   @Nullable
   box q();
}
