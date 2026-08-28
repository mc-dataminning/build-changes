import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dmk extends dkm implements dtb {
   public static final MapCodec<dmk> c = b(dmk::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final eao f = eae.aC;
   public static final eaf g = dkm.b;
   public static final eaf h = eae.I;
   public static final ToIntFunction<dzo> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fdw>> C = af.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fdw(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fdw(6.0, 7.0, 8.0).c(0.0625), new fdw(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fdw(8.0, 5.0, 10.0).c(0.0625), new fdw(6.0, 7.0, 8.0).c(0.0625), new fdw(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fdw(7.0, 5.0, 9.0).c(0.0625), new fdw(10.0, 7.0, 9.0).c(0.0625), new fdw(6.0, 7.0, 6.0).c(0.0625), new fdw(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final feq[] Q = new feq[]{
      dlu.b(2.0, 0.0, 6.0), dlu.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dlu.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dlu.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dmk> a() {
      return c;
   }

   public dmk(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bty.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dzo $$0, dcl $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         evv $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == evw.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(h) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return Q[$$0.c(f) - 1];
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      if (!$$2.c(h) && $$3.a() == evw.c) {
         dzo $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dzo $$0) {
      return $$0.a(axa.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fdw> b(dzo $$0) {
      return (Iterable<fdw>)C.get($$0.c(f));
   }

   @Override
   protected boolean d(dzo $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return dlu.a($$1, $$2.e(), ja.b);
   }
}
