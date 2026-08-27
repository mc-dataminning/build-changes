import java.util.Objects;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public final class ehk extends ehi<ehl.a, ehl> {
   private static final long g = ehi.a.a(15);
   private static final long h = ehi.a.a(15, ih.b);
   private static final long i = ehi.a.a(15, false, ih.b);
   private final ib.a j = new ib.a();
   private final ehb k;

   public ehk(doo $$0) {
      this($$0, new ehl($$0));
   }

   @VisibleForTesting
   protected ehk(doo $$0, ehl $$1) {
      super($$0, $$1);
      this.k = new ehb($$0.q());
   }

   private static boolean a(int $$0) {
      return $$0 == 15;
   }

   private int a(int $$0, int $$1, int $$2) {
      ehb $$3 = this.b(jd.a($$0), jd.a($$1));
      return $$3 == null ? $$2 : $$3.a(jd.b($$0), jd.b($$1));
   }

   @Nullable
   private ehb b(int $$0, int $$1) {
      don $$2 = this.e.c($$0, $$1);
      return $$2 != null ? $$2.B() : null;
   }

   @Override
   protected void a(long $$0) {
      int $$1 = ib.a($$0);
      int $$2 = ib.b($$0);
      int $$3 = ib.c($$0);
      long $$4 = jd.e($$0);
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
               this.b($$0, ehi.a.a($$7));
            } else {
               this.b($$0, c);
            }
         }
      }
   }

   private void b(int $$0, int $$1, int $$2) {
      int $$3 = jd.c(this.f.c());
      this.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2, $$3);
   }

   private void a(int $$0, int $$1, int $$2, int $$3) {
      if ($$2 > $$3) {
         int $$4 = jd.a($$0);
         int $$5 = jd.a($$1);
         int $$6 = $$2 - 1;

         for (int $$7 = jd.a($$6); this.f.a($$7); $$7--) {
            if (this.f.b(jd.b($$4, $$7, $$5))) {
               int $$8 = jd.c($$7);
               int $$9 = $$8 + 15;

               for (int $$10 = Math.min($$9, $$6); $$10 >= $$8; $$10--) {
                  long $$11 = ib.a($$0, $$10, $$1);
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
      int $$4 = jd.a($$0);
      int $$5 = jd.a($$1);
      int $$6 = Math.max(
         Math.max(this.a($$0 - 1, $$1, Integer.MIN_VALUE), this.a($$0 + 1, $$1, Integer.MIN_VALUE)),
         Math.max(this.a($$0, $$1 - 1, Integer.MIN_VALUE), this.a($$0, $$1 + 1, Integer.MIN_VALUE))
      );
      int $$7 = Math.max($$2, $$3);

      for (long $$8 = jd.b($$4, jd.a($$7), $$5); !this.f.l($$8); $$8 = jd.a($$8, ih.b)) {
         if (this.f.b($$8)) {
            int $$9 = jd.c(jd.c($$8));
            int $$10 = $$9 + 15;

            for (int $$11 = Math.max($$9, $$7); $$11 <= $$10; $$11++) {
               long $$12 = ib.a($$0, $$11, $$1);
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
      dme $$3 = null;
      int $$4 = this.d($$0);

      for (ih $$5 : d) {
         if (ehi.a.a($$1, $$5)) {
            long $$6 = ib.a($$0, $$5);
            if (this.f.b(jd.e($$6))) {
               int $$7 = this.f.e($$6);
               int $$8 = $$2 - 1;
               if ($$8 > $$7) {
                  this.j.f($$6);
                  dme $$9 = this.c(this.j);
                  int $$10 = $$2 - this.a($$9, this.j);
                  if ($$10 > $$7) {
                     if ($$3 == null) {
                        $$3 = ehi.a.b($$1) ? czh.a.o() : this.c(this.j.f($$0));
                     }

                     if (!this.a($$0, $$3, $$6, $$9, $$5)) {
                        this.f.a($$6, $$10);
                        if ($$10 > 1) {
                           this.c($$6, ehi.a.a($$10, a($$9), $$5.g()));
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
      int $$3 = ehi.a.a($$1);

      for (ih $$4 : d) {
         if (ehi.a.a($$1, $$4)) {
            long $$5 = ib.a($$0, $$4);
            if (this.f.b(jd.e($$5))) {
               int $$6 = this.f.e($$5);
               if ($$6 != 0) {
                  if ($$6 <= $$3 - 1) {
                     this.f.a($$5, 0);
                     this.b($$5, ehi.a.a($$6, $$4.g()));
                     this.a($$5, $$4, $$6, false, $$2);
                  } else {
                     this.c($$5, ehi.a.b($$6, false, $$4.g()));
                  }
               }
            }
         }
      }
   }

   private int d(long $$0) {
      int $$1 = ib.b($$0);
      int $$2 = jd.b($$1);
      if ($$2 != 0) {
         return 0;
      } else {
         int $$3 = ib.a($$0);
         int $$4 = ib.c($$0);
         int $$5 = jd.b($$3);
         int $$6 = jd.b($$4);
         if ($$5 != 0 && $$5 != 15 && $$6 != 0 && $$6 != 15) {
            return 0;
         } else {
            int $$7 = jd.a($$3);
            int $$8 = jd.a($$1);
            int $$9 = jd.a($$4);
            int $$10 = 0;

            while (!this.f.b(jd.b($$7, $$8 - $$10 - 1, $$9)) && this.f.a($$8 - $$10 - 1)) {
               $$10++;
            }

            return $$10;
         }
      }
   }

   private void a(long $$0, ih $$1, int $$2, boolean $$3, int $$4) {
      if ($$4 != 0) {
         int $$5 = ib.a($$0);
         int $$6 = ib.c($$0);
         if (a($$1, jd.b($$5), jd.b($$6))) {
            int $$7 = ib.b($$0);
            int $$8 = jd.a($$5);
            int $$9 = jd.a($$6);
            int $$10 = jd.a($$7) - 1;
            int $$11 = $$10 - $$4 + 1;

            while ($$10 >= $$11) {
               if (!this.f.b(jd.b($$8, $$10, $$9))) {
                  $$10--;
               } else {
                  int $$12 = jd.c($$10);

                  for (int $$13 = 15; $$13 >= 0; $$13--) {
                     long $$14 = ib.a($$5, $$12 + $$13, $$6);
                     if ($$3) {
                        this.f.a($$14, $$2);
                        if ($$2 > 1) {
                           this.c($$14, ehi.a.a($$2, true, $$1.g()));
                        }
                     } else {
                        this.f.a($$14, 0);
                        this.b($$14, ehi.a.a($$2, $$1.g()));
                     }
                  }

                  $$10--;
               }
            }
         }
      }
   }

   private static boolean a(ih $$0, int $$1, int $$2) {
      return switch ($$0) {
         case c -> $$2 == 15;
         case d -> $$2 == 0;
         case e -> $$1 == 15;
         case f -> $$1 == 0;
         default -> false;
      };
   }

   @Override
   public void a(cvl $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$1) {
         ehb $$2 = Objects.requireNonNullElse(this.b($$0.e, $$0.f), this.k);
         int $$3 = $$2.a() - 1;
         int $$4 = jd.a($$3) + 1;
         long $$5 = jd.b($$0.e, $$0.f);
         int $$6 = this.f.m($$5);
         int $$7 = Math.max(this.f.c(), $$4);

         for (int $$8 = $$6 - 1; $$8 >= $$7; $$8--) {
            dog $$9 = this.f.c(jd.b($$0.e, $$8, $$0.f));
            if ($$9 != null && $$9.d()) {
               $$9.a(15);
            }
         }
      }
   }

   @Override
   public void b(cvl $$0) {
      long $$1 = jd.b($$0.e, $$0.f);
      this.f.b($$1, true);
      ehb $$2 = Objects.requireNonNullElse(this.b($$0.e, $$0.f), this.k);
      ehb $$3 = Objects.requireNonNullElse(this.b($$0.e, $$0.f - 1), this.k);
      ehb $$4 = Objects.requireNonNullElse(this.b($$0.e, $$0.f + 1), this.k);
      ehb $$5 = Objects.requireNonNullElse(this.b($$0.e - 1, $$0.f), this.k);
      ehb $$6 = Objects.requireNonNullElse(this.b($$0.e + 1, $$0.f), this.k);
      int $$7 = this.f.m($$1);
      int $$8 = this.f.c();
      int $$9 = jd.c($$0.e);
      int $$10 = jd.c($$0.f);

      for (int $$11 = $$7 - 1; $$11 >= $$8; $$11--) {
         long $$12 = jd.b($$0.e, $$11, $$0.f);
         dog $$13 = this.f.c($$12);
         if ($$13 != null) {
            int $$14 = jd.c($$11);
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
                        $$13.a($$18, jd.b($$25), $$17, 15);
                        if ($$25 == $$19 || $$25 < $$24) {
                           long $$26 = ib.a($$9 + $$18, $$25, $$10 + $$17);
                           this.c($$26, ehi.a.a($$25 == $$19, $$25 < $$20, $$25 < $$21, $$25 < $$22, $$25 < $$23));
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
