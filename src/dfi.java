import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfi extends dhs {
   public static final MapCodec<dfi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dsq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfi::new)
   );
   public static final dss b = dsr.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ewj e = dey.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewj f = dey.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewj g = dey.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ewj h = dey.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ewj i = dey.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ewj j = dey.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ewj k = dey.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewj l = dey.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ewj m = dey.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewj n = dey.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewj o = dey.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ewj F = dey.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ewj G = dey.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ewj H = dey.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ewj I = dey.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewj J = dey.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dsq N;
   private final int O;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   protected dfi(dsq $$0, int $$1, dsa.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(K, dsm.b));
      this.O = $$1;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      je $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsm)$$0.c(K)) {
         case a:
            if ($$4.o() == je.a.a) {
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
            if ($$4.o() == je.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$0.c(b)) {
         return bqt.c;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dwu.a, $$2);
         return bqt.a($$1.B);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if ($$3.j() == dbp.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dsb $$0, dbx $$1, iz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cmw $$0, dby $$1, iz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awa.e);
   }

   protected avy a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dsb $$0, dbx $$1, iz $$2) {
      cnc $$3 = this.N.e() ? $$1.a(cnc.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dwu.a : dwu.e, $$2);
      }

      if ($$4) {
         $$1.a(new iz($$2), this, this.O);
      }
   }

   private void f(dsb $$0, dbx $$1, iz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE, b, K);
   }
}
