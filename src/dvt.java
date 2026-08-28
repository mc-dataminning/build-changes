import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvt extends dkw {
   public static final MapCodec<dvt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(dkw::b), t()).apply($$0, dvt::new));
   public static final ebf<ja> b = dqg.e;
   private static final Map<ja, ffk> c = ffh.c(dmf.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dvt> a() {
      return a;
   }

   public dvt(cyb $$0, eag.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, ja.c));
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public eah a(dcw $$0) {
      eah $$1 = this.m();
      djd $$2 = $$0.q();
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
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }
}
