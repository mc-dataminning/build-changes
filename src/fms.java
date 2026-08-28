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

public class fms implements AutoCloseable {
   private static final azk a = azk.a();
   private static final float b = 32.0F;
   private final gwl c;
   private final alb d;
   private fmw e;
   private fmw f;
   private List<fao.a> g = List.of();
   private List<fao> h = List.of();
   private final fmp<fmw> i = new fmp<>(fmw[]::new, fmw[][]::new);
   private final fmp<fms.a> j = new fmp<>(fms.a[]::new, fms.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fmt> l = Lists.newArrayList();

   public fms(gwl $$0, alb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fao.a> $$0, Set<fmr> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fmr> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fmy.b.bake(this::a);
      this.f = fmy.a.bake(this::a);
   }

   private List<fao> b(List<fao.a> $$0, Set<fmr> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fao> $$3 = new ArrayList<>();

      for (fao.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fao> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fao $$3x : $$3) {
            fan $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fmy.b) {
                  ((IntList)this.k.computeIfAbsent(azc.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fmt $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fan $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fms.a b(int $$0) {
      fan $$1 = null;

      for (fao $$2 : this.h) {
         fan $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fms.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fms.a($$1, fmy.b) : fms.a.c;
   }

   public fan a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fmw c(int $$0) {
      for (fao $$1 : this.h) {
         fan $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fmw a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fmw a(fap $$0) {
      for (fmt $$1 : this.l) {
         fmw $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alb $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fmu $$5 = $$4 ? fmu.b($$3) : fmu.a($$3);
      fmt $$6 = new fmt($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fmw $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fmw a(fan $$0) {
      IntList $$1 = (IntList)this.k.get(azc.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alb a() {
      return this.d;
   }

   public fmw b() {
      return this.f;
   }

   static record a(fan a, fan b) {
      static final fms.a c = new fms.a(fmy.b, fmy.b);

      fan a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
