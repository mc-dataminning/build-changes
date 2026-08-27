import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class ctr extends crt implements dab {
   public static final MapCodec<ctr> c = b(ctr::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dgd f = dft.az;
   public static final dfu g = crt.b;
   public static final dfu h = dft.C;
   public static final ToIntFunction<dfd> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ehh>> j = ac.a(() -> {
      Int2ObjectMap<List<ehh>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehh(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehh(0.375, 0.44, 0.5), new ehh(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehh(0.5, 0.313, 0.625), new ehh(0.375, 0.44, 0.5), new ehh(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehh(0.44, 0.313, 0.56), new ehh(0.625, 0.44, 0.56), new ehh(0.375, 0.44, 0.375), new ehh(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eia k = ctc.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eia l = ctc.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eia m = ctc.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eia n = ctc.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<ctr> a() {
      return c;
   }

   public ctr(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eag $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eah.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(h) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
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
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      if (!$$2.c(h) && $$3.a() == eah.c) {
         dfd $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dfd $$0) {
      return $$0.a(apv.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ehh> b(dfd $$0) {
      return (Iterable<ehh>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dfd $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return ctc.a($$1, $$2.d(), ha.b);
   }
}
