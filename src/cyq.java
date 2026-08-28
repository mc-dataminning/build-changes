import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyq(axt<bta> c) {
   public static final Codec<cyq> a = RecordCodecBuilder.create($$0 -> $$0.group(axt.b(ma.s).fieldOf("types").forGetter(cyq::a)).apply($$0, cyq::new));
   public static final zj<ww, cyq> b = zj.a(axt.c(ma.s), cyq::a, cyq::new);

   public boolean a(bsy $$0) {
      return $$0.a(this.c);
   }

   public axt<bta> a() {
      return this.c;
   }
}
