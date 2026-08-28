import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class esy extends esz {
   public static final dxp a = dxo.m;
   public static final dxx b = dxo.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<esy.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<esy.a> $$0 = new Object2ByteLinkedOpenHashMap<esy.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eta, fbv> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dwz.a<esz, eta> $$0) {
      $$0.a(a);
   }

   @Override
   public fbb a(dfo $$0, ji $$1, eta $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         $$5.a($$1, $$6);
         eta $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ji $$10 = $$5.e();
                  eta $$11 = $$0.b_($$10);
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

      fbb $$12 = new fbb($$3, 0.0, $$4);
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

   private boolean g(eta $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dfo $$0, ji $$1, jn $$2) {
      dwy $$3 = $$0.a_($$1);
      eta $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jn.b) {
         return true;
      } else {
         return $$3.b() instanceof dnn ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(ard $$0, ji $$1, dwy $$2, eta $$3) {
      if (!$$3.c()) {
         ji $$4 = $$1.e();
         dwy $$5 = $$0.a_($$4);
         eta $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jn.a, $$4, $$5, $$6)) {
            eta $$7 = this.a($$0, $$4, $$5);
            esz $$8 = $$7.a();
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

   private void a(ard $$0, ji $$1, eta $$2, dwy $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jn, eta> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jn, eta> $$6 : $$5.entrySet()) {
            jn $$7 = $$6.getKey();
            eta $$8 = $$6.getValue();
            ji $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected eta a(ard $$0, ji $$1, dwy $$2) {
      int $$3 = 0;
      int $$4 = 0;
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         ji $$7 = $$5.a($$1, $$6);
         dwy $$8 = $$0.a_($$7);
         eta $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dwy $$10 = $$0.a_($$5.a($$1, jn.a));
         eta $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      ji $$12 = $$5.a($$1, jn.b);
      dwy $$13 = $$0.a_($$12);
      eta $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jn.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? etb.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jn $$0, dfo $$1, ji $$2, dwy $$3, ji $$4, dwy $$5) {
      fbv $$6 = $$5.g($$1, $$4);
      if ($$6 == fbs.b()) {
         return false;
      } else {
         fbv $$7 = $$3.g($$1, $$2);
         if ($$7 == fbs.b()) {
            return false;
         } else if ($$7 == fbs.a() && $$6 == fbs.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<esy.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            esy.a $$10;
            if ($$9 != null) {
               $$10 = new esy.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fbs.b($$7, $$6, $$0);
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

   public abstract esz d();

   public eta a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract esz e();

   public eta a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(ard var1);

   protected void a(dgk $$0, ji $$1, dwy $$2, jn $$3, eta $$4) {
      if ($$2.b() instanceof dog $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dgk var1, ji var2, dwy var3);

   protected int a(dgm $$0, ji $$1, int $$2, jn $$3, dwy $$4, esy.b $$5) {
      int $$6 = 1000;

      for (jn $$7 : jn.c.a) {
         if ($$7 != $$3) {
            ji $$8 = $$1.a($$7);
            dwy $$9 = $$5.a($$8);
            eta $$10 = $$9.y();
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

   boolean a(dfo $$0, ji $$1, dwy $$2, ji $$3, dwy $$4) {
      if (!a(jn.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dfo $$0, esz $$1, ji $$2, dwy $$3, jn $$4, ji $$5, dwy $$6, eta $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dfo $$0, ji $$1, dwy $$2, jn $$3, ji $$4, dwy $$5, eta $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(eta $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dgm var1);

   private int a(dgm $$0, ji $$1) {
      int $$2 = 0;

      for (jn $$3 : jn.c.a) {
         ji $$4 = $$1.a($$3);
         eta $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jn, eta> b(ard $$0, ji $$1, dwy $$2) {
      int $$3 = 1000;
      Map<jn, eta> $$4 = Maps.newEnumMap(jn.class);
      esy.b $$5 = null;

      for (jn $$6 : jn.c.a) {
         ji $$7 = $$1.a($$6);
         dwy $$8 = $$0.a_($$7);
         eta $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            eta $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new esy.b($$0, $$1);
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

   private static boolean a(dwy $$0) {
      djn $$1 = $$0.b();
      if ($$1 instanceof dog) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dlu)
               && !$$0.a(awp.aA)
               && !$$0.a(djp.cX)
               && !$$0.a(djp.ef)
               && !$$0.a(djp.nF)
               && !$$0.a(djp.eq)
               && !$$0.a(djp.fS)
               && !$$0.a(djp.lh)
               && !$$0.a(djp.lp);
      }
   }

   private static boolean a(dfo $$0, ji $$1, dwy $$2, esz $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dfo $$0, ji $$1, dwy $$2, esz $$3) {
      return $$2.b() instanceof dog $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dgm var1);

   protected int a(dgj $$0, ji $$1, eta $$2, eta $$3) {
      return this.a($$0);
   }

   @Override
   public void b(ard $$0, ji $$1, dwy $$2, eta $$3) {
      if (!$$3.b()) {
         eta $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = djp.a.m();
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

   protected static int e(eta $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eta $$0, dfo $$1, ji $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(eta $$0, dfo $$1, ji $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eta $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eta var1);

   @Override
   public fbv b(eta $$0, dfo $$1, ji $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? fbs.b() : this.g.computeIfAbsent($$0, $$2x -> fbs.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dwy a, dwy b, jn c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof esy.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final dfo b;
      private final ji c;
      private final Short2ObjectMap<dwy> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dfo $$1, final ji $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dwy a(ji $$0) {
         return this.a($$0, this.c($$0));
      }

      private dwy a(ji $$0, short $$1) {
         return (dwy)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(ji $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dwy $$2 = this.a($$0, $$1);
            ji $$3 = $$0.e();
            dwy $$4 = this.b.a_($$3);
            return esy.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(ji $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
