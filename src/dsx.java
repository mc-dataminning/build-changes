import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsx extends djp {
   public static final MapCodec<dsx> a = b(dsx::new);
   public static final dyl<dwu> b = dye.bB;
   public static final dyf c = dye.bD;

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   public dsx(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwu.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0 instanceof arx $$3
         ? a($$2, dus.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dye.bD).orElse(false)))
         : a($$2, dus.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dye.bD).orElse(false)));
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhu.a($$0, $$2, "spawn_data");
   }
}
