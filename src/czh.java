import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class czh extends cxk implements dfs {
   public static final MapCodec<czh> c = b(czh::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dmj f = dlz.az;
   public static final dma g = cxk.b;
   public static final dma h = dlz.C;
   public static final ToIntFunction<dlj> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<enz>> j = ac.a(() -> {
      Int2ObjectMap<List<enz>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new enz(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new enz(0.375, 0.44, 0.5), new enz(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new enz(0.5, 0.313, 0.625), new enz(0.375, 0.44, 0.5), new enz(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new enz(0.44, 0.313, 0.56), new enz(0.625, 0.44, 0.56), new enz(0.375, 0.44, 0.375), new enz(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eos k = cys.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eos l = cys.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eos m = cys.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eos n = cys.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<czh> a() {
      return c;
   }

   public czh(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$0.b() && $$4.fU().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bly.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      return !$$1.h() && $$1.n().d() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         egw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == egx.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(h) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
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
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      if (!$$2.c(h) && $$3.a() == egx.c) {
         dlj $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dlj $$0) {
      return $$0.a(aua.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<enz> b(dlj $$0) {
      return (Iterable<enz>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dlj $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return cys.a($$1, $$2.d(), ie.b);
   }
}
