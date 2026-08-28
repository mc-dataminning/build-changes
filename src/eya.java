import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eya extends exs {
   private static final int c = -1;
   public static final Codec<eya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, eya::new)
   );
   public static final ext<eya> b = new ext<>("idcounts", eya::new, a, bbb.k);
   private int d;

   public eya() {
      this(-1);
   }

   public eya(int $$0) {
      this.d = $$0;
   }

   public exz a() {
      exz $$0 = new exz(++this.d);
      this.f();
      return $$0;
   }
}
