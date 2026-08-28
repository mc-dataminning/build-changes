import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjv(cty<cjv.a> e, cue f) implements cua<cud, cub> {
   public static final Codec<cjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cty.a(cjv.a.d, cjv.a.a).forGetter(cjv::b), cue.b.fieldOf("spawn_conditions").forGetter(cjv::c)).apply($$0, cjv::new)
   );
   public static final Codec<cjv> b = RecordCodecBuilder.create($$0 -> $$0.group(cty.a(cjv.a.d, cjv.a.a).forGetter(cjv::b)).apply($$0, cjv::new));
   public static final Codec<jf<cjv>> c = alf.a(mh.aM);
   public static final yy<wl, jf<cjv>> d = yw.b(mh.aM);

   private cjv(cty<cjv.a> $$0) {
      this($$0, cue.a);
   }

   @Override
   public List<cua.a<cud, cub>> a() {
      return this.f.a();
   }

   public cty<cjv.a> b() {
      return this.e;
   }

   public cue c() {
      return this.f;
   }

   public static enum a implements bam {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<cjv.a> d = bam.a(cjv.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
