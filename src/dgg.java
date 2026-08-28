import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dgg extends diq {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dtp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dgg::new)
   );
   public static final dtr b = dtq.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final exp e = dfw.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final exp f = dfw.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final exp g = dfw.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final exp h = dfw.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final exp i = dfw.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final exp j = dfw.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final exp k = dfw.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exp l = dfw.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final exp m = dfw.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final exp n = dfw.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final exp o = dfw.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final exp F = dfw.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final exp G = dfw.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final exp H = dfw.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final exp I = dfw.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exp J = dfw.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dtp N;
   private final int O;

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   protected dgg(dtp $$0, int $$1, dsz.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ji.c).a(b, Boolean.valueOf(false)).a(K, dtl.b));
      this.O = $$1;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      ji $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dtl)$$0.c(K)) {
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
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$0.c(b)) {
         return bqq.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bqq.a($$1.B);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dcm $$3, BiConsumer<cuo, jd> $$4) {
      if ($$3.n() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dta $$0, dcu $$1, jd $$2, @Nullable cmv $$3) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, dxw.a, $$2);
   }

   protected void a(@Nullable cmv $$0, dcv $$1, jd $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avp.e);
   }

   protected avn a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dta $$0, dcu $$1, jd $$2) {
      cnb $$3 = this.N.e() ? $$1.a(cnb.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dxw.a : dxw.e, $$2);
      }

      if ($$4) {
         $$1.a(new jd($$2), this, this.O);
      }
   }

   private void e(dta $$0, dcu $$1, jd $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE, b, K);
   }
}
