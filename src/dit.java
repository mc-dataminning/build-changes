import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dit extends dgw implements dpf {
   public static final MapCodec<dit> c = b(dit::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dwj f = dvz.az;
   public static final dwa g = dgw.b;
   public static final dwa h = dvz.C;
   public static final ToIntFunction<dvj> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ezn>> j = ae.a(() -> {
      Int2ObjectMap<List<ezn>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new ezn(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new ezn(0.375, 0.44, 0.5), new ezn(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new ezn(0.5, 0.313, 0.625), new ezn(0.375, 0.44, 0.5), new ezn(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new ezn(0.44, 0.313, 0.56), new ezn(0.625, 0.44, 0.56), new ezn(0.375, 0.44, 0.375), new ezn(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final fah k = die.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final fah l = die.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final fah m = die.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final fah n = die.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dit> a() {
      return c;
   }

   public dit(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$0.f() && $$4.gl().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bsd.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      return !$$1.h() && $$1.n().h() == this.j() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         erk $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == erl.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(h) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
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
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      if (!$$2.c(h) && $$3.a() == erl.c) {
         dvj $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dvj $$0) {
      return $$0.a(axa.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ezn> b(dvj $$0) {
      return (Iterable<ezn>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dvj $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return die.a($$1, $$2.e(), jm.b);
   }
}
