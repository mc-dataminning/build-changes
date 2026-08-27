import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsm implements dse {
   public static final Codec<dsm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dsm.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dsm::new)
   );
   public final List<dsm.a> b;
   public final int c;
   public final float d;

   public dsm(List<dsm.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dsm(List<dsm.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dsm(ebg $$0, dhn $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dsm.a($$0, $$1)), $$2, $$3);
   }

   public dsm(ebg $$0, dhn $$1, int $$2) {
      this(ImmutableList.of(new dsm.a($$0, $$1)), $$2, 0.0F);
   }

   public static dsm.a a(ebg $$0, dhn $$1) {
      return new dsm.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dsm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebg.c.fieldOf("target").forGetter($$0x -> $$0x.b), dhn.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dsm.a::new)
      );
      public final ebg b;
      public final dhn c;

      a(ebg $$0, dhn $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
