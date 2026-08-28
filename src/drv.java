import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class drv extends dem {
   public static final MapCodec<drv> a = b(drv::new);
   public static final dsx b = drx.a;
   public static final dtb<dtf> c = drx.c;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   public drv(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dtf.a));
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return null;
   }

   public static dpi a(iz $$0, dsd $$1, dsd $$2, je $$3, boolean $$4, boolean $$5) {
      return new drz($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.k, drz::a);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof drz) {
            ((drz)$$5).k();
         }
      }
   }

   @Override
   public void a(dca $$0, iz $$1, dsd $$2) {
      iz $$3 = $$1.a($$2.c(b).g());
      dsd $$4 = $$0.a_($$3);
      if ($$4.b() instanceof drw && $$4.c(drw.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqv.c;
      } else {
         return bqv.e;
      }
   }

   @Override
   protected List<cuq> a(dsd $$0, eqm.a $$1) {
      drz $$2 = this.a($$1.a(), iz.a($$1.a(etf.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ewi.a();
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      drz $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewi.a();
   }

   @Nullable
   private drz a(dbf $$0, iz $$1) {
      dpi $$2 = $$0.c_($$1);
      return $$2 instanceof drz ? (drz)$$2 : null;
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return cuq.l;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
