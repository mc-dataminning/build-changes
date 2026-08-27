import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eah implements dzz {
   public static final Codec<eah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eah.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eah::new)
   );
   public final List<eah.a> b;
   public final int c;
   public final float d;

   public eah(List<eah.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eah(List<eah.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eah(ejb $$0, doz $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eah.a($$0, $$1)), $$2, $$3);
   }

   public eah(ejb $$0, doz $$1, int $$2) {
      this(ImmutableList.of(new eah.a($$0, $$1)), $$2, 0.0F);
   }

   public static eah.a a(ejb $$0, doz $$1) {
      return new eah.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eah.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ejb.c.fieldOf("target").forGetter($$0x -> $$0x.b), doz.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eah.a::new)
      );
      public final ejb b;
      public final doz c;

      a(ejb $$0, doz $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
