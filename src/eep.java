import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eep implements eeh {
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eep.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eep::new)
   );
   public final List<eep.a> b;
   public final int c;
   public final float d;

   public eep(List<eep.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eep(List<eep.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eep(enl $$0, dtc $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eep.a($$0, $$1)), $$2, $$3);
   }

   public eep(enl $$0, dtc $$1, int $$2) {
      this(ImmutableList.of(new eep.a($$0, $$1)), $$2, 0.0F);
   }

   public static eep.a a(enl $$0, dtc $$1) {
      return new eep.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eep.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enl.c.fieldOf("target").forGetter($$0x -> $$0x.b), dtc.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eep.a::new)
      );
      public final enl b;
      public final dtc c;

      a(enl $$0, dtc $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
