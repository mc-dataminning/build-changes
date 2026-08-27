import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwl implements dwd {
   public static final Codec<dwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dwl.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dwl::new)
   );
   public final List<dwl.a> b;
   public final int c;
   public final float d;

   public dwl(List<dwl.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dwl(List<dwl.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dwl(eff $$0, dlj $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dwl.a($$0, $$1)), $$2, $$3);
   }

   public dwl(eff $$0, dlj $$1, int $$2) {
      this(ImmutableList.of(new dwl.a($$0, $$1)), $$2, 0.0F);
   }

   public static dwl.a a(eff $$0, dlj $$1) {
      return new dwl.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dwl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eff.c.fieldOf("target").forGetter($$0x -> $$0x.b), dlj.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dwl.a::new)
      );
      public final eff b;
      public final dlj c;

      a(eff $$0, dlj $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
