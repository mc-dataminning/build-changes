import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhg extends dfh {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dsz<dsx> b = dsr.ae;

   @Override
   public MapCodec<? extends dhg> a() {
      return a;
   }

   public dhg(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsx.b));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      dsx $$6 = $$0.c(b);
      if ($$1.o() != je.a.b || $$6 == dsx.b != ($$1 == je.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dsx.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfa.a.o();
      }
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      iz $$1 = $$0.a();
      dbx $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      iz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dsx.a)), 3);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      if ($$0.c(b) != dsx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dsx.b;
      }
   }

   public static void a(dby $$0, dsb $$1, iz $$2, int $$3) {
      iz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dsx.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dsx.a)), $$3);
   }

   public static dsb c(dca $$0, iz $$1, dsb $$2) {
      return $$2.b(dsr.C) ? $$2.a(dsr.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eX());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbx $$0, cmw $$1, iz $$2, dsb $$3, @Nullable dpg $$4, cuo $$5) {
      super.a($$0, $$1, $$2, dfa.a.o(), $$4, $$5);
   }

   protected static void b(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      dsx $$4 = $$2.c(b);
      if ($$4 == dsx.a) {
         iz $$5 = $$1.d();
         dsb $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dsx.b) {
            dsb $$7 = $$6.u().b(env.c) ? dfa.G.o() : dfa.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dey.i($$6));
         }
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsb $$0, iz $$1) {
      return ayy.b($$1.u(), $$1.c($$0.c(b) == dsx.b ? 0 : 1).v(), $$1.w());
   }
}
