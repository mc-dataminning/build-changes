import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dnn extends dqg implements dmi {
   public static final MapCodec<dnn> a = b(dnn::new);
   public static final int b = 2;
   public static final ebh c = eax.au;
   private static final List<Map<ja, ffk>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> ffh.c(dmf.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, ja.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axc.B);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = this.m();
      djd $$2 = $$0.q();
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
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
