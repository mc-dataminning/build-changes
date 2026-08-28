import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edq implements edi {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edq::new)
   );
   public final List<edq.a> b;
   public final int c;
   public final float d;

   public edq(List<edq.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edq(List<edq.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edq(emk $$0, dsh $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edq.a($$0, $$1)), $$2, $$3);
   }

   public edq(emk $$0, dsh $$1, int $$2) {
      this(ImmutableList.of(new edq.a($$0, $$1)), $$2, 0.0F);
   }

   public static edq.a a(emk $$0, dsh $$1) {
      return new edq.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emk.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsh.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edq.a::new)
      );
      public final emk b;
      public final dsh c;

      a(emk $$0, dsh $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
