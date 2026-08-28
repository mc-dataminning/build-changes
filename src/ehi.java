import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehi implements eha {
   public static final Codec<ehi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ehi.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ehi::new)
   );
   public final List<ehi.a> b;
   public final int c;
   public final float d;

   public ehi(List<ehi.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ehi(List<ehi.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ehi(eqe $$0, dvv $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ehi.a($$0, $$1)), $$2, $$3);
   }

   public ehi(eqe $$0, dvv $$1, int $$2) {
      this(ImmutableList.of(new ehi.a($$0, $$1)), $$2, 0.0F);
   }

   public static ehi.a a(eqe $$0, dvv $$1) {
      return new ehi.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ehi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eqe.c.fieldOf("target").forGetter($$0x -> $$0x.b), dvv.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ehi.a::new)
      );
      public final eqe b;
      public final dvv c;

      a(eqe $$0, dvv $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
