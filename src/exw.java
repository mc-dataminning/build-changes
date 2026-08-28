import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exw extends eyc {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewp.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, exw::new)
   );
   private final ewp.b b;

   public exw(List<ezy> $$0, ewp.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<exw> b() {
      return eyf.B;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.a(cxt.vd) && $$1.c(this.b.a()) instanceof cpx $$2) {
         $$0.b(ku.ag, new dao($$2.gh()));
      }

      return $$0;
   }

   public static eyc.a<?> a(ewp.b $$0) {
      return a($$1 -> new exw($$1, $$0));
   }
}
