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

public class fkx implements AutoCloseable {
   private static final ayv a = ayv.a();
   private static final float b = 32.0F;
   private final gqg c;
   private final akq d;
   private flb e;
   private flb f;
   private List<ezg.a> g = List.of();
   private List<ezg> h = List.of();
   private final fku<flb> i = new fku<>(flb[]::new, flb[][]::new);
   private final fku<fkx.a> j = new fku<>(fkx.a[]::new, fkx.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fky> l = Lists.newArrayList();

   public fkx(gqg $$0, akq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ezg.a> $$0, Set<fkw> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fkw> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fld.b.bake(this::a);
      this.f = fld.a.bake(this::a);
   }

   private List<ezg> b(List<ezg.a> $$0, Set<fkw> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ezg> $$3 = new ArrayList<>();

      for (ezg.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ezg> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ezg $$3x : $$3) {
            ezf $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fld.b) {
                  ((IntList)this.k.computeIfAbsent(ayn.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fky $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(ezf $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fkx.a b(int $$0) {
      ezf $$1 = null;

      for (ezg $$2 : this.h) {
         ezf $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fkx.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fkx.a($$1, fld.b) : fkx.a.c;
   }

   public ezf a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private flb c(int $$0) {
      for (ezg $$1 : this.h) {
         ezf $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public flb a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private flb a(ezh $$0) {
      for (fky $$1 : this.l) {
         flb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akq $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fkz $$5 = $$4 ? fkz.b($$3) : fkz.a($$3);
      fky $$6 = new fky($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      flb $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public flb a(ezf $$0) {
      IntList $$1 = (IntList)this.k.get(ayn.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akq a() {
      return this.d;
   }

   public flb b() {
      return this.f;
   }

   static record a(ezf a, ezf b) {
      static final fkx.a c = new fkx.a(fld.b, fld.b);

      ezf a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
