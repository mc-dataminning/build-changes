import com.mojang.serialization.MapCodec;

public class dqm extends djb {
   public static final MapCodec<dqm> n = b(dqm::new);

   @Override
   public MapCodec<dqm> a() {
      return n;
   }

   public dqm(dvc.d $$0) {
      super(() -> dsi.c, $$0);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dub($$0, $$1);
   }

   @Override
   protected awr<alh> c() {
      return awu.i.b(awu.ai);
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return azj.a(dsn.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$3 == jl.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
