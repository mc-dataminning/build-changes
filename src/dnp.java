import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnp extends dem {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dtb<drj> b = dst.by;
   public static final dsu c = dst.bA;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drj.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new drc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0 instanceof arf $$3
         ? a($$2, dpk.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dst.bA).orElse(false)))
         : a($$2, dpk.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dst.bA).orElse(false)));
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcr.a($$0, $$2, "spawn_data");
   }
}
