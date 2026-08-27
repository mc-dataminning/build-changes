import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cvu extends ctx implements dcf {
   public static final MapCodec<cvu> c = b(cvu::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final din f = did.az;
   public static final die g = ctx.b;
   public static final die h = did.C;
   public static final ToIntFunction<dhn> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ejz>> j = ac.a(() -> {
      Int2ObjectMap<List<ejz>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ejz(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ejz(0.375, 0.44, 0.5), new ejz(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ejz(0.5, 0.313, 0.625), new ejz(0.375, 0.44, 0.5), new ejz(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ejz(0.44, 0.313, 0.56), new ejz(0.625, 0.44, 0.56), new ejz(0.375, 0.44, 0.375), new ejz(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eks k = cvf.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eks l = cvf.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eks m = cvf.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eks n = cvf.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cvu> a() {
      return c;
   }

   public cvu(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$3.fU().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ecx $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ecy.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(h) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
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
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      if (!$$2.c(h) && $$3.a() == ecy.c) {
         dhn $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(dhn $$0) {
      return $$0.a(ark.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ejz> b(dhn $$0) {
      return (Iterable<ejz>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dhn $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return cvf.a($$1, $$2.d(), ib.b);
   }
}
