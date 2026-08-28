import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dwe extends dli {
   public static final MapCodec<dwe> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dty.a.b.fieldOf("kind").forGetter(dli::b), t()).apply($$0, dwe::new));
   public static final ebm<jb> d = dqn.e;
   private static final Map<jb, ffr> b = ffo.c(dmm.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dwe> a() {
      return c;
   }

   protected dwe(dty.a $$0, ean.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jb.c));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = super.a($$0);
      din $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
