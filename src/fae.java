import java.util.Objects;
import javax.annotation.Nullable;

public class fae {
   private final fam a;
   private final String b;
   private final fap c;
   private xh d;
   private xh e;
   private fap.a f;
   private boolean g;
   @Nullable
   private yx h;

   public fae(fam $$0, String $$1, fap $$2, xh $$3, fap.a $$4, boolean $$5, @Nullable yx $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fam a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fap c() {
      return this.c;
   }

   public xh d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yx f() {
      return this.h;
   }

   public yx a(yx $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xh i() {
      return xk.a((xh)this.d.f().a($$0 -> $$0.a(new xn(xn.a.a, xh.b(this.b)))));
   }

   public xh g() {
      return this.e;
   }

   public void a(xh $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fap.a h() {
      return this.f;
   }

   public void a(fap.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yx $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
