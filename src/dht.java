import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dht extends cyr {
   public static final MapCodec<dht> a = b(dht::new);
   public static final dnc<dlk> b = dmu.by;

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dlk.a));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dle($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0 instanceof apa $$3
         ? a($$2, djn.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, djn.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(cpq $$0, @Nullable cvk $$1, List<vs> $$2, crh $$3, @Nullable iy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cww.a($$0, $$2, "spawn_data");
   }
}
