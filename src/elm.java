import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elm(jr<cwk> c, elo d) {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwk.e.fieldOf("display").forGetter($$0x -> $$0x.c), elo.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, elm::new)
   );
   public static final Codec<jr<elm>> b = akr.a(mc.aQ, a);

   public jr<cwk> a() {
      return this.c;
   }

   public elo b() {
      return this.d;
   }
}
