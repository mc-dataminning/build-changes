import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cgd {
   private final int a;
   public final bgr d;
   public int e;
   public final int f;
   public final int g;

   public cgd(bgr $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(cjf $$0, cjf $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cjf $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cjf $$0) {
   }

   public void a(cbu $$0, cjf $$1) {
      this.d();
   }

   public boolean a(cjf $$0) {
      return true;
   }

   public cjf e() {
      return this.d.a(this.a);
   }

   public boolean f() {
      return !this.e().b();
   }

   public void d(cjf $$0) {
      this.a($$0, this.e());
   }

   public void a(cjf $$0, cjf $$1) {
      this.e($$0);
   }

   public void e(cjf $$0) {
      this.d.a(this.a, $$0);
      this.d();
   }

   public void d() {
      this.d.e();
   }

   public int a() {
      return this.d.ag_();
   }

   public int a_(cjf $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<aew, aew> b() {
      return null;
   }

   public cjf a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cbu $$0) {
      return true;
   }

   public boolean c() {
      return true;
   }

   public Optional<cjf> a(int $$0, int $$1, cbu $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.e().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cjf $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.e().b()) {
               this.a(cjf.b, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cjf b(int $$0, int $$1, cbu $$2) {
      Optional<cjf> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cjf.b);
   }

   public cjf f(cjf $$0) {
      return this.b($$0, $$0.L());
   }

   public cjf b(cjf $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         cjf $$2 = this.e();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$2.b()) {
            this.d($$0.a($$3));
         } else if (cjf.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.d($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cbu $$0) {
      return this.a($$0) && this.a(this.e());
   }

   public int g() {
      return this.a;
   }

   public boolean h() {
      return true;
   }
}
