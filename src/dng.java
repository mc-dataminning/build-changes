import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dng extends dor {
   public static final MapCodec<dng> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dng::new)
   );
   private final dlu b;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dlu $$0, dzn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, dzo $$3, cmw $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dzo a(dcl $$0) {
      dhv $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dhv $$0, iu $$1, dzo $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dhv $$0, iu $$1) {
      boolean $$2 = false;
      iu.a $$3 = $$1.k();

      for (ja $$4 : ja.values()) {
         dzo $$5 = $$0.a_($$3);
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

   private static boolean o(dzo $$0) {
      return $$0.y().a(axf.a);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
