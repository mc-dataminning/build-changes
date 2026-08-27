import java.util.UUID;
import javax.annotation.Nullable;

public record aba(UUID a, int b, @Nullable vs c, vz.a d, @Nullable vg e, vk f, vc.b g) implements xg<zb> {
   public aba(uj $$0) {
      this($$0.p(), $$0.n(), $$0.c(vs::a), new vz.a($$0), $$0.c(uj::m), vk.a($$0), new vc.b($$0));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, vs::a);
      this.d.a($$0);
      $$0.a(this.e, uj::a);
      vk.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(zb $$0) {
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
   public vs e() {
      return this.c;
   }

   public vz.a f() {
      return this.d;
   }

   @Nullable
   public vg g() {
      return this.e;
   }

   public vk h() {
      return this.f;
   }

   public vc.b i() {
      return this.g;
   }
}
