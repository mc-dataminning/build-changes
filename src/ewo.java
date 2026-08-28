import java.util.Objects;
import javax.annotation.Nullable;

public class ewo {
   private final eww a;
   private final String b;
   private final ewz c;
   private xp d;
   private xp e;
   private ewz.a f;
   private boolean g;
   @Nullable
   private zf h;

   public ewo(eww $$0, String $$1, ewz $$2, xp $$3, ewz.a $$4, boolean $$5, @Nullable zf $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public eww a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public ewz c() {
      return this.c;
   }

   public xp d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public zf f() {
      return this.h;
   }

   public zf a(zf $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xp i() {
      return xs.a((xp)this.d.f().a($$0 -> $$0.a(new xv(xv.a.a, xp.b(this.b)))));
   }

   public xp g() {
      return this.e;
   }

   public void a(xp $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public ewz.a h() {
      return this.f;
   }

   public void a(ewz.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable zf $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
