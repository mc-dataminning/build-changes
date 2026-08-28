import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emx implements emp {
   public static final Codec<emx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(emx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emx::new)
   );
   public final List<emx.a> b;
   public final int c;
   public final float d;

   public emx(List<emx.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public emx(List<emx.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public emx(evx $$0, ebe $$1, int $$2, float $$3) {
      this(ImmutableList.of(new emx.a($$0, $$1)), $$2, $$3);
   }

   public emx(evx $$0, ebe $$1, int $$2) {
      this(ImmutableList.of(new emx.a($$0, $$1)), $$2, 0.0F);
   }

   public static emx.a a(evx $$0, ebe $$1) {
      return new emx.a($$0, $$1);
   }

   public static class a {
      public static final Codec<emx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(evx.c.fieldOf("target").forGetter($$0x -> $$0x.b), ebe.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, emx.a::new)
      );
      public final evx b;
      public final ebe c;

      a(evx $$0, ebe $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
