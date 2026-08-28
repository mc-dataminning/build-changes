import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eis implements eid {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwy.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dwy.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               brq.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eis::new)
   );
   public final dwy b;
   public final dwy c;
   private final brq d;

   public eis(dwy $$0, dwy $$1, brq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public brq a() {
      return this.d;
   }
}
