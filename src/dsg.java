import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsg extends diy {
   public static final MapCodec<dsg> a = b(dsg::new);
   public static final dxu<dwd> b = dxn.bB;
   public static final dxo c = dxn.bD;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   public dsg(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwd.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, dub.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dxn.bD).orElse(false)))
         : a($$2, dub.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dxn.bD).orElse(false)));
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhd.a($$0, $$2, "spawn_data");
   }
}
