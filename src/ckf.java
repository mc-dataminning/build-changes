import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckf(ckf.a e, ctj f) implements ctf<cti, ctg> {
   public static final Codec<ckf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ckf.a.a.fieldOf("assets").forGetter(ckf::b), ctj.b.fieldOf("spawn_conditions").forGetter(ckf::c)).apply($$0, ckf::new)
   );
   public static final Codec<ckf> b = RecordCodecBuilder.create($$0 -> $$0.group(ckf.a.a.fieldOf("assets").forGetter(ckf::b)).apply($$0, ckf::new));
   public static final Codec<je<ckf>> c = ald.a(mg.bm);
   public static final yw<wj, je<ckf>> d = yu.b(mg.bm);

   private ckf(ckf.a $$0) {
      this($$0, ctj.a);
   }

   @Override
   public List<ctf.a<cti, ctg>> a() {
      return this.f.a();
   }

   public ckf.a b() {
      return this.e;
   }

   public ctj c() {
      return this.f;
   }

   public static record a(iv b, iv c, iv d) {
      public static final Codec<ckf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iv.a.fieldOf("wild").forGetter(ckf.a::a), iv.a.fieldOf("tame").forGetter(ckf.a::b), iv.a.fieldOf("angry").forGetter(ckf.a::c))
               .apply($$0, ckf.a::new)
      );

      public iv a() {
         return this.b;
      }

      public iv b() {
         return this.c;
      }

      public iv c() {
         return this.d;
      }
   }
}
