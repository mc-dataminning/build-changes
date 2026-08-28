import java.util.Objects;
import javax.annotation.Nullable;

public class ewv {
   private final exd a;
   private final String b;
   private final exg c;
   private wu d;
   private wu e;
   private exg.a f;
   private boolean g;
   @Nullable
   private yk h;

   public ewv(exd $$0, String $$1, exg $$2, wu $$3, exg.a $$4, boolean $$5, @Nullable yk $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public exd a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public exg c() {
      return this.c;
   }

   public wu d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yk f() {
      return this.h;
   }

   public yk a(yk $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wu i() {
      return wx.a((wu)this.d.f().a($$0 -> $$0.a(new xa(xa.a.a, wu.b(this.b)))));
   }

   public wu g() {
      return this.e;
   }

   public void a(wu $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public exg.a h() {
      return this.f;
   }

   public void a(exg.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yk $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
