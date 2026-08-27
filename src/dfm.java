import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfm extends cwk {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final dkn<djc> b = dkf.by;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djc.a));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new diw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0 instanceof ane $$3
         ? a($$2, dhf.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, dhf.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(cng $$0, @Nullable ctd $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      cup.a($$0, $$2, "spawn_data");
   }
}
