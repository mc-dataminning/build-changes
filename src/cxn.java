import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cxn extends cvq implements ddy {
   public static final MapCodec<cxn> c = b(cxn::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dkp f = dkf.az;
   public static final dkg g = cvq.b;
   public static final dkg h = dkf.C;
   public static final ToIntFunction<djp> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<emc>> j = ac.a(() -> {
      Int2ObjectMap<List<emc>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new emc(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new emc(0.375, 0.44, 0.5), new emc(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new emc(0.5, 0.313, 0.625), new emc(0.375, 0.44, 0.5), new emc(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new emc(0.44, 0.313, 0.56), new emc(0.625, 0.44, 0.56), new emc(0.375, 0.44, 0.375), new emc(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final emv k = cwy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final emv l = cwy.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final emv m = cwy.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final emv n = cwy.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cxn> a() {
      return c;
   }

   public cxn(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$0.b() && $$4.fT().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bke.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return !$$1.h() && $$1.n().d() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eez $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == efa.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(h) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
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
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      if (!$$2.c(h) && $$3.a() == efa.c) {
         djp $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(djp $$0) {
      return $$0.a(asi.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<emc> b(djp $$0) {
      return (Iterable<emc>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(djp $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return cwy.a($$1, $$2.d(), ic.b);
   }
}
