import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag extends eam {
   final awt<dfc> a;
   public static final Codec<eag> e = RecordCodecBuilder.create($$0 -> a($$0).and(awt.a(li.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eag::new));

   protected eag(jv $$0, awt<dfc> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eac<?> a() {
      return eac.b;
   }
}
