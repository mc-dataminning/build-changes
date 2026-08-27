import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dtz implements dtr {
   public static final Codec<dtz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dtz.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dtz::new)
   );
   public final List<dtz.a> b;
   public final int c;
   public final float d;

   public dtz(List<dtz.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dtz(List<dtz.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dtz(ect $$0, dja $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dtz.a($$0, $$1)), $$2, $$3);
   }

   public dtz(ect $$0, dja $$1, int $$2) {
      this(ImmutableList.of(new dtz.a($$0, $$1)), $$2, 0.0F);
   }

   public static dtz.a a(ect $$0, dja $$1) {
      return new dtz.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dtz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ect.c.fieldOf("target").forGetter($$0x -> $$0x.b), dja.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dtz.a::new)
      );
      public final ect b;
      public final dja c;

      a(ect $$0, dja $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
