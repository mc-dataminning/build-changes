import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjf(ctd<cjf.a> e, ctj f) implements ctf<cti, ctg> {
   public static final Codec<cjf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctd.a(cjf.a.d, cjf.a.a).forGetter(cjf::b), ctj.b.fieldOf("spawn_conditions").forGetter(cjf::c)).apply($$0, cjf::new)
   );
   public static final Codec<cjf> b = RecordCodecBuilder.create($$0 -> $$0.group(ctd.a(cjf.a.d, cjf.a.a).forGetter(cjf::b)).apply($$0, cjf::new));
   public static final Codec<je<cjf>> c = ald.a(mg.aM);
   public static final yw<wj, je<cjf>> d = yu.b(mg.aM);

   private cjf(ctd<cjf.a> $$0) {
      this($$0, ctj.a);
   }

   @Override
   public List<ctf.a<cti, ctg>> a() {
      return this.f.a();
   }

   public ctd<cjf.a> b() {
      return this.e;
   }

   public ctj c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<cjf.a> d = bak.a(cjf.a::values);
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
