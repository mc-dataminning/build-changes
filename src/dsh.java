import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsh implements drz {
   public static final Codec<dsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dsh.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dsh::new)
   );
   public final List<dsh.a> b;
   public final int c;
   public final float d;

   public dsh(List<dsh.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dsh(List<dsh.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dsh(ebb $$0, dhi $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dsh.a($$0, $$1)), $$2, $$3);
   }

   public dsh(ebb $$0, dhi $$1, int $$2) {
      this(ImmutableList.of(new dsh.a($$0, $$1)), $$2, 0.0F);
   }

   public static dsh.a a(ebb $$0, dhi $$1) {
      return new dsh.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dsh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebb.c.fieldOf("target").forGetter($$0x -> $$0x.b), dhi.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dsh.a::new)
      );
      public final ebb b;
      public final dhi c;

      a(ebb $$0, dhi $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
