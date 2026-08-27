import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqq {
   private final int a;
   public final bpp c;
   public int d;
   public final int e;
   public final int f;

   public cqq(bpp $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(ctq $$0, ctq $$1) {
      int $$2 = $$1.I() - $$0.I();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(ctq $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(ctq $$0) {
   }

   public void a(cly $$0, ctq $$1) {
      this.b();
   }

   public boolean a(ctq $$0) {
      return true;
   }

   public ctq g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().e();
   }

   public void e(ctq $$0) {
      this.a($$0, this.g());
   }

   public void a(ctq $$0, ctq $$1) {
      this.f($$0);
   }

   public void f(ctq $$0) {
      this.c.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.c.e();
   }

   public int a() {
      return this.c.ai_();
   }

   public int a_(ctq $$0) {
      return Math.min(this.a(), $$0.j());
   }

   @Nullable
   public Pair<akn, akn> c() {
      return null;
   }

   public ctq a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cly $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<ctq> a(int $$0, int $$1, cly $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().I()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         ctq $$3 = this.a($$0);
         if ($$3.e()) {
            return Optional.empty();
         } else {
            if (this.g().e()) {
               this.a(ctq.i, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public ctq b(int $$0, int $$1, cly $$2) {
      Optional<ctq> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(ctq.i);
   }

   public ctq d(ctq $$0) {
      return this.b($$0, $$0.I());
   }

   public ctq b(ctq $$0, int $$1) {
      if (!$$0.e() && this.a($$0)) {
         ctq $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.I()), this.a_($$0) - $$2.I());
         if ($$2.e()) {
            this.e($$0.a($$3));
         } else if (ctq.c($$2, $$0)) {
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
