import java.util.Objects;
import javax.annotation.Nullable;

public class eza {
   private final ezi a;
   private final String b;
   private final ezl c;
   private xd d;
   private xd e;
   private ezl.a f;
   private boolean g;
   @Nullable
   private yt h;

   public eza(ezi $$0, String $$1, ezl $$2, xd $$3, ezl.a $$4, boolean $$5, @Nullable yt $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public ezi a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public ezl c() {
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

   public ezl.a h() {
      return this.f;
   }

   public void a(ezl.a $$0) {
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
