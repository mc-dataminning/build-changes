import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dma {
   public static final MapCodec<dor> b = b(dor::new);
   @Nullable
   private static dsg h;
   @Nullable
   private static dsg i;

   @Override
   public MapCodec<dor> a() {
      return b;
   }

   protected dor(dsa.d $$0) {
      super(dma.b.d, $$0);
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, @Nullable bto $$3, cuo $$4) {
      a($$0, $$1);
   }

   public static void a(dbx $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dqs $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dbx $$0, iz $$1, dqs $$2) {
      if (!$$0.B) {
         dsb $$3 = $$2.n();
         boolean $$4 = $$3.a(dfa.gG) || $$3.a(dfa.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqq.a) {
            dsg.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               ciu $$6 = bsz.bp.a($$0);
               if ($$6 != null) {
                  dfs.a($$0, $$5);
                  iz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == je.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == je.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (arf $$8 : $$0.a(arf.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfs.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dbx $$0, iz $$1, cuo $$2) {
      return $$2.a(cur.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqq.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsg y() {
      if (h == null) {
         h = dsh.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awo.aF)).a('^', dsf.a(dsk.a(dfa.gG).or(dsk.a(dfa.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsg z() {
      if (i == null) {
         i = dsh.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awo.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
