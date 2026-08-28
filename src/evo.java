import java.util.Objects;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public final class evo extends evm<evp.a, evp> {
   private static final long g = evm.a.a(15);
   private static final long h = evm.a.a(15, ja.b);
   private static final long i = evm.a.a(15, false, ja.b);
   private final iu.a j = new iu.a();
   private final evf k;

   public evo(eby $$0) {
      this($$0, new evp($$0));
   }

   @VisibleForTesting
   protected evo(eby $$0, evp $$1) {
      super($$0, $$1);
      this.k = new evf($$0.r());
   }

   private static boolean a(int $$0) {
      return $$0 == 15;
   }

   private int a(int $$0, int $$1, int $$2) {
      evf $$3 = this.b(jx.a($$0), jx.a($$1));
      return $$3 == null ? $$2 : $$3.a(jx.b($$0), jx.b($$1));
   }

   @Nullable
   private evf b(int $$0, int $$1) {
      ebx $$2 = this.e.c($$0, $$1);
      return $$2 != null ? $$2.D() : null;
   }

   @Override
   protected void a(long $$0) {
      int $$1 = iu.a($$0);
      int $$2 = iu.b($$0);
      int $$3 = iu.c($$0);
      long $$4 = jx.e($$0);
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
               this.b($$0, evm.a.a($$7));
            } else {
               this.b($$0, c);
            }
         }
      }
   }

   private void b(int $$0, int $$1, int $$2) {
      int $$3 = jx.c(this.f.c());
      this.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2, $$3);
   }

   private void a(int $$0, int $$1, int $$2, int $$3) {
      if ($$2 > $$3) {
         int $$4 = jx.a($$0);
         int $$5 = jx.a($$1);
         int $$6 = $$2 - 1;

         for (int $$7 = jx.a($$6); this.f.a($$7); $$7--) {
            if (this.f.b(jx.b($$4, $$7, $$5))) {
               int $$8 = jx.c($$7);
               int $$9 = $$8 + 15;

               for (int $$10 = Math.min($$9, $$6); $$10 >= $$8; $$10--) {
                  long $$11 = iu.a($$0, $$10, $$1);
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
      int $$4 = jx.a($$0);
      int $$5 = jx.a($$1);
      int $$6 = Math.max(
         Math.max(this.a($$0 - 1, $$1, Integer.MIN_VALUE), this.a($$0 + 1, $$1, Integer.MIN_VALUE)),
         Math.max(this.a($$0, $$1 - 1, Integer.MIN_VALUE), this.a($$0, $$1 + 1, Integer.MIN_VALUE))
      );
      int $$7 = Math.max($$2, $$3);

      for (long $$8 = jx.b($$4, jx.a($$7), $$5); !this.f.m($$8); $$8 = jx.a($$8, ja.b)) {
         if (this.f.b($$8)) {
            int $$9 = jx.c(jx.c($$8));
            int $$10 = $$9 + 15;

            for (int $$11 = Math.max($$9, $$7); $$11 <= $$10; $$11++) {
               long $$12 = iu.a($$0, $$11, $$1);
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
      dzo $$3 = null;
      int $$4 = this.d($$0);

      for (ja $$5 : d) {
         if (evm.a.a($$1, $$5)) {
            long $$6 = iu.a($$0, $$5);
            if (this.f.b(jx.e($$6))) {
               int $$7 = this.f.e($$6);
               int $$8 = $$2 - 1;
               if ($$8 > $$7) {
                  this.j.f($$6);
                  dzo $$9 = this.c(this.j);
                  int $$10 = $$2 - this.b($$9);
                  if ($$10 > $$7) {
                     if ($$3 == null) {
                        $$3 = evm.a.b($$1) ? dlw.a.m() : this.c(this.j.f($$0));
                     }

                     if (!this.a($$3, $$9, $$5)) {
                        this.f.a($$6, $$10);
                        if ($$10 > 1) {
                           this.c($$6, evm.a.a($$10, a($$9), $$5.g()));
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
      int $$3 = evm.a.a($$1);

      for (ja $$4 : d) {
         if (evm.a.a($$1, $$4)) {
            long $$5 = iu.a($$0, $$4);
            if (this.f.b(jx.e($$5))) {
               int $$6 = this.f.e($$5);
               if ($$6 != 0) {
                  if ($$6 <= $$3 - 1) {
                     this.f.a($$5, 0);
                     this.b($$5, evm.a.a($$6, $$4.g()));
                     this.a($$5, $$4, $$6, false, $$2);
                  } else {
                     this.c($$5, evm.a.b($$6, false, $$4.g()));
                  }
               }
            }
         }
      }
   }

   private int d(long $$0) {
      int $$1 = iu.b($$0);
      int $$2 = jx.b($$1);
      if ($$2 != 0) {
         return 0;
      } else {
         int $$3 = iu.a($$0);
         int $$4 = iu.c($$0);
         int $$5 = jx.b($$3);
         int $$6 = jx.b($$4);
         if ($$5 != 0 && $$5 != 15 && $$6 != 0 && $$6 != 15) {
            return 0;
         } else {
            int $$7 = jx.a($$3);
            int $$8 = jx.a($$1);
            int $$9 = jx.a($$4);
            int $$10 = 0;

            while (!this.f.b(jx.b($$7, $$8 - $$10 - 1, $$9)) && this.f.a($$8 - $$10 - 1)) {
               $$10++;
            }

            return $$10;
         }
      }
   }

   private void a(long $$0, ja $$1, int $$2, boolean $$3, int $$4) {
      if ($$4 != 0) {
         int $$5 = iu.a($$0);
         int $$6 = iu.c($$0);
         if (a($$1, jx.b($$5), jx.b($$6))) {
            int $$7 = iu.b($$0);
            int $$8 = jx.a($$5);
            int $$9 = jx.a($$6);
            int $$10 = jx.a($$7) - 1;
            int $$11 = $$10 - $$4 + 1;

            while ($$10 >= $$11) {
               if (!this.f.b(jx.b($$8, $$10, $$9))) {
                  $$10--;
               } else {
                  int $$12 = jx.c($$10);

                  for (int $$13 = 15; $$13 >= 0; $$13--) {
                     long $$14 = iu.a($$5, $$12 + $$13, $$6);
                     if ($$3) {
                        this.f.a($$14, $$2);
                        if ($$2 > 1) {
                           this.c($$14, evm.a.a($$2, true, $$1.g()));
                        }
                     } else {
                        this.f.a($$14, 0);
                        this.b($$14, evm.a.a($$2, $$1.g()));
                     }
                  }

                  $$10--;
               }
            }
         }
      }
   }

   private static boolean a(ja $$0, int $$1, int $$2) {
      return switch ($$0) {
         case c -> $$2 == 15;
         case d -> $$2 == 0;
         case e -> $$1 == 15;
         case f -> $$1 == 0;
         default -> false;
      };
   }

   @Override
   public void a(dhw $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$1) {
         evf $$2 = Objects.requireNonNullElse(this.b($$0.h, $$0.i), this.k);
         int $$3 = $$2.a() - 1;
         int $$4 = jx.a($$3) + 1;
         long $$5 = jx.b($$0.h, $$0.i);
         int $$6 = this.f.n($$5);
         int $$7 = Math.max(this.f.c(), $$4);

         for (int $$8 = $$6 - 1; $$8 >= $$7; $$8--) {
            ebq $$9 = this.f.c(jx.b($$0.h, $$8, $$0.i));
            if ($$9 != null && $$9.d()) {
               $$9.a(15);
            }
         }
      }
   }

   @Override
   public void b(dhw $$0) {
      long $$1 = jx.b($$0.h, $$0.i);
      this.f.b($$1, true);
      evf $$2 = Objects.requireNonNullElse(this.b($$0.h, $$0.i), this.k);
      evf $$3 = Objects.requireNonNullElse(this.b($$0.h, $$0.i - 1), this.k);
      evf $$4 = Objects.requireNonNullElse(this.b($$0.h, $$0.i + 1), this.k);
      evf $$5 = Objects.requireNonNullElse(this.b($$0.h - 1, $$0.i), this.k);
      evf $$6 = Objects.requireNonNullElse(this.b($$0.h + 1, $$0.i), this.k);
      int $$7 = this.f.n($$1);
      int $$8 = this.f.c();
      int $$9 = jx.c($$0.h);
      int $$10 = jx.c($$0.i);

      for (int $$11 = $$7 - 1; $$11 >= $$8; $$11--) {
         long $$12 = jx.b($$0.h, $$11, $$0.i);
         ebq $$13 = this.f.c($$12);
         if ($$13 != null) {
            int $$14 = jx.c($$11);
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
                        $$13.a($$18, jx.b($$25), $$17, 15);
                        if ($$25 == $$19 || $$25 < $$24) {
                           long $$26 = iu.a($$9 + $$18, $$25, $$10 + $$17);
                           this.c($$26, evm.a.a($$25 == $$19, $$25 < $$20, $$25 < $$21, $$25 < $$22, $$25 < $$23));
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
