import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dog extends den {
   public static final MapCodec<dog> a = b(dog::new);
   public static final dua<dsi> b = dts.by;

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsi.a));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dsb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0 instanceof aqt $$3
         ? a($$2, dqe.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dqe.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(cuh $$0, @Nullable dbg $$1, List<xe> $$2, cwi $$3, @Nullable jo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcs.a($$0, $$2, "spawn_data");
   }
}
