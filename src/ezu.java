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

public class ezu implements AutoCloseable {
   private static final auu a = auu.a();
   private static final float b = 32.0F;
   private final gen c;
   private final ahg d;
   private ezy e;
   private ezy f;
   private final List<eod> g = Lists.newArrayList();
   private final ezs<ezy> h = new ezs<>(ezy[]::new, ezy[][]::new);
   private final ezs<ezu.a> i = new ezs<>(ezu.a[]::new, ezu.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<ezv> k = Lists.newArrayList();

   public ezu(gen $$0, ahg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eod> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = faa.b.bake(this::a);
      this.f = faa.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eod $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eod> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eod $$3x : $$0) {
            eoc $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != faa.b) {
                  ((IntList)this.j.computeIfAbsent(aun.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (eod $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (ezv $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(eoc $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private ezu.a b(int $$0) {
      eoc $$1 = null;

      for (eod $$2 : this.g) {
         eoc $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new ezu.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new ezu.a($$1, faa.b) : ezu.a.c;
   }

   public eoc a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private ezy c(int $$0) {
      for (eod $$1 : this.g) {
         eoc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public ezy a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private ezy a(eoe $$0) {
      for (ezv $$1 : this.k) {
         ezy $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ahg $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      ezw $$5 = $$4 ? ezw.b($$3) : ezw.a($$3);
      ezv $$6 = new ezv($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      ezy $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public ezy a(eoc $$0) {
      IntList $$1 = (IntList)this.j.get(aun.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ezy a() {
      return this.f;
   }

   static record a(eoc a, eoc b) {
      static final ezu.a c = new ezu.a(faa.b, faa.b);

      eoc a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
