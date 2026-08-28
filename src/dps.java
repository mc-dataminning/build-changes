import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dps extends dhq {
   public static final MapCodec<dps> a = b(dps::new);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   protected dps(dvi.d $$0) {
      super($$0);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new duc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.j, $$0.C ? duc::a : duc::b);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfv.a($$0, $$2, "SpawnData");
   }
}
