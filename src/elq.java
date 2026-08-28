import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elq implements eli {
   public static final Codec<elq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(elq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elq::new)
   );
   public final List<elq.a> b;
   public final int c;
   public final float d;

   public elq(List<elq.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public elq(List<elq.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public elq(eup $$0, dzz $$1, int $$2, float $$3) {
      this(ImmutableList.of(new elq.a($$0, $$1)), $$2, $$3);
   }

   public elq(eup $$0, dzz $$1, int $$2) {
      this(ImmutableList.of(new elq.a($$0, $$1)), $$2, 0.0F);
   }

   public static elq.a a(eup $$0, dzz $$1) {
      return new elq.a($$0, $$1);
   }

   public static class a {
      public static final Codec<elq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eup.c.fieldOf("target").forGetter($$0x -> $$0x.b), dzz.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, elq.a::new)
      );
      public final eup b;
      public final dzz c;

      a(eup $$0, dzz $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
