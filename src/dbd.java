import com.mojang.serialization.MapCodec;

public class dbd extends dcx implements ddp {
   public static final MapCodec<dbd> b = b(dbd::new);
   public static final djx c = djw.C;
   public static final djx d = djw.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dbd> a() {
      return b;
   }

   public dbd(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eer.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(djg $$0, cto $$1, hx $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(djg $$0, cto $$1, hx $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(dop.a.b, $$2.u(), $$2.w()) - 1) {
         auq.a($$0.c(a).o(), $$1, $$2, 0.125, jx.aQ, bjl.a(1, 2));
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      if ($$0.aa() && $$3 instanceof cgl && ((cgl)$$3).M()) {
         hx $$4 = $$2.a();
         if ($$0.h($$4)) {
            bmj $$5 = bly.aj.a($$0);
            if ($$5 != null) {
               $$5.e(els.c($$4.c()));
               blu $$6 = $$3.w();
               $$5.b($$6 instanceof ane ? (ane)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, arr.yK, ars.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }
}
