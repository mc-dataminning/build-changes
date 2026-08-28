import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsz extends djq {
   public static final MapCodec<dsz> a = b(dsz::new);
   public static final dyo<dww> b = dyg.bB;
   public static final dyh c = dyg.bE;

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   public dsz(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dww.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, duu.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dyg.bE).orElse(false)))
         : a($$2, duu.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dyg.bE).orElse(false)));
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhu.a($$0, $$2, "spawn_data");
   }
}
