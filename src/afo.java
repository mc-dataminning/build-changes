import java.util.Optional;

public record afo(String b, String c, int d, Optional<wy> e, Optional<yo> f) implements zf<abu> {
   public static final yw<wj, afo> a = yw.a(yu.p, afo::b, yu.p, afo::e, yu.h, afo::f, xa.e, afo::g, yq.d, afo::h, afo::new);

   @Override
   public zh<afo> a() {
      return agn.aP;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wy> g() {
      return this.e;
   }

   public Optional<yo> h() {
      return this.f;
   }
}
