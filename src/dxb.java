import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dxb extends dno {
   public static final MapCodec<dxb> a = b(dxb::new);
   public static final ech b = dti.f;
   public static final ech c = dti.b;
   public static final ech d = dti.c;
   public static final ech e = dti.d;
   public static final ech f = dti.e;
   public static final Map<jc, ech> g = dti.h.entrySet().stream().filter($$0 -> $$0.getKey() != jc.a).collect(ag.a());
   private final Function<ebq, fgw> h;

   @Override
   public MapCodec<dxb> a() {
      return a;
   }

   public dxb(ebp.d $$0) {
      super($$0);
      this.l(
         this.C
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
      );
      this.h = this.b();
   }

   private Function<ebq, fgw> b() {
      Map<jc, fgw> $$0 = fgt.d(dno.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgw $$2 = fgt.a();

         for (Entry<jc, ech> $$3 : g.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fgt.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? fgt.b() : $$2;
      });
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return true;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return this.o(this.e($$0, $$1, $$2));
   }

   private boolean o(ebq $$0) {
      return this.q($$0) > 0;
   }

   private int q(ebq $$0) {
      int $$1 = 0;

      for (ech $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(djn $$0, iw $$1, jc $$2) {
      if ($$2 == jc.a) {
         return false;
      } else {
         iw $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jc.a.b) {
            return false;
         } else {
            ech $$4 = g.get($$2);
            ebq $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(djn $$0, iw $$1, jc $$2) {
      return dsu.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private ebq e(ebq $$0, djn $$1, iw $$2) {
      iw $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(a($$1, $$3, jc.a)));
      }

      ebq $$4 = null;

      for (jc $$5 : jc.c.a) {
         ech $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.b($$6, Boolean.valueOf($$7));
         }
      }

      return $$0;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         ebq $$8 = this.e($$0, $$1, $$3);
         return !this.o($$8) ? dnq.a.m() : $$8;
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.O().c(dkf.Z)) {
         if ($$3.a(4) == 0) {
            jc $$4 = jc.b($$3);
            iw $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  iw $$6 = $$2.a($$4);
                  ebq $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jc $$8 = $$4.h();
                     jc $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     iw $$12 = $$6.a($$8);
                     iw $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        jc $$14 = $$4.g();
                        if ($$10 && $$1.v($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.v($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.d(), jc.b)) {
                           $$1.a($$6, this.m().b(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == jc.b && $$2.v() < $$1.ao()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.v($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     ebq $$15 = $$0;

                     for (jc $$16 : jc.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.r($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.K_()) {
                  iw $$17 = $$2.e();
                  ebq $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     ebq $$19 = $$18.l() ? this.m() : $$18;
                     ebq $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.r($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private ebq a(ebq $$0, ebq $$1, bai $$2) {
      for (jc $$3 : jc.c.a) {
         if ($$2.h()) {
            ech $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean r(ebq $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(djn $$0, iw $$1) {
      int $$2 = 4;
      Iterable<iw> $$3 = iw.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (iw $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      ebq $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.q($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      ebq $$3 = $$2 ? $$1 : this.m();

      for (jc $$4 : $$0.f()) {
         if ($$4 != jc.a) {
            ech $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      switch ($$1) {
         case c:
            return $$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d:
            return $$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b:
            return $$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static ech a(jc $$0) {
      return g.get($$0);
   }
}
