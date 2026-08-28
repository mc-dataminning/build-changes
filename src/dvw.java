import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvw extends dtp {
   public static final MapCodec<dvw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebv.a.fieldOf("wood_type").forGetter(dtp::d), t()).apply($$0, dvw::new));
   public static final ebf<ja> b = dqg.e;
   private static final Map<ja, ffk> c = ffh.c(dmf.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dvw> a() {
      return a;
   }

   public dvw(ebv $$0, eag.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = this.m();
      ewo $$2 = $$0.q().b_($$0.a());
      djd $$3 = $$0.q();
      iu $$4 = $$0.a();
      ja[] $$5 = $$0.f();

      for (ja $$6 : $$5) {
         if ($$6.o().d()) {
            ja $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == ewp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eah $$0) {
      return $$0.c(b).p();
   }

   @Override
   public feq o(eah $$0) {
      return c.get($$0.c(b)).a().f();
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
      $$0.a(b, d);
   }
}
