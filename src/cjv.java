import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjv(ctn<cjv.a> e, ctt f) implements ctp<cts, ctq> {
   public static final Codec<cjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctn.a(cjv.a.c, cjv.a.a).forGetter(cjv::b), ctt.b.fieldOf("spawn_conditions").forGetter(cjv::c)).apply($$0, cjv::new)
   );
   public static final Codec<cjv> b = RecordCodecBuilder.create($$0 -> $$0.group(ctn.a(cjv.a.c, cjv.a.a).forGetter(cjv::b)).apply($$0, cjv::new));
   public static final Codec<jf<cjv>> c = ald.a(mh.ba);
   public static final yw<wj, jf<cjv>> d = yu.b(mh.ba);

   private cjv(ctn<cjv.a> $$0) {
      this($$0, ctt.a);
   }

   @Override
   public List<ctp.a<cts, ctq>> a() {
      return this.f.a();
   }

   public ctn<cjv.a> b() {
      return this.e;
   }

   public ctt c() {
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
