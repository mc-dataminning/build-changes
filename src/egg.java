import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egg implements efy {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(egg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egg::new)
   );
   public final List<egg.a> b;
   public final int c;
   public final float d;

   public egg(List<egg.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public egg(List<egg.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public egg(epc $$0, dus $$1, int $$2, float $$3) {
      this(ImmutableList.of(new egg.a($$0, $$1)), $$2, $$3);
   }

   public egg(epc $$0, dus $$1, int $$2) {
      this(ImmutableList.of(new egg.a($$0, $$1)), $$2, 0.0F);
   }

   public static egg.a a(epc $$0, dus $$1) {
      return new egg.a($$0, $$1);
   }

   public static class a {
      public static final Codec<egg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(epc.c.fieldOf("target").forGetter($$0x -> $$0x.b), dus.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, egg.a::new)
      );
      public final epc b;
      public final dus c;

      a(epc $$0, dus $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
