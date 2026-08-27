import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dar extends cyu implements dhc {
   public static final MapCodec<dar> c = b(dar::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dob f = dnr.az;
   public static final dns g = cyu.b;
   public static final dns h = dnr.C;
   public static final ToIntFunction<dnb> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ept>> j = ac.a(() -> {
      Int2ObjectMap<List<ept>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ept(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ept(0.375, 0.44, 0.5), new ept(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ept(0.5, 0.313, 0.625), new ept(0.375, 0.44, 0.5), new ept(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ept(0.44, 0.313, 0.56), new ept(0.625, 0.44, 0.56), new ept(0.375, 0.44, 0.375), new ept(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eqm k = dac.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eqm l = dac.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eqm m = dac.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eqm n = dac.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dar> a() {
      return c;
   }

   public dar(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$0.b() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bnf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      return !$$1.h() && $$1.n().d() == this.l() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eip $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eiq.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(h) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      if (!$$2.c(h) && $$3.a() == eiq.c) {
         dnb $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dnb $$0) {
      return $$0.a(aun.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ept> b(dnb $$0) {
      return (Iterable<ept>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dnb $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return dac.a($$1, $$2.d(), ih.b);
   }
}
