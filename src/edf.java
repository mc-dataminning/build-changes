import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edf implements ecx {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edf::new)
   );
   public final List<edf.a> b;
   public final int c;
   public final float d;

   public edf(List<edf.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edf(List<edf.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edf(elz $$0, drx $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edf.a($$0, $$1)), $$2, $$3);
   }

   public edf(elz $$0, drx $$1, int $$2) {
      this(ImmutableList.of(new edf.a($$0, $$1)), $$2, 0.0F);
   }

   public static edf.a a(elz $$0, drx $$1) {
      return new edf.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elz.c.fieldOf("target").forGetter($$0x -> $$0x.b), drx.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edf.a::new)
      );
      public final elz b;
      public final drx c;

      a(elz $$0, drx $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
