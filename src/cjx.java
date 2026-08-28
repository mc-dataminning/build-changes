import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjx(cua<cjx.a> e, cug f) implements cuc<cuf, cud> {
   public static final Codec<cjx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cua.a(cjx.a.d, cjx.a.a).forGetter(cjx::b), cug.b.fieldOf("spawn_conditions").forGetter(cjx::c)).apply($$0, cjx::new)
   );
   public static final Codec<cjx> b = RecordCodecBuilder.create($$0 -> $$0.group(cua.a(cjx.a.d, cjx.a.a).forGetter(cjx::b)).apply($$0, cjx::new));
   public static final Codec<jg<cjx>> c = alh.a(mi.aM);
   public static final za<wn, jg<cjx>> d = yy.b(mi.aM);

   private cjx(cua<cjx.a> $$0) {
      this($$0, cug.a);
   }

   @Override
   public List<cuc.a<cuf, cud>> a() {
      return this.f.a();
   }

   public cua<cjx.a> b() {
      return this.e;
   }

   public cug c() {
      return this.f;
   }

   public static enum a implements bao {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<cjx.a> d = bao.a(cjx.a::values);
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
