import java.util.Optional;

public record afb(String b, String c, int d, Optional<wu> e, Optional<yk> f) implements zb<abn> {
   public static final ys<wf, afb> a = ys.a(yq.l, afb::b, yq.l, afb::e, yq.g, afb::f, ww.e, afb::g, ym.d, afb::h, afb::new);

   @Override
   public zd<afb> a() {
      return afz.aL;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wu> g() {
      return this.e;
   }

   public Optional<yk> h() {
      return this.f;
   }
}
