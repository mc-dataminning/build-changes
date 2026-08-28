import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dww extends dma {
   public static final MapCodec<dww> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(duq.a.b.fieldOf("kind").forGetter(dma::b), t()).apply($$0, dww::new));
   public static final ece<jc> d = drf.e;
   private static final Map<jc, fgm> b = fgj.c(dne.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dww> a() {
      return c;
   }

   protected dww(duq.a $$0, ebf.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jc.c));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = super.a($$0);
      djd $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
