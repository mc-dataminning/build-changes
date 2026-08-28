import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eth extends esh {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxj.d.fieldOf("pages").forGetter($$0x -> $$0x.b), esg.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eth::new)
   );
   private final List<ard<String>> b;
   private final esg c;

   protected eth(List<euf> $$0, List<ard<String>> $$1, esg $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      $$0.a(kn.I, cxj.a, this::a);
      return $$0;
   }

   public cxj a(cxj $$0) {
      List<ard<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public esj<eth> b() {
      return esk.O;
   }
}
