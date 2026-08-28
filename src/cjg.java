import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjg(ctk<cjg.a> e, ctq f) implements ctm<ctp, ctn> {
   public static final Codec<cjg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctk.a(cjg.a.c, cjg.a.a).forGetter(cjg::b), ctq.b.fieldOf("spawn_conditions").forGetter(cjg::c)).apply($$0, cjg::new)
   );
   public static final Codec<cjg> b = RecordCodecBuilder.create($$0 -> $$0.group(ctk.a(cjg.a.c, cjg.a.a).forGetter(cjg::b)).apply($$0, cjg::new));
   public static final Codec<jf<cjg>> c = ald.a(mh.aJ);
   public static final yw<wj, jf<cjg>> d = yu.b(mh.aJ);

   private cjg(ctk<cjg.a> $$0) {
      this($$0, ctq.a);
   }

   @Override
   public List<ctm.a<ctp, ctn>> a() {
      return this.f.a();
   }

   public ctk<cjg.a> b() {
      return this.e;
   }

   public ctq c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold");

      public static final Codec<cjg.a> c = bak.a(cjg.a::values);
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
