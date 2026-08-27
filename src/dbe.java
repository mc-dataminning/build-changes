import com.mojang.serialization.MapCodec;

public class dbe extends dcy implements ddq {
   public static final MapCodec<dbe> b = b(dbe::new);
   public static final djy c = djx.C;
   public static final djy d = djx.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dbe> a() {
      return b;
   }

   public dbe(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ees.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(djh $$0, ctp $$1, hx $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(djh $$0, ctp $$1, hx $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(doq.a.b, $$2.u(), $$2.w()) - 1) {
         aur.a($$0.c(a).o(), $$1, $$2, 0.125, jx.aQ, bjm.a(1, 2));
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      if ($$0.aa() && $$3 instanceof cgm && ((cgm)$$3).M()) {
         hx $$4 = $$2.a();
         if ($$0.h($$4)) {
            bmk $$5 = blz.aj.a($$0);
            if ($$5 != null) {
               $$5.e(elt.c($$4.c()));
               blv $$6 = $$3.w();
               $$5.b($$6 instanceof ane ? (ane)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, ars.yK, art.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }
}
