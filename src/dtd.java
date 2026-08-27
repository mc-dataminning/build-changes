import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dtd extends dti {
   private final ip<czf> e;
   public static final Codec<dtd> a = RecordCodecBuilder.create($$0 -> a($$0).and(iz.a(ki.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dtd::new));

   public dtd(jf $$0, ip<czf> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dme $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dsy<?> a() {
      return dsy.a;
   }
}
