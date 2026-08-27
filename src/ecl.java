import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecl implements ecd {
   public static final Codec<ecl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ecl.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecl::new)
   );
   public final List<ecl.a> b;
   public final int c;
   public final float d;

   public ecl(List<ecl.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ecl(List<ecl.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ecl(elf $$0, drd $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ecl.a($$0, $$1)), $$2, $$3);
   }

   public ecl(elf $$0, drd $$1, int $$2) {
      this(ImmutableList.of(new ecl.a($$0, $$1)), $$2, 0.0F);
   }

   public static ecl.a a(elf $$0, drd $$1) {
      return new ecl.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ecl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elf.c.fieldOf("target").forGetter($$0x -> $$0x.b), drd.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ecl.a::new)
      );
      public final elf b;
      public final drd c;

      a(elf $$0, drd $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
