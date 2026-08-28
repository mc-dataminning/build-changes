import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezb extends eyb {
   public static final MapCodec<ezb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dav.d.fieldOf("pages").forGetter($$0x -> $$0x.b), eya.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ezb::new)
   );
   private final List<asz<String>> b;
   private final eya c;

   protected ezb(List<ezx> $$0, List<asz<String>> $$1, eya $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxo a(cxo $$0, ewo $$1) {
      $$0.a(ku.S, dav.a, this::a);
      return $$0;
   }

   public dav a(dav $$0) {
      List<asz<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eyd<ezb> b() {
      return eye.O;
   }
}
