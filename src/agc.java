import java.util.Set;

public record agc(int b, bxw c, Set<bxx> d, boolean e) implements zf<abu> {
   public static final yw<vu, agc> a = yw.a(yu.h, agc::b, bxw.a, agc::e, bxx.m, agc::f, yu.b, agc::g, agc::new);

   public static agc a(int $$0, bxw $$1, Set<bxx> $$2, boolean $$3) {
      return new agc($$0, $$1, $$2, $$3);
   }

   @Override
   public zh<agc> a() {
      return agn.bd;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bxw e() {
      return this.c;
   }

   public Set<bxx> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
