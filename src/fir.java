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

public class fir implements AutoCloseable {
   private static final aym a = aym.a();
   private static final float b = 32.0F;
   private final gnw c;
   private final akn d;
   private fiv e;
   private fiv f;
   private List<ewx.a> g = List.of();
   private List<ewx> h = List.of();
   private final fio<fiv> i = new fio<>(fiv[]::new, fiv[][]::new);
   private final fio<fir.a> j = new fio<>(fir.a[]::new, fir.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fis> l = Lists.newArrayList();

   public fir(gnw $$0, akn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ewx.a> $$0, Set<fiq> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fiq> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fix.b.bake(this::a);
      this.f = fix.a.bake(this::a);
   }

   private List<ewx> b(List<ewx.a> $$0, Set<fiq> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ewx> $$3 = new ArrayList<>();

      for (ewx.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ewx> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ewx $$3x : $$3) {
            eww $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fix.b) {
                  ((IntList)this.k.computeIfAbsent(ayf.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fis $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(eww $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fir.a b(int $$0) {
      eww $$1 = null;

      for (ewx $$2 : this.h) {
         eww $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fir.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fir.a($$1, fix.b) : fir.a.c;
   }

   public eww a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fiv c(int $$0) {
      for (ewx $$1 : this.h) {
         eww $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fiv a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fiv a(ewy $$0) {
      for (fis $$1 : this.l) {
         fiv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akn $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fit $$5 = $$4 ? fit.b($$3) : fit.a($$3);
      fis $$6 = new fis($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fiv $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fiv a(eww $$0) {
      IntList $$1 = (IntList)this.k.get(ayf.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akn a() {
      return this.d;
   }

   public fiv b() {
      return this.f;
   }

   static record a(eww a, eww b) {
      static final fir.a c = new fir.a(fix.b, fix.b);

      eww a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
