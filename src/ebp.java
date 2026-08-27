import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebp implements ebh {
   public static final Codec<ebp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ebp.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ebp::new)
   );
   public final List<ebp.a> b;
   public final int c;
   public final float d;

   public ebp(List<ebp.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ebp(List<ebp.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ebp(ekj $$0, dqh $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ebp.a($$0, $$1)), $$2, $$3);
   }

   public ebp(ekj $$0, dqh $$1, int $$2) {
      this(ImmutableList.of(new ebp.a($$0, $$1)), $$2, 0.0F);
   }

   public static ebp.a a(ekj $$0, dqh $$1) {
      return new ebp.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ebp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ekj.c.fieldOf("target").forGetter($$0x -> $$0x.b), dqh.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ebp.a::new)
      );
      public final ekj b;
      public final dqh c;

      a(ekj $$0, dqh $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
