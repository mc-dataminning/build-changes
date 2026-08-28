import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fba extends faa {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcb.d.fieldOf("pages").forGetter($$0x -> $$0x.b), ezz.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fba::new)
   );
   private final List<asg<String>> b;
   private final ezz c;

   protected fba(List<fbw> $$0, List<asg<String>> $$1, ezz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      $$0.a(kj.U, dcb.a, this::a);
      return $$0;
   }

   public dcb a(dcb $$0) {
      List<asg<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fac<fba> b() {
      return fad.O;
   }
}
