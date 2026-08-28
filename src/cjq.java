import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjq(ctd<cjq.a> e, ctj f) implements ctf<cti, ctg> {
   public static final Codec<cjq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctd.a(cjq.a.c, cjq.a.a).forGetter(cjq::b), ctj.b.fieldOf("spawn_conditions").forGetter(cjq::c)).apply($$0, cjq::new)
   );
   public static final Codec<cjq> b = RecordCodecBuilder.create($$0 -> $$0.group(ctd.a(cjq.a.c, cjq.a.a).forGetter(cjq::b)).apply($$0, cjq::new));
   public static final Codec<je<cjq>> c = ald.a(mg.ba);
   public static final yw<wj, je<cjq>> d = yu.b(mg.ba);

   private cjq(ctd<cjq.a> $$0) {
      this($$0, ctj.a);
   }

   @Override
   public List<ctf.a<cti, ctg>> a() {
      return this.f.a();
   }

   public ctd<cjq.a> b() {
      return this.e;
   }

   public ctj c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold");

      public static final Codec<cjq.a> c = bak.a(cjq.a::values);
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
