import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnw extends dln {
   public static final MapCodec<dnw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnv.a.forGetter($$0x -> $$0x.d), t()).apply($$0, dnw::new));
   private final dmf d;

   @Override
   public MapCodec<dnw> a() {
      return c;
   }

   protected dnw(dmf $$0, eag.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.d.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.a && !$$0.a($$1, $$3)) {
         return dmh.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
