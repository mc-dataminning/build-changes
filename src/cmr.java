import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cmr(cmr.a e, cug f) implements cuc<cuf, cud> {
   public static final Codec<cmr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cmr.a.a.fieldOf("assets").forGetter(cmr::b), cug.b.fieldOf("spawn_conditions").forGetter(cmr::c)).apply($$0, cmr::new)
   );
   public static final Codec<cmr> b = RecordCodecBuilder.create($$0 -> $$0.group(cmr.a.a.fieldOf("assets").forGetter(cmr::b)).apply($$0, cmr::new));
   public static final Codec<jg<cmr>> c = alh.a(mi.bm);
   public static final za<wn, jg<cmr>> d = yy.b(mi.bm);

   private cmr(cmr.a $$0) {
      this($$0, cug.a);
   }

   @Override
   public List<cuc.a<cuf, cud>> a() {
      return this.f.a();
   }

   public cmr.a b() {
      return this.e;
   }

   public cug c() {
      return this.f;
   }

   public static record a(ix b, ix c, ix d) {
      public static final Codec<cmr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ix.a.fieldOf("wild").forGetter(cmr.a::a), ix.a.fieldOf("tame").forGetter(cmr.a::b), ix.a.fieldOf("angry").forGetter(cmr.a::c))
               .apply($$0, cmr.a::new)
      );

      public ix a() {
         return this.b;
      }

      public ix b() {
         return this.c;
      }

      public ix c() {
         return this.d;
      }
   }
}
