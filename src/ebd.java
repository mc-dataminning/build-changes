import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebd implements ebh {
   public static final Codec<ebd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqh.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dqh.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bor.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bor.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ebd::new)
   );
   private final dqh b;
   private final dqh c;
   private final bor d;
   private final bor e;

   public ebd(dqh $$0, dqh $$1, bor $$2, bor $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dqh a() {
      return this.b;
   }

   public dqh b() {
      return this.c;
   }

   public bor c() {
      return this.d;
   }

   public bor d() {
      return this.e;
   }
}
