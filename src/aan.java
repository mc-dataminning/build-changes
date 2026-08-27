import java.util.UUID;
import javax.annotation.Nullable;

public record aan(UUID a, int b, @Nullable vn c, vu.a d, @Nullable vb e, vf f, ux.b g) implements wu<yo> {
   public aan(ue $$0) {
      this($$0.p(), $$0.n(), $$0.c(vn::a), new vu.a($$0), $$0.c(ue::m), vf.a($$0), new ux.b($$0));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, vn::a);
      this.d.a($$0);
      $$0.a(this.e, ue::a);
      vf.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(yo $$0) {
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
   public vn e() {
      return this.c;
   }

   public vu.a f() {
      return this.d;
   }

   @Nullable
   public vb g() {
      return this.e;
   }

   public vf h() {
      return this.f;
   }

   public ux.b i() {
      return this.g;
   }
}
