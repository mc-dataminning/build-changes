import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etx extends eta {
   public static final Codec<etx> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(cxz.c.fieldOf("pages").forGetter($$0x -> $$0x.b), esz.a(100).forGetter($$0x -> $$0x.c))).apply($$0, etx::new)
   );
   private final List<ark<String>> b;
   private final esz c;

   protected etx(List<euu> $$0, List<ark<String>> $$1, esz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.G, cxz.a, this::a);
      return $$0;
   }

   public cxz a(cxz $$0) {
      List<ark<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public etc b() {
      return etd.L;
   }
}
