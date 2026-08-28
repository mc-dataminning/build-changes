import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dnh extends dqa implements dmd {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final int b = 2;
   public static final eaz c = eap.au;
   private static final List<Map<ja, ffc>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fez.c(dma.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axc.B);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = this.m();
      diy $$2 = $$0.q();
      iu $$3 = $$0.a();

      for (ja $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(e, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
