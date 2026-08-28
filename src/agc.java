import java.util.Set;

public record agc(int b, bxp c, Set<bxq> d, boolean e) implements zf<abu> {
   public static final yw<vu, agc> a = yw.a(yu.h, agc::b, bxp.a, agc::e, bxq.m, agc::f, yu.b, agc::g, agc::new);

   public static agc a(int $$0, bxp $$1, Set<bxq> $$2, boolean $$3) {
      return new agc($$0, $$1, $$2, $$3);
   }

   @Override
   public zh<agc> a() {
      return agn.bd;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bxp e() {
      return this.c;
   }

   public Set<bxq> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
