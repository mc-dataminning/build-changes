import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dks extends dcq {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dqg.d $$0) {
      super($$0);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.j, $$0.B ? dpa::a : dpa::b);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   public void a(csz $$0, @Nullable czj $$1, List<wu> $$2, cuq $$3, @Nullable jk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dav.a($$0, $$2, "SpawnData");
   }
}
