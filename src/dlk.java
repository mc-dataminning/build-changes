import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dlk extends djm implements dsb {
   public static final MapCodec<dlk> c = b(dlk::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dzm f = dzc.aC;
   public static final dzd g = djm.b;
   public static final dzd h = dzc.I;
   public static final ToIntFunction<dym> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fcu>> C = af.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fcu(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fcu(6.0, 7.0, 8.0).c(0.0625), new fcu(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fcu(8.0, 5.0, 10.0).c(0.0625), new fcu(6.0, 7.0, 8.0).c(0.0625), new fcu(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fcu(7.0, 5.0, 9.0).c(0.0625), new fcu(10.0, 7.0, 9.0).c(0.0625), new fcu(6.0, 7.0, 6.0).c(0.0625), new fcu(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final fdo[] Q = new fdo[]{
      dku.b(2.0, 0.0, 6.0), dku.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dku.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dku.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dlk> a() {
      return c;
   }

   public dlk(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return btq.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      return !$$1.h() && $$1.n().h() == this.i() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eut $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == euu.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(h) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return Q[$$0.c(f) - 1];
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      if (!$$2.c(h) && $$3.a() == euu.c) {
         dym $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dym $$0) {
      return $$0.a(awz.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fcu> b(dym $$0) {
      return (Iterable<fcu>)C.get($$0.c(f));
   }

   @Override
   protected boolean d(dym $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return dku.a($$1, $$2.e(), jo.b);
   }
}
