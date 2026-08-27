import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends ddk {
   public static final MapCodec<dga> b = b(dga::new);
   @Nullable
   private static djf h;
   @Nullable
   private static djf i;

   @Override
   public MapCodec<dga> a() {
      return b;
   }

   protected dga(diz.d $$0) {
      super(ddk.b.d, $$0);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgo $$5 = $$0.c_($$1);
      if ($$5 instanceof dhz) {
         a($$0, $$1, (dhz)$$5);
      }
   }

   public static void a(cti $$0, hx $$1, dhz $$2) {
      if (!$$0.B) {
         dja $$3 = $$2.r();
         boolean $$4 = $$3.a(cwl.gG) || $$3.a(cwl.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.ak() != bjs.a) {
            djf.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cbc $$6 = blt.bm.a($$0);
               if ($$6 != null) {
                  cxd.a($$0, $$5);
                  hx $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ic.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ic.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (ana $$8 : $$0.a(ana.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cxd.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cti $$0, hx $$1, cmr $$2) {
      return $$2.a(cmu.uf) && $$1.v() >= $$0.J_() + 2 && $$0.ak() != bjs.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static djf s() {
      if (h == null) {
         h = djg.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(asb.aE)).a('^', dje.a(djj.a(cwl.gG).or(djj.a(cwl.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static djf y() {
      if (i == null) {
         i = djg.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(asb.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
