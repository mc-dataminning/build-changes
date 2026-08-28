import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnw extends det {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final dti<drq> b = dta.by;
   public static final dtb c = dta.bA;

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drq.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0 instanceof aqm $$3
         ? a($$2, dpr.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dta.bA).orElse(false)))
         : a($$2, dpr.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dta.bA).orElse(false)));
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcy.a($$0, $$2, "spawn_data");
   }
}
