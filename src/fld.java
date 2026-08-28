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

public class fld implements AutoCloseable {
   private static final ayw a = ayw.a();
   private static final float b = 32.0F;
   private final gqm c;
   private final akr d;
   private flh e;
   private flh f;
   private List<ezm.a> g = List.of();
   private List<ezm> h = List.of();
   private final fla<flh> i = new fla<>(flh[]::new, flh[][]::new);
   private final fla<fld.a> j = new fla<>(fld.a[]::new, fld.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fle> l = Lists.newArrayList();

   public fld(gqm $$0, akr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ezm.a> $$0, Set<flc> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<flc> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = flj.b.bake(this::a);
      this.f = flj.a.bake(this::a);
   }

   private List<ezm> b(List<ezm.a> $$0, Set<flc> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ezm> $$3 = new ArrayList<>();

      for (ezm.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ezm> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ezm $$3x : $$3) {
            ezl $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != flj.b) {
                  ((IntList)this.k.computeIfAbsent(ayo.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fle $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(ezl $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fld.a b(int $$0) {
      ezl $$1 = null;

      for (ezm $$2 : this.h) {
         ezl $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fld.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fld.a($$1, flj.b) : fld.a.c;
   }

   public ezl a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private flh c(int $$0) {
      for (ezm $$1 : this.h) {
         ezl $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public flh a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private flh a(ezn $$0) {
      for (fle $$1 : this.l) {
         flh $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akr $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      flf $$5 = $$4 ? flf.b($$3) : flf.a($$3);
      fle $$6 = new fle($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      flh $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public flh a(ezl $$0) {
      IntList $$1 = (IntList)this.k.get(ayo.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akr a() {
      return this.d;
   }

   public flh b() {
      return this.f;
   }

   static record a(ezl a, ezl b) {
      static final fld.a c = new fld.a(flj.b, flj.b);

      ezl a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
