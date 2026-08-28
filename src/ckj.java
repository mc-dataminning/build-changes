import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckj(ckj.a e, ctq f) implements ctm<ctp, ctn> {
   public static final Codec<ckj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ckj.a.a.fieldOf("assets").forGetter(ckj::b), ctq.b.fieldOf("spawn_conditions").forGetter(ckj::c)).apply($$0, ckj::new)
   );
   public static final Codec<ckj> b = RecordCodecBuilder.create($$0 -> $$0.group(ckj.a.a.fieldOf("assets").forGetter(ckj::b)).apply($$0, ckj::new));
   public static final Codec<jf<ckj>> c = ald.a(mh.bm);
   public static final yw<wj, jf<ckj>> d = yu.b(mh.bm);

   private ckj(ckj.a $$0) {
      this($$0, ctq.a);
   }

   @Override
   public List<ctm.a<ctp, ctn>> a() {
      return this.f.a();
   }

   public ckj.a b() {
      return this.e;
   }

   public ctq c() {
      return this.f;
   }

   public static record a(iw b, iw c, iw d) {
      public static final Codec<ckj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iw.a.fieldOf("wild").forGetter(ckj.a::a), iw.a.fieldOf("tame").forGetter(ckj.a::b), iw.a.fieldOf("angry").forGetter(ckj.a::c))
               .apply($$0, ckj.a::new)
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
