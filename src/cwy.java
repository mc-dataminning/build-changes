import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cwy extends cvb implements ddj {
   public static final MapCodec<cwy> c = b(cwy::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dka f = djq.az;
   public static final djr g = cvb.b;
   public static final djr h = djq.C;
   public static final ToIntFunction<dja> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<elm>> j = ac.a(() -> {
      Int2ObjectMap<List<elm>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new elm(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new elm(0.375, 0.44, 0.5), new elm(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new elm(0.5, 0.313, 0.625), new elm(0.375, 0.44, 0.5), new elm(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new elm(0.44, 0.313, 0.56), new elm(0.625, 0.44, 0.56), new elm(0.375, 0.44, 0.375), new elm(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final emf k = cwj.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final emf l = cwj.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final emf m = cwj.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final emf n = cwj.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cwy> a() {
      return c;
   }

   public cwy(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eek $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eel.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(h) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      if (!$$2.c(h) && $$3.a() == eel.c) {
         dja $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dja $$0) {
      return $$0.a(asb.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<elm> b(dja $$0) {
      return (Iterable<elm>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dja $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return cwj.a($$1, $$2.d(), ic.b);
   }
}
