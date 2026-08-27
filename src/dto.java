import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dto implements dtg {
   public static final Codec<dto> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dto.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dto::new)
   );
   public final List<dto.a> b;
   public final int c;
   public final float d;

   public dto(List<dto.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dto(List<dto.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dto(eci $$0, dip $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dto.a($$0, $$1)), $$2, $$3);
   }

   public dto(eci $$0, dip $$1, int $$2) {
      this(ImmutableList.of(new dto.a($$0, $$1)), $$2, 0.0F);
   }

   public static dto.a a(eci $$0, dip $$1) {
      return new dto.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dto.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eci.c.fieldOf("target").forGetter($$0x -> $$0x.b), dip.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dto.a::new)
      );
      public final eci b;
      public final dip c;

      a(eci $$0, dip $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
