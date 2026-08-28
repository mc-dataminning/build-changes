import java.util.Objects;
import javax.annotation.Nullable;

public class exw {
   private final eye a;
   private final String b;
   private final eyh c;
   private wz d;
   private wz e;
   private eyh.a f;
   private boolean g;
   @Nullable
   private yp h;

   public exw(eye $$0, String $$1, eyh $$2, wz $$3, eyh.a $$4, boolean $$5, @Nullable yp $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public eye a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eyh c() {
      return this.c;
   }

   public wz d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yp f() {
      return this.h;
   }

   public yp a(yp $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wz i() {
      return xc.a((wz)this.d.f().a($$0 -> $$0.a(new xf(xf.a.a, wz.b(this.b)))));
   }

   public wz g() {
      return this.e;
   }

   public void a(wz $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eyh.a h() {
      return this.f;
   }

   public void a(eyh.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yp $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
