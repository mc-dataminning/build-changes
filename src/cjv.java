import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjv(cjv.a e, csy f) implements csu<csx, csv> {
   public static final Codec<cjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cjv.a.a.fieldOf("assets").forGetter(cjv::b), csy.b.fieldOf("spawn_conditions").forGetter(cjv::c)).apply($$0, cjv::new)
   );
   public static final Codec<cjv> b = RecordCodecBuilder.create($$0 -> $$0.group(cjv.a.a.fieldOf("assets").forGetter(cjv::b)).apply($$0, cjv::new));
   public static final Codec<je<cjv>> c = alb.a(mg.bk);
   public static final yu<wh, je<cjv>> d = ys.b(mg.bk);

   private cjv(cjv.a $$0) {
      this($$0, csy.a);
   }

   @Override
   public List<csu.a<csx, csv>> a() {
      return this.f.a();
   }

   public cjv.a b() {
      return this.e;
   }

   public csy c() {
      return this.f;
   }

   public static record a(iv b, iv c, iv d) {
      public static final Codec<cjv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iv.a.fieldOf("wild").forGetter(cjv.a::a), iv.a.fieldOf("tame").forGetter(cjv.a::b), iv.a.fieldOf("angry").forGetter(cjv.a::c))
               .apply($$0, cjv.a::new)
      );

      public iv a() {
         return this.b;
      }

      public iv b() {
         return this.c;
      }

      public iv c() {
         return this.d;
      }
   }
}
