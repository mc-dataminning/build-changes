import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class chh {
   private final int a;
   public final bhu d;
   public int e;
   public final int f;
   public final int g;

   public chh(bhu $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(ckj $$0, ckj $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(ckj $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(ckj $$0) {
   }

   public void a(ccx $$0, ckj $$1) {
      this.d();
   }

   public boolean a(ckj $$0) {
      return true;
   }

   public ckj e() {
      return this.d.a(this.a);
   }

   public boolean f() {
      return !this.e().b();
   }

   public void d(ckj $$0) {
      this.a($$0, this.e());
   }

   public void a(ckj $$0, ckj $$1) {
      this.e($$0);
   }

   public void e(ckj $$0) {
      this.d.a(this.a, $$0);
      this.d();
   }

   public void d() {
      this.d.e();
   }

   public int a() {
      return this.d.aj_();
   }

   public int a_(ckj $$0) {
      return Math.min(this.a(), $$0.g());
   }

   @Nullable
   public Pair<afw, afw> b() {
      return null;
   }

   public ckj a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(ccx $$0) {
      return true;
   }

   public boolean c() {
      return true;
   }

   public Optional<ckj> a(int $$0, int $$1, ccx $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.e().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         ckj $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.e().b()) {
               this.a(ckj.b, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public ckj b(int $$0, int $$1, ccx $$2) {
      Optional<ckj> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(ckj.b);
   }

   public ckj f(ckj $$0) {
      return this.b($$0, $$0.L());
   }

   public ckj b(ckj $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         ckj $$2 = this.e();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$2.b()) {
            this.d($$0.a($$3));
         } else if (ckj.c($$2, $$0)) {
            $$0.h($$3);
            $$2.g($$3);
            this.d($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(ccx $$0) {
      return this.a($$0) && this.a(this.e());
   }

   public int g() {
      return this.a;
   }

   public boolean h() {
      return true;
   }
}
