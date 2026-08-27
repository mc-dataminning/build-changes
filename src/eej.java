import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eej extends edt {
   public static final Codec<eej> a = RecordCodecBuilder.create($$0 -> a($$0).and(rl.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eej::new));
   private final qr b;

   private eej(List<efg> $$0, qr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edv b() {
      return edw.g;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static edt.a<?> a(qr $$0) {
      return a($$1 -> new eej($$1, $$0));
   }
}
