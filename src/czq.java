import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czq(axf<btr> c) {
   public static final Codec<czq> a = RecordCodecBuilder.create($$0 -> $$0.group(axf.b(mc.s).fieldOf("types").forGetter(czq::a)).apply($$0, czq::new));
   public static final yn<wa, czq> b = yn.a(axf.c(mc.s), czq::a, czq::new);

   public boolean a(btp $$0) {
      return $$0.a(this.c);
   }

   public axf<btr> a() {
      return this.c;
   }
}
