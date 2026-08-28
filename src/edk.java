import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edk implements edc {
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edk.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edk::new)
   );
   public final List<edk.a> b;
   public final int c;
   public final float d;

   public edk(List<edk.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edk(List<edk.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edk(eme $$0, dsc $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edk.a($$0, $$1)), $$2, $$3);
   }

   public edk(eme $$0, dsc $$1, int $$2) {
      this(ImmutableList.of(new edk.a($$0, $$1)), $$2, 0.0F);
   }

   public static edk.a a(eme $$0, dsc $$1) {
      return new edk.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eme.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsc.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edk.a::new)
      );
      public final eme b;
      public final dsc c;

      a(eme $$0, dsc $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
