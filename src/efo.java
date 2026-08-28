import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efo implements efg {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(efo.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, efo::new)
   );
   public final List<efo.a> b;
   public final int c;
   public final float d;

   public efo(List<efo.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public efo(List<efo.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public efo(eok $$0, dua $$1, int $$2, float $$3) {
      this(ImmutableList.of(new efo.a($$0, $$1)), $$2, $$3);
   }

   public efo(eok $$0, dua $$1, int $$2) {
      this(ImmutableList.of(new efo.a($$0, $$1)), $$2, 0.0F);
   }

   public static efo.a a(eok $$0, dua $$1) {
      return new efo.a($$0, $$1);
   }

   public static class a {
      public static final Codec<efo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eok.c.fieldOf("target").forGetter($$0x -> $$0x.b), dua.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, efo.a::new)
      );
      public final eok b;
      public final dua c;

      a(eok $$0, dua $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
