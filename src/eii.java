import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eii implements eia {
   public static final Codec<eii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eii.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eii::new)
   );
   public final List<eii.a> b;
   public final int c;
   public final float d;

   public eii(List<eii.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eii(List<eii.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eii(erg $$0, dwv $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eii.a($$0, $$1)), $$2, $$3);
   }

   public eii(erg $$0, dwv $$1, int $$2) {
      this(ImmutableList.of(new eii.a($$0, $$1)), $$2, 0.0F);
   }

   public static eii.a a(erg $$0, dwv $$1) {
      return new eii.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eii.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(erg.c.fieldOf("target").forGetter($$0x -> $$0x.b), dwv.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eii.a::new)
      );
      public final erg b;
      public final dwv c;

      a(erg $$0, dwv $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
