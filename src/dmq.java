import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dmq extends dks implements dtj {
   public static final MapCodec<dmq> c = b(dmq::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final eaz f = eap.aC;
   public static final eaq g = dks.b;
   public static final eaq h = eap.I;
   public static final ToIntFunction<dzz> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fei>> C = af.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fei(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fei(6.0, 7.0, 8.0).c(0.0625), new fei(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fei(8.0, 5.0, 10.0).c(0.0625), new fei(6.0, 7.0, 8.0).c(0.0625), new fei(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fei(7.0, 5.0, 9.0).c(0.0625), new fei(10.0, 7.0, 9.0).c(0.0625), new fei(6.0, 7.0, 6.0).c(0.0625), new fei(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final ffc[] Q = new ffc[]{
      dma.b(2.0, 0.0, 6.0), dma.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dma.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dma.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dmq> a() {
      return c;
   }

   public dmq(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bub.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dzz $$0, dcr $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ewg $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ewh.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(h) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return Q[$$0.c(f) - 1];
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      if (!$$2.c(h) && $$3.a() == ewh.c) {
         dzz $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dzz $$0) {
      return $$0.a(axc.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fei> b(dzz $$0) {
      return (Iterable<fei>)C.get($$0.c(f));
   }

   @Override
   protected boolean d(dzz $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return dma.a($$1, $$2.e(), ja.b);
   }
}
