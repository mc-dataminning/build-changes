import java.util.Objects;
import javax.annotation.Nullable;

public class fao {
   private final faw a;
   private final String b;
   private final faz c;
   private xl d;
   private xl e;
   private faz.a f;
   private boolean g;
   @Nullable
   private zb h;

   public fao(faw $$0, String $$1, faz $$2, xl $$3, faz.a $$4, boolean $$5, @Nullable zb $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public faw a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public faz c() {
      return this.c;
   }

   public xl d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public zb f() {
      return this.h;
   }

   public zb a(zb $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xl i() {
      return xo.a((xl)this.d.f().a($$0 -> $$0.a(new xr(xr.a.a, xl.b(this.b)))));
   }

   public xl g() {
      return this.e;
   }

   public void a(xl $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public faz.a h() {
      return this.f;
   }

   public void a(faz.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable zb $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
