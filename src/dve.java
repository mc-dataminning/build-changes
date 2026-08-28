import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dve extends dta {
   public static final MapCodec<dve> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebc.a.fieldOf("wood_type").forGetter(dta::d), t()).apply($$0, dve::new));
   public static final eam<ja> b = dpt.e;
   private static final Map<ja, feq> c = fen.c(dlu.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dve> a() {
      return a;
   }

   public dve(ebc $$0, dzn.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m();
      evv $$2 = $$0.q().b_($$0.a());
      dis $$3 = $$0.q();
      iu $$4 = $$0.a();
      ja[] $$5 = $$0.f();

      for (ja $$6 : $$5) {
         if ($$6.o().d()) {
            ja $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == evw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzo $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fdw o(dzo $$0) {
      return c.get($$0.c(b)).a().f();
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, d);
   }
}
