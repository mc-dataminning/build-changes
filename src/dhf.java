import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhf(jk<dag> c) {
   public static final Codec<dhf> a = RecordCodecBuilder.create($$0 -> $$0.group(jv.a(mi.K).fieldOf("items").forGetter(dhf::a)).apply($$0, dhf::new));
   public static final ze<wp, dhf> b = ze.a(zc.c(mi.K), dhf::a, dhf::new);

   public boolean a(dak $$0) {
      return $$0.a(this.c);
   }

   public jk<dag> a() {
      return this.c;
   }
}
