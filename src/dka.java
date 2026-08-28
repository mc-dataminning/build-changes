import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dka extends dic implements dqq {
   public static final MapCodec<dka> c = b(dka::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dxu f = dxl.aC;
   public static final dxm g = dic.b;
   public static final dxm h = dxl.J;
   public static final ToIntFunction<dwv> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fay>> j = af.a(() -> {
      Int2ObjectMap<List<fay>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fay(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fay(0.375, 0.44, 0.5), new fay(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fay(0.5, 0.313, 0.625), new fay(0.375, 0.44, 0.5), new fay(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fay(0.44, 0.313, 0.56), new fay(0.625, 0.44, 0.56), new fay(0.375, 0.44, 0.375), new fay(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fbs k = djk.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fbs l = djk.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fbs m = djk.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fbs n = djk.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dka> a() {
      return c;
   }

   public dka(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsi.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dwv $$0, dae $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         esx $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == esy.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(h) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ($$0.c(f)) {
         case 1:
         default:
            return k;
         case 2:
            return l;
         case 3:
            return m;
         case 4:
            return n;
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      if (!$$2.c(h) && $$3.a() == esy.c) {
         dwv $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dwv $$0) {
      return $$0.a(awo.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fay> b(dwv $$0) {
      return (Iterable<fay>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dwv $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return djk.a($$1, $$2.e(), jn.b);
   }
}
