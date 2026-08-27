import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxg implements dwy {
   public static final Codec<dxg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dxg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dxg::new)
   );
   public final List<dxg.a> b;
   public final int c;
   public final float d;

   public dxg(List<dxg.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dxg(List<dxg.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dxg(ega $$0, dme $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dxg.a($$0, $$1)), $$2, $$3);
   }

   public dxg(ega $$0, dme $$1, int $$2) {
      this(ImmutableList.of(new dxg.a($$0, $$1)), $$2, 0.0F);
   }

   public static dxg.a a(ega $$0, dme $$1) {
      return new dxg.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dxg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ega.c.fieldOf("target").forGetter($$0x -> $$0x.b), dme.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dxg.a::new)
      );
      public final ega b;
      public final dme c;

      a(ega $$0, dme $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
