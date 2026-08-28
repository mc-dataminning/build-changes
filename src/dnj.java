import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnj extends deg {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final dsv<drd> b = dsn.by;
   public static final dso c = dsn.bA;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drd.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0 instanceof arb $$3
         ? a($$2, dpe.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dsn.bA).orElse(false)))
         : a($$2, dpe.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dsn.bA).orElse(false)));
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcl.a($$0, $$2, "spawn_data");
   }
}
