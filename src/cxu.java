import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxu(boolean d) {
   public static cxu a = new cxu(false);
   public static final Codec<cxu> b = RecordCodecBuilder.create($$0 -> $$0.group(Codec.BOOL.fieldOf("revealed").forGetter(cxu::a)).apply($$0, cxu::new));
   public static final zc<? super wp, cxu> c = zc.a(za.b, cxu::a, cxu::new);

   public boolean a() {
      return this.d;
   }
}
