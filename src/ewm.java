import java.util.Objects;
import javax.annotation.Nullable;

public class ewm {
   private final ewu a;
   private final String b;
   private final ewx c;
   private xo d;
   private xo e;
   private ewx.a f;
   private boolean g;
   @Nullable
   private ze h;

   public ewm(ewu $$0, String $$1, ewx $$2, xo $$3, ewx.a $$4, boolean $$5, @Nullable ze $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public ewu a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public ewx c() {
      return this.c;
   }

   public xo d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public ze f() {
      return this.h;
   }

   public ze a(ze $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xo i() {
      return xr.a((xo)this.d.f().a($$0 -> $$0.a(new xu(xu.a.a, xo.b(this.b)))));
   }

   public xo g() {
      return this.e;
   }

   public void a(xo $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public ewx.a h() {
      return this.f;
   }

   public void a(ewx.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable ze $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
