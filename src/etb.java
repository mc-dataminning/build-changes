import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etb extends esb {
   public static final MapCodec<etb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxh.d.fieldOf("pages").forGetter($$0x -> $$0x.b), esa.a(100).forGetter($$0x -> $$0x.c))).apply($$0, etb::new)
   );
   private final List<arb<String>> b;
   private final esa c;

   protected etb(List<etz> $$0, List<arb<String>> $$1, esa $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      $$0.a(kn.I, cxh.a, this::a);
      return $$0;
   }

   public cxh a(cxh $$0) {
      List<arb<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public esd<etb> b() {
      return ese.O;
   }
}
