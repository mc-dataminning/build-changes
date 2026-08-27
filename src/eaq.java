import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eaq implements eai {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eaq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eaq::new)
   );
   public final List<eaq.a> b;
   public final int c;
   public final float d;

   public eaq(List<eaq.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eaq(List<eaq.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eaq(ejk $$0, dpi $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eaq.a($$0, $$1)), $$2, $$3);
   }

   public eaq(ejk $$0, dpi $$1, int $$2) {
      this(ImmutableList.of(new eaq.a($$0, $$1)), $$2, 0.0F);
   }

   public static eaq.a a(ejk $$0, dpi $$1) {
      return new eaq.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eaq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ejk.c.fieldOf("target").forGetter($$0x -> $$0x.b), dpi.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eaq.a::new)
      );
      public final ejk b;
      public final dpi c;

      a(ejk $$0, dpi $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
