import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends dhi implements dfd, dmb {
   public static final MapCodec<dmf> c = b(dmf::new);
   private static final dsu g = dst.C;
   public static final dsx d = dst.R;
   protected static final float e = 6.0F;
   protected static final ewl f = dfa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmf> a() {
      return c;
   }

   public dmf(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsz.b).a(g, Boolean.valueOf(false)).a(d, je.c));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return f;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(awp.bx) || $$1.b_($$2.c()).a(enx.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, btq $$3, cuq $$4) {
      if (!$$0.x_()) {
         iz $$5 = $$1.c();
         dsd $$6 = dhi.c($$0, $$5, this.o().a(b, dsz.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(g) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      if ($$0.c(b) == dsz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iz $$3 = $$2.d();
         dsd $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return true;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      if ($$3.c(dhi.b) == dsz.b) {
         iz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dex.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float as_() {
      return 0.1F;
   }
}
