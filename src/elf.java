import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elf implements ekx {
   public static final Codec<elf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(elf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elf::new)
   );
   public final List<elf.a> b;
   public final int c;
   public final float d;

   public elf(List<elf.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public elf(List<elf.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public elf(eue $$0, dzo $$1, int $$2, float $$3) {
      this(ImmutableList.of(new elf.a($$0, $$1)), $$2, $$3);
   }

   public elf(eue $$0, dzo $$1, int $$2) {
      this(ImmutableList.of(new elf.a($$0, $$1)), $$2, 0.0F);
   }

   public static elf.a a(eue $$0, dzo $$1) {
      return new elf.a($$0, $$1);
   }

   public static class a {
      public static final Codec<elf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eue.c.fieldOf("target").forGetter($$0x -> $$0x.b), dzo.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, elf.a::new)
      );
      public final eue b;
      public final dzo c;

      a(eue $$0, dzo $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
