import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcl(ju<cwi> c) {
   public static final Codec<dcl> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(ma.K).fieldOf("items").forGetter(dcl::a)).apply($$0, dcl::new));
   public static final zh<wu, dcl> b = zh.a(zf.c(ma.K), dcl::a, dcl::new);

   public boolean a(cwm $$0) {
      return $$0.a(this.c);
   }

   public ju<cwi> a() {
      return this.c;
   }
}
