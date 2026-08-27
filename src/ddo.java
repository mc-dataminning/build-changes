import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ddo extends dfy {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dqw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, ddo::new)
   );
   public static final dqy b = dqx.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eui e = dde.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eui f = dde.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eui g = dde.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eui h = dde.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eui i = dde.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eui j = dde.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eui k = dde.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eui l = dde.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eui m = dde.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eui n = dde.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eui o = dde.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eui F = dde.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eui G = dde.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eui H = dde.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eui I = dde.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eui J = dde.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dqw N;
   private final int O;

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   protected ddo(dqw $$0, int $$1, dqg.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, is.c).a(b, Boolean.valueOf(false)).a(K, dqs.b));
      this.O = $$1;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      is $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dqs)$$0.c(K)) {
         case a:
            if ($$4.o() == is.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? F : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? J : l;
               case e -> $$5 ? I : k;
               case d -> $$5 ? H : j;
               case c, b, a -> $$5 ? G : i;
            };
         case c:
         default:
            if ($$4.o() == is.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$0.c(b)) {
         return bpm.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dva.a, $$2);
         return bpm.a($$1.B);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dqh $$0, dad $$1, in $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable clh $$0, dae $$1, in $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avd.e);
   }

   protected avb a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dqh $$0, dad $$1, in $$2) {
      cln $$3 = this.N.e() ? $$1.a(cln.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dva.a : dva.e, $$2);
      }

      if ($$4) {
         $$1.a(new in($$2), this, this.O);
      }
   }

   private void f(dqh $$0, dad $$1, in $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE, b, K);
   }
}
