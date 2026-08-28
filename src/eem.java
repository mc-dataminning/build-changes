import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eem implements eee {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eem.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eem::new)
   );
   public final List<eem.a> b;
   public final int c;
   public final float d;

   public eem(List<eem.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eem(List<eem.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eem(enh $$0, dta $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eem.a($$0, $$1)), $$2, $$3);
   }

   public eem(enh $$0, dta $$1, int $$2) {
      this(ImmutableList.of(new eem.a($$0, $$1)), $$2, 0.0F);
   }

   public static eem.a a(enh $$0, dta $$1) {
      return new eem.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eem.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enh.c.fieldOf("target").forGetter($$0x -> $$0x.b), dta.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eem.a::new)
      );
      public final enh b;
      public final dta c;

      a(enh $$0, dta $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
