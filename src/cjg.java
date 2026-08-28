import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjg(ctn<cjg.a> e, ctt f) implements ctp<cts, ctq> {
   public static final Codec<cjg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctn.a(cjg.a.c, cjg.a.a).forGetter(cjg::b), ctt.b.fieldOf("spawn_conditions").forGetter(cjg::c)).apply($$0, cjg::new)
   );
   public static final Codec<cjg> b = RecordCodecBuilder.create($$0 -> $$0.group(ctn.a(cjg.a.c, cjg.a.a).forGetter(cjg::b)).apply($$0, cjg::new));
   public static final Codec<jf<cjg>> c = ald.a(mh.aJ);
   public static final yw<wj, jf<cjg>> d = yu.b(mh.aJ);

   private cjg(ctn<cjg.a> $$0) {
      this($$0, ctt.a);
   }

   @Override
   public List<ctp.a<cts, ctq>> a() {
      return this.f.a();
   }

   public ctn<cjg.a> b() {
      return this.e;
   }

   public ctt c() {
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
