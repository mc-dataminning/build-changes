import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckg(cty<ckg.a> e, cue f) implements cua<cud, cub> {
   public static final Codec<ckg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cty.a(ckg.a.c, ckg.a.a).forGetter(ckg::b), cue.b.fieldOf("spawn_conditions").forGetter(ckg::c)).apply($$0, ckg::new)
   );
   public static final Codec<ckg> b = RecordCodecBuilder.create($$0 -> $$0.group(cty.a(ckg.a.c, ckg.a.a).forGetter(ckg::b)).apply($$0, ckg::new));
   public static final Codec<jf<ckg>> c = alf.a(mh.ba);
   public static final yy<wl, jf<ckg>> d = yw.b(mh.ba);

   private ckg(cty<ckg.a> $$0) {
      this($$0, cue.a);
   }

   @Override
   public List<cua.a<cud, cub>> a() {
      return this.f.a();
   }

   public cty<ckg.a> b() {
      return this.e;
   }

   public cue c() {
      return this.f;
   }

   public static enum a implements bam {
      a("normal"),
      b("cold");

      public static final Codec<ckg.a> c = bam.a(ckg.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
