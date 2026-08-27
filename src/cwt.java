import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwt extends czd {
   public static final MapCodec<cwt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               djp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cwt::new)
   );
   public static final djr b = djq.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final emf e = cwj.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final emf f = cwj.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final emf g = cwj.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final emf h = cwj.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final emf i = cwj.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final emf j = cwj.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final emf k = cwj.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emf l = cwj.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final emf m = cwj.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final emf n = cwj.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final emf o = cwj.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final emf F = cwj.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final emf G = cwj.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final emf H = cwj.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final emf I = cwj.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emf J = cwj.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final djp N;
   private final int O;

   @Override
   public MapCodec<cwt> a() {
      return a;
   }

   protected cwt(djp $$0, int $$1, diz.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, djl.b));
      this.O = $$1;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      ic $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((djl)$$0.c(K)) {
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
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$0.c(b)) {
         return bjv.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dnk.a, $$2);
         return bjv.a($$1.B);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dja $$0, cti $$1, hx $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cfb $$0, ctj $$1, hx $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), arn.e);
   }

   protected arl a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dja $$0, cti $$1, hx $$2) {
      cfh $$3 = this.N.e() ? $$1.a(cfh.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dnk.a : dnk.e, $$2);
      }

      if ($$4) {
         $$1.a(new hx($$2), this, this.O);
      }
   }

   private void f(dja $$0, cti $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE, b, K);
   }
}
