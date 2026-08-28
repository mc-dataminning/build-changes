import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edi implements eda {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edi.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edi::new)
   );
   public final List<edi.a> b;
   public final int c;
   public final float d;

   public edi(List<edi.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edi(List<edi.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edi(emc $$0, dsa $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edi.a($$0, $$1)), $$2, $$3);
   }

   public edi(emc $$0, dsa $$1, int $$2) {
      this(ImmutableList.of(new edi.a($$0, $$1)), $$2, 0.0F);
   }

   public static edi.a a(emc $$0, dsa $$1) {
      return new edi.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emc.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsa.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edi.a::new)
      );
      public final emc b;
      public final dsa c;

      a(emc $$0, dsa $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
