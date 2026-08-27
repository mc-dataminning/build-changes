import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drv implements drn {
   public static final Codec<drv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(drv.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, drv::new)
   );
   public final List<drv.a> b;
   public final int c;
   public final float d;

   public drv(List<drv.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public drv(List<drv.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public drv(eap $$0, dgw $$1, int $$2, float $$3) {
      this(ImmutableList.of(new drv.a($$0, $$1)), $$2, $$3);
   }

   public drv(eap $$0, dgw $$1, int $$2) {
      this(ImmutableList.of(new drv.a($$0, $$1)), $$2, 0.0F);
   }

   public static drv.a a(eap $$0, dgw $$1) {
      return new drv.a($$0, $$1);
   }

   public static class a {
      public static final Codec<drv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eap.c.fieldOf("target").forGetter($$0x -> $$0x.b), dgw.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, drv.a::new)
      );
      public final eap b;
      public final dgw c;

      a(eap $$0, dgw $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
