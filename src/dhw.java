import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhw extends dkg {
   public static final MapCodec<dhw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dvh.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dhw::new)
   );
   public static final dvj b = dvi.w;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ezq e = dhm.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ezq f = dhm.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ezq g = dhm.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ezq h = dhm.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ezq i = dhm.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ezq j = dhm.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ezq k = dhm.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ezq l = dhm.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ezq m = dhm.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ezq n = dhm.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ezq o = dhm.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ezq G = dhm.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ezq H = dhm.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ezq I = dhm.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ezq J = dhm.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ezq K = dhm.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dvh O;
   private final int P;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   protected dhw(dvh $$0, int $$1, dur.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jk.c).b(b, Boolean.valueOf(false)).b(L, dvd.b));
      this.P = $$1;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      jk $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dvd)$$0.c(L)) {
         case a:
            if ($$4.o() == jk.a.a) {
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
            if ($$4.o() == jk.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$0.c(b)) {
         return brs.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return brs.a;
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dus $$0, dej $$1, jf $$2, @Nullable cnx $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, dzp.a, $$2);
   }

   protected void a(@Nullable cnx $$0, dek $$1, jf $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awh.e);
   }

   protected awf a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dus $$0, dej $$1, jf $$2) {
      coe $$3 = this.O.e() ? $$1.a(coe.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dzp.a : dzp.e, $$2);
      }

      if ($$4) {
         $$1.a(new jf($$2), this, this.P);
      }
   }

   private void e(dus $$0, dej $$1, jf $$2) {
      jk $$3 = n($$0).g();
      esb $$4 = erx.a($$1, $$3, $$3.o().d() ? jk.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, b, L);
   }
}
