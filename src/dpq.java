import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpq implements dpu {
   public static final Codec<dpq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfd.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dfd.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bgj.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bgj.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpq::new)
   );
   private final dfd b;
   private final dfd c;
   private final bgj d;
   private final bgj e;

   public dpq(dfd $$0, dfd $$1, bgj $$2, bgj $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dfd a() {
      return this.b;
   }

   public dfd b() {
      return this.c;
   }

   public bgj c() {
      return this.d;
   }

   public bgj d() {
      return this.e;
   }
}
