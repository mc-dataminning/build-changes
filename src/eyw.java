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

public class eyw implements AutoCloseable {
   private static final auf a = auf.a();
   private static final float b = 32.0F;
   private final gdp c;
   private final agt d;
   private eza e;
   private eza f;
   private final List<eng> g = Lists.newArrayList();
   private final eyu<eza> h = new eyu<>(eza[]::new, eza[][]::new);
   private final eyu<eyw.a> i = new eyu<>(eyw.a[]::new, eyw.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<eyx> k = Lists.newArrayList();

   public eyw(gdp $$0, agt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eng> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = ezc.b.bake(this::a);
      this.f = ezc.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eng $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eng> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eng $$3x : $$0) {
            enf $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != ezc.b) {
                  ((IntList)this.j.computeIfAbsent(aty.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (eng $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (eyx $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(enf $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private eyw.a b(int $$0) {
      enf $$1 = null;

      for (eng $$2 : this.g) {
         enf $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new eyw.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new eyw.a($$1, ezc.b) : eyw.a.c;
   }

   public enf a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private eza c(int $$0) {
      for (eng $$1 : this.g) {
         enf $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public eza a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private eza a(enh $$0) {
      for (eyx $$1 : this.k) {
         eza $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      agt $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      eyy $$5 = $$4 ? eyy.b($$3) : eyy.a($$3);
      eyx $$6 = new eyx($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      eza $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public eza a(enf $$0) {
      IntList $$1 = (IntList)this.j.get(aty.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public eza a() {
      return this.f;
   }

   static record a(enf a, enf b) {
      static final eyw.a c = new eyw.a(ezc.b, ezc.b);

      enf a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
