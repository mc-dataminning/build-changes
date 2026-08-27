import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cre {
   private final int a;
   public final bpt d;
   public int e;
   public final int f;
   public final int g;

   public cre(bpt $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(cuh $$0, cuh $$1) {
      int $$2 = $$1.G() - $$0.G();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cuh $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   public void a(cly $$0, cuh $$1) {
      this.b();
   }

   public boolean a(cuh $$0) {
      return true;
   }

   public cuh g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().d();
   }

   public void e(cuh $$0) {
      this.a($$0, this.g());
   }

   public void a(cuh $$0, cuh $$1) {
      this.f($$0);
   }

   public void f(cuh $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.ai_();
   }

   public int a_(cuh $$0) {
      return Math.min(this.a(), $$0.i());
   }

   @Nullable
   public Pair<akt, akt> c() {
      return null;
   }

   public cuh a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cly $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cuh> a(int $$0, int $$1, cly $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().G()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cuh $$3 = this.a($$0);
         if ($$3.d()) {
            return Optional.empty();
         } else {
            if (this.g().d()) {
               this.a(cuh.i, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cuh b(int $$0, int $$1, cly $$2) {
      Optional<cuh> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cuh.i);
   }

   public cuh b_(cuh $$0) {
      return this.b($$0, $$0.G());
   }

   public cuh b(cuh $$0, int $$1) {
      if (!$$0.d() && this.a($$0)) {
         cuh $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.G()), this.a_($$0) - $$2.G());
         if ($$2.d()) {
            this.e($$0.a($$3));
         } else if (cuh.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cly $$0) {
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
