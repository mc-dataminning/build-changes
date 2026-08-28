import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dpv extends dpb {
   public static final MapCodec<dpv> a = b(dpv::new);
   private static final wy b = wy.c("container.grindstone_title");
   private final Function<eah, ffk> d;

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   protected dpv(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, ja.c).b(c, eas.b));
      this.d = this.b();
   }

   private Function<eah, ffk> b() {
      ffk $$0 = ffh.a(dmf.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dmf.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      ffk $$1 = ffh.a($$0, h.z);
      ffk $$2 = ffh.a(dmf.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<eas, Map<ja, ffk>> $$3 = ffh.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private ffk o(eah $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.o($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return true;
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aD);
      }

      return bud.a;
   }

   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cvv($$2x, $$3, cvi.a($$1, $$2)), b);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(e)));
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
