import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class duf {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int f = 32;
   public static final int d = 11;
   public static final int e = 1024;
   final boolean g;
   private final axt<dnc> h;
   private final int i;
   private final int j;
   private final int k;
   private final int l;
   private List<duf.a> m = new ArrayList<>();

   public duf(boolean $$0, axt<dnc> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   public static duf a() {
      return new duf(false, axe.bW, 10, 4, 10, 5);
   }

   public static duf b() {
      return new duf(true, axe.bX, 50, 1, 5, 10);
   }

   public axt<dnc> c() {
      return this.h;
   }

   public int d() {
      return this.i;
   }

   public int e() {
      return this.j;
   }

   public int f() {
      return this.k;
   }

   public int g() {
      return this.l;
   }

   public boolean h() {
      return this.g;
   }

   @VisibleForTesting
   public List<duf.a> i() {
      return this.m;
   }

   public void j() {
      this.m.clear();
   }

   public void a(tz $$0) {
      this.m.clear();
      $$0.<List>a("cursors", duf.a.b.sizeLimitedListOf(32)).orElse(List.of()).forEach(this::a);
   }

   public void b(tz $$0) {
      $$0.a("cursors", duf.a.b.listOf(), this.m);
   }

   public void a(iv $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new duf.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(duf.a $$0) {
      if (this.m.size() < 32) {
         this.m.add($$0);
      }
   }

   public void a(djy $$0, iv $$1, azx $$2, boolean $$3) {
      if (!this.m.isEmpty()) {
         List<duf.a> $$4 = new ArrayList<>();
         Map<iv, duf.a> $$5 = new HashMap<>();
         Object2IntMap<iv> $$6 = new Object2IntOpenHashMap();

         for (duf.a $$7 : this.m) {
            if (!$$7.a($$1)) {
               $$7.a($$0, $$1, $$2, this, $$3);
               if ($$7.e <= 0) {
                  $$0.c(3006, $$7.a(), 0);
               } else {
                  iv $$8 = $$7.a();
                  $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
                  duf.a $$9 = $$5.get($$8);
                  if ($$9 == null) {
                     $$5.put($$8, $$7);
                     $$4.add($$7);
                  } else if (!this.h() && $$7.e + $$9.e <= 1000) {
                     $$9.a($$7);
                  } else {
                     $$4.add($$7);
                     if ($$7.e < $$9.e) {
                        $$5.put($$8, $$7);
                     }
                  }
               }
            }
         }

         ObjectIterator var16 = $$6.object2IntEntrySet().iterator();

         while (var16.hasNext()) {
            Entry<iv> $$10 = (Entry<iv>)var16.next();
            iv $$11 = (iv)$$10.getKey();
            int $$12 = $$10.getIntValue();
            duf.a $$13 = $$5.get($$11);
            Collection<jb> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + dsi.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.m = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<ka> c = ag.a(
         new ObjectArrayList(18),
         $$0 -> iv.d(new iv(-1, -1, -1), new iv(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(iv.c))
               .map(iv::j)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private iv d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<jb> h;
      private static final Codec<Set<jb>> i = jb.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, jb.class), Lists::newArrayList);
      public static final Codec<duf.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a.fieldOf("pos").forGetter(duf.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(duf.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(duf.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.lenientOptionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, duf.a::new)
      );

      private a(iv $$0, int $$1, int $$2, int $$3, Optional<Set<jb>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(iv $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public iv a() {
         return this.d;
      }

      boolean a(iv $$0) {
         return this.d.l($$0) > 1024;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<jb> d() {
         return this.h;
      }

      private boolean a(djy $$0, iv $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof ars $$3 ? $$3.n($$1) : false;
         }
      }

      public void a(djy $$0, iv $$1, azx $$2, duf $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.g)) {
            if (this.f > 0) {
               this.f--;
            } else {
               ebe $$5 = $$0.a_(this.d);
               dua $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, awp.wJ, awq.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  iv $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.j();
                     if ($$3.h() && !this.d.a(new ka($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof dua) {
                     this.h = dsi.o($$5);
                  }

                  this.g = $$6.j_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(duf.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static dua a(ebe $$0) {
         return $$0.b() instanceof dua $$1 ? $$1 : dua.s_;
      }

      private static List<ka> a(azx $$0) {
         return ag.a(c, $$0);
      }

      @Nullable
      private static iv a(djy $$0, iv $$1, azx $$2) {
         iv.a $$3 = $$1.k();
         iv.a $$4 = $$1.k();

         for (ka $$5 : a($$2)) {
            $$4.a($$1, $$5);
            ebe $$6 = $$0.a_($$4);
            if ($$6.b() instanceof dua && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (dug.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(djy $$0, iv $$1, iv $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            iv $$3 = $$2.b($$1);
            jb $$4 = jb.a(jb.a.a, $$3.u() < 0 ? jb.b.b : jb.b.a);
            jb $$5 = jb.a(jb.a.b, $$3.v() < 0 ? jb.b.b : jb.b.a);
            jb $$6 = jb.a(jb.a.c, $$3.w() < 0 ? jb.b.b : jb.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(djy $$0, iv $$1, jb $$2) {
         iv $$3 = $$1.a($$2);
         return !$$0.a_($$3).c($$0, $$3, $$2.g());
      }
   }
}
