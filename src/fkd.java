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

public class fkd implements AutoCloseable {
   private static final aym a = aym.a();
   private static final float b = 32.0F;
   private final gpj c;
   private final akk d;
   private fkh e;
   private fkh f;
   private List<eyj.a> g = List.of();
   private List<eyj> h = List.of();
   private final fka<fkh> i = new fka<>(fkh[]::new, fkh[][]::new);
   private final fka<fkd.a> j = new fka<>(fkd.a[]::new, fkd.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fke> l = Lists.newArrayList();

   public fkd(gpj $$0, akk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eyj.a> $$0, Set<fkc> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fkc> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fkj.b.bake(this::a);
      this.f = fkj.a.bake(this::a);
   }

   private List<eyj> b(List<eyj.a> $$0, Set<fkc> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<eyj> $$3 = new ArrayList<>();

      for (eyj.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<eyj> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (eyj $$3x : $$3) {
            eyi $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fkj.b) {
                  ((IntList)this.k.computeIfAbsent(aye.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fke $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(eyi $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fkd.a b(int $$0) {
      eyi $$1 = null;

      for (eyj $$2 : this.h) {
         eyi $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fkd.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fkd.a($$1, fkj.b) : fkd.a.c;
   }

   public eyi a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fkh c(int $$0) {
      for (eyj $$1 : this.h) {
         eyi $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fkh a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fkh a(eyk $$0) {
      for (fke $$1 : this.l) {
         fkh $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akk $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fkf $$5 = $$4 ? fkf.b($$3) : fkf.a($$3);
      fke $$6 = new fke($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fkh $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fkh a(eyi $$0) {
      IntList $$1 = (IntList)this.k.get(aye.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akk a() {
      return this.d;
   }

   public fkh b() {
      return this.f;
   }

   static record a(eyi a, eyi b) {
      static final fkd.a c = new fkd.a(fkj.b, fkj.b);

      eyi a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
