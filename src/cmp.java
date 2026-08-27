import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmp {
   private final int a;
   public final bme d;
   public int e;
   public final int f;
   public final int g;

   public cmp(bme $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(cpq $$0, cpq $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cpq $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cpq $$0) {
   }

   public void a(cia $$0, cpq $$1) {
      this.b();
   }

   public boolean a(cpq $$0) {
      return true;
   }

   public cpq g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().b();
   }

   public void e(cpq $$0) {
      this.a($$0, this.g());
   }

   public void a(cpq $$0, cpq $$1) {
      this.f($$0);
   }

   public void f(cpq $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.al_();
   }

   public int a_(cpq $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<ajc, ajc> c() {
      return null;
   }

   public cpq a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cia $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cpq> a(int $$0, int $$1, cia $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cpq $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.g().b()) {
               this.a(cpq.h, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cpq b(int $$0, int $$1, cia $$2) {
      Optional<cpq> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cpq.h);
   }

   public cpq d(cpq $$0) {
      return this.b($$0, $$0.M());
   }

   public cpq b(cpq $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         cpq $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.a_($$0) - $$2.M());
         if ($$2.b()) {
            this.e($$0.a($$3));
         } else if (cpq.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cia $$0) {
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
