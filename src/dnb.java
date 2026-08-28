import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dnb extends dpt implements dlx {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final int b = 2;
   public static final eao c = eae.au;
   private static final List<Map<ja, feq>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fen.c(dlu.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axa.B);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m();
      dis $$2 = $$0.q();
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
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
