import java.util.UUID;
import javax.annotation.Nullable;

public record acg(UUID b, int c, @Nullable wc d, wj.a e, @Nullable vq f, vu g, vm.b h) implements xx<aag> {
   public static final xo<uq, acg> a = xx.a(acg::a, acg::new);

   private acg(uq $$0) {
      this($$0.p(), $$0.n(), $$0.c(wc::a), new wj.a($$0), $$0.c(uq::m), vu.a($$0), new vm.b($$0));
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, wc::a);
      this.e.a($$0);
      $$0.a(this.f, uq::a);
      vu.a($$0, this.g);
      this.h.a($$0);
   }

   @Override
   public xz<acg> a() {
      return aeq.Z;
   }

   public void a(aag $$0) {
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
   public wc f() {
      return this.d;
   }

   public wj.a g() {
      return this.e;
   }

   @Nullable
   public vq h() {
      return this.f;
   }

   public vu i() {
      return this.g;
   }

   public vm.b j() {
      return this.h;
   }
}
