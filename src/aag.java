import java.util.UUID;
import javax.annotation.Nullable;

public record aag(UUID a, int b, @Nullable vh c, vo.a d, @Nullable uv e, uz f, ur.b g) implements wo<yh> {
   public aag(ty $$0) {
      this($$0.p(), $$0.n(), $$0.c(vh::a), new vo.a($$0), $$0.c(ty::m), uz.a($$0), new ur.b($$0));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, vh::a);
      this.d.a($$0);
      $$0.a(this.e, ty::a);
      uz.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vh e() {
      return this.c;
   }

   public vo.a f() {
      return this.d;
   }

   @Nullable
   public uv g() {
      return this.e;
   }

   public uz h() {
      return this.f;
   }

   public ur.b i() {
      return this.g;
   }
}
