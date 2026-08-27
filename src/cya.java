import javax.annotation.Nullable;

public class cya extends ctg implements cwo {
   public static final dcs a = dcr.u;
   public static final dcz<dda> b = dcr.af;
   public static final dcs c = dcr.w;
   public static final dcs d = dcr.C;
   protected static final int e = 3;
   protected static final efb f = cpn.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final efb g = cpn.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final efb h = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final efb i = cpn.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final efb j = cpn.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final efb k = cpn.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dcq l;

   protected cya(dca.d $$0, dcq $$1) {
      super($$0.a($$1.d()));
      this.l = $$1;
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(b, dda.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == dda.a ? k : j;
      } else {
         switch ((ha)$$0.c(aC)) {
            case c:
            default:
               return i;
            case d:
               return h;
            case e:
               return g;
            case f:
               return f;
         }
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      switch ($$3) {
         case a:
            return $$0.c(a);
         case b:
            return $$0.c(d);
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if (!this.l.c()) {
         return bdx.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, dxf.c, dxf.c.a((cmp)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return bdx.a($$1.B);
      }
   }

   protected void a(@Nullable byo $$0, cmm $$1, gu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), ami.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dgl.h : dgl.d, $$2);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, dxf.c, dxf.c.a((cmp)$$1));
            }
         }
      }
   }

   @Override
   public dcb a(cih $$0) {
      dcb $$1 = this.n();
      dxe $$2 = $$0.q().b_($$0.a());
      ha $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aC, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? dda.a : dda.b);
      } else {
         $$1 = $$1.a(aC, $$0.g().g()).a(b, $$3 == ha.b ? dda.b : dda.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == dxf.c));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(aC, a, b, c, d);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(d) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
