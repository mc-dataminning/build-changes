import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhf extends djp {
   public static final MapCodec<dhf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dup.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dhf::new)
   );
   public static final dur b = duq.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eyx e = dgv.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eyx f = dgv.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eyx g = dgv.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eyx h = dgv.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eyx i = dgv.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eyx j = dgv.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eyx k = dgv.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eyx l = dgv.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eyx m = dgv.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eyx n = dgv.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eyx o = dgv.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eyx F = dgv.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eyx G = dgv.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eyx H = dgv.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eyx I = dgv.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eyx J = dgv.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dup N;
   private final int O;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   protected dhf(dup $$0, int $$1, dtz.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.l(this.E.b().b(aE, jj.c).b(b, Boolean.valueOf(false)).b(K, dul.b));
      this.O = $$1;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      jj $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dul)$$0.c(K)) {
         case a:
            if ($$4.o() == jj.a.a) {
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
            if ($$4.o() == jj.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$0.c(b)) {
         return brk.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return brk.a;
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dua $$0, dds $$1, je $$2, @Nullable cnp $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, dyx.a, $$2);
   }

   protected void a(@Nullable cnp $$0, ddt $$1, je $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awe.e);
   }

   protected awc a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dua $$0, dds $$1, je $$2) {
      cnw $$3 = this.N.e() ? $$1.a(cnw.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dyx.a : dyx.e, $$2);
      }

      if ($$4) {
         $$1.a(new je($$2), this, this.O);
      }
   }

   private void e(dua $$0, dds $$1, je $$2) {
      jj $$3 = n($$0).g();
      erj $$4 = erf.a($$1, $$3, $$3.o().d() ? jj.b : null);
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE, b, K);
   }
}
