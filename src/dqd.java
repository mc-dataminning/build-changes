import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqd implements dpv {
   public static final Codec<dqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dqd.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqd::new)
   );
   public final List<dqd.a> b;
   public final int c;
   public final float d;

   public dqd(List<dqd.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dqd(List<dqd.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dqd(dyq $$0, dfe $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dqd.a($$0, $$1)), $$2, $$3);
   }

   public dqd(dyq $$0, dfe $$1, int $$2) {
      this(ImmutableList.of(new dqd.a($$0, $$1)), $$2, 0.0F);
   }

   public static dqd.a a(dyq $$0, dfe $$1) {
      return new dqd.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dqd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyq.c.fieldOf("target").forGetter($$0x -> $$0x.b), dfe.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dqd.a::new)
      );
      public final dyq b;
      public final dfe c;

      a(dyq $$0, dfe $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
