import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dtd extends djx {
   public static final MapCodec<dtd> a = b(dtd::new);
   public static final dyr<dxa> b = dyk.bz;
   public static final dyl c = dyk.bC;

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxa.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0 instanceof ash $$3
         ? a($$2, duy.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dyk.bC).orElse(false)))
         : a($$2, duy.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dyk.bC).orElse(false)));
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dic.a($$0, $$2, "spawn_data");
   }
}
