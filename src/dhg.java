import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhg extends cye {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dmh<dkw> b = dlz.by;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dhg(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkw.a));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0 instanceof aow $$3
         ? a($$2, diz.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, diz.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(cpd $$0, @Nullable cux $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      cwj.a($$0, $$2, "spawn_data");
   }
}
