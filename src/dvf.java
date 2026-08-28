import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvf extends dkq {
   public static final MapCodec<dvf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtc.a.b.fieldOf("kind").forGetter(dkq::b), t()).apply($$0, dvf::new));
   public static final eam<ja> d = dpt.e;
   private static final Map<ja, feq> b = fen.c(dlu.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dvf> a() {
      return c;
   }

   protected dvf(dtc.a $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, ja.c));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = super.a($$0);
      dhv $$2 = $$0.q();
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
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
