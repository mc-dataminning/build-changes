import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eji implements eja {
   public static final Codec<eji> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eji.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eji::new)
   );
   public final List<eji.a> b;
   public final int c;
   public final float d;

   public eji(List<eji.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eji(List<eji.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eji(esg $$0, dxv $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eji.a($$0, $$1)), $$2, $$3);
   }

   public eji(esg $$0, dxv $$1, int $$2) {
      this(ImmutableList.of(new eji.a($$0, $$1)), $$2, 0.0F);
   }

   public static eji.a a(esg $$0, dxv $$1) {
      return new eji.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eji.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(esg.c.fieldOf("target").forGetter($$0x -> $$0x.b), dxv.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eji.a::new)
      );
      public final esg b;
      public final dxv c;

      a(esg $$0, dxv $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
