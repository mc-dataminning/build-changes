import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dmw extends dkx implements dtq {
   public static final MapCodec<dmw> c = b(dmw::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final ebh f = eax.aC;
   public static final eay g = dkx.b;
   public static final eay h = eax.I;
   public static final ToIntFunction<eah> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<feq>> D = af.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new feq(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new feq(6.0, 7.0, 8.0).c(0.0625), new feq(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new feq(8.0, 5.0, 10.0).c(0.0625), new feq(6.0, 7.0, 8.0).c(0.0625), new feq(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new feq(7.0, 5.0, 9.0).c(0.0625), new feq(10.0, 7.0, 9.0).c(0.0625), new feq(6.0, 7.0, 6.0).c(0.0625), new feq(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final ffk[] R = new ffk[]{
      dmf.b(2.0, 0.0, 6.0), dmf.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dmf.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dmf.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dmw> a() {
      return c;
   }

   public dmw(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$0.f() && $$4.gk().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bud.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eah a(dcw $$0) {
      eah $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ewo $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ewp.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(h) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      if (!$$2.c(h) && $$3.a() == ewp.c) {
         eah $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(eah $$0) {
      return $$0.a(axc.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<feq> b(eah $$0) {
      return (Iterable<feq>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(eah $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return dmf.a($$1, $$2.e(), ja.b);
   }
}
