import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dml extends dej {
   public static final MapCodec<dml> a = b(dml::new);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   protected dml(drz.d $$0) {
      super($$0);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.j, $$0.B ? dqt::a : dqt::b);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, cun $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dco.a($$0, $$2, "SpawnData");
   }
}
