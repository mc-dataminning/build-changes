import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class clw {
   private final int a;
   public final bln d;
   public int e;
   public final int f;
   public final int g;

   public clw(bln $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(coz $$0, coz $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(coz $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(coz $$0) {
   }

   public void a(chh $$0, coz $$1) {
      this.b();
   }

   public boolean a(coz $$0) {
      return true;
   }

   public coz g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().b();
   }

   public void e(coz $$0) {
      this.a($$0, this.g());
   }

   public void a(coz $$0, coz $$1) {
      this.f($$0);
   }

   public void f(coz $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.al_();
   }

   public int a_(coz $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<aiy, aiy> c() {
      return null;
   }

   public coz a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(chh $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<coz> a(int $$0, int $$1, chh $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         coz $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.g().b()) {
               this.a(coz.h, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public coz b(int $$0, int $$1, chh $$2) {
      Optional<coz> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(coz.h);
   }

   public coz d(coz $$0) {
      return this.b($$0, $$0.M());
   }

   public coz b(coz $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         coz $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.a_($$0) - $$2.M());
         if ($$2.b()) {
            this.e($$0.a($$3));
         } else if (coz.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(chh $$0) {
      return this.a($$0) && this.a(this.g());
   }

   public int i() {
      return this.a;
   }

   public boolean e() {
      return true;
   }

   public boolean f() {
      return false;
   }
}
