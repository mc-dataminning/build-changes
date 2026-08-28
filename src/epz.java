import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class epz extends eqa {
   public static final dur a = duq.i;
   public static final dva b = duq.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dgv.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dgv.a> $$0 = new Object2ByteLinkedOpenHashMap<dgv.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eqb, eyx> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dub.a<eqa, eqb> $$0) {
      $$0.a(a);
   }

   @Override
   public eye a(dcx $$0, je $$1, eqb $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      je.a $$5 = new je.a();

      for (jj $$6 : jj.c.a) {
         $$5.a($$1, $$6);
         eqb $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  je $$10 = $$5.e();
                  eqb $$11 = $$0.b_($$10);
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

      eye $$12 = new eye($$3, 0.0, $$4);
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

   private boolean g(eqb $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dcx $$0, je $$1, jj $$2) {
      dua $$3 = $$0.a_($$1);
      eqb $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jj.b) {
         return true;
      } else {
         return $$3.b() instanceof dkt ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(dds $$0, je $$1, dua $$2, eqb $$3) {
      if (!$$3.c()) {
         je $$4 = $$1.e();
         dua $$5 = $$0.a_($$4);
         eqb $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jj.a, $$4, $$5, $$6)) {
            eqb $$7 = this.a($$0, $$4, $$5);
            eqa $$8 = $$7.a();
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

   private void a(dds $$0, je $$1, eqb $$2, dua $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jj, eqb> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jj, eqb> $$6 : $$5.entrySet()) {
            jj $$7 = $$6.getKey();
            eqb $$8 = $$6.getValue();
            je $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected eqb a(dds $$0, je $$1, dua $$2) {
      int $$3 = 0;
      int $$4 = 0;
      je.a $$5 = new je.a();

      for (jj $$6 : jj.c.a) {
         je $$7 = $$5.a($$1, $$6);
         dua $$8 = $$0.a_($$7);
         eqb $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dua $$10 = $$0.a_($$5.a($$1, jj.a));
         eqb $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      je $$12 = $$5.a($$1, jj.b);
      dua $$13 = $$0.a_($$12);
      eqb $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jj.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? eqc.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jj $$0, dcx $$1, je $$2, dua $$3, je $$4, dua $$5) {
      eyx $$6 = $$5.g($$1, $$4);
      if ($$6 == eyu.b()) {
         return false;
      } else {
         eyx $$7 = $$3.g($$1, $$2);
         if ($$7 == eyu.b()) {
            return false;
         } else if ($$7 == eyu.a() && $$6 == eyu.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<dgv.a> $$9;
            if (!$$3.b().p() && !$$5.b().p()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            dgv.a $$10;
            if ($$9 != null) {
               $$10 = new dgv.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !eyu.b($$7, $$6, $$0);
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

   public abstract eqa d();

   public eqb a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract eqa e();

   public eqb a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(dds var1);

   protected void a(ddt $$0, je $$1, dua $$2, jj $$3, eqb $$4) {
      if ($$2.b() instanceof dlm $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(ddt var1, je var2, dua var3);

   protected int a(ddv $$0, je $$1, int $$2, jj $$3, dua $$4, epz.a $$5) {
      int $$6 = 1000;

      for (jj $$7 : jj.c.a) {
         if ($$7 != $$3) {
            je $$8 = $$1.a($$7);
            dua $$9 = $$5.a($$8);
            eqb $$10 = $$9.y();
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

   boolean a(dcx $$0, je $$1, dua $$2, je $$3, dua $$4) {
      if (!a(jj.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dcx $$0, eqa $$1, je $$2, dua $$3, jj $$4, je $$5, dua $$6, eqb $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dcx $$0, je $$1, dua $$2, jj $$3, je $$4, dua $$5, eqb $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(eqb $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(ddv var1);

   private int a(ddv $$0, je $$1) {
      int $$2 = 0;

      for (jj $$3 : jj.c.a) {
         je $$4 = $$1.a($$3);
         eqb $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jj, eqb> b(dds $$0, je $$1, dua $$2) {
      int $$3 = 1000;
      Map<jj, eqb> $$4 = Maps.newEnumMap(jj.class);
      epz.a $$5 = null;

      for (jj $$6 : jj.c.a) {
         je $$7 = $$1.a($$6);
         dua $$8 = $$0.a_($$7);
         eqb $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            eqb $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new epz.a($$0, $$1);
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

   private static boolean a(dua $$0) {
      dgv $$1 = $$0.b();
      if ($$1 instanceof dlm) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof djb)
               && !$$0.a(aws.ay)
               && !$$0.a(dgx.cO)
               && !$$0.a(dgx.dS)
               && !$$0.a(dgx.nd)
               && !$$0.a(dgx.ed)
               && !$$0.a(dgx.fx)
               && !$$0.a(dgx.kF)
               && !$$0.a(dgx.kN);
      }
   }

   private static boolean a(dcx $$0, je $$1, dua $$2, eqa $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dcx $$0, je $$1, dua $$2, eqa $$3) {
      return $$2.b() instanceof dlm $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(ddv var1);

   protected int a(dds $$0, je $$1, eqb $$2, eqb $$3) {
      return this.a((ddv)$$0);
   }

   @Override
   public void b(dds $$0, je $$1, dua $$2, eqb $$3) {
      if (!$$3.b()) {
         eqb $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dgx.a.o();
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

   protected static int e(eqb $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eqb $$0, dcx $$1, je $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(eqb $$0, dcx $$1, je $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eqb $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eqb var1);

   @Override
   public eyx b(eqb $$0, dcx $$1, je $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eyu.b() : this.g.computeIfAbsent($$0, $$2x -> eyu.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   protected class a {
      private final dcx b;
      private final je c;
      private final Short2ObjectMap<dua> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      a(final dcx $$1, final je $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dua a(je $$0) {
         return this.a($$0, this.c($$0));
      }

      private dua a(je $$0, short $$1) {
         return (dua)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(je $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dua $$2 = this.a($$0, $$1);
            je $$3 = $$0.e();
            dua $$4 = this.b.a_($$3);
            return epz.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(je $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
