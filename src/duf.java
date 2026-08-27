import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duf implements dtx {
   public static final Codec<duf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(duf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, duf::new)
   );
   public final List<duf.a> b;
   public final int c;
   public final float d;

   public duf(List<duf.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public duf(List<duf.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public duf(ecz $$0, djg $$1, int $$2, float $$3) {
      this(ImmutableList.of(new duf.a($$0, $$1)), $$2, $$3);
   }

   public duf(ecz $$0, djg $$1, int $$2) {
      this(ImmutableList.of(new duf.a($$0, $$1)), $$2, 0.0F);
   }

   public static duf.a a(ecz $$0, djg $$1) {
      return new duf.a($$0, $$1);
   }

   public static class a {
      public static final Codec<duf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ecz.c.fieldOf("target").forGetter($$0x -> $$0x.b), djg.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, duf.a::new)
      );
      public final ecz b;
      public final djg c;

      a(ecz $$0, djg $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
