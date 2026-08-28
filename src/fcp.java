import java.util.Objects;
import javax.annotation.Nullable;

public class fcp {
   private final fcx a;
   private final String b;
   private final fda c;
   private xv d;
   private xv e;
   private fda.a f;
   private boolean g;
   @Nullable
   private zl h;

   public fcp(fcx $$0, String $$1, fda $$2, xv $$3, fda.a $$4, boolean $$5, @Nullable zl $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fcx a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fda c() {
      return this.c;
   }

   public xv d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public zl f() {
      return this.h;
   }

   public zl a(zl $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xv i() {
      return xy.a((xv)this.d.f().a($$0 -> $$0.a(new yb(yb.a.a, xv.b(this.b)))));
   }

   public xv g() {
      return this.e;
   }

   public void a(xv $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fda.a h() {
      return this.f;
   }

   public void a(fda.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable zl $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
