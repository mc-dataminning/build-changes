import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cup extends csr implements daz {
   public static final MapCodec<cup> c = b(cup::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dhb f = dgr.az;
   public static final dgs g = csr.b;
   public static final dgs h = dgr.C;
   public static final ToIntFunction<dgb> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eif>> j = ac.a(() -> {
      Int2ObjectMap<List<eif>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eif(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eif(0.375, 0.44, 0.5), new eif(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eif(0.5, 0.313, 0.625), new eif(0.375, 0.44, 0.5), new eif(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eif(0.44, 0.313, 0.56), new eif(0.625, 0.44, 0.56), new eif(0.375, 0.44, 0.375), new eif(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eiy k = cua.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eiy l = cua.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eiy m = cua.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eiy n = cua.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cup> a() {
      return c;
   }

   public cup(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ebe $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ebf.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(h) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
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
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      if (!$$2.c(h) && $$3.a() == ebf.c) {
         dgb $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dgb $$0) {
      return $$0.a(aqs.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eif> b(dgb $$0) {
      return (Iterable<eif>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dgb $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return cua.a($$1, $$2.d(), hx.b);
   }
}
