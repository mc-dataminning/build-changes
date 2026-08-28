import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dtr extends dkg {
   public static final MapCodec<dtr> a = b(dtr::new);
   public static final dzk<dxs> b = dzc.bB;
   public static final dzd c = dzc.bE;

   @Override
   public MapCodec<dtr> a() {
      return a;
   }

   public dtr(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dxs.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0 instanceof arn $$3
         ? a($$2, dvn.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dzc.bE).orElse(false)))
         : a($$2, dvn.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dzc.bE).orElse(false)));
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      dik.a($$0, $$2, "spawn_data");
   }
}
