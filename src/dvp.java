import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvp extends dkw {
   public static final MapCodec<dvp> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtk.a.b.fieldOf("kind").forGetter(dkw::b), t()).apply($$0, dvp::new));
   public static final eax<ja> d = dqa.e;
   private static final Map<ja, ffc> b = fez.c(dma.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dvp> a() {
      return c;
   }

   protected dvp(dtk.a $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, ja.c));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = super.a($$0);
      dib $$2 = $$0.q();
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
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
