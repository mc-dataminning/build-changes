import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnr extends dnx {
   final arr<cut> a;
   public static final Codec<dnr> e = RecordCodecBuilder.create($$0 -> a($$0).and(arr.a(jz.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dnr::new));

   protected dnr(iw $$0, arr<cut> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dgw $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dnn<?> a() {
      return dnn.b;
   }
}
