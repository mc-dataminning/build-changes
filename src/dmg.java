import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg extends dmm {
   final aqj<csx> a;
   public static final Codec<dmg> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqj.a(je.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dmg::new));

   protected dmg(ib $$0, aqj<csx> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dfl $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dmc<?> a() {
      return dmc.b;
   }
}
