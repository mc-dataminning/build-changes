import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record epc(je<cyz> c, epe d) {
   public static final Codec<epc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyz.e.fieldOf("display").forGetter($$0x -> $$0x.c), epe.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, epc::new)
   );
   public static final Codec<je<epc>> b = alc.a(mg.aS, a);

   public je<cyz> a() {
      return this.c;
   }

   public epe b() {
      return this.d;
   }
}
