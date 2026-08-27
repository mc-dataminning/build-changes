import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cxa extends czk {
   public static final MapCodec<cxa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               djw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cxa::new)
   );
   public static final djy b = djx.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final emm e = cwq.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final emm f = cwq.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final emm g = cwq.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final emm h = cwq.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final emm i = cwq.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final emm j = cwq.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final emm k = cwq.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emm l = cwq.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final emm m = cwq.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final emm n = cwq.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final emm o = cwq.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final emm F = cwq.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final emm G = cwq.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final emm H = cwq.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final emm I = cwq.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emm J = cwq.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final djw N;
   private final int O;

   @Override
   public MapCodec<cxa> a() {
      return a;
   }

   protected cxa(djw $$0, int $$1, djg.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, djs.b));
      this.O = $$1;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      ic $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((djs)$$0.c(K)) {
         case a:
            if ($$4.o() == ic.a.a) {
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
            if ($$4.o() == ic.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$0.c(b)) {
         return bkb.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dnr.a, $$2);
         return bkb.a($$1.B);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cth $$3, BiConsumer<cmy, hx> $$4) {
      if ($$3.j() == cth.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(djh $$0, ctp $$1, hx $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cfi $$0, ctq $$1, hx $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), art.e);
   }

   protected arr a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(djh $$0, ctp $$1, hx $$2) {
      cfo $$3 = this.N.e() ? $$1.a(cfo.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dnr.a : dnr.e, $$2);
      }

      if ($$4) {
         $$1.a(new hx($$2), this, this.O);
      }
   }

   private void f(djh $$0, ctp $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE, b, K);
   }
}
