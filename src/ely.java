import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ely extends elz {
   public static final dqy a = dqx.i;
   public static final drh b = dqx.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dde.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dde.a> $$0 = new Object2ByteLinkedOpenHashMap<dde.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ema, eui> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dqi.a<elz, ema> $$0) {
      $$0.a(a);
   }

   @Override
   public etp a(czj $$0, in $$1, ema $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      in.a $$5 = new in.a();

      for (is $$6 : is.c.a) {
         $$5.a($$1, $$6);
         ema $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  in $$10 = $$5.d();
                  ema $$11 = $$0.b_($$10);
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

      etp $$12 = new etp($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (is $$13 : is.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ema $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(czj $$0, in $$1, is $$2) {
      dqh $$3 = $$0.a_($$1);
      ema $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == is.b) {
         return true;
      } else {
         return $$3.b() instanceof dhc ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dad $$0, in $$1, ema $$2) {
      if (!$$2.c()) {
         dqh $$3 = $$0.a_($$1);
         in $$4 = $$1.d();
         dqh $$5 = $$0.a_($$4);
         ema $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, is.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, is.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(dad $$0, in $$1, ema $$2, dqh $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<is, ema> $$5 = this.b($$0, $$1, $$3);

         for (Entry<is, ema> $$6 : $$5.entrySet()) {
            is $$7 = $$6.getKey();
            ema $$8 = $$6.getValue();
            in $$9 = $$1.a($$7);
            dqh $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected ema a(dad $$0, in $$1, dqh $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (is $$5 : is.c.a) {
         in $$6 = $$1.a($$5);
         dqh $$7 = $$0.a_($$6);
         ema $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dqh $$9 = $$0.a_($$1.d());
         ema $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      in $$11 = $$1.c();
      dqh $$12 = $$0.a_($$11);
      ema $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(is.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? emb.a.g() : this.a($$14, false);
      }
   }

   private boolean a(is $$0, czj $$1, in $$2, dqh $$3, in $$4, dqh $$5) {
      Object2ByteLinkedOpenHashMap<dde.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dde.a $$8;
      if ($$7 != null) {
         $$8 = new dde.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      eui $$11 = $$3.k($$1, $$2);
      eui $$12 = $$5.k($$1, $$4);
      boolean $$13 = !euf.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract elz d();

   public ema a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract elz e();

   public ema a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dad var1);

   protected void a(dae $$0, in $$1, dqh $$2, is $$3, ema $$4) {
      if ($$2.b() instanceof dhv) {
         ((dhv)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dae var1, in var2, dqh var3);

   private static short a(in $$0, in $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dag $$0, in $$1, int $$2, is $$3, dqh $$4, in $$5, Short2ObjectMap<Pair<dqh, ema>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (is $$9 : is.c.a) {
         if ($$9 != $$3) {
            in $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dqh, ema> $$12 = (Pair<dqh, ema>)$$6.computeIfAbsent($$11, $$2x -> {
               dqh $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dqh $$13 = (dqh)$$12.getFirst();
            ema $$14 = (ema)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  in $$4x = $$10.d();
                  dqh $$5x = $$0.a_($$4x);
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

   private boolean a(czj $$0, elz $$1, in $$2, dqh $$3, in $$4, dqh $$5) {
      if (!this.a(is.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(czj $$0, elz $$1, in $$2, dqh $$3, is $$4, in $$5, dqh $$6, ema $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(ema $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dag var1);

   private int a(dag $$0, in $$1) {
      int $$2 = 0;

      for (is $$3 : is.c.a) {
         in $$4 = $$1.a($$3);
         ema $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<is, ema> b(dad $$0, in $$1, dqh $$2) {
      int $$3 = 1000;
      Map<is, ema> $$4 = Maps.newEnumMap(is.class);
      Short2ObjectMap<Pair<dqh, ema>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (is $$7 : is.c.a) {
         in $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dqh, ema> $$10 = (Pair<dqh, ema>)$$5.computeIfAbsent($$9, $$2x -> {
            dqh $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dqh $$11 = (dqh)$$10.getFirst();
         ema $$12 = (ema)$$10.getSecond();
         ema $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            in $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dqh $$5x = $$0.a_($$14);
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

   private boolean a(czj $$0, in $$1, dqh $$2, elz $$3) {
      dde $$4 = $$2.b();
      if ($$4 instanceof dhv $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dfk || $$2.a(avr.ax) || $$2.a(ddg.cO) || $$2.a(ddg.dS) || $$2.a(ddg.nd)) {
         return false;
      } else {
         return !$$2.a(ddg.ed) && !$$2.a(ddg.fx) && !$$2.a(ddg.kF) && !$$2.a(ddg.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(czj $$0, in $$1, dqh $$2, is $$3, in $$4, dqh $$5, ema $$6, elz $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dag var1);

   protected int a(dad $$0, in $$1, ema $$2, ema $$3) {
      return this.a((dag)$$0);
   }

   @Override
   public void b(dad $$0, in $$1, ema $$2) {
      if (!$$2.b()) {
         ema $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, ddg.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dqh $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(ema $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(ema $$0, czj $$1, in $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(ema $$0, czj $$1, in $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ema $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ema var1);

   @Override
   public eui b(ema $$0, czj $$1, in $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? euf.b() : this.g.computeIfAbsent($$0, $$2x -> euf.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
