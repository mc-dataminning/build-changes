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

public class ezt implements AutoCloseable {
   private static final auu a = auu.a();
   private static final float b = 32.0F;
   private final gem c;
   private final ahg d;
   private ezx e;
   private ezx f;
   private final List<eoc> g = Lists.newArrayList();
   private final ezr<ezx> h = new ezr<>(ezx[]::new, ezx[][]::new);
   private final ezr<ezt.a> i = new ezr<>(ezt.a[]::new, ezt.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<ezu> k = Lists.newArrayList();

   public ezt(gem $$0, ahg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eoc> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = ezz.b.bake(this::a);
      this.f = ezz.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eoc $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eoc> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eoc $$3x : $$0) {
            eob $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != ezz.b) {
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
      for (eoc $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (ezu $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(eob $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private ezt.a b(int $$0) {
      eob $$1 = null;

      for (eoc $$2 : this.g) {
         eob $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new ezt.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new ezt.a($$1, ezz.b) : ezt.a.c;
   }

   public eob a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private ezx c(int $$0) {
      for (eoc $$1 : this.g) {
         eob $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public ezx a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private ezx a(eod $$0) {
      for (ezu $$1 : this.k) {
         ezx $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ahg $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      ezv $$5 = $$4 ? ezv.b($$3) : ezv.a($$3);
      ezu $$6 = new ezu($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      ezx $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public ezx a(eob $$0) {
      IntList $$1 = (IntList)this.j.get(aun.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ezx a() {
      return this.f;
   }

   static record a(eob a, eob b) {
      static final ezt.a c = new ezt.a(ezz.b, ezz.b);

      eob a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
