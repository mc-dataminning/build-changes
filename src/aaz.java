import java.util.UUID;
import javax.annotation.Nullable;

public record aaz(UUID a, int b, @Nullable vr c, vy.a d, @Nullable vf e, vj f, vb.b g) implements xf<za> {
   public aaz(ui $$0) {
      this($$0.p(), $$0.n(), $$0.c(vr::a), new vy.a($$0), $$0.c(ui::m), vj.a($$0), new vb.b($$0));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, vr::a);
      this.d.a($$0);
      $$0.a(this.e, ui::a);
      vj.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(za $$0) {
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
   public vr e() {
      return this.c;
   }

   public vy.a f() {
      return this.d;
   }

   @Nullable
   public vf g() {
      return this.e;
   }

   public vj h() {
      return this.f;
   }

   public vb.b i() {
      return this.g;
   }
}
