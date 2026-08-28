import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvo extends dti {
   public static final MapCodec<dvo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebn.a.fieldOf("wood_type").forGetter(dti::d), t()).apply($$0, dvo::new));
   public static final eax<ja> b = dqa.e;
   private static final Map<ja, ffc> c = fez.c(dma.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dvo> a() {
      return a;
   }

   public dvo(ebn $$0, dzy.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = this.m();
      ewg $$2 = $$0.q().b_($$0.a());
      diy $$3 = $$0.q();
      iu $$4 = $$0.a();
      ja[] $$5 = $$0.f();

      for (ja $$6 : $$5) {
         if ($$6.o().d()) {
            ja $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == ewh.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzz $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fei o(dzz $$0) {
      return c.get($$0.c(b)).a().f();
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, d);
   }
}
