import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvb extends dkl {
   public static final MapCodec<dvb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(dkl::b), t()).apply($$0, dvb::new));
   public static final eam<ja> b = dpt.e;
   private static final Map<ja, feq> c = fen.c(dlu.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   public dvb(cxq $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m();
      dis $$2 = $$0.q();
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
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
