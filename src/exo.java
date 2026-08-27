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

public class exo implements AutoCloseable {
   private static final ats a = ats.a();
   private static final float b = 32.0F;
   private final gbv c;
   private final agi d;
   private exs e;
   private exs f;
   private final List<elz> g = Lists.newArrayList();
   private final exm<exs> h = new exm<>(exs[]::new, exs[][]::new);
   private final exm<exo.a> i = new exm<>(exo.a[]::new, exo.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<exp> k = Lists.newArrayList();

   public exo(gbv $$0, agi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<elz> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = exu.b.bake(this::a);
      this.f = exu.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (elz $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<elz> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (elz $$3x : $$0) {
            ely $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != exu.b) {
                  ((IntList)this.j.computeIfAbsent(atm.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (elz $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (exp $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(ely $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private exo.a b(int $$0) {
      ely $$1 = null;

      for (elz $$2 : this.g) {
         ely $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new exo.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new exo.a($$1, exu.b) : exo.a.c;
   }

   public ely a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private exs c(int $$0) {
      for (elz $$1 : this.g) {
         ely $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public exs a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private exs a(ema $$0) {
      for (exp $$1 : this.k) {
         exs $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      agi $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      exq $$5 = $$4 ? exq.b($$3) : exq.a($$3);
      exp $$6 = new exp($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      exs $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public exs a(ely $$0) {
      IntList $$1 = (IntList)this.j.get(atm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public exs a() {
      return this.f;
   }

   static record a(ely a, ely b) {
      static final exo.a c = new exo.a(exu.b, exu.b);

      ely a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
