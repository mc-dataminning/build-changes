import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ddf extends dfp {
   public static final MapCodec<ddf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dqn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, ddf::new)
   );
   public static final dqp b = dqo.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ety e = dcv.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ety f = dcv.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ety g = dcv.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ety h = dcv.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ety i = dcv.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ety j = dcv.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ety k = dcv.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ety l = dcv.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ety m = dcv.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ety n = dcv.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ety o = dcv.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ety F = dcv.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ety G = dcv.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ety H = dcv.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ety I = dcv.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ety J = dcv.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dqn N;
   private final int O;

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   protected ddf(dqn $$0, int $$1, dpx.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ir.c).a(b, Boolean.valueOf(false)).a(K, dqj.b));
      this.O = $$1;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      ir $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dqj)$$0.c(K)) {
         case a:
            if ($$4.o() == ir.a.a) {
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
            if ($$4.o() == ir.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$0.c(b)) {
         return boq.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dur.a, $$2);
         return boq.a($$1.B);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dpy $$0, czu $$1, im $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable ckl $$0, czv $$1, im $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), ava.e);
   }

   protected auy a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dpy $$0, czu $$1, im $$2) {
      ckr $$3 = this.N.e() ? $$1.a(ckr.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dur.a : dur.e, $$2);
      }

      if ($$4) {
         $$1.a(new im($$2), this, this.O);
      }
   }

   private void f(dpy $$0, czu $$1, im $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, b, K);
   }
}
