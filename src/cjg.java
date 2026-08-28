import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjg(css<cjg.a> e, csy f) implements csu<csx, csv> {
   public static final Codec<cjg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(css.a(cjg.a.c, cjg.a.a).forGetter(cjg::b), csy.b.fieldOf("spawn_conditions").forGetter(cjg::c)).apply($$0, cjg::new)
   );
   public static final Codec<cjg> b = RecordCodecBuilder.create($$0 -> $$0.group(css.a(cjg.a.c, cjg.a.a).forGetter(cjg::b)).apply($$0, cjg::new));
   public static final Codec<je<cjg>> c = alb.a(mg.aY);
   public static final yu<wh, je<cjg>> d = ys.b(mg.aY);

   private cjg(css<cjg.a> $$0) {
      this($$0, csy.a);
   }

   @Override
   public List<csu.a<csx, csv>> a() {
      return this.f.a();
   }

   public css<cjg.a> b() {
      return this.e;
   }

   public csy c() {
      return this.f;
   }

   public static enum a implements bai {
      a("normal"),
      b("cold");

      public static final Codec<cjg.a> c = bai.a(cjg.a::values);
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
