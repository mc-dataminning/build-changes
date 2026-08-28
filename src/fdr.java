import java.util.Objects;
import javax.annotation.Nullable;

public class fdr {
   private final fdz a;
   private final String b;
   private final fec c;
   private wv d;
   private wv e;
   private fec.a f;
   private boolean g;
   @Nullable
   private yl h;

   public fdr(fdz $$0, String $$1, fec $$2, wv $$3, fec.a $$4, boolean $$5, @Nullable yl $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fdz a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fec c() {
      return this.c;
   }

   public wv d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yl f() {
      return this.h;
   }

   public yl a(yl $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wv i() {
      return wy.a((wv)this.d.f().a($$0 -> $$0.a(new xb.e(wv.b(this.b)))));
   }

   public wv g() {
      return this.e;
   }

   public void a(wv $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fec.a h() {
      return this.f;
   }

   public void a(fec.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yl $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
