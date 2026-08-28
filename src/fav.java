import java.util.Objects;
import javax.annotation.Nullable;

public class fav {
   private final fbd a;
   private final String b;
   private final fbg c;
   private xj d;
   private xj e;
   private fbg.a f;
   private boolean g;
   @Nullable
   private yz h;

   public fav(fbd $$0, String $$1, fbg $$2, xj $$3, fbg.a $$4, boolean $$5, @Nullable yz $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fbd a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fbg c() {
      return this.c;
   }

   public xj d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yz f() {
      return this.h;
   }

   public yz a(yz $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xj i() {
      return xm.a((xj)this.d.f().a($$0 -> $$0.a(new xp(xp.a.a, xj.b(this.b)))));
   }

   public xj g() {
      return this.e;
   }

   public void a(xj $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fbg.a h() {
      return this.f;
   }

   public void a(fbg.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yz $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
