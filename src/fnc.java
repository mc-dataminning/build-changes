import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class fnc implements AutoCloseable {
   private static final azl a = azl.a();
   private static final float b = 32.0F;
   private final gxc c;
   private final alc d;
   private fng e;
   private fng f;
   private List<fbd.a> g = List.of();
   private List<fbd> h = List.of();
   private final fmz<fng> i = new fmz<>(fng[]::new, fng[][]::new);
   private final fmz<fnc.a> j = new fmz<>(fnc.a[]::new, fnc.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fnd> l = Lists.newArrayList();

   public fnc(gxc $$0, alc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fbd.a> $$0, Set<fnb> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fnb> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fni.b.bake(this::a);
      this.f = fni.a.bake(this::a);
   }

   private List<fbd> b(List<fbd.a> $$0, Set<fnb> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fbd> $$3 = new ArrayList<>();

      for (fbd.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fbd> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fbd $$3x : $$3) {
            fbc $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fni.b) {
                  ((IntList)this.k.computeIfAbsent(azd.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.d();
   }

   private void d() {
      for (fnd $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fbc $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fnc.a b(int $$0) {
      fbc $$1 = null;

      for (fbd $$2 : this.h) {
         fbc $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fnc.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fnc.a($$1, fni.b) : fnc.a.c;
   }

   public fbc a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fng c(int $$0) {
      for (fbd $$1 : this.h) {
         fbc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fng a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fng a(fbe $$0) {
      for (fnd $$1 : this.l) {
         fng $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alc $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fne $$5 = $$4 ? fne.b($$3) : fne.a($$3);
      fnd $$6 = new fnd($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fng $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fng a(fbc $$0) {
      IntList $$1 = (IntList)this.k.get(azd.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alc a() {
      return this.d;
   }

   public fng b() {
      return this.f;
   }

   static record a(fbc a, fbc b) {
      static final fnc.a c = new fnc.a(fni.b, fni.b);

      fbc a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
