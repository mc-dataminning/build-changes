import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cme(cme.a e, ctt f) implements ctp<cts, ctq> {
   public static final Codec<cme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cme.a.a.fieldOf("assets").forGetter(cme::b), ctt.b.fieldOf("spawn_conditions").forGetter(cme::c)).apply($$0, cme::new)
   );
   public static final Codec<cme> b = RecordCodecBuilder.create($$0 -> $$0.group(cme.a.a.fieldOf("assets").forGetter(cme::b)).apply($$0, cme::new));
   public static final Codec<jf<cme>> c = ald.a(mh.bm);
   public static final yw<wj, jf<cme>> d = yu.b(mh.bm);

   private cme(cme.a $$0) {
      this($$0, ctt.a);
   }

   @Override
   public List<ctp.a<cts, ctq>> a() {
      return this.f.a();
   }

   public cme.a b() {
      return this.e;
   }

   public ctt c() {
      return this.f;
   }

   public static record a(iw b, iw c, iw d) {
      public static final Codec<cme.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iw.a.fieldOf("wild").forGetter(cme.a::a), iw.a.fieldOf("tame").forGetter(cme.a::b), iw.a.fieldOf("angry").forGetter(cme.a::c))
               .apply($$0, cme.a::new)
      );

      public iw a() {
         return this.b;
      }

      public iw b() {
         return this.c;
      }

      public iw c() {
         return this.d;
      }
   }
}
