import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckb(ckb.a e, cte f) implements cta<ctd, ctb> {
   public static final Codec<ckb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ckb.a.a.fieldOf("assets").forGetter(ckb::b), cte.b.fieldOf("spawn_conditions").forGetter(ckb::c)).apply($$0, ckb::new)
   );
   public static final Codec<ckb> b = RecordCodecBuilder.create($$0 -> $$0.group(ckb.a.a.fieldOf("assets").forGetter(ckb::b)).apply($$0, ckb::new));
   public static final Codec<je<ckb>> c = ald.a(mg.bl);
   public static final yw<wj, je<ckb>> d = yu.b(mg.bl);

   private ckb(ckb.a $$0) {
      this($$0, cte.a);
   }

   @Override
   public List<cta.a<ctd, ctb>> a() {
      return this.f.a();
   }

   public ckb.a b() {
      return this.e;
   }

   public cte c() {
      return this.f;
   }

   public static record a(iv b, iv c, iv d) {
      public static final Codec<ckb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iv.a.fieldOf("wild").forGetter(ckb.a::a), iv.a.fieldOf("tame").forGetter(ckb.a::b), iv.a.fieldOf("angry").forGetter(ckb.a::c))
               .apply($$0, ckb.a::new)
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
