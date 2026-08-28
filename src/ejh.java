import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejh implements eiz {
   public static final Codec<ejh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ejh.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejh::new)
   );
   public final List<ejh.a> b;
   public final int c;
   public final float d;

   public ejh(List<ejh.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ejh(List<ejh.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ejh(esf $$0, dxu $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ejh.a($$0, $$1)), $$2, $$3);
   }

   public ejh(esf $$0, dxu $$1, int $$2) {
      this(ImmutableList.of(new ejh.a($$0, $$1)), $$2, 0.0F);
   }

   public static ejh.a a(esf $$0, dxu $$1) {
      return new ejh.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ejh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(esf.c.fieldOf("target").forGetter($$0x -> $$0x.b), dxu.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ejh.a::new)
      );
      public final esf b;
      public final dxu c;

      a(esf $$0, dxu $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
