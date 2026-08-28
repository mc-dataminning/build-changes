import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlb extends diu {
   public static final MapCodec<dlb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkz.a.forGetter($$0x -> $$0x.e), t()).apply($$0, dlb::new));
   private final djk e;
   protected static final float b = 6.0F;
   protected static final fbs c = djk.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   protected dlb(djk $$0, dwu.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djm.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(d)) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }
}
