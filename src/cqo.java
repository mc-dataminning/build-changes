import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqo {
   private final int a;
   public final bpn d;
   public int e;
   public final int f;
   public final int g;

   public cqo(bpn $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(cto $$0, cto $$1) {
      int $$2 = $$1.I() - $$0.I();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cto $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cto $$0) {
   }

   public void a(clw $$0, cto $$1) {
      this.b();
   }

   public boolean a(cto $$0) {
      return true;
   }

   public cto g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().e();
   }

   public void e(cto $$0) {
      this.a($$0, this.g());
   }

   public void a(cto $$0, cto $$1) {
      this.f($$0);
   }

   public void f(cto $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.ah_();
   }

   public int a_(cto $$0) {
      return Math.min(this.a(), $$0.j());
   }

   @Nullable
   public Pair<akm, akm> c() {
      return null;
   }

   public cto a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(clw $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cto> a(int $$0, int $$1, clw $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().I()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cto $$3 = this.a($$0);
         if ($$3.e()) {
            return Optional.empty();
         } else {
            if (this.g().e()) {
               this.a(cto.i, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cto b(int $$0, int $$1, clw $$2) {
      Optional<cto> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cto.i);
   }

   public cto d(cto $$0) {
      return this.b($$0, $$0.I());
   }

   public cto b(cto $$0, int $$1) {
      if (!$$0.e() && this.a($$0)) {
         cto $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.I()), this.a_($$0) - $$2.I());
         if ($$2.e()) {
            this.e($$0.a($$3));
         } else if (cto.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(clw $$0) {
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
