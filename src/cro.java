import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cro {
   private final int a;
   public final bqj c;
   public int d;
   public final int e;
   public final int f;

   public cro(bqj $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cuo $$0, cuo $$1) {
      int $$2 = $$1.H() - $$0.H();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cuo $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cuo $$0) {
   }

   public void a(cmv $$0, cuo $$1) {
      this.c();
   }

   public boolean a(cuo $$0) {
      return true;
   }

   public cuo g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().e();
   }

   public void e(cuo $$0) {
      this.a($$0, this.g());
   }

   public void a(cuo $$0, cuo $$1) {
      this.f($$0);
   }

   public void f(cuo $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.ah_();
   }

   public int a_(cuo $$0) {
      return Math.min(this.a(), $$0.j());
   }

   @Nullable
   public Pair<akq, akq> b() {
      return null;
   }

   public cuo a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cmv $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cuo> a(int $$0, int $$1, cmv $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().H()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cuo $$3 = this.a($$0);
         if ($$3.e()) {
            return Optional.empty();
         } else {
            if (this.g().e()) {
               this.a(cuo.l, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cuo b(int $$0, int $$1, cmv $$2) {
      Optional<cuo> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cuo.l);
   }

   public cuo d(cuo $$0) {
      return this.b($$0, $$0.H());
   }

   public cuo b(cuo $$0, int $$1) {
      if (!$$0.e() && this.a($$0)) {
         cuo $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.H()), this.a_($$0) - $$2.H());
         if ($$2.e()) {
            this.e($$0.a($$3));
         } else if (cuo.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cmv $$0) {
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
