import com.mojang.serialization.MapCodec;

public class dbm extends ddg implements ddy {
   public static final MapCodec<dbm> b = b(dbm::new);
   public static final dkg c = dkf.C;
   public static final dkg d = dkf.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dbm> a() {
      return b;
   }

   public dbm(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == efa.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(djp $$0, ctx $$1, hx $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(djp $$0, ctx $$1, hx $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(doy.a.b, $$2.u(), $$2.w()) - 1) {
         aus.a($$0.c(a).o(), $$1, $$2, 0.125, jx.aQ, bjn.a(1, 2));
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      if ($$0.aa() && $$3 instanceof cgu && ((cgu)$$3).K()) {
         hx $$4 = $$2.a();
         if ($$0.h($$4)) {
            bmn $$5 = bmc.ak.a($$0);
            if ($$5 != null) {
               $$5.e(emc.c($$4.c()));
               blw $$6 = $$3.w();
               $$5.b($$6 instanceof anf ? (anf)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, art.yZ, aru.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }
}
