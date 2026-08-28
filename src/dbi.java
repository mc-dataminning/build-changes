import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbi(axr<buu> c) {
   public static final Codec<dbi> a = RecordCodecBuilder.create($$0 -> $$0.group(axr.b(mg.aM).fieldOf("types").forGetter(dbi::a)).apply($$0, dbi::new));
   public static final yw<wj, dbi> b = yw.a(axr.c(mg.aM), dbi::a, dbi::new);

   public boolean a(bus $$0) {
      return $$0.a(this.c);
   }

   public axr<buu> a() {
      return this.c;
   }
}
