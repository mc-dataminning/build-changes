import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends dpd {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dns::new)
   );
   private final dmf b;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dmf $$0, eag.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, eah $$3, cng $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public eah a(dcw $$0) {
      dig $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dig $$0, iu $$1, eah $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dig $$0, iu $$1) {
      boolean $$2 = false;
      iu.a $$3 = $$1.k();

      for (ja $$4 : ja.values()) {
         eah $$5 = $$0.a_($$3);
         if ($$4 != ja.a || o($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (o($$5) && !$$5.c($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean o(eah $$0) {
      return $$0.y().a(axh.a);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(eah $$0, dig $$1, iu $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
