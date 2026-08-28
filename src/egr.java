import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egr implements egj {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(egr.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egr::new)
   );
   public final List<egr.a> b;
   public final int c;
   public final float d;

   public egr(List<egr.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public egr(List<egr.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public egr(epn $$0, dvd $$1, int $$2, float $$3) {
      this(ImmutableList.of(new egr.a($$0, $$1)), $$2, $$3);
   }

   public egr(epn $$0, dvd $$1, int $$2) {
      this(ImmutableList.of(new egr.a($$0, $$1)), $$2, 0.0F);
   }

   public static egr.a a(epn $$0, dvd $$1) {
      return new egr.a($$0, $$1);
   }

   public static class a {
      public static final Codec<egr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(epn.c.fieldOf("target").forGetter($$0x -> $$0x.b), dvd.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, egr.a::new)
      );
      public final epn b;
      public final dvd c;

      a(epn $$0, dvd $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
