import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwz extends czj {
   public static final MapCodec<cwz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               djv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cwz::new)
   );
   public static final djx b = djw.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eml e = cwp.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eml f = cwp.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eml g = cwp.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eml h = cwp.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eml i = cwp.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eml j = cwp.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eml k = cwp.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eml l = cwp.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eml m = cwp.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eml n = cwp.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eml o = cwp.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eml F = cwp.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eml G = cwp.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eml H = cwp.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eml I = cwp.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eml J = cwp.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final djv N;
   private final int O;

   @Override
   public MapCodec<cwz> a() {
      return a;
   }

   protected cwz(djv $$0, int $$1, djf.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, djr.b));
      this.O = $$1;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      ic $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((djr)$$0.c(K)) {
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
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$0.c(b)) {
         return bka.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dnq.a, $$2);
         return bka.a($$1.B);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, ctg $$3, BiConsumer<cmx, hx> $$4) {
      if ($$3.j() == ctg.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(djg $$0, cto $$1, hx $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cfh $$0, ctp $$1, hx $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), ars.e);
   }

   protected arq a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(djg $$0, cto $$1, hx $$2) {
      cfn $$3 = this.N.e() ? $$1.a(cfn.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dnq.a : dnq.e, $$2);
      }

      if ($$4) {
         $$1.a(new hx($$2), this, this.O);
      }
   }

   private void f(djg $$0, cto $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(aE, b, K);
   }
}
