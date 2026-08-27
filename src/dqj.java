import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqj implements dpu {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfd.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dfd.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bgj.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqj::new)
   );
   public final dfd b;
   public final dfd c;
   private final bgj d;

   public dqj(dfd $$0, dfd $$1, bgj $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bgj a() {
      return this.d;
   }
}
