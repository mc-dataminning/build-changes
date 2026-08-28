import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dgi extends dis {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dgi::new)
   );
   public static final dtt b = dts.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ext e = dfy.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ext f = dfy.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ext g = dfy.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ext h = dfy.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ext i = dfy.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ext j = dfy.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ext k = dfy.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ext l = dfy.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ext m = dfy.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ext n = dfy.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ext o = dfy.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ext F = dfy.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ext G = dfy.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ext H = dfy.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ext I = dfy.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ext J = dfy.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dtr N;
   private final int O;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   protected dgi(dtr $$0, int $$1, dtb.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ji.c).a(b, Boolean.valueOf(false)).a(K, dtn.b));
      this.O = $$1;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      ji $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dtn)$$0.c(K)) {
         case a:
            if ($$4.o() == ji.a.a) {
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
            if ($$4.o() == ji.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$0.c(b)) {
         return bqr.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bqr.a($$1.B);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if ($$3.n() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dtc $$0, dcw $$1, jd $$2, @Nullable cmx $$3) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, dxz.a, $$2);
   }

   protected void a(@Nullable cmx $$0, dcx $$1, jd $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avq.e);
   }

   protected avo a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dtc $$0, dcw $$1, jd $$2) {
      cnd $$3 = this.N.e() ? $$1.a(cnd.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dxz.a : dxz.e, $$2);
      }

      if ($$4) {
         $$1.a(new jd($$2), this, this.O);
      }
   }

   private void e(dtc $$0, dcw $$1, jd $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, b, K);
   }
}
