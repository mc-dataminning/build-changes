import java.util.Objects;
import javax.annotation.Nullable;

public class evi {
   private final evq a;
   private final String b;
   private final evt c;
   private wx d;
   private wx e;
   private evt.a f;
   private boolean g;
   @Nullable
   private yn h;

   public evi(evq $$0, String $$1, evt $$2, wx $$3, evt.a $$4, boolean $$5, @Nullable yn $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public evq a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public evt c() {
      return this.c;
   }

   public wx d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yn f() {
      return this.h;
   }

   public yn a(yn $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wx i() {
      return xa.a((wx)this.d.f().a($$0 -> $$0.a(new xd(xd.a.a, wx.b(this.b)))));
   }

   public wx g() {
      return this.e;
   }

   public void a(wx $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public evt.a h() {
      return this.f;
   }

   public void a(evt.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yn $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
