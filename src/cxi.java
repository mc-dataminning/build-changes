import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cxi extends czs {
   public static final MapCodec<cxi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dke.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cxi::new)
   );
   public static final dkg b = dkf.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final emv e = cwy.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final emv f = cwy.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final emv g = cwy.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final emv h = cwy.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final emv i = cwy.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final emv j = cwy.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final emv k = cwy.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emv l = cwy.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final emv m = cwy.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final emv n = cwy.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final emv o = cwy.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final emv F = cwy.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final emv G = cwy.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final emv H = cwy.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final emv I = cwy.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emv J = cwy.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dke N;
   private final int O;

   @Override
   public MapCodec<cxi> a() {
      return a;
   }

   protected cxi(dke $$0, int $$1, djo.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, dka.b));
      this.O = $$1;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      ic $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dka)$$0.c(K)) {
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
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$0.c(b)) {
         return bkc.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dnz.a, $$2);
         return bkc.a($$1.B);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if ($$3.j() == ctp.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(djp $$0, ctx $$1, hx $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cfq $$0, cty $$1, hx $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aru.e);
   }

   protected ars a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(djp $$0, ctx $$1, hx $$2) {
      cfw $$3 = this.N.e() ? $$1.a(cfw.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dnz.a : dnz.e, $$2);
      }

      if ($$4) {
         $$1.a(new hx($$2), this, this.O);
      }
   }

   private void f(djp $$0, ctx $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE, b, K);
   }
}
