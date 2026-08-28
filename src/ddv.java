import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddv(jr<avz> d, brm e, brm f) implements ddp {
   public static final MapCodec<ddv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound").forGetter(ddv::b),
               brm.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(ddv::c),
               brm.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(ddv::d)
            )
            .apply($$0, ddv::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      azh $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public jr<avz> b() {
      return this.d;
   }

   public brm c() {
      return this.e;
   }

   public brm d() {
      return this.f;
   }
}
