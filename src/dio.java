import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dio extends dkx {
   public static final MapCodec<dio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dvy.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dio::new)
   );
   public static final dwa b = dvz.w;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fah e = die.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fah f = die.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fah g = die.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fah h = die.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fah i = die.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fah j = die.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fah k = die.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fah l = die.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fah m = die.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fah n = die.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fah o = die.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fah G = die.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fah H = die.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fah I = die.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fah J = die.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fah K = die.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dvy O;
   private final int P;

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(dvy $$0, int $$1, dvi.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dvu.b));
      this.P = $$1;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      jm $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dvu)$$0.c(L)) {
         case a:
            if ($$4.o() == jm.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? G : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? K : l;
               case e -> $$5 ? J : k;
               case d -> $$5 ? I : j;
               case c, b, a -> $$5 ? H : i;
            };
         case c:
         default:
            if ($$4.o() == jm.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$0.c(b)) {
         return bsd.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bsd.a;
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if ($$3.f() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dvj $$0, dfb $$1, jh $$2, @Nullable com $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eag.a, $$2);
   }

   protected void a(@Nullable com $$0, dfc $$1, jh $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awm.e);
   }

   protected awk a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dvj $$0, dfb $$1, jh $$2) {
      cou $$3 = this.O.e() ? $$1.a(cou.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eag.a : eag.e, $$2);
      }

      if ($$4) {
         $$1.a(new jh($$2), this, this.P);
      }
   }

   private void e(dvj $$0, dfb $$1, jh $$2) {
      jm $$3 = n($$0).g();
      ess $$4 = eso.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, b, L);
   }
}
