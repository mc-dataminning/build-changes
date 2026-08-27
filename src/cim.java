import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cim {
   private final int a;
   public final biu d;
   public int e;
   public final int f;
   public final int g;

   public cim(biu $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(clo $$0, clo $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(clo $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(clo $$0) {
   }

   public void a(cdz $$0, clo $$1) {
      this.b();
   }

   public boolean a(clo $$0) {
      return true;
   }

   public clo f() {
      return this.d.a(this.a);
   }

   public boolean g() {
      return !this.f().b();
   }

   public void e(clo $$0) {
      this.a($$0, this.f());
   }

   public void a(clo $$0, clo $$1) {
      this.f($$0);
   }

   public void f(clo $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.al_();
   }

   public int a_(clo $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<agm, agm> c() {
      return null;
   }

   public clo a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cdz $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<clo> a(int $$0, int $$1, cdz $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.f().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         clo $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.f().b()) {
               this.a(clo.b, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public clo b(int $$0, int $$1, cdz $$2) {
      Optional<clo> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(clo.b);
   }

   public clo d(clo $$0) {
      return this.b($$0, $$0.L());
   }

   public clo b(clo $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         clo $$2 = this.f();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$2.b()) {
            this.e($$0.a($$3));
         } else if (clo.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cdz $$0) {
      return this.a($$0) && this.a(this.f());
   }

   public int h() {
      return this.a;
   }

   public boolean e() {
      return true;
   }
}
