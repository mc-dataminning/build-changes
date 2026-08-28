import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjv(ctk<cjv.a> e, ctq f) implements ctm<ctp, ctn> {
   public static final Codec<cjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctk.a(cjv.a.c, cjv.a.a).forGetter(cjv::b), ctq.b.fieldOf("spawn_conditions").forGetter(cjv::c)).apply($$0, cjv::new)
   );
   public static final Codec<cjv> b = RecordCodecBuilder.create($$0 -> $$0.group(ctk.a(cjv.a.c, cjv.a.a).forGetter(cjv::b)).apply($$0, cjv::new));
   public static final Codec<jf<cjv>> c = ald.a(mh.ba);
   public static final yw<wj, jf<cjv>> d = yu.b(mh.ba);

   private cjv(ctk<cjv.a> $$0) {
      this($$0, ctq.a);
   }

   @Override
   public List<ctm.a<ctp, ctn>> a() {
      return this.f.a();
   }

   public ctk<cjv.a> b() {
      return this.e;
   }

   public ctq c() {
      return this.f;
   }

   public static enum a implements bak {
      a("normal"),
      b("cold");

      public static final Codec<cjv.a> c = bak.a(cjv.a::values);
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
