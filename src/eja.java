import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eja implements eis {
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eja.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eja::new)
   );
   public final List<eja.a> b;
   public final int c;
   public final float d;

   public eja(List<eja.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eja(List<eja.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eja(ery $$0, dxn $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eja.a($$0, $$1)), $$2, $$3);
   }

   public eja(ery $$0, dxn $$1, int $$2) {
      this(ImmutableList.of(new eja.a($$0, $$1)), $$2, 0.0F);
   }

   public static eja.a a(ery $$0, dxn $$1) {
      return new eja.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eja.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ery.c.fieldOf("target").forGetter($$0x -> $$0x.b), dxn.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eja.a::new)
      );
      public final ery b;
      public final dxn c;

      a(ery $$0, dxn $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
