import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcu(ayc<bvv> c) {
   public static final Codec<dcu> a = RecordCodecBuilder.create($$0 -> $$0.group(ayc.b(mi.aN).fieldOf("types").forGetter(dcu::a)).apply($$0, dcu::new));
   public static final ze<wp, dcu> b = ze.a(ayc.c(mi.aN), dcu::a, dcu::new);

   public boolean a(bvt $$0) {
      return $$0.a(this.c);
   }

   public ayc<bvv> a() {
      return this.c;
   }
}
