import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egc implements efu {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(egc.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egc::new)
   );
   public final List<egc.a> b;
   public final int c;
   public final float d;

   public egc(List<egc.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public egc(List<egc.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public egc(eoy $$0, duo $$1, int $$2, float $$3) {
      this(ImmutableList.of(new egc.a($$0, $$1)), $$2, $$3);
   }

   public egc(eoy $$0, duo $$1, int $$2) {
      this(ImmutableList.of(new egc.a($$0, $$1)), $$2, 0.0F);
   }

   public static egc.a a(eoy $$0, duo $$1) {
      return new egc.a($$0, $$1);
   }

   public static class a {
      public static final Codec<egc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eoy.c.fieldOf("target").forGetter($$0x -> $$0x.b), duo.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, egc.a::new)
      );
      public final eoy b;
      public final duo c;

      a(eoy $$0, duo $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
