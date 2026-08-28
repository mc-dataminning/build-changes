import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class crq {
   private final int a;
   public final bqk c;
   public int d;
   public final int e;
   public final int f;

   public crq(bqk $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cuq $$0, cuq $$1) {
      int $$2 = $$1.H() - $$0.H();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cuq $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cuq $$0) {
   }

   public void a(cmx $$0, cuq $$1) {
      this.c();
   }

   public boolean a(cuq $$0) {
      return true;
   }

   public cuq g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().e();
   }

   public void e(cuq $$0) {
      this.a($$0, this.g());
   }

   public void a(cuq $$0, cuq $$1) {
      this.f($$0);
   }

   public void f(cuq $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.al_();
   }

   public int a_(cuq $$0) {
      return Math.min(this.a(), $$0.j());
   }

   @Nullable
   public Pair<akr, akr> b() {
      return null;
   }

   public cuq a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cmx $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cuq> a(int $$0, int $$1, cmx $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().H()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cuq $$3 = this.a($$0);
         if ($$3.e()) {
            return Optional.empty();
         } else {
            if (this.g().e()) {
               this.a(cuq.l, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cuq b(int $$0, int $$1, cmx $$2) {
      Optional<cuq> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cuq.l);
   }

   public cuq d(cuq $$0) {
      return this.b($$0, $$0.H());
   }

   public cuq b(cuq $$0, int $$1) {
      if (!$$0.e() && this.a($$0)) {
         cuq $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.H()), this.a_($$0) - $$2.H());
         if ($$2.e()) {
            this.e($$0.a($$3));
         } else if (cuq.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cmx $$0) {
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
