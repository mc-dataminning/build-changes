import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvn(ig<clj> c, dvp d) {
   public static final Codec<dvn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agj.a(kd.E).fieldOf("display").forGetter($$0x -> $$0x.c), dvp.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dvn::new)
   );
   public static final Codec<ig<dvn>> b = agi.a(kd.ax, a);

   public ig<clj> a() {
      return this.c;
   }

   public dvp b() {
      return this.d;
   }
}
