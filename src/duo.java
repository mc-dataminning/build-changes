import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duo implements dug {
   public static final Codec<duo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(duo.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, duo::new)
   );
   public final List<duo.a> b;
   public final int c;
   public final float d;

   public duo(List<duo.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public duo(List<duo.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public duo(edi $$0, djp $$1, int $$2, float $$3) {
      this(ImmutableList.of(new duo.a($$0, $$1)), $$2, $$3);
   }

   public duo(edi $$0, djp $$1, int $$2) {
      this(ImmutableList.of(new duo.a($$0, $$1)), $$2, 0.0F);
   }

   public static duo.a a(edi $$0, djp $$1) {
      return new duo.a($$0, $$1);
   }

   public static class a {
      public static final Codec<duo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(edi.c.fieldOf("target").forGetter($$0x -> $$0x.b), djp.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, duo.a::new)
      );
      public final edi b;
      public final djp c;

      a(edi $$0, djp $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
