import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dug implements dty {
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dug.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dug::new)
   );
   public final List<dug.a> b;
   public final int c;
   public final float d;

   public dug(List<dug.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dug(List<dug.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dug(eda $$0, djh $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dug.a($$0, $$1)), $$2, $$3);
   }

   public dug(eda $$0, djh $$1, int $$2) {
      this(ImmutableList.of(new dug.a($$0, $$1)), $$2, 0.0F);
   }

   public static dug.a a(eda $$0, djh $$1) {
      return new dug.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dug.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eda.c.fieldOf("target").forGetter($$0x -> $$0x.b), djh.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dug.a::new)
      );
      public final eda b;
      public final djh c;

      a(eda $$0, djh $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
