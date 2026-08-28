import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfu extends ddx implements dmg {
   public static final MapCodec<dfu> c = b(dfu::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dth f = dsx.az;
   public static final dsy g = ddx.b;
   public static final dsy h = dsx.C;
   public static final ToIntFunction<dsh> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evz>> j = ac.a(() -> {
      Int2ObjectMap<List<evz>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evz(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evz(0.375, 0.44, 0.5), new evz(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evz(0.5, 0.313, 0.625), new evz(0.375, 0.44, 0.5), new evz(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evz(0.44, 0.313, 0.56), new evz(0.625, 0.44, 0.56), new evz(0.375, 0.44, 0.375), new evz(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ews k = dff.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ews l = dff.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ews m = dff.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ews n = dff.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfu> a() {
      return c;
   }

   public dfu(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$0.e() && $$4.fZ().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eob $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eoc.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(h) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
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
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      if (!$$2.c(h) && $$3.a() == eoc.c) {
         dsh $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsh $$0) {
      return $$0.a(avu.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evz> b(dsh $$0) {
      return (Iterable<evz>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsh $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return dff.a($$1, $$2.d(), jf.b);
   }
}
