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

public class euu implements AutoCloseable {
   private static final aru a = aru.a();
   private static final float b = 32.0F;
   private final fym c;
   private final aer d;
   private euy e;
   private euy f;
   private final List<ejj> g = Lists.newArrayList();
   private final eus<euy> h = new eus<>(euy[]::new, euy[][]::new);
   private final eus<euu.a> i = new eus<>(euu.a[]::new, euu.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<euv> k = Lists.newArrayList();

   public euu(fym $$0, aer $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ejj> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = eva.b.bake(this::a);
      this.f = eva.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (ejj $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<ejj> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (ejj $$3x : $$0) {
            eji $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != eva.b) {
                  ((IntList)this.j.computeIfAbsent(arp.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (ejj $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (euv $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(eji $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private euu.a b(int $$0) {
      eji $$1 = null;

      for (ejj $$2 : this.g) {
         eji $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new euu.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new euu.a($$1, eva.b) : euu.a.c;
   }

   public eji a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private euy c(int $$0) {
      for (ejj $$1 : this.g) {
         eji $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public euy a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private euy a(ejk $$0) {
      for (euv $$1 : this.k) {
         euy $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aer $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      euw $$5 = $$4 ? euw.b($$3) : euw.a($$3);
      euv $$6 = new euv($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      euy $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public euy a(eji $$0) {
      IntList $$1 = (IntList)this.j.get(arp.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public euy a() {
      return this.f;
   }

   static record a(eji a, eji b) {
      static final euu.a c = new euu.a(eva.b, eva.b);

      eji a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
