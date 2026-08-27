import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqb(he<cfu> c, dqd d) {
   public static final Codec<dqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(acn.a(jc.D).fieldOf("display").forGetter($$0x -> $$0x.c), dqd.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dqb::new)
   );
   public static final Codec<he<dqb>> b = acm.a(jc.av, a);

   public he<cfu> a() {
      return this.c;
   }

   public dqd b() {
      return this.d;
   }
}
