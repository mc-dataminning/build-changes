import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emz implements emr {
   public static final Codec<emz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(emz.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emz::new)
   );
   public final List<emz.a> b;
   public final int c;
   public final float d;

   public emz(List<emz.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public emz(List<emz.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public emz(evz $$0, ebg $$1, int $$2, float $$3) {
      this(ImmutableList.of(new emz.a($$0, $$1)), $$2, $$3);
   }

   public emz(evz $$0, ebg $$1, int $$2) {
      this(ImmutableList.of(new emz.a($$0, $$1)), $$2, 0.0F);
   }

   public static emz.a a(evz $$0, ebg $$1) {
      return new emz.a($$0, $$1);
   }

   public static class a {
      public static final Codec<emz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(evz.c.fieldOf("target").forGetter($$0x -> $$0x.b), ebg.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, emz.a::new)
      );
      public final evz b;
      public final ebg c;

      a(evz $$0, ebg $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
