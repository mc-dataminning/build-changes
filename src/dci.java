import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dci extends daj {
   public static final MapCodec<dci> a = b(dci::new);
   public static final dnx<dnv> b = dnp.ae;

   @Override
   public MapCodec<? extends dci> a() {
      return a;
   }

   public dci(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dnv.b));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      dnv $$6 = $$0.c(b);
      if ($$1.o() != ih.a.b || $$6 == dnv.b != ($$1 == ih.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dnv.b && $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dac.a.o();
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ib $$1 = $$0.a();
      cwz $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      ib $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dnv.a)), 3);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      if ($$0.c(b) != dnv.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dmz $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dnv.b;
      }
   }

   public static void a(cxa $$0, dmz $$1, ib $$2, int $$3) {
      ib $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dnv.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dnv.a)), $$3);
   }

   public static dmz c(cxc $$0, ib $$1, dmz $$2) {
      return $$2.b(dnp.C) ? $$2.a(dnp.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eU());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwz $$0, cis $$1, ib $$2, dmz $$3, @Nullable dkg $$4, cqk $$5) {
      super.a($$0, $$1, $$2, dac.a.o(), $$4, $$5);
   }

   protected static void b(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      dnv $$4 = $$2.c(b);
      if ($$4 == dnv.a) {
         ib $$5 = $$1.d();
         dmz $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dnv.b) {
            dmz $$7 = $$6.u().b(eio.c) ? dac.G.o() : dac.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, daa.i($$6));
         }
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dmz $$0, ib $$1) {
      return aww.b($$1.u(), $$1.c($$0.c(b) == dnv.b ? 0 : 1).v(), $$1.w());
   }
}
