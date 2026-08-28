import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnr extends dlk {
   public static final MapCodec<dnr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnp.a.forGetter($$0x -> $$0x.c), t()).apply($$0, dnr::new));
   private final dma c;
   private static final ffc d = dma.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   protected dnr(dma $$0, dzy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.a && !$$0.a($$1, $$3)) {
         return dmc.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, ewh.c, ewh.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }
}
