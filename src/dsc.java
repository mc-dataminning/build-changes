import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc implements drn {
   public static final Codec<dsc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgw.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dgw.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bhv.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dsc::new)
   );
   public final dgw b;
   public final dgw c;
   private final bhv d;

   public dsc(dgw $$0, dgw $$1, bhv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bhv a() {
      return this.d;
   }
}
