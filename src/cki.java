import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cki(cua<cki.a> e, cug f) implements cuc<cuf, cud> {
   public static final Codec<cki> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cua.a(cki.a.c, cki.a.a).forGetter(cki::b), cug.b.fieldOf("spawn_conditions").forGetter(cki::c)).apply($$0, cki::new)
   );
   public static final Codec<cki> b = RecordCodecBuilder.create($$0 -> $$0.group(cua.a(cki.a.c, cki.a.a).forGetter(cki::b)).apply($$0, cki::new));
   public static final Codec<jg<cki>> c = alh.a(mi.ba);
   public static final za<wn, jg<cki>> d = yy.b(mi.ba);

   private cki(cua<cki.a> $$0) {
      this($$0, cug.a);
   }

   @Override
   public List<cuc.a<cuf, cud>> a() {
      return this.f.a();
   }

   public cua<cki.a> b() {
      return this.e;
   }

   public cug c() {
      return this.f;
   }

   public static enum a implements bao {
      a("normal"),
      b("cold");

      public static final Codec<cki.a> c = bao.a(cki.a::values);
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
