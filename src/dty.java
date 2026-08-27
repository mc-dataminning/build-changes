import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dty extends due {
   final avd<daa> a;
   public static final Codec<dty> e = RecordCodecBuilder.create($$0 -> a($$0).and(avd.a(kj.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dty::new));

   protected dty(jg $$0, avd<daa> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dmz $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dtu<?> a() {
      return dtu.b;
   }
}
