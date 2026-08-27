import javax.annotation.Nullable;

public class cuq extends csu {
   public static final dfy<dfw> a = dfq.ae;

   public cuq(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dfw.b));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      dfw $$6 = $$0.c(a);
      if ($$1.o() != ha.a.b || $$6 == dfw.b != ($$1 == ha.b) || $$2.a(this) && $$2.c(a) != $$6) {
         return $$6 == dfw.b && $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return csn.a.n();
      }
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      gu $$1 = $$0.a();
      cpm $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      gu $$5 = $$1.c();
      $$0.a($$5, b($$0, $$5, this.n().a(a, dfw.a)), 3);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      if ($$0.c(a) != dfw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dfa $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(a) == dfw.b;
      }
   }

   public static void a(cpn $$0, dfa $$1, gu $$2, int $$3) {
      gu $$4 = $$2.c();
      $$0.a($$2, b($$0, $$2, $$1.a(a, dfw.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.a(a, dfw.a)), $$3);
   }

   public static dfa b(cpp $$0, gu $$1, dfa $$2) {
      return $$2.b(dfq.C) ? $$2.a(dfq.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eR());
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpm $$0, cbn $$1, gu $$2, dfa $$3, @Nullable dcm $$4, ciy $$5) {
      super.a($$0, $$1, $$2, csn.a.n(), $$4, $$5);
   }

   protected static void b(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      dfw $$4 = $$2.c(a);
      if ($$4 == dfw.a) {
         gu $$5 = $$1.d();
         dfa $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(a) == dfw.b) {
            dfa $$7 = $$6.u().b(eae.c) ? csn.G.n() : csn.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, csm.i($$6));
         }
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public long a(dfa $$0, gu $$1) {
      return arp.b($$1.u(), $$1.c($$0.c(a) == dfw.b ? 0 : 1).v(), $$1.w());
   }
}
