import java.util.Objects;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public final class esr extends esp<ess.a, ess> {
   private static final long g = esp.a.a(15);
   private static final long h = esp.a.a(15, jn.b);
   private static final long i = esp.a.a(15, false, jn.b);
   private final ji.a j = new ji.a();
   private final esi k;

   public esr(dze $$0) {
      this($$0, new ess($$0));
   }

   @VisibleForTesting
   protected esr(dze $$0, ess $$1) {
      super($$0, $$1);
      this.k = new esi($$0.q());
   }

   private static boolean a(int $$0) {
      return $$0 == 15;
   }

   private int a(int $$0, int $$1, int $$2) {
      esi $$3 = this.b(kk.a($$0), kk.a($$1));
      return $$3 == null ? $$2 : $$3.a(kk.b($$0), kk.b($$1));
   }

   @Nullable
   private esi b(int $$0, int $$1) {
      dzd $$2 = this.e.c($$0, $$1);
      return $$2 != null ? $$2.D() : null;
   }

   @Override
   protected void a(long $$0) {
      int $$1 = ji.a($$0);
      int $$2 = ji.b($$0);
      int $$3 = ji.c($$0);
      long $$4 = kk.e($$0);
      int $$5 = this.f.j($$4) ? this.a($$1, $$3, Integer.MAX_VALUE) : Integer.MAX_VALUE;
      if ($$5 != Integer.MAX_VALUE) {
         this.b($$1, $$3, $$5);
      }

      if (this.f.b($$4)) {
         boolean $$6 = $$2 >= $$5;
         if ($$6) {
            this.b($$0, h);
            this.c($$0, i);
         } else {
            int $$7 = this.f.e($$0);
            if ($$7 > 0) {
               this.f.a($$0, 0);
               this.b($$0, esp.a.a($$7));
            } else {
               this.b($$0, c);
            }
         }
      }
   }

   private void b(int $$0, int $$1, int $$2) {
      int $$3 = kk.c(this.f.c());
      this.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2, $$3);
   }

   private void a(int $$0, int $$1, int $$2, int $$3) {
      if ($$2 > $$3) {
         int $$4 = kk.a($$0);
         int $$5 = kk.a($$1);
         int $$6 = $$2 - 1;

         for (int $$7 = kk.a($$6); this.f.a($$7); $$7--) {
            if (this.f.b(kk.b($$4, $$7, $$5))) {
               int $$8 = kk.c($$7);
               int $$9 = $$8 + 15;

               for (int $$10 = Math.min($$9, $$6); $$10 >= $$8; $$10--) {
                  long $$11 = ji.a($$0, $$10, $$1);
                  if (!a(this.f.e($$11))) {
                     return;
                  }

                  this.f.a($$11, 0);
                  this.b($$11, $$10 == $$2 - 1 ? g : h);
               }
            }
         }
      }
   }

   private void b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kk.a($$0);
      int $$5 = kk.a($$1);
      int $$6 = Math.max(
         Math.max(this.a($$0 - 1, $$1, Integer.MIN_VALUE), this.a($$0 + 1, $$1, Integer.MIN_VALUE)),
         Math.max(this.a($$0, $$1 - 1, Integer.MIN_VALUE), this.a($$0, $$1 + 1, Integer.MIN_VALUE))
      );
      int $$7 = Math.max($$2, $$3);

      for (long $$8 = kk.b($$4, kk.a($$7), $$5); !this.f.m($$8); $$8 = kk.a($$8, jn.b)) {
         if (this.f.b($$8)) {
            int $$9 = kk.c(kk.c($$8));
            int $$10 = $$9 + 15;

            for (int $$11 = Math.max($$9, $$7); $$11 <= $$10; $$11++) {
               long $$12 = ji.a($$0, $$11, $$1);
               if (a(this.f.e($$12))) {
                  return;
               }

               this.f.a($$12, 15);
               if ($$11 < $$6 || $$11 == $$2) {
                  this.c($$12, i);
               }
            }
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1, int $$2) {
      dww $$3 = null;
      int $$4 = this.d($$0);

      for (jn $$5 : d) {
         if (esp.a.a($$1, $$5)) {
            long $$6 = ji.a($$0, $$5);
            if (this.f.b(kk.e($$6))) {
               int $$7 = this.f.e($$6);
               int $$8 = $$2 - 1;
               if ($$8 > $$7) {
                  this.j.f($$6);
                  dww $$9 = this.c(this.j);
                  int $$10 = $$2 - this.b($$9);
                  if ($$10 > $$7) {
                     if ($$3 == null) {
                        $$3 = esp.a.b($$1) ? djn.a.m() : this.c(this.j.f($$0));
                     }

                     if (!this.a($$3, $$9, $$5)) {
                        this.f.a($$6, $$10);
                        if ($$10 > 1) {
                           this.c($$6, esp.a.a($$10, a($$9), $$5.g()));
                        }

                        this.a($$6, $$5, $$10, true, $$4);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(long $$0, long $$1) {
      int $$2 = this.d($$0);
      int $$3 = esp.a.a($$1);

      for (jn $$4 : d) {
         if (esp.a.a($$1, $$4)) {
            long $$5 = ji.a($$0, $$4);
            if (this.f.b(kk.e($$5))) {
               int $$6 = this.f.e($$5);
               if ($$6 != 0) {
                  if ($$6 <= $$3 - 1) {
                     this.f.a($$5, 0);
                     this.b($$5, esp.a.a($$6, $$4.g()));
                     this.a($$5, $$4, $$6, false, $$2);
                  } else {
                     this.c($$5, esp.a.b($$6, false, $$4.g()));
                  }
               }
            }
         }
      }
   }

   private int d(long $$0) {
      int $$1 = ji.b($$0);
      int $$2 = kk.b($$1);
      if ($$2 != 0) {
         return 0;
      } else {
         int $$3 = ji.a($$0);
         int $$4 = ji.c($$0);
         int $$5 = kk.b($$3);
         int $$6 = kk.b($$4);
         if ($$5 != 0 && $$5 != 15 && $$6 != 0 && $$6 != 15) {
            return 0;
         } else {
            int $$7 = kk.a($$3);
            int $$8 = kk.a($$1);
            int $$9 = kk.a($$4);
            int $$10 = 0;

            while (!this.f.b(kk.b($$7, $$8 - $$10 - 1, $$9)) && this.f.a($$8 - $$10 - 1)) {
               $$10++;
            }

            return $$10;
         }
      }
   }

   private void a(long $$0, jn $$1, int $$2, boolean $$3, int $$4) {
      if ($$4 != 0) {
         int $$5 = ji.a($$0);
         int $$6 = ji.c($$0);
         if (a($$1, kk.b($$5), kk.b($$6))) {
            int $$7 = ji.b($$0);
            int $$8 = kk.a($$5);
            int $$9 = kk.a($$6);
            int $$10 = kk.a($$7) - 1;
            int $$11 = $$10 - $$4 + 1;

            while ($$10 >= $$11) {
               if (!this.f.b(kk.b($$8, $$10, $$9))) {
                  $$10--;
               } else {
                  int $$12 = kk.c($$10);

                  for (int $$13 = 15; $$13 >= 0; $$13--) {
                     long $$14 = ji.a($$5, $$12 + $$13, $$6);
                     if ($$3) {
                        this.f.a($$14, $$2);
                        if ($$2 > 1) {
                           this.c($$14, esp.a.a($$2, true, $$1.g()));
                        }
                     } else {
                        this.f.a($$14, 0);
                        this.b($$14, esp.a.a($$2, $$1.g()));
                     }
                  }

                  $$10--;
               }
            }
         }
      }
   }

   private static boolean a(jn $$0, int $$1, int $$2) {
      return switch ($$0) {
         case c -> $$2 == 15;
         case d -> $$2 == 0;
         case e -> $$1 == 15;
         case f -> $$1 == 0;
         default -> false;
      };
   }

   @Override
   public void a(dfn $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$1) {
         esi $$2 = Objects.requireNonNullElse(this.b($$0.h, $$0.i), this.k);
         int $$3 = $$2.a() - 1;
         int $$4 = kk.a($$3) + 1;
         long $$5 = kk.b($$0.h, $$0.i);
         int $$6 = this.f.n($$5);
         int $$7 = Math.max(this.f.c(), $$4);

         for (int $$8 = $$6 - 1; $$8 >= $$7; $$8--) {
            dyw $$9 = this.f.c(kk.b($$0.h, $$8, $$0.i));
            if ($$9 != null && $$9.d()) {
               $$9.a(15);
            }
         }
      }
   }

   @Override
   public void b(dfn $$0) {
      long $$1 = kk.b($$0.h, $$0.i);
      this.f.b($$1, true);
      esi $$2 = Objects.requireNonNullElse(this.b($$0.h, $$0.i), this.k);
      esi $$3 = Objects.requireNonNullElse(this.b($$0.h, $$0.i - 1), this.k);
      esi $$4 = Objects.requireNonNullElse(this.b($$0.h, $$0.i + 1), this.k);
      esi $$5 = Objects.requireNonNullElse(this.b($$0.h - 1, $$0.i), this.k);
      esi $$6 = Objects.requireNonNullElse(this.b($$0.h + 1, $$0.i), this.k);
      int $$7 = this.f.n($$1);
      int $$8 = this.f.c();
      int $$9 = kk.c($$0.h);
      int $$10 = kk.c($$0.i);

      for (int $$11 = $$7 - 1; $$11 >= $$8; $$11--) {
         long $$12 = kk.b($$0.h, $$11, $$0.i);
         dyw $$13 = this.f.c($$12);
         if ($$13 != null) {
            int $$14 = kk.c($$11);
            int $$15 = $$14 + 15;
            boolean $$16 = false;

            for (int $$17 = 0; $$17 < 16; $$17++) {
               for (int $$18 = 0; $$18 < 16; $$18++) {
                  int $$19 = $$2.a($$18, $$17);
                  if ($$19 <= $$15) {
                     int $$20 = $$17 == 0 ? $$3.a($$18, 15) : $$2.a($$18, $$17 - 1);
                     int $$21 = $$17 == 15 ? $$4.a($$18, 0) : $$2.a($$18, $$17 + 1);
                     int $$22 = $$18 == 0 ? $$5.a(15, $$17) : $$2.a($$18 - 1, $$17);
                     int $$23 = $$18 == 15 ? $$6.a(0, $$17) : $$2.a($$18 + 1, $$17);
                     int $$24 = Math.max(Math.max($$20, $$21), Math.max($$22, $$23));

                     for (int $$25 = $$15; $$25 >= Math.max($$14, $$19); $$25--) {
                        $$13.a($$18, kk.b($$25), $$17, 15);
                        if ($$25 == $$19 || $$25 < $$24) {
                           long $$26 = ji.a($$9 + $$18, $$25, $$10 + $$17);
                           this.c($$26, esp.a.a($$25 == $$19, $$25 < $$20, $$25 < $$21, $$25 < $$22, $$25 < $$23));
                        }
                     }

                     if ($$19 < $$14) {
                        $$16 = true;
                     }
                  }
               }
            }

            if (!$$16) {
               break;
            }
         }
      }
   }
}
