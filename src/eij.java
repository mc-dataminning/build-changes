import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eij implements eib {
   public static final Codec<eij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(eij.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eij::new)
   );
   public final List<eij.a> b;
   public final int c;
   public final float d;

   public eij(List<eij.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public eij(List<eij.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public eij(erh $$0, dww $$1, int $$2, float $$3) {
      this(ImmutableList.of(new eij.a($$0, $$1)), $$2, $$3);
   }

   public eij(erh $$0, dww $$1, int $$2) {
      this(ImmutableList.of(new eij.a($$0, $$1)), $$2, 0.0F);
   }

   public static eij.a a(erh $$0, dww $$1) {
      return new eij.a($$0, $$1);
   }

   public static class a {
      public static final Codec<eij.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(erh.c.fieldOf("target").forGetter($$0x -> $$0x.b), dww.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, eij.a::new)
      );
      public final erh b;
      public final dww c;

      a(erh $$0, dww $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
