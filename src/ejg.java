import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejg implements eiy {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ejg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejg::new)
   );
   public final List<ejg.a> b;
   public final int c;
   public final float d;

   public ejg(List<ejg.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ejg(List<ejg.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ejg(esf $$0, dxq $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ejg.a($$0, $$1)), $$2, $$3);
   }

   public ejg(esf $$0, dxq $$1, int $$2) {
      this(ImmutableList.of(new ejg.a($$0, $$1)), $$2, 0.0F);
   }

   public static ejg.a a(esf $$0, dxq $$1) {
      return new ejg.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ejg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(esf.c.fieldOf("target").forGetter($$0x -> $$0x.b), dxq.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ejg.a::new)
      );
      public final esf b;
      public final dxq c;

      a(esf $$0, dxq $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
