import java.util.Optional;

public record afs(String b, String c, int d, Optional<xc> e, Optional<ys> f) implements zj<aby> {
   public static final za<wn, afs> a = za.a(yy.p, afs::b, yy.p, afs::e, yy.h, afs::f, xe.e, afs::g, yu.d, afs::h, afs::new);

   @Override
   public zl<afs> a() {
      return agr.aP;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xc> g() {
      return this.e;
   }

   public Optional<ys> h() {
      return this.f;
   }
}
