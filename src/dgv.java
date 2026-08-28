import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgv(jk<czw> c) {
   public static final Codec<dgv> a = RecordCodecBuilder.create($$0 -> $$0.group(jv.a(mi.K).fieldOf("items").forGetter(dgv::a)).apply($$0, dgv::new));
   public static final za<wn, dgv> b = za.a(yy.c(mi.K), dgv::a, dgv::new);

   public boolean a(daa $$0) {
      return $$0.a(this.c);
   }

   public jk<czw> a() {
      return this.c;
   }
}
