import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cjp {
   private final int a;
   public final bjo d;
   public int e;
   public final int f;
   public final int g;

   public cjp(bjo $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(cmr $$0, cmr $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cmr $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cmr $$0) {
   }

   public void a(cfb $$0, cmr $$1) {
      this.b();
   }

   public boolean a(cmr $$0) {
      return true;
   }

   public cmr g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().b();
   }

   public void e(cmr $$0) {
      this.a($$0, this.g());
   }

   public void a(cmr $$0, cmr $$1) {
      this.f($$0);
   }

   public void f(cmr $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.ak_();
   }

   public int a_(cmr $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<ahd, ahd> c() {
      return null;
   }

   public cmr a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cfb $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cmr> a(int $$0, int $$1, cfb $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cmr $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.g().b()) {
               this.a(cmr.f, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cmr b(int $$0, int $$1, cfb $$2) {
      Optional<cmr> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cmr.f);
   }

   public cmr d(cmr $$0) {
      return this.b($$0, $$0.L());
   }

   public cmr b(cmr $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         cmr $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$2.b()) {
            this.e($$0.a($$3));
         } else if (cmr.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cfb $$0) {
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
