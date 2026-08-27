import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsa extends dsg {
   final auo<cyo> a;
   public static final Codec<dsa> e = RecordCodecBuilder.create($$0 -> a($$0).and(auo.a(kg.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dsa::new));

   protected dsa(jd $$0, auo<cyo> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dlf $$0) {
      return $$0.a(this.a);
   }

   @Override
   public drw<?> a() {
      return drw.b;
   }
}
