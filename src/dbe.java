import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbe(jr<cvg> c) {
   public static final Codec<dbe> a = RecordCodecBuilder.create($$0 -> $$0.group(kc.a(lv.K).fieldOf("items").forGetter(dbe::a)).apply($$0, dbe::new));
   public static final zb<wo, dbe> b = zb.a(yz.c(lv.K), dbe::a, dbe::new);

   public boolean a(cvl $$0) {
      return $$0.a(this.c);
   }

   public jr<cvg> a() {
      return this.c;
   }
}
