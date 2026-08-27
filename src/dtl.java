import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtl(hg<cjc> c, dtn d) {
   public static final Codec<dtl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aev.a(je.D).fieldOf("display").forGetter($$0x -> $$0x.c), dtn.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dtl::new)
   );
   public static final Codec<hg<dtl>> b = aeu.a(je.av, a);

   public hg<cjc> a() {
      return this.c;
   }

   public dtn b() {
      return this.d;
   }
}
