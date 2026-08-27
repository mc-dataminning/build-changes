import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cwo extends cur implements dcz {
   public static final MapCodec<cwo> c = b(cwo::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final djp f = djf.az;
   public static final djg g = cur.b;
   public static final djg h = djf.C;
   public static final ToIntFunction<dip> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<elb>> j = ac.a(() -> {
      Int2ObjectMap<List<elb>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new elb(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new elb(0.375, 0.44, 0.5), new elb(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new elb(0.5, 0.313, 0.625), new elb(0.375, 0.44, 0.5), new elb(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new elb(0.44, 0.313, 0.56), new elb(0.625, 0.44, 0.56), new elb(0.375, 0.44, 0.375), new elb(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final elu k = cvz.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final elu l = cvz.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final elu m = cvz.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final elu n = cvz.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cwo> a() {
      return c;
   }

   public cwo(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         edz $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eea.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(h) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
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
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      if (!$$2.c(h) && $$3.a() == eea.c) {
         dip $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dip $$0) {
      return $$0.a(arr.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<elb> b(dip $$0) {
      return (Iterable<elb>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dip $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return cvz.a($$1, $$2.d(), ia.b);
   }
}
