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
import java.util.function.IntFunction;

public class fqw implements AutoCloseable {
   private static final bam a = bam.a();
   private static final float b = 32.0F;
   private final hbk c;
   private final alz d;
   private fra e;
   private fra f;
   private List<fep.a> g = List.of();
   private List<fep> h = List.of();
   private final fqt<fra> i = new fqt<>(fra[]::new, fra[][]::new);
   private final fqt<fqw.a> j = new fqt<>(fqw.a[]::new, fqw.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fqx> l = Lists.newArrayList();
   private final IntFunction<fqw.a> m = this::b;
   private final IntFunction<fra> n = this::c;

   public fqw(hbk $$0, alz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fep.a> $$0, Set<fqv> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fqv> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = frc.b.bake(this::a);
      this.f = frc.a.bake(this::a);
   }

   private List<fep> b(List<fep.a> $$0, Set<fqv> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fep> $$3 = new ArrayList<>();

      for (fep.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fep> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fep $$3x : $$3) {
            feo $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != frc.b) {
                  ((IntList)this.k.computeIfAbsent(bae.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fqx $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(feo $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fqw.a b(int $$0) {
      feo $$1 = null;

      for (fep $$2 : this.h) {
         feo $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fqw.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fqw.a($$1, frc.b) : fqw.a.c;
   }

   public feo a(int $$0, boolean $$1) {
      return this.j.a($$0, this.m).a($$1);
   }

   private fra c(int $$0) {
      for (fep $$1 : this.h) {
         feo $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fra a(int $$0) {
      return this.i.a($$0, this.n);
   }

   private fra a(feq $$0) {
      for (fqx $$1 : this.l) {
         fra $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alz $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fqy $$5 = $$4 ? fqy.b($$3) : fqy.a($$3);
      fqx $$6 = new fqx($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fra $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fra a(feo $$0) {
      IntList $$1 = (IntList)this.k.get(bae.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alz a() {
      return this.d;
   }

   public fra b() {
      return this.f;
   }

   static record a(feo a, feo b) {
      static final fqw.a c = new fqw.a(frc.b, frc.b);

      feo a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
