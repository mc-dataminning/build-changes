import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czn<T extends cyp> implements cze<T> {
   private final czn.a<T> a;
   private final Codec<T> A;
   private final zc<wp, T> B;

   public czn(czn.a<T> $$0) {
      this.a = $$0;
      this.A = RecordCodecBuilder.create($$1 -> $$1.group(cyo.e.fieldOf("category").orElse(cyo.d).forGetter(cyp::d)).apply($$1, $$0::create));
      this.B = zc.a(cyo.g, cyp::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.A;
   }

   @Override
   public zc<wp, T> b() {
      return this.B;
   }

   @FunctionalInterface
   public interface a<T extends cyp> {
      T create(cyo var1);
   }
}
