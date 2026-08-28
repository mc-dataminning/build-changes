import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class diy extends dhb implements dpk {
   public static final MapCodec<diy> c = b(diy::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dwn f = dwe.az;
   public static final dwf g = dhb.b;
   public static final dwf h = dwe.C;
   public static final ToIntFunction<dvo> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ezr>> j = ae.a(() -> {
      Int2ObjectMap<List<ezr>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ezr(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ezr(0.375, 0.44, 0.5), new ezr(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ezr(0.5, 0.313, 0.625), new ezr(0.375, 0.44, 0.5), new ezr(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ezr(0.44, 0.313, 0.56), new ezr(0.625, 0.44, 0.56), new ezr(0.375, 0.44, 0.375), new ezr(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fal k = dij.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fal l = dij.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fal m = dij.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fal n = dij.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<diy> a() {
      return c;
   }

   public diy(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$0.f() && $$4.gm().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsh.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ero $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == erp.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(h) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      if (!$$2.c(h) && $$3.a() == erp.c) {
         dvo $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dvo $$0) {
      return $$0.a(axd.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ezr> b(dvo $$0) {
      return (Iterable<ezr>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dvo $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return dij.a($$1, $$2.e(), jm.b);
   }
}
