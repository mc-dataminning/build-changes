import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eqn extends eqo {
   public static final dvf a = dve.i;
   public static final dvo b = dve.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dhj.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dhj.a> $$0 = new Object2ByteLinkedOpenHashMap<dhj.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eqp, ezm> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dup.a<eqo, eqp> $$0) {
      $$0.a(a);
   }

   @Override
   public eys a(ddl $$0, je $$1, eqp $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      je.a $$5 = new je.a();

      for (jj $$6 : jj.c.a) {
         $$5.a($$1, $$6);
         eqp $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  je $$10 = $$5.e();
                  eqp $$11 = $$0.b_($$10);
                  if (this.g($$11)) {
                     $$8 = $$11.d();
                     if ($$8 > 0.0F) {
                        $$9 = $$2.d() - ($$8 - 0.8888889F);
                     }
                  }
               }
            } else if ($$8 > 0.0F) {
               $$9 = $$2.d() - $$8;
            }

            if ($$9 != 0.0F) {
               $$3 += (double)((float)$$6.j() * $$9);
               $$4 += (double)((float)$$6.l() * $$9);
            }
         }
      }

      eys $$12 = new eys($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jj $$13 : jj.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eqp $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(ddl $$0, je $$1, jj $$2) {
      duo $$3 = $$0.a_($$1);
      eqp $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jj.b) {
         return true;
      } else {
         return $$3.b() instanceof dlh ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(deg $$0, je $$1, duo $$2, eqp $$3) {
      if (!$$3.c()) {
         je $$4 = $$1.e();
         duo $$5 = $$0.a_($$4);
         eqp $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jj.a, $$4, $$5, $$6)) {
            eqp $$7 = this.a($$0, $$4, $$5);
            eqo $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jj.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jj.a, $$7);
               if (this.a($$0, $$1) >= 3) {
                  this.a($$0, $$1, $$3, $$2);
               }

               return;
            }
         }

         if ($$3.b() || !this.a($$0, $$1, $$2, $$4, $$5)) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   private void a(deg $$0, je $$1, eqp $$2, duo $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jj, eqp> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jj, eqp> $$6 : $$5.entrySet()) {
            jj $$7 = $$6.getKey();
            eqp $$8 = $$6.getValue();
            je $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected eqp a(deg $$0, je $$1, duo $$2) {
      int $$3 = 0;
      int $$4 = 0;
      je.a $$5 = new je.a();

      for (jj $$6 : jj.c.a) {
         je $$7 = $$5.a($$1, $$6);
         duo $$8 = $$0.a_($$7);
         eqp $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         duo $$10 = $$0.a_($$5.a($$1, jj.a));
         eqp $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      je $$12 = $$5.a($$1, jj.b);
      duo $$13 = $$0.a_($$12);
      eqp $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jj.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? eqq.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jj $$0, ddl $$1, je $$2, duo $$3, je $$4, duo $$5) {
      ezm $$6 = $$5.g($$1, $$4);
      if ($$6 == ezj.b()) {
         return false;
      } else {
         ezm $$7 = $$3.g($$1, $$2);
         if ($$7 == ezj.b()) {
            return false;
         } else if ($$7 == ezj.a() && $$6 == ezj.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<dhj.a> $$9;
            if (!$$3.b().p() && !$$5.b().p()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            dhj.a $$10;
            if ($$9 != null) {
               $$10 = new dhj.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !ezj.b($$7, $$6, $$0);
            if ($$9 != null) {
               if ($$9.size() == 200) {
                  $$9.removeLastByte();
               }

               $$9.putAndMoveToFirst($$10, (byte)($$13 ? 1 : 0));
            }

            return $$13;
         }
      }
   }

   public abstract eqo d();

   public eqp a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract eqo e();

   public eqp a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(deg var1);

   protected void a(deh $$0, je $$1, duo $$2, jj $$3, eqp $$4) {
      if ($$2.b() instanceof dma $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(deh var1, je var2, duo var3);

   protected int a(dej $$0, je $$1, int $$2, jj $$3, duo $$4, eqn.a $$5) {
      int $$6 = 1000;

      for (jj $$7 : jj.c.a) {
         if ($$7 != $$3) {
            je $$8 = $$1.a($$7);
            duo $$9 = $$5.a($$8);
            eqp $$10 = $$9.y();
            if (this.a($$0, this.d(), $$1, $$4, $$7, $$8, $$9, $$10)) {
               if ($$5.b($$8)) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$11 = this.a($$0, $$8, $$2 + 1, $$7.g(), $$9, $$5);
                  if ($$11 < $$6) {
                     $$6 = $$11;
                  }
               }
            }
         }
      }

      return $$6;
   }

   boolean a(ddl $$0, je $$1, duo $$2, je $$3, duo $$4) {
      if (!a(jj.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(ddl $$0, eqo $$1, je $$2, duo $$3, jj $$4, je $$5, duo $$6, eqp $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(ddl $$0, je $$1, duo $$2, jj $$3, je $$4, duo $$5, eqp $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(eqp $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dej var1);

   private int a(dej $$0, je $$1) {
      int $$2 = 0;

      for (jj $$3 : jj.c.a) {
         je $$4 = $$1.a($$3);
         eqp $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jj, eqp> b(deg $$0, je $$1, duo $$2) {
      int $$3 = 1000;
      Map<jj, eqp> $$4 = Maps.newEnumMap(jj.class);
      eqn.a $$5 = null;

      for (jj $$6 : jj.c.a) {
         je $$7 = $$1.a($$6);
         duo $$8 = $$0.a_($$7);
         eqp $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            eqp $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new eqn.a($$0, $$1);
               }

               int $$11;
               if ($$5.b($$7)) {
                  $$11 = 0;
               } else {
                  $$11 = this.a($$0, $$7, 1, $$6.g(), $$8, $$5);
               }

               if ($$11 < $$3) {
                  $$4.clear();
               }

               if ($$11 <= $$3) {
                  if ($$9.a($$0, $$7, $$10.a(), $$6)) {
                     $$4.put($$6, $$10);
                  }

                  $$3 = $$11;
               }
            }
         }
      }

      return $$4;
   }

   private static boolean a(duo $$0) {
      dhj $$1 = $$0.b();
      if ($$1 instanceof dma) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof djp)
               && !$$0.a(awt.ay)
               && !$$0.a(dhl.cO)
               && !$$0.a(dhl.dS)
               && !$$0.a(dhl.nd)
               && !$$0.a(dhl.ed)
               && !$$0.a(dhl.fx)
               && !$$0.a(dhl.kF)
               && !$$0.a(dhl.kN);
      }
   }

   private static boolean a(ddl $$0, je $$1, duo $$2, eqo $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(ddl $$0, je $$1, duo $$2, eqo $$3) {
      return $$2.b() instanceof dma $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dej var1);

   protected int a(deg $$0, je $$1, eqp $$2, eqp $$3) {
      return this.a((dej)$$0);
   }

   @Override
   public void b(deg $$0, je $$1, duo $$2, eqp $$3) {
      if (!$$3.b()) {
         eqp $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dhl.a.o();
            $$0.a($$1, $$2, 3);
         } else if (!$$4.equals($$3)) {
            $$3 = $$4;
            $$2 = $$4.g();
            $$0.a($$1, $$2, 3);
            $$0.a($$1, $$4.a(), $$5);
         }
      }

      this.a($$0, $$1, $$2, $$3);
   }

   protected static int e(eqp $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eqp $$0, ddl $$1, je $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(eqp $$0, ddl $$1, je $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eqp $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eqp var1);

   @Override
   public ezm b(eqp $$0, ddl $$1, je $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ezj.b() : this.g.computeIfAbsent($$0, $$2x -> ezj.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   protected class a {
      private final ddl b;
      private final je c;
      private final Short2ObjectMap<duo> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      a(final ddl $$1, final je $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public duo a(je $$0) {
         return this.a($$0, this.c($$0));
      }

      private duo a(je $$0, short $$1) {
         return (duo)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(je $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            duo $$2 = this.a($$0, $$1);
            je $$3 = $$0.e();
            duo $$4 = this.b.a_($$3);
            return eqn.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(je $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
