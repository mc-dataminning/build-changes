import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbc(axp<bur> c) {
   public static final Codec<dbc> a = RecordCodecBuilder.create($$0 -> $$0.group(axp.b(mg.aL).fieldOf("types").forGetter(dbc::a)).apply($$0, dbc::new));
   public static final yu<wh, dbc> b = yu.a(axp.c(mg.aL), dbc::a, dbc::new);

   public boolean a(bup $$0) {
      return $$0.a(this.c);
   }

   public axp<bur> a() {
      return this.c;
   }
}
