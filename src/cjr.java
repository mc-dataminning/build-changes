import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjr(cty<cjr.a> e, cue f) implements cua<cud, cub> {
   public static final Codec<cjr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cty.a(cjr.a.c, cjr.a.a).forGetter(cjr::b), cue.b.fieldOf("spawn_conditions").forGetter(cjr::c)).apply($$0, cjr::new)
   );
   public static final Codec<cjr> b = RecordCodecBuilder.create($$0 -> $$0.group(cty.a(cjr.a.c, cjr.a.a).forGetter(cjr::b)).apply($$0, cjr::new));
   public static final Codec<jf<cjr>> c = alf.a(mh.aJ);
   public static final yy<wl, jf<cjr>> d = yw.b(mh.aJ);

   private cjr(cty<cjr.a> $$0) {
      this($$0, cue.a);
   }

   @Override
   public List<cua.a<cud, cub>> a() {
      return this.f.a();
   }

   public cty<cjr.a> b() {
      return this.e;
   }

   public cue c() {
      return this.f;
   }

   public static enum a implements bam {
      a("normal"),
      b("cold");

      public static final Codec<cjr.a> c = bam.a(cjr.a::values);
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
