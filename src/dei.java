import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dei extends dgs {
   public static final MapCodec<dei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               drq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dei::new)
   );
   public static final drs b = drr.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final evd e = ddy.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final evd f = ddy.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final evd g = ddy.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final evd h = ddy.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final evd i = ddy.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final evd j = ddy.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final evd k = ddy.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final evd l = ddy.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final evd m = ddy.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final evd n = ddy.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final evd o = ddy.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final evd F = ddy.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final evd G = ddy.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final evd H = ddy.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final evd I = ddy.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final evd J = ddy.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final drq N;
   private final int O;

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   protected dei(drq $$0, int $$1, dra.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, it.c).a(b, Boolean.valueOf(false)).a(K, drm.b));
      this.O = $$1;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      it $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((drm)$$0.c(K)) {
         case a:
            if ($$4.o() == it.a.a) {
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
            if ($$4.o() == it.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$0.c(b)) {
         return bpu.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dvu.a, $$2);
         return bpu.a($$1.B);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if ($$3.j() == dap.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(drb $$0, dax $$1, io $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable clw $$0, day $$1, io $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avi.e);
   }

   protected avg a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(drb $$0, dax $$1, io $$2) {
      cmc $$3 = this.N.e() ? $$1.a(cmc.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dvu.a : dvu.e, $$2);
      }

      if ($$4) {
         $$1.a(new io($$2), this, this.O);
      }
   }

   private void f(drb $$0, dax $$1, io $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, b, K);
   }
}
