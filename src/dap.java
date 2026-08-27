import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dap extends cys implements dha {
   public static final MapCodec<dap> c = b(dap::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dnz f = dnp.az;
   public static final dnq g = cys.b;
   public static final dnq h = dnp.C;
   public static final ToIntFunction<dmz> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<epr>> j = ac.a(() -> {
      Int2ObjectMap<List<epr>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new epr(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new epr(0.375, 0.44, 0.5), new epr(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new epr(0.5, 0.313, 0.625), new epr(0.375, 0.44, 0.5), new epr(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new epr(0.44, 0.313, 0.56), new epr(0.625, 0.44, 0.56), new epr(0.375, 0.44, 0.375), new epr(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eqk k = daa.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eqk l = daa.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eqk m = daa.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eqk n = daa.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dap> a() {
      return c;
   }

   public dap(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$0.b() && $$4.ga().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bne.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      return !$$1.h() && $$1.n().d() == this.l() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dmz a(css $$0) {
      dmz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ein $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eio.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(h) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
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
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      if (!$$2.c(h) && $$3.a() == eio.c) {
         dmz $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dmz $$0) {
      return $$0.a(aun.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<epr> b(dmz $$0) {
      return (Iterable<epr>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dmz $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return daa.a($$1, $$2.d(), ih.b);
   }
}
