import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtc extends dti {
   final aut<czf> a;
   public static final Codec<dtc> e = RecordCodecBuilder.create($$0 -> a($$0).and(aut.a(ki.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dtc::new));

   protected dtc(jf $$0, aut<czf> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dme $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dsy<?> a() {
      return dsy.b;
   }
}
