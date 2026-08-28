import java.util.Objects;
import javax.annotation.Nullable;

public class fco {
   private final fcw a;
   private final String b;
   private final fcz c;
   private xk d;
   private xk e;
   private fcz.a f;
   private boolean g;
   @Nullable
   private za h;

   public fco(fcw $$0, String $$1, fcz $$2, xk $$3, fcz.a $$4, boolean $$5, @Nullable za $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fcw a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fcz c() {
      return this.c;
   }

   public xk d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public za f() {
      return this.h;
   }

   public za a(za $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xk i() {
      return xn.a((xk)this.d.f().a($$0 -> $$0.a(new xq(xq.a.a, xk.b(this.b)))));
   }

   public xk g() {
      return this.e;
   }

   public void a(xk $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fcz.a h() {
      return this.f;
   }

   public void a(fcz.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable za $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
