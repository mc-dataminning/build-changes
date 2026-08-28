import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dnt extends dlu implements dun {
   public static final MapCodec<dnt> c = b(dnt::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final ece f = ebu.aC;
   public static final ebv g = dlu.b;
   public static final ebv h = ebu.I;
   public static final ToIntFunction<ebe> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ffq>> D = ag.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new ffq(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new ffq(6.0, 7.0, 8.0).c(0.0625), new ffq(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new ffq(8.0, 5.0, 10.0).c(0.0625), new ffq(6.0, 7.0, 8.0).c(0.0625), new ffq(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new ffq(7.0, 5.0, 9.0).c(0.0625), new ffq(10.0, 7.0, 9.0).c(0.0625), new ffq(6.0, 7.0, 6.0).c(0.0625), new ffq(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final fgk[] R = new fgk[]{
      dnc.b(2.0, 0.0, 6.0), dnc.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dnc.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dnc.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dnt> a() {
      return c;
   }

   public dnt(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$0.f() && $$4.gk().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bur.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         exo $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == exp.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(h) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      if (!$$2.c(h) && $$3.a() == exp.c) {
         ebe $$4 = $$2.b(h, Boolean.valueOf(true));
         if ($$2.c(g)) {
            a(null, $$4, $$0, $$1);
         } else {
            $$0.a($$1, $$4, 3);
         }

         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   public static boolean h(ebe $$0) {
      return $$0.a(axe.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ffq> b(ebe $$0) {
      return (Iterable<ffq>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(ebe $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return dnc.a($$1, $$2.e(), jb.b);
   }
}
