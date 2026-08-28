import java.util.Objects;
import javax.annotation.Nullable;

public class ezp {
   private final ezx a;
   private final String b;
   private final faa c;
   private xd d;
   private xd e;
   private faa.a f;
   private boolean g;
   @Nullable
   private yt h;

   public ezp(ezx $$0, String $$1, faa $$2, xd $$3, faa.a $$4, boolean $$5, @Nullable yt $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public ezx a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public faa c() {
      return this.c;
   }

   public xd d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yt f() {
      return this.h;
   }

   public yt a(yt $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xd i() {
      return xg.a((xd)this.d.f().a($$0 -> $$0.a(new xj(xj.a.a, xd.b(this.b)))));
   }

   public xd g() {
      return this.e;
   }

   public void a(xd $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public faa.a h() {
      return this.f;
   }

   public void a(faa.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yt $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
