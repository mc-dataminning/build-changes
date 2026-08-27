import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfw {
   private final int a;
   public final bgj d;
   public int e;
   public final int f;
   public final int g;

   public cfw(bgj $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void a(ciy $$0, ciy $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(ciy $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(ciy $$0) {
   }

   public void a(cbn $$0, ciy $$1) {
      this.d();
   }

   public boolean a(ciy $$0) {
      return true;
   }

   public ciy e() {
      return this.d.a(this.a);
   }

   public boolean f() {
      return !this.e().b();
   }

   public void d(ciy $$0) {
      this.e($$0);
   }

   public void e(ciy $$0) {
      this.d.a(this.a, $$0);
      this.d();
   }

   public void d() {
      this.d.e();
   }

   public int a() {
      return this.d.ac_();
   }

   public int a_(ciy $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<aer, aer> b() {
      return null;
   }

   public ciy a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cbn $$0) {
      return true;
   }

   public boolean c() {
      return true;
   }

   public Optional<ciy> a(int $$0, int $$1, cbn $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.e().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         ciy $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.e().b()) {
               this.d(ciy.b);
            }

            return Optional.of($$3);
         }
      }
   }

   public ciy b(int $$0, int $$1, cbn $$2) {
      Optional<ciy> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(ciy.b);
   }

   public ciy f(ciy $$0) {
      return this.b($$0, $$0.L());
   }

   public ciy b(ciy $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         ciy $$2 = this.e();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$2.b()) {
            this.d($$0.a($$3));
         } else if (ciy.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.d($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cbn $$0) {
      return this.a($$0) && this.a(this.e());
   }

   public int g() {
      return this.a;
   }

   public boolean h() {
      return true;
   }
}
