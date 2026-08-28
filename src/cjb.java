import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjb(ctd<cjb.a> e, ctj f) implements ctf<cti, ctg> {
   public static final Codec<cjb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctd.a(cjb.a.c, cjb.a.a).forGetter(cjb::b), ctj.b.fieldOf("spawn_conditions").forGetter(cjb::c)).apply($$0, cjb::new)
   );
   public static final Codec<cjb> b = RecordCodecBuilder.create($$0 -> $$0.group(ctd.a(cjb.a.c, cjb.a.a).forGetter(cjb::b)).apply($$0, cjb::new));
   public static final Codec<je<cjb>> c = ald.a(mg.aJ);
   public static final yw<wj, je<cjb>> d = yu.b(mg.aJ);

   private cjb(ctd<cjb.a> $$0) {
      this($$0, ctj.a);
   }

   @Override
   public List<ctf.a<cti, ctg>> a() {
      return this.f.a();
   }

   public ctd<cjb.a> b() {
      return this.e;
   }

   public ctj c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold");

      public static final Codec<cjb.a> c = bak.a(cjb.a::values);
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
