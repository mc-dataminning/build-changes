public class csi extends ctg {
   public static final dcs a = dcr.u;
   public static final dcs b = dcr.w;
   public static final dcs c = dcr.q;
   protected static final efb d = cpn.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final efb e = cpn.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final efb f = cpn.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final efb g = cpn.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final efb h = cpn.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final efb i = cpn.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final efb j = cpn.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final efb k = cpn.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final efb l = eey.a(cpn.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cpn.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final efb m = eey.a(cpn.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cpn.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final efb n = eey.a(cpn.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cpn.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final efb D = eey.a(cpn.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cpn.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final ddo E;

   public csi(dca.d $$0, ddo $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == ha.a.a ? e : d;
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      ha.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public efb b_(dcb $$0, cls $$1, gu $$2) {
      if ($$0.c(a)) {
         return eey.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? j : k;
      }
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      if ($$0.c(a)) {
         return eey.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? h : i;
      }
   }

   @Override
   public efb f(dcb $$0, cls $$1, gu $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == ha.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      switch ($$3) {
         case a:
            return $$0.c(a);
         case b:
            return false;
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public dcb a(cih $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ha $$4 = $$0.g();
      ha.a $$5 = $$4.o();
      boolean $$6 = $$5 == ha.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ha.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dcb $$0) {
      return $$0.a(amw.L);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ha $$6 = $$3.cB();
         if ($$0.c(aC) == $$6.g()) {
            $$0 = $$0.a(aC, $$6);
         }

         $$0 = $$0.a(a, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(a);
      $$1.a($$3, $$2, $$7 ? this.E.g() : this.E.f(), ami.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dgl.h : dgl.d, $$2);
      return bdx.a($$1.B);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), ami.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dgl.h : dgl.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dcb $$0, ha $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
