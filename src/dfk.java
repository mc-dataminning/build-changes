import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dfk extends cwq {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final djy b = dcd.f;
   public static final djy c = dcd.b;
   public static final djy d = dcd.c;
   public static final djy e = dcd.d;
   public static final djy f = dcd.e;
   public static final Map<ic, djy> g = dcd.h.entrySet().stream().filter($$0 -> $$0.getKey() != ic.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final emm i = cwq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm j = cwq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emm k = cwq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm l = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emm m = cwq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<djh, emm> n;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(djg.d $$0) {
      super($$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
      );
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dfk::h)));
   }

   private static emm h(djh $$0) {
      emm $$1 = emj.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = emj.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = emj.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = emj.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = emj.a($$1, j);
      }

      return $$1.c() ? emj.b() : $$1;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.n.get($$0);
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(djh $$0) {
      return this.o($$0) > 0;
   }

   private int o(djh $$0) {
      int $$1 = 0;

      for (djy $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(csv $$0, hx $$1, ic $$2) {
      if ($$2 == ic.a) {
         return false;
      } else {
         hx $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ic.a.b) {
            return false;
         } else {
            djy $$4 = g.get($$2);
            djh $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(csv $$0, hx $$1, ic $$2) {
      return dbp.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private djh i(djh $$0, csv $$1, hx $$2) {
      hx $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ic.a)));
      }

      djh $$4 = null;

      for (ic $$5 : ic.c.a) {
         djy $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.a($$6, Boolean.valueOf($$7));
         }
      }

      return $$0;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         djh $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cws.a.o() : $$6;
      }
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.Z().b(ctl.X)) {
         if ($$3.a(4) == 0) {
            ic $$4 = ic.b($$3);
            hx $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  hx $$6 = $$2.a($$4);
                  djh $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ic $$8 = $$4.h();
                     ic $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     hx $$12 = $$6.a($$8);
                     hx $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ic $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ic.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ic.b && $$2.v() < $$1.al() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     djh $$15 = $$0;

                     for (ic $$16 : ic.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.a(a($$16), Boolean.valueOf(false));
                        }
                     }

                     if (this.p($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.J_()) {
                  hx $$17 = $$2.d();
                  djh $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     djh $$19 = $$18.i() ? this.o() : $$18;
                     djh $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private djh a(djh $$0, djh $$1, auv $$2) {
      for (ic $$3 : ic.c.a) {
         if ($$2.h()) {
            djy $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(djh $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(csv $$0, hx $$1) {
      int $$2 = 4;
      Iterable<hx> $$3 = hx.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (hx $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      djh $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      djh $$3 = $$2 ? $$1 : this.o();

      for (ic $$4 : $$0.f()) {
         if ($$4 != ic.a) {
            djy $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      switch ($$1) {
         case c:
            return $$0.a(c, $$0.c(e)).a(d, $$0.c(f)).a(e, $$0.c(c)).a(f, $$0.c(d));
         case d:
            return $$0.a(c, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(c));
         case b:
            return $$0.a(c, $$0.c(f)).a(d, $$0.c(c)).a(e, $$0.c(d)).a(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static djy a(ic $$0) {
      return g.get($$0);
   }
}
