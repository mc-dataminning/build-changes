import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bln {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(rz $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }
   }

   default void a(csa $$0, rz $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof ame) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bkq $$3 = ((ame)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bli) {
                  this.a((bli)$$3);
               }

               if ($$3.ai() == bku.bt) {
                  this.c((cdu)$$3);
               }
            }
         }
      }
   }

   default void a(ame $$0, boolean $$1) {
      blg $$2 = this.q();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.ex()) && $$3 != null && $$0.a($$3) instanceof bli) {
         this.W_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cw())) {
            this.a($$2.cw());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ai() != bku.bt || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.W_();
            }
         }
      }
   }

   default boolean a_(blg $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ai() == bku.bt && this.a_($$0.dN()) ? true : $$0.cw().equals(this.b());
      }
   }

   default boolean a_(csa $$0) {
      return $$0.Y().b(crw.O) && this.Z_() && this.b() == null;
   }

   default boolean Z_() {
      return this.a() > 0;
   }

   default void a_(cdu $$0) {
      if ($$0.dN().Y().b(crw.N)) {
         if ($$0.cw().equals(this.b())) {
            this.W_();
         }
      }
   }

   default void aa_() {
      this.W_();
      this.c();
   }

   default void W_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   blg ei();

   void a(@Nullable blg var1);

   void c(@Nullable cdu var1);

   void h(@Nullable blg var1);

   boolean c(blg var1);

   @Nullable
   blg q();
}
