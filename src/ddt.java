import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class ddt extends dbw implements dkf {
   public static final MapCodec<ddt> c = b(ddt::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final drh f = dqx.az;
   public static final dqy g = dbw.b;
   public static final dqy h = dqx.C;
   public static final ToIntFunction<dqh> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<etp>> j = ac.a(() -> {
      Int2ObjectMap<List<etp>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new etp(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new etp(0.375, 0.44, 0.5), new etp(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new etp(0.5, 0.313, 0.625), new etp(0.375, 0.44, 0.5), new etp(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new etp(0.44, 0.313, 0.56), new etp(0.625, 0.44, 0.56), new etp(0.375, 0.44, 0.375), new etp(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eui k = dde.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eui l = dde.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eui m = dde.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eui n = dde.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<ddt> a() {
      return c;
   }

   public ddt(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$0.d() && $$4.gb().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bpo.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return !$$1.h() && $$1.n().f() == this.q() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ema $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == emb.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(h) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
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
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      if (!$$2.c(h) && $$3.a() == emb.c) {
         dqh $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dqh $$0) {
      return $$0.a(avr.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<etp> b(dqh $$0) {
      return (Iterable<etp>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dqh $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return dde.a($$1, $$2.d(), is.b);
   }
}
