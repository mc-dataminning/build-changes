import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqi implements dqa {
   public static final Codec<dqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dqi.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqi::new)
   );
   public final List<dqi.a> b;
   public final int c;
   public final float d;

   public dqi(List<dqi.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dqi(List<dqi.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dqi(dyv $$0, dfj $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dqi.a($$0, $$1)), $$2, $$3);
   }

   public dqi(dyv $$0, dfj $$1, int $$2) {
      this(ImmutableList.of(new dqi.a($$0, $$1)), $$2, 0.0F);
   }

   public static dqi.a a(dyv $$0, dfj $$1) {
      return new dqi.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dqi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyv.c.fieldOf("target").forGetter($$0x -> $$0x.b), dfj.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dqi.a::new)
      );
      public final dyv b;
      public final dfj c;

      a(dyv $$0, dfj $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
