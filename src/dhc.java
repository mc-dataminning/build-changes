import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhc extends cya {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final dmd<dks> b = dlv.by;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dks.a));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0 instanceof aov $$3
         ? a($$2, div.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, div.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(coz $$0, @Nullable cut $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      cwf.a($$0, $$2, "spawn_data");
   }
}
