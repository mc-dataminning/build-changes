import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebg implements eay {
   public static final Codec<ebg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ebg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ebg::new)
   );
   public final List<ebg.a> b;
   public final int c;
   public final float d;

   public ebg(List<ebg.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ebg(List<ebg.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ebg(eka $$0, dpy $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ebg.a($$0, $$1)), $$2, $$3);
   }

   public ebg(eka $$0, dpy $$1, int $$2) {
      this(ImmutableList.of(new ebg.a($$0, $$1)), $$2, 0.0F);
   }

   public static ebg.a a(eka $$0, dpy $$1) {
      return new ebg.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ebg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eka.c.fieldOf("target").forGetter($$0x -> $$0x.b), dpy.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ebg.a::new)
      );
      public final eka b;
      public final dpy c;

      a(eka $$0, dpy $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
