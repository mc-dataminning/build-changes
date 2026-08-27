import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ekz extends ela {
   public static final dpz a = dpy.i;
   public static final dqi b = dpy.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dch.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dch.a> $$0 = new Object2ByteLinkedOpenHashMap<dch.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<elb, etc> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dpj.a<ela, elb> $$0) {
      $$0.a(a);
   }

   @Override
   public esj a(cym $$0, id $$1, elb $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      id.a $$5 = new id.a();

      for (ij $$6 : ij.c.a) {
         $$5.a($$1, $$6);
         elb $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  id $$10 = $$5.d();
                  elb $$11 = $$0.b_($$10);
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

      esj $$12 = new esj($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ij $$13 : ij.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(elb $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cym $$0, id $$1, ij $$2) {
      dpi $$3 = $$0.a_($$1);
      elb $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ij.b) {
         return true;
      } else {
         return $$3.b() instanceof dge ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(czg $$0, id $$1, elb $$2) {
      if (!$$2.c()) {
         dpi $$3 = $$0.a_($$1);
         id $$4 = $$1.d();
         dpi $$5 = $$0.a_($$4);
         elb $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ij.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ij.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(czg $$0, id $$1, elb $$2, dpi $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ij, elb> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ij, elb> $$6 : $$5.entrySet()) {
            ij $$7 = $$6.getKey();
            elb $$8 = $$6.getValue();
            id $$9 = $$1.a($$7);
            dpi $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected elb a(czg $$0, id $$1, dpi $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ij $$5 : ij.c.a) {
         id $$6 = $$1.a($$5);
         dpi $$7 = $$0.a_($$6);
         elb $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dpi $$9 = $$0.a_($$1.d());
         elb $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      id $$11 = $$1.c();
      dpi $$12 = $$0.a_($$11);
      elb $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ij.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? elc.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ij $$0, cym $$1, id $$2, dpi $$3, id $$4, dpi $$5) {
      Object2ByteLinkedOpenHashMap<dch.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dch.a $$8;
      if ($$7 != null) {
         $$8 = new dch.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      etc $$11 = $$3.k($$1, $$2);
      etc $$12 = $$5.k($$1, $$4);
      boolean $$13 = !esz.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ela d();

   public elb a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ela e();

   public elb a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(czg var1);

   protected void a(czh $$0, id $$1, dpi $$2, ij $$3, elb $$4) {
      if ($$2.b() instanceof dgx) {
         ((dgx)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(czh var1, id var2, dpi var3);

   private static short a(id $$0, id $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(czj $$0, id $$1, int $$2, ij $$3, dpi $$4, id $$5, Short2ObjectMap<Pair<dpi, elb>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ij $$9 : ij.c.a) {
         if ($$9 != $$3) {
            id $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dpi, elb> $$12 = (Pair<dpi, elb>)$$6.computeIfAbsent($$11, $$2x -> {
               dpi $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dpi $$13 = (dpi)$$12.getFirst();
            elb $$14 = (elb)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  id $$4x = $$10.d();
                  dpi $$5x = $$0.a_($$4x);
                  return this.a($$0, this.d(), $$10, $$13, $$4x, $$5x);
               });
               if ($$15) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$16 = this.a($$0, $$10, $$2 + 1, $$9.g(), $$13, $$5, $$6, $$7);
                  if ($$16 < $$8) {
                     $$8 = $$16;
                  }
               }
            }
         }
      }

      return $$8;
   }

   private boolean a(cym $$0, ela $$1, id $$2, dpi $$3, id $$4, dpi $$5) {
      if (!this.a(ij.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cym $$0, ela $$1, id $$2, dpi $$3, ij $$4, id $$5, dpi $$6, elb $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(elb $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(czj var1);

   private int a(czj $$0, id $$1) {
      int $$2 = 0;

      for (ij $$3 : ij.c.a) {
         id $$4 = $$1.a($$3);
         elb $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ij, elb> b(czg $$0, id $$1, dpi $$2) {
      int $$3 = 1000;
      Map<ij, elb> $$4 = Maps.newEnumMap(ij.class);
      Short2ObjectMap<Pair<dpi, elb>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ij $$7 : ij.c.a) {
         id $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dpi, elb> $$10 = (Pair<dpi, elb>)$$5.computeIfAbsent($$9, $$2x -> {
            dpi $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dpi $$11 = (dpi)$$10.getFirst();
         elb $$12 = (elb)$$10.getSecond();
         elb $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            id $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dpi $$5x = $$0.a_($$14);
               return this.a($$0, this.d(), $$8, $$11, $$14, $$5x);
            });
            int $$16;
            if ($$15) {
               $$16 = 0;
            } else {
               $$16 = this.a($$0, $$8, 1, $$7.g(), $$11, $$1, $$5, $$6);
            }

            if ($$16 < $$3) {
               $$4.clear();
            }

            if ($$16 <= $$3) {
               $$4.put($$7, $$13);
               $$3 = $$16;
            }
         }
      }

      return $$4;
   }

   private boolean a(cym $$0, id $$1, dpi $$2, ela $$3) {
      dch $$4 = $$2.b();
      if ($$4 instanceof dgx $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof den || $$2.a(ave.ax) || $$2.a(dcj.cO) || $$2.a(dcj.dS) || $$2.a(dcj.nd)) {
         return false;
      } else {
         return !$$2.a(dcj.ed) && !$$2.a(dcj.fx) && !$$2.a(dcj.kF) && !$$2.a(dcj.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cym $$0, id $$1, dpi $$2, ij $$3, id $$4, dpi $$5, elb $$6, ela $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(czj var1);

   protected int a(czg $$0, id $$1, elb $$2, elb $$3) {
      return this.a((czj)$$0);
   }

   @Override
   public void b(czg $$0, id $$1, elb $$2) {
      if (!$$2.b()) {
         elb $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dcj.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dpi $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(elb $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(elb $$0, cym $$1, id $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(elb $$0, cym $$1, id $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(elb $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(elb var1);

   @Override
   public etc b(elb $$0, cym $$1, id $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? esz.b() : this.g.computeIfAbsent($$0, $$2x -> esz.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
