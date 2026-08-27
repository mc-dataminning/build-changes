import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dna implements dms {
   public static final Codec<dna> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dna.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dna::new)
   );
   public final List<dna.a> b;
   public final int c;
   public final float d;

   public dna(List<dna.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dna(List<dna.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dna(dvn $$0, dcb $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dna.a($$0, $$1)), $$2, $$3);
   }

   public dna(dvn $$0, dcb $$1, int $$2) {
      this(ImmutableList.of(new dna.a($$0, $$1)), $$2, 0.0F);
   }

   public static dna.a a(dvn $$0, dcb $$1) {
      return new dna.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dna.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dvn.c.fieldOf("target").forGetter($$0x -> $$0x.b), dcb.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dna.a::new)
      );
      public final dvn b;
      public final dcb c;

      a(dvn $$0, dcb $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
