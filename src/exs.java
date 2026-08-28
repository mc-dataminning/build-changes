import java.util.Objects;
import javax.annotation.Nullable;

public class exs {
   private final eya a;
   private final String b;
   private final eyd c;
   private wy d;
   private wy e;
   private eyd.a f;
   private boolean g;
   @Nullable
   private yo h;

   public exs(eya $$0, String $$1, eyd $$2, wy $$3, eyd.a $$4, boolean $$5, @Nullable yo $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public eya a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eyd c() {
      return this.c;
   }

   public wy d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yo f() {
      return this.h;
   }

   public yo a(yo $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wy i() {
      return xb.a((wy)this.d.f().a($$0 -> $$0.a(new xe(xe.a.a, wy.b(this.b)))));
   }

   public wy g() {
      return this.e;
   }

   public void a(wy $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eyd.a h() {
      return this.f;
   }

   public void a(eyd.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yo $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
