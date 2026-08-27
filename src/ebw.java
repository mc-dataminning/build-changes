import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebw implements ebh {
   public static final Codec<ebw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqh.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dqh.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bor.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ebw::new)
   );
   public final dqh b;
   public final dqh c;
   private final bor d;

   public ebw(dqh $$0, dqh $$1, bor $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bor a() {
      return this.d;
   }
}
