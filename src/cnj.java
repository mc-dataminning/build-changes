import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnj {
   private final int a;
   public final bmv d;
   public int e;
   public final int f;
   public final int g;

   public cnj(bmv $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(cqk $$0, cqk $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cqk $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cqk $$0) {
   }

   public void a(cis $$0, cqk $$1) {
      this.b();
   }

   public boolean a(cqk $$0) {
      return true;
   }

   public cqk g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().b();
   }

   public void e(cqk $$0) {
      this.a($$0, this.g());
   }

   public void a(cqk $$0, cqk $$1) {
      this.f($$0);
   }

   public void f(cqk $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.ak_();
   }

   public int a_(cqk $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<ajh, ajh> c() {
      return null;
   }

   public cqk a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cis $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cqk> a(int $$0, int $$1, cis $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cqk $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.g().b()) {
               this.a(cqk.h, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cqk b(int $$0, int $$1, cis $$2) {
      Optional<cqk> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cqk.h);
   }

   public cqk d(cqk $$0) {
      return this.b($$0, $$0.M());
   }

   public cqk b(cqk $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         cqk $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.a_($$0) - $$2.M());
         if ($$2.b()) {
            this.e($$0.a($$3));
         } else if (cqk.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cis $$0) {
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
