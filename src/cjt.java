import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjt(cua<cjt.a> e, cug f) implements cuc<cuf, cud> {
   public static final Codec<cjt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cua.a(cjt.a.c, cjt.a.a).forGetter(cjt::b), cug.b.fieldOf("spawn_conditions").forGetter(cjt::c)).apply($$0, cjt::new)
   );
   public static final Codec<cjt> b = RecordCodecBuilder.create($$0 -> $$0.group(cua.a(cjt.a.c, cjt.a.a).forGetter(cjt::b)).apply($$0, cjt::new));
   public static final Codec<jg<cjt>> c = alh.a(mi.aJ);
   public static final za<wn, jg<cjt>> d = yy.b(mi.aJ);

   private cjt(cua<cjt.a> $$0) {
      this($$0, cug.a);
   }

   @Override
   public List<cuc.a<cuf, cud>> a() {
      return this.f.a();
   }

   public cua<cjt.a> b() {
      return this.e;
   }

   public cug c() {
      return this.f;
   }

   public static enum a implements bao {
      a("normal"),
      b("cold");

      public static final Codec<cjt.a> c = bao.a(cjt.a::values);
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
