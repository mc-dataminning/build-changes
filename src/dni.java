import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dni extends dne implements dnh {
   public static final MapCodec<dni> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a(mi.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dni::new)
   );
   private final alj<ejx<?, ?>> b;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(alj<ejx<?, ?>> $$0, ebf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      $$0.J_().a(mi.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ejx)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dnh.a ar_() {
      return dnh.a.a;
   }
}
