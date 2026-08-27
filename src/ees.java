import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ees implements eek {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ees.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ees::new)
   );
   public final List<ees.a> b;
   public final int c;
   public final float d;

   public ees(List<ees.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ees(List<ees.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ees(enn $$0, dtc $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ees.a($$0, $$1)), $$2, $$3);
   }

   public ees(enn $$0, dtc $$1, int $$2) {
      this(ImmutableList.of(new ees.a($$0, $$1)), $$2, 0.0F);
   }

   public static ees.a a(enn $$0, dtc $$1) {
      return new ees.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ees.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enn.c.fieldOf("target").forGetter($$0x -> $$0x.b), dtc.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ees.a::new)
      );
      public final enn b;
      public final dtc c;

      a(enn $$0, dtc $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
