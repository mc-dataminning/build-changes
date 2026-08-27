import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dlc extends dch {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final dpz b = dhu.f;
   public static final dpz c = dhu.b;
   public static final dpz d = dhu.c;
   public static final dpz e = dhu.d;
   public static final dpz f = dhu.e;
   public static final Map<ij, dpz> g = dhu.h.entrySet().stream().filter($$0 -> $$0.getKey() != ij.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final etc i = dch.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc j = dch.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final etc k = dch.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc l = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final etc m = dch.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dpi, etc> n;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dph.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dlc::m)));
   }

   private static etc m(dpi $$0) {
      etc $$1 = esz.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = esz.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = esz.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = esz.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = esz.a($$1, j);
      }

      return $$1.c() ? esz.b() : $$1;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return true;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dpi $$0) {
      return this.o($$0) > 0;
   }

   private int o(dpi $$0) {
      int $$1 = 0;

      for (dpz $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cym $$0, id $$1, ij $$2) {
      if ($$2 == ij.a) {
         return false;
      } else {
         id $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == ij.a.b) {
            return false;
         } else {
            dpz $$4 = g.get($$2);
            dpi $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cym $$0, id $$1, ij $$2) {
      return dhg.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dpi i(dpi $$0, cym $$1, id $$2) {
      id $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, ij.a)));
      }

      dpi $$4 = null;

      for (ij $$5 : ij.c.a) {
         dpz $$6 = a($$5);
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
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dpi $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? dcj.a.n() : $$6;
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.aa().b(czc.X)) {
         if ($$3.a(4) == 0) {
            ij $$4 = ij.b($$3);
            id $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  id $$6 = $$2.a($$4);
                  dpi $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     ij $$8 = $$4.h();
                     ij $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     id $$12 = $$6.a($$8);
                     id $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        ij $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), ij.b)) {
                           $$1.a($$6, this.n().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == ij.b && $$2.v() < $$1.al() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dpi $$15 = $$0;

                     for (ij $$16 : ij.c.a) {
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

               if ($$2.v() > $$1.I_()) {
                  id $$17 = $$2.d();
                  dpi $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dpi $$19 = $$18.i() ? this.n() : $$18;
                     dpi $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dpi a(dpi $$0, dpi $$1, axt $$2) {
      for (ij $$3 : ij.c.a) {
         if ($$2.h()) {
            dpz $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dpi $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cym $$0, id $$1) {
      int $$2 = 4;
      Iterable<id> $$3 = id.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (id $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      dpi $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dpi $$3 = $$2 ? $$1 : this.n();

      for (ij $$4 : $$0.f()) {
         if ($$4 != ij.a) {
            dpz $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
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
   protected dpi a(dpi $$0, dhd $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dpz a(ij $$0) {
      return g.get($$0);
   }
}
