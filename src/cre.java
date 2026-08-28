import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cre {
   private final int a;
   public final bqa c;
   public int d;
   public final int e;
   public final int f;

   public cre(bqa $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cud $$0, cud $$1) {
      int $$2 = $$1.H() - $$0.H();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cud $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cud $$0) {
   }

   public void a(cml $$0, cud $$1) {
      this.c();
   }

   public boolean a(cud $$0) {
      return true;
   }

   public cud g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().e();
   }

   public void e(cud $$0) {
      this.a($$0, this.g());
   }

   public void a(cud $$0, cud $$1) {
      this.f($$0);
   }

   public void f(cud $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.ah_();
   }

   public int a_(cud $$0) {
      return Math.min(this.a(), $$0.j());
   }

   @Nullable
   public Pair<akk, akk> b() {
      return null;
   }

   public cud a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cml $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cud> a(int $$0, int $$1, cml $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().H()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cud $$3 = this.a($$0);
         if ($$3.e()) {
            return Optional.empty();
         } else {
            if (this.g().e()) {
               this.a(cud.l, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cud b(int $$0, int $$1, cml $$2) {
      Optional<cud> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cud.l);
   }

   public cud d(cud $$0) {
      return this.b($$0, $$0.H());
   }

   public cud b(cud $$0, int $$1) {
      if (!$$0.e() && this.a($$0)) {
         cud $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.H()), this.a_($$0) - $$2.H());
         if ($$2.e()) {
            this.e($$0.a($$3));
         } else if (cud.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cml $$0) {
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
