import java.util.Objects;
import javax.annotation.Nullable;

public class fet {
   private final ffb a;
   private final String b;
   private final ffe c;
   private ww d;
   private ww e;
   private ffe.a f;
   private boolean g;
   @Nullable
   private ym h;

   public fet(ffb $$0, String $$1, ffe $$2, ww $$3, ffe.a $$4, boolean $$5, @Nullable ym $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public ffb a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public ffe c() {
      return this.c;
   }

   public ww d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public ym f() {
      return this.h;
   }

   public ym a(ym $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private ww i() {
      return wz.a((ww)this.d.f().a($$0 -> $$0.a(new xc.e(ww.b(this.b)))));
   }

   public ww g() {
      return this.e;
   }

   public void a(ww $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public ffe.a h() {
      return this.f;
   }

   public void a(ffe.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable ym $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
