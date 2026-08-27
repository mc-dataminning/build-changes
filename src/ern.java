import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Set;

public class ern implements AutoCloseable {
   private static final apf a = apf.a();
   private static final float b = 32.0F;
   private final fuw c;
   private final acq d;
   private err e;
   private err f;
   private final List<egm> g = Lists.newArrayList();
   private final erl<err> h = new erl<>(err[]::new, err[][]::new);
   private final erl<ern.a> i = new erl<>(ern.a[]::new, ern.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<ero> k = Lists.newArrayList();

   public ern(fuw $$0, acq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<egm> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = ert.b.bake(this::a);
      this.f = ert.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (egm $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<egm> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (egm $$3x : $$0) {
            egl $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != ert.b) {
                  ((IntList)this.j.computeIfAbsent(apa.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      $$0.stream().filter($$3::contains).forEach(this.g::add);
   }

   @Override
   public void close() {
      this.b();
      this.c();
   }

   private void b() {
      for (egm $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (ero $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(egl $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private ern.a b(int $$0) {
      egl $$1 = null;

      for (egm $$2 : this.g) {
         egl $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new ern.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new ern.a($$1, ert.b) : ern.a.c;
   }

   public egl a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private err c(int $$0) {
      for (egm $$1 : this.g) {
         egl $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public err a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private err a(egn $$0) {
      for (ero $$1 : this.k) {
         err $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      acq $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      erp $$5 = $$4 ? erp.b($$3) : erp.a($$3);
      ero $$6 = new ero($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      err $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public err a(egl $$0) {
      IntList $$1 = (IntList)this.j.get(apa.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public err a() {
      return this.f;
   }

   static record a(egl a, egl b) {
      static final ern.a c = new ern.a(ert.b, ert.b);

      egl a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
