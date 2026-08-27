import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecj implements ecb {
   public static final Codec<ecj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ecj.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecj::new)
   );
   public final List<ecj.a> b;
   public final int c;
   public final float d;

   public ecj(List<ecj.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ecj(List<ecj.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ecj(eld $$0, drb $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ecj.a($$0, $$1)), $$2, $$3);
   }

   public ecj(eld $$0, drb $$1, int $$2) {
      this(ImmutableList.of(new ecj.a($$0, $$1)), $$2, 0.0F);
   }

   public static ecj.a a(eld $$0, drb $$1) {
      return new ecj.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ecj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eld.c.fieldOf("target").forGetter($$0x -> $$0x.b), drb.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ecj.a::new)
      );
      public final eld b;
      public final drb c;

      a(eld $$0, drb $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
