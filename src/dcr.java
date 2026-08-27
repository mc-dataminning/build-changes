import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dcr extends cua {
   public static final MapCodec<dcr> a = b(dcr::new);
   public static final dgs b = czm.f;
   public static final dgs c = czm.b;
   public static final dgs d = czm.c;
   public static final dgs e = czm.d;
   public static final dgs f = czm.e;
   public static final Map<hx, dgs> g = czm.h.entrySet().stream().filter($$0 -> $$0.getKey() != hx.a).collect(ac.a());
   protected static final float h = 1.0F;
   private static final eiy i = cua.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy j = cua.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eiy k = cua.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy l = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eiy m = cua.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dgb, eiy> n;

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public dcr(dga.d $$0) {
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
      this.n = ImmutableMap.copyOf(this.E.a().stream().collect(Collectors.toMap(Function.identity(), dcr::h)));
   }

   private static eiy h(dgb $$0) {
      eiy $$1 = eiv.a();
      if ($$0.c(b)) {
         $$1 = i;
      }

      if ($$0.c(c)) {
         $$1 = eiv.a($$1, l);
      }

      if ($$0.c(e)) {
         $$1 = eiv.a($$1, m);
      }

      if ($$0.c(d)) {
         $$1 = eiv.a($$1, k);
      }

      if ($$0.c(f)) {
         $$1 = eiv.a($$1, j);
      }

      return $$1.c() ? eiv.b() : $$1;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.n.get($$0);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return true;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(dgb $$0) {
      return this.o($$0) > 0;
   }

   private int o(dgb $$0) {
      int $$1 = 0;

      for (dgs $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(cqf $$0, ht $$1, hx $$2) {
      if ($$2 == hx.a) {
         return false;
      } else {
         ht $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == hx.a.b) {
            return false;
         } else {
            dgs $$4 = g.get($$2);
            dgb $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cqf $$0, ht $$1, hx $$2) {
      return cyy.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private dgb i(dgb $$0, cqf $$1, ht $$2) {
      ht $$3 = $$2.c();
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(a($$1, $$3, hx.a)));
      }

      dgb $$4 = null;

      for (hx $$5 : hx.c.a) {
         dgs $$6 = a($$5);
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
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         dgb $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cuc.a.o() : $$6;
      }
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.X().b(cqv.U)) {
         if ($$3.a(4) == 0) {
            hx $$4 = hx.b($$3);
            ht $$5 = $$2.c();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  ht $$6 = $$2.a($$4);
                  dgb $$7 = $$1.a_($$6);
                  if ($$7.i()) {
                     hx $$8 = $$4.h();
                     hx $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     ht $$12 = $$6.a($$8);
                     ht $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.o().a(a($$8), Boolean.valueOf(true)), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.o().a(a($$9), Boolean.valueOf(true)), 2);
                     } else {
                        hx $$14 = $$4.g();
                        if ($$10 && $$1.t($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ($$11 && $$1.t($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.o().a(a($$14), Boolean.valueOf(true)), 2);
                        } else if ((double)$$3.i() < 0.05 && a($$1, $$6.c(), hx.b)) {
                           $$1.a($$6, this.o().a(b, Boolean.valueOf(true)), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
                  }
               }
            } else {
               if ($$4 == hx.b && $$2.v() < $$1.aj() - 1) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
                     return;
                  }

                  if ($$1.t($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     dgb $$15 = $$0;

                     for (hx $$16 : hx.c.a) {
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
                  ht $$17 = $$2.d();
                  dgb $$18 = $$1.a_($$17);
                  if ($$18.i() || $$18.a(this)) {
                     dgb $$19 = $$18.i() ? this.o() : $$18;
                     dgb $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.p($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private dgb a(dgb $$0, dgb $$1, ate $$2) {
      for (hx $$3 : hx.c.a) {
         if ($$2.h()) {
            dgs $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(dgb $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(cqf $$0, ht $$1) {
      int $$2 = 4;
      Iterable<ht> $$3 = ht.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (ht $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      dgb $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.o($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      dgb $$3 = $$2 ? $$1 : this.o();

      for (hx $$4 : $$0.f()) {
         if ($$4 != hx.a) {
            dgs $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
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
   public dgb a(dgb $$0, cyv $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         case c:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static dgs a(hx $$0) {
      return g.get($$0);
   }
}
