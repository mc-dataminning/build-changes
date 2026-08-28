import java.util.Optional;

public record adx(fbx b, Optional<fbx> c, lq d, jq<axe> e) implements aac<acr> {
   public static final zt<xg, adx> a = zt.a(fbx.b, adx::b, fbx.b.a(zr::a), adx::e, ls.bi, adx::f, axe.d, adx::g, adx::new);

   @Override
   public aae<adx> a() {
      return ahk.E;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public Optional<fbx> e() {
      return this.c;
   }

   public lq f() {
      return this.d;
   }

   public jq<axe> g() {
      return this.e;
   }
}
