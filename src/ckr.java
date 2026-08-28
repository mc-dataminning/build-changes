import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckr(cuj<ckr.a> e, cup f) implements cul<cuo, cum> {
   public static final Codec<ckr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuj.a(ckr.a.c, ckr.a.a).forGetter(ckr::b), cup.b.fieldOf("spawn_conditions").forGetter(ckr::c)).apply($$0, ckr::new)
   );
   public static final Codec<ckr> b = RecordCodecBuilder.create($$0 -> $$0.group(cuj.a(ckr.a.c, ckr.a.a).forGetter(ckr::b)).apply($$0, ckr::new));
   public static final Codec<jg<ckr>> c = alo.a(mi.ba);
   public static final ze<wp, jg<ckr>> d = zc.b(mi.ba);

   private ckr(cuj<ckr.a> $$0) {
      this($$0, cup.a);
   }

   @Override
   public List<cul.a<cuo, cum>> a() {
      return this.f.a();
   }

   public cuj<ckr.a> b() {
      return this.e;
   }

   public cup c() {
      return this.f;
   }

   public static enum a implements bax {
      a("normal"),
      b("cold");

      public static final Codec<ckr.a> c = bax.a(ckr.a::values);
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
