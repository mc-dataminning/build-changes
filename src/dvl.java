import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvl extends dkr {
   public static final MapCodec<dvl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(dkr::b), t()).apply($$0, dvl::new));
   public static final eax<ja> b = dqa.e;
   private static final Map<ja, ffc> c = fez.c(dma.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dvl> a() {
      return a;
   }

   public dvl(cxw $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = this.m();
      diy $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
