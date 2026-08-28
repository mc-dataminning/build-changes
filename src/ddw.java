import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddw(jr<avz> d, brm e, brm f) implements ddq {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound").forGetter(ddw::b),
               brm.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(ddw::c),
               brm.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(ddw::d)
            )
            .apply($$0, ddw::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      azh $$5 = $$3.dZ();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<ddw> a() {
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
