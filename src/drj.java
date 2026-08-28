import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
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
import org.slf4j.Logger;

public class drj {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int f = 32;
   public static final int d = 11;
   public static final int e = 1024;
   final boolean g;
   private final ayk<dkl> h;
   private final int i;
   private final int j;
   private final int k;
   private final int l;
   private List<drj.a> m = new ArrayList<>();
   private static final Logger n = LogUtils.getLogger();

   public drj(boolean $$0, ayk<dkl> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   public static drj a() {
      return new drj(false, axu.bU, 10, 4, 10, 5);
   }

   public static drj b() {
      return new drj(true, axu.bV, 50, 1, 5, 10);
   }

   public ayk<dkl> c() {
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
   public List<drj.a> i() {
      return this.m;
   }

   public void j() {
      this.m.clear();
   }

   public void a(ux $$0) {
      if ($$0.b("cursors", 9)) {
         this.m.clear();
         List<drj.a> $$1 = (List<drj.a>)drj.a.b.listOf().parse(new Dynamic(vl.a, $$0.c("cursors", 10))).resultOrPartial(n::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(ux $$0) {
      drj.a.b.listOf().encodeStart(vl.a, this.m).resultOrPartial(n::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(jh $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new drj.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(drj.a $$0) {
      if (this.m.size() < 32) {
         this.m.add($$0);
      }
   }

   public void a(dhi $$0, jh $$1, bam $$2, boolean $$3) {
      if (!this.m.isEmpty()) {
         List<drj.a> $$4 = new ArrayList<>();
         Map<jh, drj.a> $$5 = new HashMap<>();
         Object2IntMap<jh> $$6 = new Object2IntOpenHashMap();

         for (drj.a $$7 : this.m) {
            if (!$$7.a($$1)) {
               $$7.a($$0, $$1, $$2, this, $$3);
               if ($$7.e <= 0) {
                  $$0.c(3006, $$7.a(), 0);
               } else {
                  jh $$8 = $$7.a();
                  $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
                  drj.a $$9 = $$5.get($$8);
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
            Entry<jh> $$10 = (Entry<jh>)var16.next();
            jh $$11 = (jh)$$10.getKey();
            int $$12 = $$10.getIntValue();
            drj.a $$13 = $$5.get($$11);
            Collection<jm> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + dpn.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.m = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<kl> c = ae.a(
         new ObjectArrayList(18),
         $$0 -> jh.d(new jh(-1, -1, -1), new jh(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(jh.c))
               .map(jh::j)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private jh d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<jm> h;
      private static final Codec<Set<jm>> i = jm.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, jm.class), Lists::newArrayList);
      public static final Codec<drj.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jh.a.fieldOf("pos").forGetter(drj.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(drj.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(drj.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.lenientOptionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, drj.a::new)
      );

      private a(jh $$0, int $$1, int $$2, int $$3, Optional<Set<jm>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(jh $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public jh a() {
         return this.d;
      }

      boolean a(jh $$0) {
         return this.d.l($$0) > 1024;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<jm> d() {
         return this.h;
      }

      private boolean a(dhi $$0, jh $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof ash $$3 ? $$3.n($$1) : false;
         }
      }

      public void a(dhi $$0, jh $$1, bam $$2, drj $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.g)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dxu $$5 = $$0.a_(this.d);
               dre $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, axf.wn, axg.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  jh $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.j();
                     if ($$3.h() && !this.d.a(new kl($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof dre) {
                     this.h = dpn.o($$5);
                  }

                  this.g = $$6.j_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(drj.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static dre a(dxu $$0) {
         return $$0.b() instanceof dre $$1 ? $$1 : dre.u_;
      }

      private static List<kl> a(bam $$0) {
         return ae.a(c, $$0);
      }

      @Nullable
      private static jh a(dhi $$0, jh $$1, bam $$2) {
         jh.a $$3 = $$1.k();
         jh.a $$4 = $$1.k();

         for (kl $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dxu $$6 = $$0.a_($$4);
            if ($$6.b() instanceof dre && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (drk.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(dhi $$0, jh $$1, jh $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            jh $$3 = $$2.b($$1);
            jm $$4 = jm.a(jm.a.a, $$3.u() < 0 ? jm.b.b : jm.b.a);
            jm $$5 = jm.a(jm.a.b, $$3.v() < 0 ? jm.b.b : jm.b.a);
            jm $$6 = jm.a(jm.a.c, $$3.w() < 0 ? jm.b.b : jm.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(dhi $$0, jh $$1, jm $$2) {
         jh $$3 = $$1.a($$2);
         return !$$0.a_($$3).c($$0, $$3, $$2.g());
      }
   }
}
