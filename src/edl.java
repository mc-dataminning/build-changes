import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edl implements edd {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edl.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edl::new)
   );
   public final List<edl.a> b;
   public final int c;
   public final float d;

   public edl(List<edl.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edl(List<edl.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edl(emf $$0, dsd $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edl.a($$0, $$1)), $$2, $$3);
   }

   public edl(emf $$0, dsd $$1, int $$2) {
      this(ImmutableList.of(new edl.a($$0, $$1)), $$2, 0.0F);
   }

   public static edl.a a(emf $$0, dsd $$1) {
      return new edl.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emf.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsd.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edl.a::new)
      );
      public final emf b;
      public final dsd c;

      a(emf $$0, dsd $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
