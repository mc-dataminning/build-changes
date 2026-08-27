import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cta extends cre implements czn {
   public static final int c = 1;
   public static final int d = 4;
   public static final dga e = dfq.az;
   public static final dfr f = cre.b;
   public static final dfr g = dfq.C;
   public static final ToIntFunction<dfa> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<ehe>> i = ac.a(() -> {
      Int2ObjectMap<List<ehe>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ehe(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ehe(0.375, 0.44, 0.5), new ehe(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ehe(0.5, 0.313, 0.625), new ehe(0.375, 0.44, 0.5), new ehe(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ehe(0.44, 0.313, 0.56), new ehe(0.625, 0.44, 0.56), new ehe(0.375, 0.44, 0.375), new ehe(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ehx j = csm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ehx k = csm.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ehx l = csm.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ehx m = csm.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public cta(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$3.fR().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         ead $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eae.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(g) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ($$0.c(e)) {
         case 1:
         default:
            return j;
         case 2:
            return k;
         case 3:
            return l;
         case 4:
            return m;
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cpn $$0, gu $$1, dfa $$2, ead $$3) {
      if (!$$2.c(g) && $$3.a() == eae.c) {
         dfa $$4 = $$2.a(g, Boolean.valueOf(true));
         if ($$2.c(f)) {
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

   public static boolean g(dfa $$0) {
      return $$0.a(apl.ae, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<ehe> b(dfa $$0) {
      return (Iterable<ehe>)i.get($$0.c(e));
   }

   @Override
   protected boolean d(dfa $$0) {
      return !$$0.c(g) && super.d($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return csm.a($$1, $$2.d(), ha.b);
   }
}
