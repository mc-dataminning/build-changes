import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dph extends dmz {
   public static final MapCodec<dph> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpe.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dph::new));
   private final dno f;

   @Override
   public MapCodec<dph> a() {
      return e;
   }

   protected dph(dno $$0, ebp.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
