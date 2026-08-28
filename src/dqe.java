import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dqe extends dic {
   public static final MapCodec<dqe> a = b(dqe::new);

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   protected dqe(dvu.d $$0) {
      super($$0);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.j, $$0.C ? duo::a : duo::b);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      dgh.a($$0, $$2, "SpawnData");
   }
}
