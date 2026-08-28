import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehb implements egt {
   public static final Codec<ehb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ehb.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ehb::new)
   );
   public final List<ehb.a> b;
   public final int c;
   public final float d;

   public ehb(List<ehb.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ehb(List<ehb.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ehb(epx $$0, dvo $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ehb.a($$0, $$1)), $$2, $$3);
   }

   public ehb(epx $$0, dvo $$1, int $$2) {
      this(ImmutableList.of(new ehb.a($$0, $$1)), $$2, 0.0F);
   }

   public static ehb.a a(epx $$0, dvo $$1) {
      return new ehb.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ehb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(epx.c.fieldOf("target").forGetter($$0x -> $$0x.b), dvo.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ehb.a::new)
      );
      public final epx b;
      public final dvo c;

      a(epx $$0, dvo $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
