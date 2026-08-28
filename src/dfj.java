import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfj extends dht {
   public static final MapCodec<dfj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dsr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfj::new)
   );
   public static final dst b = dss.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ewk e = dez.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewk f = dez.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewk g = dez.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ewk h = dez.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ewk i = dez.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ewk j = dez.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ewk k = dez.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewk l = dez.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ewk m = dez.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewk n = dez.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewk o = dez.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ewk F = dez.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ewk G = dez.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ewk H = dez.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ewk I = dez.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewk J = dez.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dsr N;
   private final int O;

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   protected dfj(dsr $$0, int $$1, dsb.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(K, dsn.b));
      this.O = $$1;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      je $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsn)$$0.c(K)) {
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
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$0.c(b)) {
         return bqu.c;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dwv.a, $$2);
         return bqu.a($$1.B);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dbq $$3, BiConsumer<cup, iz> $$4) {
      if ($$3.j() == dbq.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dsc $$0, dby $$1, iz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cmx $$0, dbz $$1, iz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awb.e);
   }

   protected avz a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dsc $$0, dby $$1, iz $$2) {
      cnd $$3 = this.N.e() ? $$1.a(cnd.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dwv.a : dwv.e, $$2);
      }

      if ($$4) {
         $$1.a(new iz($$2), this, this.O);
      }
   }

   private void f(dsc $$0, dby $$1, iz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(aE, b, K);
   }
}
