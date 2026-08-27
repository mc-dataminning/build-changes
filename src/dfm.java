import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfm extends dhz {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfm::new)
   );
   public static final dtt b = dts.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final exn e = dfc.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final exn f = dfc.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final exn g = dfc.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final exn h = dfc.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final exn i = dfc.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final exn j = dfc.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final exn k = dfc.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exn l = dfc.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final exn m = dfc.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final exn n = dfc.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final exn o = dfc.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final exn F = dfc.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final exn G = dfc.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final exn H = dfc.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final exn I = dfc.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exn J = dfc.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dtr N;
   private final int O;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   protected dfm(dtr $$0, int $$1, dtb.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, iw.c).a(b, Boolean.valueOf(false)).a(K, dtn.b));
      this.O = $$1;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      iw $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dtn)$$0.c(K)) {
         case a:
            if ($$4.o() == iw.a.a) {
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
            if ($$4.o() == iw.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$0.c(b)) {
         return bqa.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dxv.a, $$2);
         return bqa.a($$1.C);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dtc $$0, dca $$1, ir $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cly $$0, dcb $$1, ir $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avq.e);
   }

   protected avn a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dtc $$0, dca $$1, ir $$2) {
      cme $$3 = this.N.e() ? $$1.a(cme.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dxv.a : dxv.e, $$2);
      }

      if ($$4) {
         $$1.a(new ir($$2), this, this.O);
      }
   }

   private void f(dtc $$0, dca $$1, ir $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE, b, K);
   }
}
