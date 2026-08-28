import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cna(cna.a e, cup f) implements cul<cuo, cum> {
   public static final Codec<cna> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cna.a.a.fieldOf("assets").forGetter(cna::b), cup.b.fieldOf("spawn_conditions").forGetter(cna::c)).apply($$0, cna::new)
   );
   public static final Codec<cna> b = RecordCodecBuilder.create($$0 -> $$0.group(cna.a.a.fieldOf("assets").forGetter(cna::b)).apply($$0, cna::new));
   public static final Codec<jg<cna>> c = alo.a(mi.bm);
   public static final ze<wp, jg<cna>> d = zc.b(mi.bm);

   private cna(cna.a $$0) {
      this($$0, cup.a);
   }

   @Override
   public List<cul.a<cuo, cum>> a() {
      return this.f.a();
   }

   public cna.a b() {
      return this.e;
   }

   public cup c() {
      return this.f;
   }

   public static record a(ix b, ix c, ix d) {
      public static final Codec<cna.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ix.a.fieldOf("wild").forGetter(cna.a::a), ix.a.fieldOf("tame").forGetter(cna.a::b), ix.a.fieldOf("angry").forGetter(cna.a::c))
               .apply($$0, cna.a::new)
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
