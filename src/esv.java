import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class esv extends esw {
   public static final dxm a = dxl.m;
   public static final dxu b = dxl.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<esv.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<esv.a> $$0 = new Object2ByteLinkedOpenHashMap<esv.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<esx, fbs> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dww.a<esw, esx> $$0) {
      $$0.a(a);
   }

   @Override
   public fay a(dfl $$0, ji $$1, esx $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         $$5.a($$1, $$6);
         esx $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ji $$10 = $$5.e();
                  esx $$11 = $$0.b_($$10);
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

      fay $$12 = new fay($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jn $$13 : jn.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(esx $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dfl $$0, ji $$1, jn $$2) {
      dwv $$3 = $$0.a_($$1);
      esx $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jn.b) {
         return true;
      } else {
         return $$3.b() instanceof dnk ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(arc $$0, ji $$1, dwv $$2, esx $$3) {
      if (!$$3.c()) {
         ji $$4 = $$1.e();
         dwv $$5 = $$0.a_($$4);
         esx $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jn.a, $$4, $$5, $$6)) {
            esx $$7 = this.a($$0, $$4, $$5);
            esw $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jn.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jn.a, $$7);
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

   private void a(arc $$0, ji $$1, esx $$2, dwv $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jn, esx> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jn, esx> $$6 : $$5.entrySet()) {
            jn $$7 = $$6.getKey();
            esx $$8 = $$6.getValue();
            ji $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected esx a(arc $$0, ji $$1, dwv $$2) {
      int $$3 = 0;
      int $$4 = 0;
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         ji $$7 = $$5.a($$1, $$6);
         dwv $$8 = $$0.a_($$7);
         esx $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dwv $$10 = $$0.a_($$5.a($$1, jn.a));
         esx $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      ji $$12 = $$5.a($$1, jn.b);
      dwv $$13 = $$0.a_($$12);
      esx $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jn.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? esy.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jn $$0, dfl $$1, ji $$2, dwv $$3, ji $$4, dwv $$5) {
      fbs $$6 = $$5.g($$1, $$4);
      if ($$6 == fbp.b()) {
         return false;
      } else {
         fbs $$7 = $$3.g($$1, $$2);
         if ($$7 == fbp.b()) {
            return false;
         } else if ($$7 == fbp.a() && $$6 == fbp.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<esv.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            esv.a $$10;
            if ($$9 != null) {
               $$10 = new esv.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fbp.b($$7, $$6, $$0);
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

   public abstract esw d();

   public esx a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract esw e();

   public esx a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(arc var1);

   protected void a(dgh $$0, ji $$1, dwv $$2, jn $$3, esx $$4) {
      if ($$2.b() instanceof dod $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dgh var1, ji var2, dwv var3);

   protected int a(dgj $$0, ji $$1, int $$2, jn $$3, dwv $$4, esv.b $$5) {
      int $$6 = 1000;

      for (jn $$7 : jn.c.a) {
         if ($$7 != $$3) {
            ji $$8 = $$1.a($$7);
            dwv $$9 = $$5.a($$8);
            esx $$10 = $$9.y();
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

   boolean a(dfl $$0, ji $$1, dwv $$2, ji $$3, dwv $$4) {
      if (!a(jn.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dfl $$0, esw $$1, ji $$2, dwv $$3, jn $$4, ji $$5, dwv $$6, esx $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dfl $$0, ji $$1, dwv $$2, jn $$3, ji $$4, dwv $$5, esx $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(esx $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dgj var1);

   private int a(dgj $$0, ji $$1) {
      int $$2 = 0;

      for (jn $$3 : jn.c.a) {
         ji $$4 = $$1.a($$3);
         esx $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jn, esx> b(arc $$0, ji $$1, dwv $$2) {
      int $$3 = 1000;
      Map<jn, esx> $$4 = Maps.newEnumMap(jn.class);
      esv.b $$5 = null;

      for (jn $$6 : jn.c.a) {
         ji $$7 = $$1.a($$6);
         dwv $$8 = $$0.a_($$7);
         esx $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            esx $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new esv.b($$0, $$1);
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

   private static boolean a(dwv $$0) {
      djk $$1 = $$0.b();
      if ($$1 instanceof dod) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dlr)
               && !$$0.a(awo.aA)
               && !$$0.a(djm.cX)
               && !$$0.a(djm.ef)
               && !$$0.a(djm.nF)
               && !$$0.a(djm.eq)
               && !$$0.a(djm.fS)
               && !$$0.a(djm.lh)
               && !$$0.a(djm.lp);
      }
   }

   private static boolean a(dfl $$0, ji $$1, dwv $$2, esw $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dfl $$0, ji $$1, dwv $$2, esw $$3) {
      return $$2.b() instanceof dod $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dgj var1);

   protected int a(dgg $$0, ji $$1, esx $$2, esx $$3) {
      return this.a($$0);
   }

   @Override
   public void b(arc $$0, ji $$1, dwv $$2, esx $$3) {
      if (!$$3.b()) {
         esx $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = djm.a.m();
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

   protected static int e(esx $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(esx $$0, dfl $$1, ji $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(esx $$0, dfl $$1, ji $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(esx $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(esx var1);

   @Override
   public fbs b(esx $$0, dfl $$1, ji $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? fbp.b() : this.g.computeIfAbsent($$0, $$2x -> fbp.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dwv a, dwv b, jn c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof esv.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         int $$0 = System.identityHashCode(this.a);
         $$0 = 31 * $$0 + System.identityHashCode(this.b);
         return 31 * $$0 + this.c.hashCode();
      }
   }

   protected class b {
      private final dfl b;
      private final ji c;
      private final Short2ObjectMap<dwv> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dfl $$1, final ji $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dwv a(ji $$0) {
         return this.a($$0, this.c($$0));
      }

      private dwv a(ji $$0, short $$1) {
         return (dwv)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(ji $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dwv $$2 = this.a($$0, $$1);
            ji $$3 = $$0.e();
            dwv $$4 = this.b.a_($$3);
            return esv.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(ji $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
