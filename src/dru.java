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

public class dru {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int f = 32;
   public static final int d = 11;
   public static final int e = 1024;
   final boolean g;
   private final axp<dku> h;
   private final int i;
   private final int j;
   private final int k;
   private final int l;
   private List<dru.a> m = new ArrayList<>();
   private static final Logger n = LogUtils.getLogger();

   public dru(boolean $$0, axp<dku> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   public static dru a() {
      return new dru(false, awz.bV, 10, 4, 10, 5);
   }

   public static dru b() {
      return new dru(true, awz.bW, 50, 1, 5, 10);
   }

   public axp<dku> c() {
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
   public List<dru.a> i() {
      return this.m;
   }

   public void j() {
      this.m.clear();
   }

   public void a(tw $$0) {
      if ($$0.b("cursors", 9)) {
         this.m.clear();
         List<dru.a> $$1 = (List<dru.a>)dru.a.b.listOf().parse(new Dynamic(uk.a, $$0.c("cursors", 10))).resultOrPartial(n::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(tw $$0) {
      dru.a.b.listOf().encodeStart(uk.a, this.m).resultOrPartial(n::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(jj $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new dru.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(dru.a $$0) {
      if (this.m.size() < 32) {
         this.m.add($$0);
      }
   }

   public void a(dhq $$0, jj $$1, azs $$2, boolean $$3) {
      if (!this.m.isEmpty()) {
         List<dru.a> $$4 = new ArrayList<>();
         Map<jj, dru.a> $$5 = new HashMap<>();
         Object2IntMap<jj> $$6 = new Object2IntOpenHashMap();

         for (dru.a $$7 : this.m) {
            if (!$$7.a($$1)) {
               $$7.a($$0, $$1, $$2, this, $$3);
               if ($$7.e <= 0) {
                  $$0.c(3006, $$7.a(), 0);
               } else {
                  jj $$8 = $$7.a();
                  $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
                  dru.a $$9 = $$5.get($$8);
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
            Entry<jj> $$10 = (Entry<jj>)var16.next();
            jj $$11 = (jj)$$10.getKey();
            int $$12 = $$10.getIntValue();
            dru.a $$13 = $$5.get($$11);
            Collection<jo> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + dpy.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.m = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<kn> c = af.a(
         new ObjectArrayList(18),
         $$0 -> jj.d(new jj(-1, -1, -1), new jj(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(jj.c))
               .map(jj::j)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private jj d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<jo> h;
      private static final Codec<Set<jo>> i = jo.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, jo.class), Lists::newArrayList);
      public static final Codec<dru.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jj.a.fieldOf("pos").forGetter(dru.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(dru.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(dru.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.lenientOptionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, dru.a::new)
      );

      private a(jj $$0, int $$1, int $$2, int $$3, Optional<Set<jo>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(jj $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public jj a() {
         return this.d;
      }

      boolean a(jj $$0) {
         return this.d.l($$0) > 1024;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<jo> d() {
         return this.h;
      }

      private boolean a(dhq $$0, jj $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof arn $$3 ? $$3.n($$1) : false;
         }
      }

      public void a(dhq $$0, jj $$1, azs $$2, dru $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.g)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dym $$5 = $$0.a_(this.d);
               drp $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, awk.wD, awl.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  jj $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.j();
                     if ($$3.h() && !this.d.a(new kn($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof drp) {
                     this.h = dpy.o($$5);
                  }

                  this.g = $$6.j_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(dru.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static drp a(dym $$0) {
         return $$0.b() instanceof drp $$1 ? $$1 : drp.u_;
      }

      private static List<kn> a(azs $$0) {
         return af.a(c, $$0);
      }

      @Nullable
      private static jj a(dhq $$0, jj $$1, azs $$2) {
         jj.a $$3 = $$1.k();
         jj.a $$4 = $$1.k();

         for (kn $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dym $$6 = $$0.a_($$4);
            if ($$6.b() instanceof drp && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (drv.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(dhq $$0, jj $$1, jj $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            jj $$3 = $$2.b($$1);
            jo $$4 = jo.a(jo.a.a, $$3.u() < 0 ? jo.b.b : jo.b.a);
            jo $$5 = jo.a(jo.a.b, $$3.v() < 0 ? jo.b.b : jo.b.a);
            jo $$6 = jo.a(jo.a.c, $$3.w() < 0 ? jo.b.b : jo.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(dhq $$0, jj $$1, jo $$2) {
         jj $$3 = $$1.a($$2);
         return !$$0.a_($$3).c($$0, $$3, $$2.g());
      }
   }
}
