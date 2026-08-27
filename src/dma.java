import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dma extends dde {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dqy b = dis.f;
   public static final dqy c = dis.b;
   public static final dqy d = dis.c;
   public static final dqy e = dis.d;
   public static final dqy f = dis.e;
   public static final Map<is, dqy> g = dis.h.entrySet().stream().filter($$0 -> $$0.getKey() != is.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final eui i = dde.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui j = dde.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eui k = dde.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui l = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eui m = dde.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dqh, eui> n;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dqg.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dma::m)));
   }

   private static eui m(dqh $$0) {
      eui $$1 = euf.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = euf.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = euf.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = euf.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = euf.a($$1, j);
      }

      return $$1.c() ? euf.b() : $$1;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.n.get($$0);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return true;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dqh $$0) {
      return this.o($$0) > 0;
   }

   private int o(dqh $$0) {
      int $$1 = 0;

      for (dqy $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(czj $$0, in $$1, is $$2) {
      if ($$2 == is.a) {
         return false;
      } else {
         in $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == is.a.b) {
            return false;
         } else {
            dqy $$4 = g.get($$2);
            dqh $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(czj $$0, in $$1, is $$2) {
      return die.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dqh i(dqh $$0, czj $$1, in $$2) {
      in $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, is.a)));
      }

      dqh $$4 = null;

      for (is $$5 : is.c.a) {
         dqy $$6 = a($$5);
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
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dqh $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? ddg.a.n() : $$6;
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.aa().b(czz.X)) {
         if ($$3.a(4) == 0) {
            is $$4 = is.b($$3);
            in $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  in $$6 = $$2.a($$4);
                  dqh $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     is $$8 = $$4.h();
                     is $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     in $$12 = $$6.a($$8);
                     in $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.n().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.n().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        is $$14 = $$4.g();
                        if ($$10 && $$1.u($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.u($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.n().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), is.b)) {
                           $$1.a($$6, this.n().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == is.b && $$2.v() < $$1.al() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.u($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dqh $$15 = $$0;

                     for (is $$16 : is.c.a) {
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
                  in $$17 = $$2.d();
                  dqh $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dqh $$19 = $$18.i() ? this.n() : $$18;
                     dqh $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dqh a(dqh $$0, dqh $$1, ayg $$2) {
      for (is $$3 : is.c.a) {
         if ($$2.h()) {
            dqy $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dqh $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(czj $$0, in $$1) {
      int $$2 = 4;
      Iterable<in> $$3 = in.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (in $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      dqh $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dqh $$3 = $$2 ? $$1 : this.n();

      for (is $$4 : $$0.f()) {
         if ($$4 != is.a) {
            dqy $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
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
   protected dqh a(dqh $$0, dib $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dqy a(is $$0) {
      return g.get($$0);
   }
}
