import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egn(ji<cum> c, egp d) {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a(lq.G).fieldOf("display").forGetter($$0x -> $$0x.c), egp.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egn::new)
   );
   public static final Codec<ji<egn>> b = alb.a(lq.aF, a);

   public ji<cum> a() {
      return this.c;
   }

   public egp b() {
      return this.d;
   }
}
