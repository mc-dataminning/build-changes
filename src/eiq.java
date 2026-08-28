import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiq implements eib {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dww.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dww.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bro.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eiq::new)
   );
   public final dww b;
   public final dww c;
   private final bro d;

   public eiq(dww $$0, dww $$1, bro $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bro a() {
      return this.d;
   }
}
