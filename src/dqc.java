import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqc implements dpu {
   public static final Codec<dqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dqc.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqc::new)
   );
   public final List<dqc.a> b;
   public final int c;
   public final float d;

   public dqc(List<dqc.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dqc(List<dqc.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dqc(dyp $$0, dfd $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dqc.a($$0, $$1)), $$2, $$3);
   }

   public dqc(dyp $$0, dfd $$1, int $$2) {
      this(ImmutableList.of(new dqc.a($$0, $$1)), $$2, 0.0F);
   }

   public static dqc.a a(dyp $$0, dfd $$1) {
      return new dqc.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dqc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyp.c.fieldOf("target").forGetter($$0x -> $$0x.b), dfd.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dqc.a::new)
      );
      public final dyp b;
      public final dfd c;

      a(dyp $$0, dfd $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
