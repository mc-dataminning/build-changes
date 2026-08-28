import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekd implements ejv {
   public static final Codec<ekd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ekd.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ekd::new)
   );
   public final List<ekd.a> b;
   public final int c;
   public final float d;

   public ekd(List<ekd.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ekd(List<ekd.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ekd(etc $$0, dym $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ekd.a($$0, $$1)), $$2, $$3);
   }

   public ekd(etc $$0, dym $$1, int $$2) {
      this(ImmutableList.of(new ekd.a($$0, $$1)), $$2, 0.0F);
   }

   public static ekd.a a(etc $$0, dym $$1) {
      return new ekd.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ekd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(etc.c.fieldOf("target").forGetter($$0x -> $$0x.b), dym.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ekd.a::new)
      );
      public final etc b;
      public final dym c;

      a(etc $$0, dym $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
