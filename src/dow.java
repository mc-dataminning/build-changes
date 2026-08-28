import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dow extends dmo {
   public static final MapCodec<dow> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dou.a.forGetter($$0x -> $$0x.c), t()).apply($$0, dow::new));
   private final dne c;
   private static final fgm d = dne.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(dne $$0, ebf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.a && !$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }
}
