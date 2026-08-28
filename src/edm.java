import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edm implements ede {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edm.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edm::new)
   );
   public final List<edm.a> b;
   public final int c;
   public final float d;

   public edm(List<edm.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edm(List<edm.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edm(emg $$0, dse $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edm.a($$0, $$1)), $$2, $$3);
   }

   public edm(emg $$0, dse $$1, int $$2) {
      this(ImmutableList.of(new edm.a($$0, $$1)), $$2, 0.0F);
   }

   public static edm.a a(emg $$0, dse $$1) {
      return new edm.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emg.c.fieldOf("target").forGetter($$0x -> $$0x.b), dse.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edm.a::new)
      );
      public final emg b;
      public final dse c;

      a(emg $$0, dse $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
