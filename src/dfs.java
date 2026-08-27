import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dfs extends cwy {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final dkg b = dcl.f;
   public static final dkg c = dcl.b;
   public static final dkg d = dcl.c;
   public static final dkg e = dcl.d;
   public static final dkg f = dcl.e;
   public static final Map<ic, dkg> g = dcl.h.entrySet().stream().filter($$0 -> $$0.getKey() != ic.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final emv i = cwy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv j = cwy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emv k = cwy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv l = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emv m = cwy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<djp, emv> n;

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   public dfs(djo.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dfs::h)));
   }

   private static emv h(djp $$0) {
      emv $$1 = ems.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = ems.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = ems.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = ems.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = ems.a($$1, j);
      }

      return $$1.c() ? ems.b() : $$1;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.n.get($$0);
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return true;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(djp $$0) {
      return this.o($$0) > 0;
   }

   private int o(djp $$0) {
      int $$1 = 0;

      for (dkg $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(ctd $$0, hx $$1, ic $$2) {
      if ($$2 == ic.a) {
         return false;
      } else {
         hx $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ic.a.b) {
            return false;
         } else {
            dkg $$4 = g.get($$2);
            djp $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(ctd $$0, hx $$1, ic $$2) {
      return dbx.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private djp i(djp $$0, ctd $$1, hx $$2) {
      hx $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ic.a)));
      }

      djp $$4 = null;

      for (ic $$5 : ic.c.a) {
         dkg $$6 = a($$5);
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
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         djp $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cxa.a.o() : $$6;
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.Z().b(ctt.X)) {
         if ($$3.a(4) == 0) {
            ic $$4 = ic.b($$3);
            hx $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  hx $$6 = $$2.a($$4);
                  djp $$7 = $$1.a_($$6);
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

                     djp $$15 = $$0;

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
                  djp $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     djp $$19 = $$18.i() ? this.o() : $$18;
                     djp $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private djp a(djp $$0, djp $$1, auw $$2) {
      for (ic $$3 : ic.c.a) {
         if ($$2.h()) {
            dkg $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(djp $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(ctd $$0, hx $$1) {
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
   public boolean a(djp $$0, cpp $$1) {
      djp $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      djp $$3 = $$2 ? $$1 : this.o();

      for (ic $$4 : $$0.f()) {
         if ($$4 != ic.a) {
            dkg $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
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
   public djp a(djp $$0, dbu $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dkg a(ic $$0) {
      return g.get($$0);
   }
}
