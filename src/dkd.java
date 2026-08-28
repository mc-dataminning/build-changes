import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dkd extends dif implements dqt {
   public static final MapCodec<dkd> c = b(dkd::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dxx f = dxo.aC;
   public static final dxp g = dif.b;
   public static final dxp h = dxo.J;
   public static final ToIntFunction<dwy> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fbb>> j = af.a(() -> {
      Int2ObjectMap<List<fbb>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fbb(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fbb(0.375, 0.44, 0.5), new fbb(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fbb(0.5, 0.313, 0.625), new fbb(0.375, 0.44, 0.5), new fbb(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fbb(0.44, 0.313, 0.56), new fbb(0.625, 0.44, 0.56), new fbb(0.375, 0.44, 0.375), new fbb(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fbv k = djn.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fbv l = djn.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fbv m = djn.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fbv n = djn.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dkd> a() {
      return c;
   }

   public dkd(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsl.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eta $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == etb.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(h) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
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
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      if (!$$2.c(h) && $$3.a() == etb.c) {
         dwy $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dwy $$0) {
      return $$0.a(awp.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fbb> b(dwy $$0) {
      return (Iterable<fbb>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dwy $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return djn.a($$1, $$2.e(), jn.b);
   }
}
