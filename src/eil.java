import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eil implements eid {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eil.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eil::new)
   );
   public final List<eil.a> b;
   public final int c;
   public final float d;

   public eil(List<eil.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eil(List<eil.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eil(erj $$0, dwy $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eil.a($$0, $$1)), $$2, $$3);
   }

   public eil(erj $$0, dwy $$1, int $$2) {
      this(ImmutableList.of(new eil.a($$0, $$1)), $$2, 0.0F);
   }

   public static eil.a a(erj $$0, dwy $$1) {
      return new eil.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eil.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(erj.c.fieldOf("target").forGetter($$0x -> $$0x.b), dwy.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eil.a::new)
      );
      public final erj b;
      public final dwy c;

      a(erj $$0, dwy $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
