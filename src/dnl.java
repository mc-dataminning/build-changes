import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnl extends dfi {
   public static final MapCodec<dnl> a = b(dnl::new);

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   protected dnl(dsz.d $$0) {
      super($$0);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dru($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.j, $$0.B ? dru::a : dru::b);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddn.a($$0, $$2, "SpawnData");
   }
}
