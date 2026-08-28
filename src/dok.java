import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dok extends dmm implements dtx {
   public static final ebf a = dsg.b;
   public static final ebf b = dsg.c;
   public static final ebf c = dsg.d;
   public static final ebf d = dsg.e;
   public static final ebf e = ebe.I;
   public static final Map<jb, ebf> f = dsg.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ag.a());
   private final Function<eao, ffr> g;
   private final Function<eao, ffr> h;

   protected dok(float $$0, float $$1, float $$2, float $$3, float $$4, ean.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dok> a();

   protected Function<eao, ffr> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      ffr $$5 = dmm.b((double)$$0, 0.0, (double)$$1);
      Map<jb, ffr> $$6 = ffo.c(dmm.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         ffr $$3x = $$5;

         for (Entry<jb, ebf> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = ffo.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ebr[]{e});
   }

   @Override
   protected boolean e_(eao $$0) {
      return !$$0.c(e);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(e) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
