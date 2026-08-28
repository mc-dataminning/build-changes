import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbs(jr<cvk> c) {
   public static final Codec<dbs> a = RecordCodecBuilder.create($$0 -> $$0.group(kc.a(lv.K).fieldOf("items").forGetter(dbs::a)).apply($$0, dbs::new));
   public static final zb<wo, dbs> b = zb.a(yz.c(lv.K), dbs::a, dbs::new);

   public boolean a(cvp $$0) {
      return $$0.a(this.c);
   }

   public jr<cvk> a() {
      return this.c;
   }
}
