import java.util.Set;

public record aed(int b, bxr c, Set<bxs> d) implements zf<abu> {
   public static final yw<vu, aed> a = yw.a(yu.h, aed::b, bxr.a, aed::e, bxs.m, aed::f, aed::new);

   public static aed a(int $$0, bxr $$1, Set<bxs> $$2) {
      return new aed($$0, $$1, $$2);
   }

   @Override
   public zh<aed> a() {
      return agn.ai;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bxr e() {
      return this.c;
   }

   public Set<bxs> f() {
      return this.d;
   }
}
