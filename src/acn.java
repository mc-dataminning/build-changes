import java.util.UUID;
import javax.annotation.Nullable;

public record acn(UUID b, int c, @Nullable wg d, wn.a e, @Nullable vu f, vy g, vq.a h) implements yb<aam> {
   public static final xs<vf, acn> a = yb.a(acn::a, acn::new);

   private acn(vf $$0) {
      this($$0.n(), $$0.l(), $$0.c(wg::a), new wn.a($$0), uu.a($$0, vw.b), vy.a($$0), vq.a.a.decode($$0));
   }

   private void a(vf $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, wg::a);
      this.e.a($$0);
      uu.a($$0, this.f, vw.b);
      vy.a($$0, this.g);
      vq.a.a.encode($$0, this.h);
   }

   @Override
   public yd<acn> a() {
      return aex.aa;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public wg f() {
      return this.d;
   }

   public wn.a g() {
      return this.e;
   }

   @Nullable
   public vu h() {
      return this.f;
   }

   public vy i() {
      return this.g;
   }

   public vq.a j() {
      return this.h;
   }
}
