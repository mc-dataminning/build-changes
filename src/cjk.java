import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjk(ctk<cjk.a> e, ctq f) implements ctm<ctp, ctn> {
   public static final Codec<cjk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctk.a(cjk.a.d, cjk.a.a).forGetter(cjk::b), ctq.b.fieldOf("spawn_conditions").forGetter(cjk::c)).apply($$0, cjk::new)
   );
   public static final Codec<cjk> b = RecordCodecBuilder.create($$0 -> $$0.group(ctk.a(cjk.a.d, cjk.a.a).forGetter(cjk::b)).apply($$0, cjk::new));
   public static final Codec<jf<cjk>> c = ald.a(mh.aM);
   public static final yw<wj, jf<cjk>> d = yu.b(mh.aM);

   private cjk(ctk<cjk.a> $$0) {
      this($$0, ctq.a);
   }

   @Override
   public List<ctm.a<ctp, ctn>> a() {
      return this.f.a();
   }

   public ctk<cjk.a> b() {
      return this.e;
   }

   public ctq c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<cjk.a> d = bak.a(cjk.a::values);
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
