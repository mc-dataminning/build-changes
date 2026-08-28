import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dqt extends dhq {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final dwh<dup> b = dvz.by;
   public static final dwa c = dvz.bA;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dup.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dui($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0 instanceof arn $$3
         ? a($$2, dso.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dvz.bA).orElse(false)))
         : a($$2, dso.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dvz.bA).orElse(false)));
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfv.a($$0, $$2, "spawn_data");
   }
}
