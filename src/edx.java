import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edx implements edp {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edx::new)
   );
   public final List<edx.a> b;
   public final int c;
   public final float d;

   public edx(List<edx.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edx(List<edx.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edx(ems $$0, dsl $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edx.a($$0, $$1)), $$2, $$3);
   }

   public edx(ems $$0, dsl $$1, int $$2) {
      this(ImmutableList.of(new edx.a($$0, $$1)), $$2, 0.0F);
   }

   public static edx.a a(ems $$0, dsl $$1) {
      return new edx.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ems.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsl.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edx.a::new)
      );
      public final ems b;
      public final dsl c;

      a(ems $$0, dsl $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
