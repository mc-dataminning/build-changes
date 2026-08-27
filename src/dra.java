import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dra implements dqs {
   public static final Codec<dra> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dra.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dra::new)
   );
   public final List<dra.a> b;
   public final int c;
   public final float d;

   public dra(List<dra.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dra(List<dra.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dra(dzn $$0, dgb $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dra.a($$0, $$1)), $$2, $$3);
   }

   public dra(dzn $$0, dgb $$1, int $$2) {
      this(ImmutableList.of(new dra.a($$0, $$1)), $$2, 0.0F);
   }

   public static dra.a a(dzn $$0, dgb $$1) {
      return new dra.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dra.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzn.c.fieldOf("target").forGetter($$0x -> $$0x.b), dgb.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dra.a::new)
      );
      public final dzn b;
      public final dgb c;

      a(dzn $$0, dgb $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
