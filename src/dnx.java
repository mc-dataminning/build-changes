import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnx extends deu {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final dtj<drr> b = dtb.by;
   public static final dtc c = dtb.bA;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drr.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0 instanceof aqm $$3
         ? a($$2, dps.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dtb.bA).orElse(false)))
         : a($$2, dps.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dtb.bA).orElse(false)));
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcz.a($$0, $$2, "spawn_data");
   }
}
