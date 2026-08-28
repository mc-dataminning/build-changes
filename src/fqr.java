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
import java.util.function.IntFunction;

public class fqr implements AutoCloseable {
   private static final bam a = bam.a();
   private static final float b = 32.0F;
   private final hbf c;
   private final alz d;
   private fqv e;
   private fqv f;
   private List<fek.a> g = List.of();
   private List<fek> h = List.of();
   private final fqo<fqv> i = new fqo<>(fqv[]::new, fqv[][]::new);
   private final fqo<fqr.a> j = new fqo<>(fqr.a[]::new, fqr.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fqs> l = Lists.newArrayList();
   private final IntFunction<fqr.a> m = this::b;
   private final IntFunction<fqv> n = this::c;

   public fqr(hbf $$0, alz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fek.a> $$0, Set<fqq> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fqq> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fqx.b.bake(this::a);
      this.f = fqx.a.bake(this::a);
   }

   private List<fek> b(List<fek.a> $$0, Set<fqq> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fek> $$3 = new ArrayList<>();

      for (fek.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fek> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fek $$3x : $$3) {
            fej $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fqx.b) {
                  ((IntList)this.k.computeIfAbsent(bae.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fqs $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fej $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fqr.a b(int $$0) {
      fej $$1 = null;

      for (fek $$2 : this.h) {
         fej $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fqr.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fqr.a($$1, fqx.b) : fqr.a.c;
   }

   public fej a(int $$0, boolean $$1) {
      return this.j.a($$0, this.m).a($$1);
   }

   private fqv c(int $$0) {
      for (fek $$1 : this.h) {
         fej $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fqv a(int $$0) {
      return this.i.a($$0, this.n);
   }

   private fqv a(fel $$0) {
      for (fqs $$1 : this.l) {
         fqv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alz $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fqt $$5 = $$4 ? fqt.b($$3) : fqt.a($$3);
      fqs $$6 = new fqs($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fqv $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fqv a(fej $$0) {
      IntList $$1 = (IntList)this.k.get(bae.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alz a() {
      return this.d;
   }

   public fqv b() {
      return this.f;
   }

   static record a(fej a, fej b) {
      static final fqr.a c = new fqr.a(fqx.b, fqx.b);

      fej a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
