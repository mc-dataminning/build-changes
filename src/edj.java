import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edj implements edb {
   public static final Codec<edj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edj.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edj::new)
   );
   public final List<edj.a> b;
   public final int c;
   public final float d;

   public edj(List<edj.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edj(List<edj.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edj(emd $$0, dsb $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edj.a($$0, $$1)), $$2, $$3);
   }

   public edj(emd $$0, dsb $$1, int $$2) {
      this(ImmutableList.of(new edj.a($$0, $$1)), $$2, 0.0F);
   }

   public static edj.a a(emd $$0, dsb $$1) {
      return new edj.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emd.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsb.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edj.a::new)
      );
      public final emd b;
      public final dsb c;

      a(emd $$0, dsb $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
