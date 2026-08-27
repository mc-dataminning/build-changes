import java.util.UUID;
import javax.annotation.Nullable;

public record aaw(UUID a, int b, @Nullable vp c, vw.a d, @Nullable vd e, vh f, uz.b g) implements xd<yx> {
   public aaw(ug $$0) {
      this($$0.p(), $$0.n(), $$0.c(vp::a), new vw.a($$0), $$0.c(ug::m), vh.a($$0), new uz.b($$0));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, vp::a);
      this.d.a($$0);
      $$0.a(this.e, ug::a);
      vh.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(yx $$0) {
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
   public vp e() {
      return this.c;
   }

   public vw.a f() {
      return this.d;
   }

   @Nullable
   public vd g() {
      return this.e;
   }

   public vh h() {
      return this.f;
   }

   public uz.b i() {
      return this.g;
   }
}
