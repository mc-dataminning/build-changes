import java.util.Objects;
import javax.annotation.Nullable;

public class etf {
   private final etn a;
   private final String b;
   private final etq c;
   private wi d;
   private wi e;
   private etq.a f;
   private boolean g;
   @Nullable
   private xy h;

   public etf(etn $$0, String $$1, etq $$2, wi $$3, etq.a $$4, boolean $$5, @Nullable xy $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public etn a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public etq c() {
      return this.c;
   }

   public wi d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public xy f() {
      return this.h;
   }

   public xy a(xy $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wi i() {
      return wl.a((wi)this.d.f().a($$0 -> $$0.a(new wo(wo.a.a, wi.b(this.b)))));
   }

   public wi g() {
      return this.e;
   }

   public void a(wi $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public etq.a h() {
      return this.f;
   }

   public void a(etq.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable xy $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
