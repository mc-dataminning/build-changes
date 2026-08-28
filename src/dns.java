import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends dno implements dnr {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alq.a(mi.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dns::new)
   );
   private final alq<ekh<?, ?>> b;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(alq<ekh<?, ?>> $$0, ebp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      $$0.J_().a(mi.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ekh)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dnr.a an_() {
      return dnr.a.a;
   }
}
