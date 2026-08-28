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

public class flb implements AutoCloseable {
   private static final ayw a = ayw.a();
   private static final float b = 32.0F;
   private final gqk c;
   private final akr d;
   private flf e;
   private flf f;
   private List<ezk.a> g = List.of();
   private List<ezk> h = List.of();
   private final fky<flf> i = new fky<>(flf[]::new, flf[][]::new);
   private final fky<flb.a> j = new fky<>(flb.a[]::new, flb.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<flc> l = Lists.newArrayList();

   public flb(gqk $$0, akr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ezk.a> $$0, Set<fla> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fla> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = flh.b.bake(this::a);
      this.f = flh.a.bake(this::a);
   }

   private List<ezk> b(List<ezk.a> $$0, Set<fla> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ezk> $$3 = new ArrayList<>();

      for (ezk.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ezk> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ezk $$3x : $$3) {
            ezj $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != flh.b) {
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
      for (flc $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(ezj $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private flb.a b(int $$0) {
      ezj $$1 = null;

      for (ezk $$2 : this.h) {
         ezj $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new flb.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new flb.a($$1, flh.b) : flb.a.c;
   }

   public ezj a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private flf c(int $$0) {
      for (ezk $$1 : this.h) {
         ezj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public flf a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private flf a(ezl $$0) {
      for (flc $$1 : this.l) {
         flf $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akr $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fld $$5 = $$4 ? fld.b($$3) : fld.a($$3);
      flc $$6 = new flc($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      flf $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public flf a(ezj $$0) {
      IntList $$1 = (IntList)this.k.get(ayo.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akr a() {
      return this.d;
   }

   public flf b() {
      return this.f;
   }

   static record a(ezj a, ezj b) {
      static final flb.a c = new flb.a(flh.b, flh.b);

      ezj a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
