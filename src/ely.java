import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ely implements elq {
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ely.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ely::new)
   );
   public final List<ely.a> b;
   public final int c;
   public final float d;

   public ely(List<ely.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ely(List<ely.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ely(eux $$0, eah $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ely.a($$0, $$1)), $$2, $$3);
   }

   public ely(eux $$0, eah $$1, int $$2) {
      this(ImmutableList.of(new ely.a($$0, $$1)), $$2, 0.0F);
   }

   public static ely.a a(eux $$0, eah $$1) {
      return new ely.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ely.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eux.c.fieldOf("target").forGetter($$0x -> $$0x.b), eah.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ely.a::new)
      );
      public final eux b;
      public final eah c;

      a(eux $$0, eah $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
