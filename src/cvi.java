import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cvi extends ctk implements dbt {
   public static final MapCodec<cvi> c = b(cvi::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dhw f = dhm.az;
   public static final dhn g = ctk.b;
   public static final dhn h = dhm.C;
   public static final ToIntFunction<dgw> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eji>> j = ac.a(() -> {
      Int2ObjectMap<List<eji>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eji(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eji(0.375, 0.44, 0.5), new eji(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eji(0.5, 0.313, 0.625), new eji(0.375, 0.44, 0.5), new eji(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eji(0.44, 0.313, 0.56), new eji(0.625, 0.44, 0.56), new eji(0.375, 0.44, 0.375), new eji(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ekb k = cut.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ekb l = cut.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ekb m = cut.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ekb n = cut.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cvi> a() {
      return c;
   }

   public cvi(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ecg $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ech.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(h) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
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
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      if (!$$2.c(h) && $$3.a() == ech.c) {
         dgw $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dgw $$0) {
      return $$0.a(arc.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eji> b(dgw $$0) {
      return (Iterable<eji>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dgw $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return cut.a($$1, $$2.d(), hx.b);
   }
}
