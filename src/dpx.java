import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dpx implements dpp {
   public static final Codec<dpx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dpx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpx::new)
   );
   public final List<dpx.a> b;
   public final int c;
   public final float d;

   public dpx(List<dpx.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dpx(List<dpx.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dpx(dyk $$0, dey $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dpx.a($$0, $$1)), $$2, $$3);
   }

   public dpx(dyk $$0, dey $$1, int $$2) {
      this(ImmutableList.of(new dpx.a($$0, $$1)), $$2, 0.0F);
   }

   public static dpx.a a(dyk $$0, dey $$1) {
      return new dpx.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dpx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyk.c.fieldOf("target").forGetter($$0x -> $$0x.b), dey.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dpx.a::new)
      );
      public final dyk b;
      public final dey c;

      a(dyk $$0, dey $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
