import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dpy implements dpq {
   public static final Codec<dpy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dpy.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpy::new)
   );
   public final List<dpy.a> b;
   public final int c;
   public final float d;

   public dpy(List<dpy.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dpy(List<dpy.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dpy(dyl $$0, dez $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dpy.a($$0, $$1)), $$2, $$3);
   }

   public dpy(dyl $$0, dez $$1, int $$2) {
      this(ImmutableList.of(new dpy.a($$0, $$1)), $$2, 0.0F);
   }

   public static dpy.a a(dyl $$0, dez $$1) {
      return new dpy.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dpy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyl.c.fieldOf("target").forGetter($$0x -> $$0x.b), dez.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dpy.a::new)
      );
      public final dyl b;
      public final dez c;

      a(dyl $$0, dez $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
