import java.util.Objects;
import javax.annotation.Nullable;

public class fbx {
   private final fcf a;
   private final String b;
   private final fci c;
   private wo d;
   private wo e;
   private fci.a f;
   private boolean g;
   @Nullable
   private ye h;

   public fbx(fcf $$0, String $$1, fci $$2, wo $$3, fci.a $$4, boolean $$5, @Nullable ye $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fcf a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fci c() {
      return this.c;
   }

   public wo d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public ye f() {
      return this.h;
   }

   public ye a(ye $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wo i() {
      return wr.a((wo)this.d.f().a($$0 -> $$0.a(new wu(wu.a.a, wo.b(this.b)))));
   }

   public wo g() {
      return this.e;
   }

   public void a(wo $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fci.a h() {
      return this.f;
   }

   public void a(fci.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable ye $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
