import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends dll {
   public static final MapCodec<dns> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnp.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dns::new));
   private final dma f;

   @Override
   public MapCodec<dns> a() {
      return e;
   }

   protected dns(dma $$0, dzy.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dmc.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, ewh.c, ewh.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
