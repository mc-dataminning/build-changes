import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egx implements egp {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(egx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egx::new)
   );
   public final List<egx.a> b;
   public final int c;
   public final float d;

   public egx(List<egx.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public egx(List<egx.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public egx(ept $$0, dvj $$1, int $$2, float $$3) {
      this(ImmutableList.of(new egx.a($$0, $$1)), $$2, $$3);
   }

   public egx(ept $$0, dvj $$1, int $$2) {
      this(ImmutableList.of(new egx.a($$0, $$1)), $$2, 0.0F);
   }

   public static egx.a a(ept $$0, dvj $$1) {
      return new egx.a($$0, $$1);
   }

   public static class a {
      public static final Codec<egx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ept.c.fieldOf("target").forGetter($$0x -> $$0x.b), dvj.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, egx.a::new)
      );
      public final ept b;
      public final dvj c;

      a(ept $$0, dvj $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
