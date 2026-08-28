import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjk(ctn<cjk.a> e, ctt f) implements ctp<cts, ctq> {
   public static final Codec<cjk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctn.a(cjk.a.d, cjk.a.a).forGetter(cjk::b), ctt.b.fieldOf("spawn_conditions").forGetter(cjk::c)).apply($$0, cjk::new)
   );
   public static final Codec<cjk> b = RecordCodecBuilder.create($$0 -> $$0.group(ctn.a(cjk.a.d, cjk.a.a).forGetter(cjk::b)).apply($$0, cjk::new));
   public static final Codec<jf<cjk>> c = ald.a(mh.aM);
   public static final yw<wj, jf<cjk>> d = yu.b(mh.aM);

   private cjk(ctn<cjk.a> $$0) {
      this($$0, ctt.a);
   }

   @Override
   public List<ctp.a<cts, ctq>> a() {
      return this.f.a();
   }

   public ctn<cjk.a> b() {
      return this.e;
   }

   public ctt c() {
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
