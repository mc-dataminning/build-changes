import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfp extends dds implements dmb {
   public static final MapCodec<dfp> c = b(dfp::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dtd f = dst.az;
   public static final dsu g = dds.b;
   public static final dsu h = dst.C;
   public static final ToIntFunction<dsd> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evs>> j = ac.a(() -> {
      Int2ObjectMap<List<evs>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evs(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evs(0.375, 0.44, 0.5), new evs(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evs(0.5, 0.313, 0.625), new evs(0.375, 0.44, 0.5), new evs(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evs(0.44, 0.313, 0.56), new evs(0.625, 0.44, 0.56), new evs(0.375, 0.44, 0.375), new evs(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewl k = dfa.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewl l = dfa.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewl m = dfa.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewl n = dfa.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfp> a() {
      return c;
   }

   public dfp(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqx.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         enw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enx.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(h) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
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
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      if (!$$2.c(h) && $$3.a() == enx.c) {
         dsd $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dsd $$0) {
      return $$0.a(awp.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evs> b(dsd $$0) {
      return (Iterable<evs>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dsd $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return dfa.a($$1, $$2.d(), je.b);
   }
}
