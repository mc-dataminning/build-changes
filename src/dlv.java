import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends djo {
   public static final MapCodec<dlv> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dls.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dlv::new));
   private final dkd f;

   @Override
   public MapCodec<dlv> a() {
      return e;
   }

   protected dlv(dkd $$0, dxn.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return dkf.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, etr.c, etr.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
