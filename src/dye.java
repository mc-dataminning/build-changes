import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dye implements dxw {
   public static final Codec<dye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dye.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dye::new)
   );
   public final List<dye.a> b;
   public final int c;
   public final float d;

   public dye(List<dye.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dye(List<dye.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dye(egy $$0, dnb $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dye.a($$0, $$1)), $$2, $$3);
   }

   public dye(egy $$0, dnb $$1, int $$2) {
      this(ImmutableList.of(new dye.a($$0, $$1)), $$2, 0.0F);
   }

   public static dye.a a(egy $$0, dnb $$1) {
      return new dye.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dye.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(egy.c.fieldOf("target").forGetter($$0x -> $$0x.b), dnb.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dye.a::new)
      );
      public final egy b;
      public final dnb c;

      a(egy $$0, dnb $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
