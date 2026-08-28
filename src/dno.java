import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dno extends del {
   public static final MapCodec<dno> a = b(dno::new);
   public static final dta<dri> b = dss.by;
   public static final dst c = dss.bA;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dri.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new drb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0 instanceof arf $$3
         ? a($$2, dpj.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dss.bA).orElse(false)))
         : a($$2, dpj.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dss.bA).orElse(false)));
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcq.a($$0, $$2, "spawn_data");
   }
}
