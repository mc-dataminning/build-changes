import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emk implements emc {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(emk.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emk::new)
   );
   public final List<emk.a> b;
   public final int c;
   public final float d;

   public emk(List<emk.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public emk(List<emk.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public emk(evj $$0, eat $$1, int $$2, float $$3) {
      this(ImmutableList.of(new emk.a($$0, $$1)), $$2, $$3);
   }

   public emk(evj $$0, eat $$1, int $$2) {
      this(ImmutableList.of(new emk.a($$0, $$1)), $$2, 0.0F);
   }

   public static emk.a a(evj $$0, eat $$1) {
      return new emk.a($$0, $$1);
   }

   public static class a {
      public static final Codec<emk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(evj.c.fieldOf("target").forGetter($$0x -> $$0x.b), eat.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, emk.a::new)
      );
      public final evj b;
      public final eat c;

      a(evj $$0, eat $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
