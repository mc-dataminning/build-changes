import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvd extends cxm {
   public static final MapCodec<cvd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               t()
            )
            .apply($$0, cvd::new)
   );
   public static final dhn b = dhm.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ekb e = cut.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ekb f = cut.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ekb g = cut.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ekb h = cut.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ekb i = cut.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ekb j = cut.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ekb k = cut.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ekb l = cut.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ekb m = cut.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ekb n = cut.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ekb o = cut.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ekb F = cut.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ekb G = cut.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ekb H = cut.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ekb I = cut.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ekb J = cut.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dhl N;
   private final int O;

   @Override
   public MapCodec<cvd> a() {
      return a;
   }

   protected cvd(dhl $$0, int $$1, dgv.d $$2) {
      super($$2.a($$0.f()));
      this.N = $$0;
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(K, dhh.b));
      this.O = $$1;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      hx $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dhh)$$0.c(K)) {
         case a:
            if ($$4.o() == hx.a.a) {
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
            if ($$4.o() == hx.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$0.c(b)) {
         return biq.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dlg.a, $$2);
         return biq.a($$1.B);
      }
   }

   public void d(dgw $$0, crs $$1, ht $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cdm $$0, crt $$1, ht $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aqo.e);
   }

   protected aqm a(boolean $$0) {
      return $$0 ? this.N.n() : this.N.m();
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B && this.N.d() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dgw $$0, crs $$1, ht $$2) {
      cds $$3 = this.N.d() ? $$1.a(cds.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dlg.a : dlg.e, $$2);
      }

      if ($$4) {
         $$1.a(new ht($$2), this, this.O);
      }
   }

   private void f(dgw $$0, crs $$1, ht $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, b, K);
   }
}
