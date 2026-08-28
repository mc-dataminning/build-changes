import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dkc extends die implements dqs {
   public static final MapCodec<dkc> c = b(dkc::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dxw f = dxn.aC;
   public static final dxo g = die.b;
   public static final dxo h = dxn.J;
   public static final ToIntFunction<dwx> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fba>> j = af.a(() -> {
      Int2ObjectMap<List<fba>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new fba(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new fba(0.375, 0.44, 0.5), new fba(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new fba(0.5, 0.313, 0.625), new fba(0.375, 0.44, 0.5), new fba(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new fba(0.44, 0.313, 0.56), new fba(0.625, 0.44, 0.56), new fba(0.375, 0.44, 0.375), new fba(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fbu k = djm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fbu l = djm.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fbu m = djm.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fbu n = djm.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dkc> a() {
      return c;
   }

   public dkc(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dwx $$0, dag $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         esz $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eta.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(h) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      if (!$$2.c(h) && $$3.a() == eta.c) {
         dwx $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dwx $$0) {
      return $$0.a(awp.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fba> b(dwx $$0) {
      return (Iterable<fba>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dwx $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return djm.a($$1, $$2.e(), jn.b);
   }
}
