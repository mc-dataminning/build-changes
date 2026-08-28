import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmk extends dkc {
   public static final MapCodec<dmk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmj.a.forGetter($$0x -> $$0x.d), t()).apply($$0, dmk::new));
   private final dku d;

   @Override
   public MapCodec<dmk> a() {
      return c;
   }

   protected dmk(dku $$0, dyl.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.d.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.a && !$$0.a($$1, $$3)) {
         return dkw.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
