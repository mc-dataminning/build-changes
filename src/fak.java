import java.util.Objects;
import javax.annotation.Nullable;

public class fak {
   private final fas a;
   private final String b;
   private final fav c;
   private xi d;
   private xi e;
   private fav.a f;
   private boolean g;
   @Nullable
   private yy h;

   public fak(fas $$0, String $$1, fav $$2, xi $$3, fav.a $$4, boolean $$5, @Nullable yy $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fas a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fav c() {
      return this.c;
   }

   public xi d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yy f() {
      return this.h;
   }

   public yy a(yy $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xi i() {
      return xl.a((xi)this.d.f().a($$0 -> $$0.a(new xo(xo.a.a, xi.b(this.b)))));
   }

   public xi g() {
      return this.e;
   }

   public void a(xi $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fav.a h() {
      return this.f;
   }

   public void a(fav.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yy $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
