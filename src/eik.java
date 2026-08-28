import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eik implements eic {
   public static final Codec<eik> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eik.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eik::new)
   );
   public final List<eik.a> b;
   public final int c;
   public final float d;

   public eik(List<eik.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eik(List<eik.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eik(eri $$0, dwx $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eik.a($$0, $$1)), $$2, $$3);
   }

   public eik(eri $$0, dwx $$1, int $$2) {
      this(ImmutableList.of(new eik.a($$0, $$1)), $$2, 0.0F);
   }

   public static eik.a a(eri $$0, dwx $$1) {
      return new eik.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eik.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eri.c.fieldOf("target").forGetter($$0x -> $$0x.b), dwx.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eik.a::new)
      );
      public final eri b;
      public final dwx c;

      a(eri $$0, dwx $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
