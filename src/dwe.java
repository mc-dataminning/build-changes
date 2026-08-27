import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwe implements dvw {
   public static final Codec<dwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dwe.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dwe::new)
   );
   public final List<dwe.a> b;
   public final int c;
   public final float d;

   public dwe(List<dwe.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dwe(List<dwe.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dwe(eey $$0, dlf $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dwe.a($$0, $$1)), $$2, $$3);
   }

   public dwe(eey $$0, dlf $$1, int $$2) {
      this(ImmutableList.of(new dwe.a($$0, $$1)), $$2, 0.0F);
   }

   public static dwe.a a(eey $$0, dlf $$1) {
      return new dwe.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dwe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eey.c.fieldOf("target").forGetter($$0x -> $$0x.b), dlf.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dwe.a::new)
      );
      public final eey b;
      public final dlf c;

      a(eey $$0, dlf $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
