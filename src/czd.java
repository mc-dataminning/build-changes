import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class czd extends cxg implements dfo {
   public static final MapCodec<czd> c = b(czd::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dmf f = dlv.az;
   public static final dlw g = cxg.b;
   public static final dlw h = dlv.C;
   public static final ToIntFunction<dlf> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ens>> j = ac.a(() -> {
      Int2ObjectMap<List<ens>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ens(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ens(0.375, 0.44, 0.5), new ens(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ens(0.5, 0.313, 0.625), new ens(0.375, 0.44, 0.5), new ens(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ens(0.44, 0.313, 0.56), new ens(0.625, 0.44, 0.56), new ens(0.375, 0.44, 0.375), new ens(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eol k = cyo.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eol l = cyo.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eol m = cyo.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eol n = cyo.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<czd> a() {
      return c;
   }

   public czd(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$0.b() && $$4.fU().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return blw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return !$$1.h() && $$1.n().d() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         egp $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == egq.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(h) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
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
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      if (!$$2.c(h) && $$3.a() == egq.c) {
         dlf $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dlf $$0) {
      return $$0.a(atz.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ens> b(dlf $$0) {
      return (Iterable<ens>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dlf $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return cyo.a($$1, $$2.d(), ie.b);
   }
}
