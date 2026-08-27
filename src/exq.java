import java.util.Objects;
import javax.annotation.Nullable;

public class exq {
   private final exy a;
   private final String b;
   private final eyb c;
   private xe d;
   private xe e;
   private eyb.a f;
   private boolean g;
   @Nullable
   private yu h;

   public exq(exy $$0, String $$1, eyb $$2, xe $$3, eyb.a $$4, boolean $$5, @Nullable yu $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public exy a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eyb c() {
      return this.c;
   }

   public xe d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yu f() {
      return this.h;
   }

   public yu a(yu $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xe i() {
      return xh.a((xe)this.d.f().a($$0 -> $$0.a(new xk(xk.a.a, xe.b(this.b)))));
   }

   public xe g() {
      return this.e;
   }

   public void a(xe $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eyb.a h() {
      return this.f;
   }

   public void a(eyb.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yu $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
