import java.util.UUID;
import javax.annotation.Nullable;

public record acj(UUID b, int c, @Nullable we d, wl.a e, @Nullable vs f, vw g, vo.a h) implements xz<aai> {
   public static final xq<vd, acj> a = xz.a(acj::a, acj::new);

   private acj(vd $$0) {
      this($$0.n(), $$0.l(), $$0.c(we::a), new wl.a($$0), us.a($$0, vu.b), vw.a($$0), vo.a.a.decode($$0));
   }

   private void a(vd $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, we::a);
      this.e.a($$0);
      us.a($$0, this.f, vu.b);
      vw.a($$0, this.g);
      vo.a.a.encode($$0, this.h);
   }

   @Override
   public yb<acj> a() {
      return aet.aa;
   }

   public void a(aai $$0) {
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
   public we f() {
      return this.d;
   }

   public wl.a g() {
      return this.e;
   }

   @Nullable
   public vs h() {
      return this.f;
   }

   public vw i() {
      return this.g;
   }

   public vo.a j() {
      return this.h;
   }
}
