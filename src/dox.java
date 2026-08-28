import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dmp {
   public static final MapCodec<dox> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dou.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dox::new));
   private final dne f;

   @Override
   public MapCodec<dox> a() {
      return e;
   }

   protected dox(dne $$0, ebf.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
