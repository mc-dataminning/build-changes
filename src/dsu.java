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

public class dsu {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int f = 32;
   public static final int d = 11;
   public static final int e = 1024;
   final boolean g;
   private final axp<dlu> h;
   private final int i;
   private final int j;
   private final int k;
   private final int l;
   private List<dsu.a> m = new ArrayList<>();
   private static final Logger n = LogUtils.getLogger();

   public dsu(boolean $$0, axp<dlu> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   public static dsu a() {
      return new dsu(false, axa.bV, 10, 4, 10, 5);
   }

   public static dsu b() {
      return new dsu(true, axa.bW, 50, 1, 5, 10);
   }

   public axp<dlu> c() {
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
   public List<dsu.a> i() {
      return this.m;
   }

   public void j() {
      this.m.clear();
   }

   public void a(tx $$0) {
      if ($$0.b("cursors", 9)) {
         this.m.clear();
         List<dsu.a> $$1 = (List<dsu.a>)dsu.a.b.listOf().parse(new Dynamic(ul.a, $$0.c("cursors", 10))).resultOrPartial(n::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(tx $$0) {
      dsu.a.b.listOf().encodeStart(ul.a, this.m).resultOrPartial(n::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(iu $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new dsu.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(dsu.a $$0) {
      if (this.m.size() < 32) {
         this.m.add($$0);
      }
   }

   public void a(diq $$0, iu $$1, azt $$2, boolean $$3) {
      if (!this.m.isEmpty()) {
         List<dsu.a> $$4 = new ArrayList<>();
         Map<iu, dsu.a> $$5 = new HashMap<>();
         Object2IntMap<iu> $$6 = new Object2IntOpenHashMap();

         for (dsu.a $$7 : this.m) {
            if (!$$7.a($$1)) {
               $$7.a($$0, $$1, $$2, this, $$3);
               if ($$7.e <= 0) {
                  $$0.c(3006, $$7.a(), 0);
               } else {
                  iu $$8 = $$7.a();
                  $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
                  dsu.a $$9 = $$5.get($$8);
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
            Entry<iu> $$10 = (Entry<iu>)var16.next();
            iu $$11 = (iu)$$10.getKey();
            int $$12 = $$10.getIntValue();
            dsu.a $$13 = $$5.get($$11);
            Collection<ja> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + dqy.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.m = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<jz> c = af.a(
         new ObjectArrayList(18),
         $$0 -> iu.d(new iu(-1, -1, -1), new iu(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(iu.c))
               .map(iu::j)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private iu d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<ja> h;
      private static final Codec<Set<ja>> i = ja.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, ja.class), Lists::newArrayList);
      public static final Codec<dsu.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iu.a.fieldOf("pos").forGetter(dsu.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(dsu.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(dsu.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.lenientOptionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, dsu.a::new)
      );

      private a(iu $$0, int $$1, int $$2, int $$3, Optional<Set<ja>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(iu $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public iu a() {
         return this.d;
      }

      boolean a(iu $$0) {
         return this.d.l($$0) > 1024;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<ja> d() {
         return this.h;
      }

      private boolean a(diq $$0, iu $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof aro $$3 ? $$3.n($$1) : false;
         }
      }

      public void a(diq $$0, iu $$1, azt $$2, dsu $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.g)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dzo $$5 = $$0.a_(this.d);
               dsp $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, awl.wD, awm.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  iu $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.j();
                     if ($$3.h() && !this.d.a(new jz($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof dsp) {
                     this.h = dqy.o($$5);
                  }

                  this.g = $$6.j_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(dsu.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static dsp a(dzo $$0) {
         return $$0.b() instanceof dsp $$1 ? $$1 : dsp.u_;
      }

      private static List<jz> a(azt $$0) {
         return af.a(c, $$0);
      }

      @Nullable
      private static iu a(diq $$0, iu $$1, azt $$2) {
         iu.a $$3 = $$1.k();
         iu.a $$4 = $$1.k();

         for (jz $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dzo $$6 = $$0.a_($$4);
            if ($$6.b() instanceof dsp && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (dsv.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(diq $$0, iu $$1, iu $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            iu $$3 = $$2.b($$1);
            ja $$4 = ja.a(ja.a.a, $$3.u() < 0 ? ja.b.b : ja.b.a);
            ja $$5 = ja.a(ja.a.b, $$3.v() < 0 ? ja.b.b : ja.b.a);
            ja $$6 = ja.a(ja.a.c, $$3.w() < 0 ? ja.b.b : ja.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(diq $$0, iu $$1, ja $$2) {
         iu $$3 = $$1.a($$2);
         return !$$0.a_($$3).c($$0, $$3, $$2.g());
      }
   }
}
