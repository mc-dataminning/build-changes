import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecs implements ecd {
   public static final Codec<ecs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drd.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               drd.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpb.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecs::new)
   );
   public final drd b;
   public final drd c;
   private final bpb d;

   public ecs(drd $$0, drd $$1, bpb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpb a() {
      return this.d;
   }
}
