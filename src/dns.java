import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dns extends deu implements dlv {
   public static final MapCodec<dns> a = b(dns::new);
   public static final dso b = dsn.J;
   public static final dsv<dtj> c = dsn.W;
   public static final dsv<dtj> d = dsn.X;
   public static final dsv<dtj> e = dsn.Y;
   public static final dsv<dtj> f = dsn.Z;
   public static final dso g = dsn.C;
   private final Map<drx, ewf> h;
   private final Map<drx, ewf> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewf F = deu.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewf G = deu.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewf H = deu.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewf I = deu.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewf J = deu.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtj.a).a(c, dtj.a).a(e, dtj.a).a(f, dtj.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewf a(ewf $$0, dtj $$1, ewf $$2, ewf $$3) {
      if ($$1 == dtj.c) {
         return ewc.a($$0, $$3);
      } else {
         return $$1 == dtj.b ? ewc.a($$0, $$2) : $$0;
      }
   }

   private Map<drx, ewf> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewf $$10 = deu.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewf $$11 = deu.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewf $$12 = deu.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewf $$13 = deu.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewf $$14 = deu.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewf $$15 = deu.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewf $$16 = deu.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewf $$17 = deu.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewf $$18 = deu.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<drx, ewf> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtj $$21 : c.a()) {
            for (dtj $$22 : d.a()) {
               for (dtj $$23 : f.a()) {
                  for (dtj $$24 : e.a()) {
                     ewf $$25 = ewc.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewc.a($$25, $$10);
                     }

                     drx $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
                     $$19.put($$26.a(g, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.a(g, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   private boolean a(drx $$0, boolean $$1, je $$2) {
      deu $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dht && dht.a($$0, $$2);
      return $$0.a(awl.L) || !j($$0) && $$1 || $$3 instanceof div || $$4;
   }

   @Override
   public drx a(cxv $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      enq $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      iz $$8 = $$2.c();
      drx $$9 = $$1.a_($$4);
      drx $$10 = $$1.a_($$5);
      drx $$11 = $$1.a_($$6);
      drx $$12 = $$1.a_($$7);
      drx $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, je.d), je.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, je.e), je.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, je.c), je.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, je.f), je.f);
      drx $$18 = this.n().a(g, Boolean.valueOf($$3.a() == enr.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == je.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(drx $$0, dta<dtj> $$1) {
      return $$0.c($$1) != dtj.a;
   }

   private static boolean a(ewf $$0, ewf $$1) {
      return !ewc.c($$1, $$0, evq.e);
   }

   private drx a(dbw $$0, drx $$1, iz $$2, drx $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private drx a(dbw $$0, iz $$1, drx $$2, iz $$3, drx $$4, je $$5) {
      je $$6 = $$5.g();
      boolean $$7 = $$5 == je.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == je.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == je.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == je.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      iz $$11 = $$1.c();
      drx $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private drx a(dbw $$0, drx $$1, iz $$2, drx $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewf $$8 = $$3.k($$0, $$2).a(je.a);
      drx $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(drx $$0, drx $$1, ewf $$2) {
      boolean $$3 = $$1.b() instanceof dns && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtj $$4 = $$0.c(d);
         dtj $$5 = $$0.c(e);
         dtj $$6 = $$0.c(c);
         dtj $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtj.a;
         boolean $$9 = $$7 == dtj.a;
         boolean $$10 = $$6 == dtj.a;
         boolean $$11 = $$4 == dtj.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtj.c && $$5 == dtj.c || $$6 == dtj.c && $$7 == dtj.c;
            return $$13 ? false : $$1.a(awl.aO) || a($$2, F);
         }
      }
   }

   private drx a(drx $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewf $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtj a(boolean $$0, ewf $$1, ewf $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtj.c : dtj.b;
      } else {
         return dtj.a;
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(g) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      switch ($$1) {
         case c:
            return $$0.a(d, $$0.c(e)).a(c, $$0.c(f)).a(e, $$0.c(d)).a(f, $$0.c(c));
         case d:
            return $$0.a(d, $$0.c(c)).a(c, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(d));
         case b:
            return $$0.a(d, $$0.c(f)).a(c, $$0.c(d)).a(e, $$0.c(c)).a(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      switch ($$1) {
         case b:
            return $$0.a(d, $$0.c(e)).a(e, $$0.c(d));
         case c:
            return $$0.a(c, $$0.c(f)).a(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}
