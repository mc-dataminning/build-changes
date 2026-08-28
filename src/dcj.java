import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcj(jp<awj> d, brb e, brb f) implements dcd {
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awj.b.fieldOf("sound").forGetter(dcj::b),
               brb.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dcj::c),
               brb.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dcj::d)
            )
            .apply($$0, dcj::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      azr $$5 = $$3.ea();
      if (!$$3.bc()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public jp<awj> b() {
      return this.d;
   }

   public brb c() {
      return this.e;
   }

   public brb d() {
      return this.f;
   }
}
