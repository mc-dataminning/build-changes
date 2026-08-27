import java.util.UUID;
import javax.annotation.Nullable;

public record aac(UUID a, int b, @Nullable vd c, vk.a d, @Nullable ur e, uv f, un.b g) implements wk<yd> {
   public aac(tu $$0) {
      this($$0.p(), $$0.n(), $$0.c(vd::a), new vk.a($$0), $$0.c(tu::m), uv.a($$0), new un.b($$0));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, vd::a);
      this.d.a($$0);
      $$0.a(this.e, tu::a);
      uv.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(yd $$0) {
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
   public vd e() {
      return this.c;
   }

   public vk.a f() {
      return this.d;
   }

   @Nullable
   public ur g() {
      return this.e;
   }

   public uv h() {
      return this.f;
   }

   public un.b i() {
      return this.g;
   }
}
