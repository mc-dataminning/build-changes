import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dhy extends dgb implements dol {
   public static final MapCodec<dhy> c = b(dhy::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dvo f = dve.az;
   public static final dvf g = dgb.b;
   public static final dvf h = dve.C;
   public static final ToIntFunction<duo> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eys>> j = ad.a(() -> {
      Int2ObjectMap<List<eys>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eys(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eys(0.375, 0.44, 0.5), new eys(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eys(0.5, 0.313, 0.625), new eys(0.375, 0.44, 0.5), new eys(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eys(0.44, 0.313, 0.56), new eys(0.625, 0.44, 0.56), new eys(0.375, 0.44, 0.375), new eys(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ezm k = dhj.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ezm l = dhj.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ezm m = dhj.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ezm n = dhj.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dhy> a() {
      return c;
   }

   public dhy(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$0.f() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return brp.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      return !$$1.h() && $$1.n().h() == this.q() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eqp $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eqq.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(h) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
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
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      if (!$$2.c(h) && $$3.a() == eqq.c) {
         duo $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(duo $$0) {
      return $$0.a(awt.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eys> b(duo $$0) {
      return (Iterable<eys>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(duo $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return dhj.a($$1, $$2.e(), jj.b);
   }
}
