import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckg(cuj<ckg.a> e, cup f) implements cul<cuo, cum> {
   public static final Codec<ckg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuj.a(ckg.a.d, ckg.a.a).forGetter(ckg::b), cup.b.fieldOf("spawn_conditions").forGetter(ckg::c)).apply($$0, ckg::new)
   );
   public static final Codec<ckg> b = RecordCodecBuilder.create($$0 -> $$0.group(cuj.a(ckg.a.d, ckg.a.a).forGetter(ckg::b)).apply($$0, ckg::new));
   public static final Codec<jg<ckg>> c = alo.a(mi.aM);
   public static final ze<wp, jg<ckg>> d = zc.b(mi.aM);

   private ckg(cuj<ckg.a> $$0) {
      this($$0, cup.a);
   }

   @Override
   public List<cul.a<cuo, cum>> a() {
      return this.f.a();
   }

   public cuj<ckg.a> b() {
      return this.e;
   }

   public cup c() {
      return this.f;
   }

   public static enum a implements bax {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<ckg.a> d = bax.a(ckg.a::values);
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
