import com.mojang.serialization.MapCodec;

public class dlk extends dnf implements dnx {
   public static final MapCodec<dlk> b = b(dlk::new);
   public static final dur c = duq.C;
   public static final dur d = duq.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dlk> a() {
      return b;
   }

   public dlk(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(a, jj.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqc.c;
      return this.o().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dua $$0, dds $$1, je $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dua $$0, dds $$1, je $$2) {
      jj $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, erf.a($$1, $$3, null));
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$1.ad() && (long)$$1.z.a(200) <= $$1.aa() % 200L && $$2.v() == $$1.a(dzw.a.b, $$2.u(), $$2.w()) - 1) {
         azg.a($$0.c(a).o(), $$1, $$2, 0.125, ln.aT, bqv.a(1, 2));
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }
}
