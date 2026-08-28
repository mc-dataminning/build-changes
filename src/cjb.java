import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjb(csy<cjb.a> e, cte f) implements cta<ctd, ctb> {
   public static final Codec<cjb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csy.a(cjb.a.d, cjb.a.a).forGetter(cjb::b), cte.b.fieldOf("spawn_conditions").forGetter(cjb::c)).apply($$0, cjb::new)
   );
   public static final Codec<cjb> b = RecordCodecBuilder.create($$0 -> $$0.group(csy.a(cjb.a.d, cjb.a.a).forGetter(cjb::b)).apply($$0, cjb::new));
   public static final Codec<je<cjb>> c = ald.a(mg.aL);
   public static final yw<wj, je<cjb>> d = yu.b(mg.aL);

   private cjb(csy<cjb.a> $$0) {
      this($$0, cte.a);
   }

   @Override
   public List<cta.a<ctd, ctb>> a() {
      return this.f.a();
   }

   public csy<cjb.a> b() {
      return this.e;
   }

   public cte c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<cjb.a> d = bak.a(cjb.a::values);
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
