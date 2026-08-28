import java.util.Optional;

public record afs(String b, String c, int d, Optional<xl> e, Optional<zb> f) implements zs<ace> {
   public static final zj<ww, afs> a = zj.a(zh.l, afs::b, zh.l, afs::e, zh.g, afs::f, xn.e, afs::g, zd.d, afs::h, afs::new);

   @Override
   public zu<afs> a() {
      return agq.aL;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xl> g() {
      return this.e;
   }

   public Optional<zb> h() {
      return this.f;
   }
}
