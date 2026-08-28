import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckc(cuj<ckc.a> e, cup f) implements cul<cuo, cum> {
   public static final Codec<ckc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuj.a(ckc.a.c, ckc.a.a).forGetter(ckc::b), cup.b.fieldOf("spawn_conditions").forGetter(ckc::c)).apply($$0, ckc::new)
   );
   public static final Codec<ckc> b = RecordCodecBuilder.create($$0 -> $$0.group(cuj.a(ckc.a.c, ckc.a.a).forGetter(ckc::b)).apply($$0, ckc::new));
   public static final Codec<jg<ckc>> c = alo.a(mi.aJ);
   public static final ze<wp, jg<ckc>> d = zc.b(mi.aJ);

   private ckc(cuj<ckc.a> $$0) {
      this($$0, cup.a);
   }

   @Override
   public List<cul.a<cuo, cum>> a() {
      return this.f.a();
   }

   public cuj<ckc.a> b() {
      return this.e;
   }

   public cup c() {
      return this.f;
   }

   public static enum a implements bax {
      a("normal"),
      b("cold");

      public static final Codec<ckc.a> c = bax.a(ckc.a::values);
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
