import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class enj implements enb {
   public static final Codec<enj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(enj.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, enj::new)
   );
   public final List<enj.a> b;
   public final int c;
   public final float d;

   public enj(List<enj.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public enj(List<enj.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public enj(ewj $$0, ebq $$1, int $$2, float $$3) {
      this(ImmutableList.of(new enj.a($$0, $$1)), $$2, $$3);
   }

   public enj(ewj $$0, ebq $$1, int $$2) {
      this(ImmutableList.of(new enj.a($$0, $$1)), $$2, 0.0F);
   }

   public static enj.a a(ewj $$0, ebq $$1) {
      return new enj.a($$0, $$1);
   }

   public static class a {
      public static final Codec<enj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ewj.c.fieldOf("target").forGetter($$0x -> $$0x.b), ebq.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, enj.a::new)
      );
      public final ewj b;
      public final ebq c;

      a(ewj $$0, ebq $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
