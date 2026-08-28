import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class csw {
   private final int a;
   public final brl c;
   public int d;
   public final int e;
   public final int f;

   public csw(brl $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cvs $$0, cvs $$1) {
      int $$2 = $$1.K() - $$0.K();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cvs $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cvs $$0) {
   }

   public void a(cnx $$0, cvs $$1) {
      this.c();
   }

   public boolean a(cvs $$0) {
      return true;
   }

   public cvs g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cvs $$0) {
      this.a($$0, this.g());
   }

   public void a(cvs $$0, cvs $$1) {
      this.f($$0);
   }

   public void f(cvs $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.al_();
   }

   public int a_(cvs $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public Pair<ale, ale> b() {
      return null;
   }

   public cvs a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cnx $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cvs> a(int $$0, int $$1, cnx $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().K()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cvs $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cvs.k, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cvs b(int $$0, int $$1, cnx $$2) {
      Optional<cvs> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cvs.k);
   }

   public cvs d(cvs $$0) {
      return this.b($$0, $$0.K());
   }

   public cvs b(cvs $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cvs $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.K()), this.a_($$0) - $$2.K());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cvs.c($$2, $$0)) {
               $$0.h($$3);
               $$2.g($$3);
               this.e($$2);
            }

            return $$0;
         }
      } else {
         return $$0;
      }
   }

   public boolean b(cnx $$0) {
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
