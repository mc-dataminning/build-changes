import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvx extends dlb {
   public static final MapCodec<dvx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtr.a.b.fieldOf("kind").forGetter(dlb::b), t()).apply($$0, dvx::new));
   public static final ebf<ja> d = dqg.e;
   private static final Map<ja, ffk> b = ffh.c(dmf.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dvx> a() {
      return c;
   }

   protected dvx(dtr.a $$0, eag.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, ja.c));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public eah a(dcw $$0) {
      eah $$1 = super.a($$0);
      dig $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
