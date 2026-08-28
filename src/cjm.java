import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjm(csy<cjm.a> e, cte f) implements cta<ctd, ctb> {
   public static final Codec<cjm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csy.a(cjm.a.c, cjm.a.a).forGetter(cjm::b), cte.b.fieldOf("spawn_conditions").forGetter(cjm::c)).apply($$0, cjm::new)
   );
   public static final Codec<cjm> b = RecordCodecBuilder.create($$0 -> $$0.group(csy.a(cjm.a.c, cjm.a.a).forGetter(cjm::b)).apply($$0, cjm::new));
   public static final Codec<je<cjm>> c = ald.a(mg.aZ);
   public static final yw<wj, je<cjm>> d = yu.b(mg.aZ);

   private cjm(csy<cjm.a> $$0) {
      this($$0, cte.a);
   }

   @Override
   public List<cta.a<ctd, ctb>> a() {
      return this.f.a();
   }

   public csy<cjm.a> b() {
      return this.e;
   }

   public cte c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold");

      public static final Codec<cjm.a> c = bak.a(cjm.a::values);
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
