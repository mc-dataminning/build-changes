import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpz {
   private final int a;
   public final bpf d;
   public int e;
   public final int f;
   public final int g;

   public cpz(bpf $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(csz $$0, csz $$1) {
      int $$2 = $$1.G() - $$0.G();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(csz $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(csz $$0) {
   }

   public void a(clh $$0, csz $$1) {
      this.b();
   }

   public boolean a(csz $$0) {
      return true;
   }

   public csz g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().d();
   }

   public void e(csz $$0) {
      this.a($$0, this.g());
   }

   public void a(csz $$0, csz $$1) {
      this.f($$0);
   }

   public void f(csz $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.ah_();
   }

   public int a_(csz $$0) {
      return Math.min(this.a(), $$0.i());
   }

   @Nullable
   public Pair<akh, akh> c() {
      return null;
   }

   public csz a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(clh $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<csz> a(int $$0, int $$1, clh $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().G()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         csz $$3 = this.a($$0);
         if ($$3.d()) {
            return Optional.empty();
         } else {
            if (this.g().d()) {
               this.a(csz.i, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public csz b(int $$0, int $$1, clh $$2) {
      Optional<csz> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(csz.i);
   }

   public csz d(csz $$0) {
      return this.b($$0, $$0.G());
   }

   public csz b(csz $$0, int $$1) {
      if (!$$0.d() && this.a($$0)) {
         csz $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.G()), this.a_($$0) - $$2.G());
         if ($$2.d()) {
            this.e($$0.a($$3));
         } else if (csz.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(clh $$0) {
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
