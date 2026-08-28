import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czb(axf<bte> c) {
   public static final Codec<czb> a = RecordCodecBuilder.create($$0 -> $$0.group(axf.b(mc.s).fieldOf("types").forGetter(czb::a)).apply($$0, czb::new));
   public static final yn<wa, czb> b = yn.a(axf.c(mc.s), czb::a, czb::new);

   public boolean a(btc $$0) {
      return $$0.a(this.c);
   }

   public axf<bte> a() {
      return this.c;
   }
}
