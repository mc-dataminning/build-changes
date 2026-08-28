import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emf implements elx {
   public static final Codec<emf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(emf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emf::new)
   );
   public final List<emf.a> b;
   public final int c;
   public final float d;

   public emf(List<emf.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public emf(List<emf.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public emf(eve $$0, eao $$1, int $$2, float $$3) {
      this(ImmutableList.of(new emf.a($$0, $$1)), $$2, $$3);
   }

   public emf(eve $$0, eao $$1, int $$2) {
      this(ImmutableList.of(new emf.a($$0, $$1)), $$2, 0.0F);
   }

   public static emf.a a(eve $$0, eao $$1) {
      return new emf.a($$0, $$1);
   }

   public static class a {
      public static final Codec<emf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eve.c.fieldOf("target").forGetter($$0x -> $$0x.b), eao.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, emf.a::new)
      );
      public final eve b;
      public final eao c;

      a(eve $$0, eao $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
