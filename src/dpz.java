import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dpz implements dpr {
   public static final Codec<dpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dpz.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpz::new)
   );
   public final List<dpz.a> b;
   public final int c;
   public final float d;

   public dpz(List<dpz.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dpz(List<dpz.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dpz(dym $$0, dfa $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dpz.a($$0, $$1)), $$2, $$3);
   }

   public dpz(dym $$0, dfa $$1, int $$2) {
      this(ImmutableList.of(new dpz.a($$0, $$1)), $$2, 0.0F);
   }

   public static dpz.a a(dym $$0, dfa $$1) {
      return new dpz.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dpz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dym.c.fieldOf("target").forGetter($$0x -> $$0x.b), dfa.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dpz.a::new)
      );
      public final dym b;
      public final dfa c;

      a(dym $$0, dfa $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
