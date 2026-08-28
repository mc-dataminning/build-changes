import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
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
import org.slf4j.Logger;

public class fqr implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final bac b = bac.a();
   private static final float c = 32.0F;
   private final hbh d;
   private final alp e;
   private fqv f;
   private fqv g;
   private List<fek.a> h = List.of();
   private List<fek> i = List.of();
   private final fqo<fqv> j = new fqo<>(fqv[]::new, fqv[][]::new);
   private final fqo<fqr.a> k = new fqo<>(fqr.a[]::new, fqr.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fqs> m = Lists.newArrayList();
   private final IntFunction<fqr.a> n = this::b;
   private final IntFunction<fqv> o = this::c;

   public fqr(hbh $$0, alp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fek.a> $$0, Set<fqq> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fqq> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fqx.b.bake(this::a);
      this.g = fqx.a.bake(this::a);
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
                  ((IntList)this.l.computeIfAbsent(azu.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fqs $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
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

      for (fek $$2 : this.i) {
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
      return this.k.a($$0, this.n).a($$1);
   }

   private fqv c(int $$0) {
      for (fek $$1 : this.i) {
         fej $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fqv a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fqv a(fel $$0) {
      for (fqs $$1 : this.m) {
         fqv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alp $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fqt $$5 = $$4 ? fqt.b($$3) : fqt.a($$3);
      fqs $$6 = new fqs($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fqv $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fqv a(fej $$0) {
      IntList $$1 = (IntList)this.l.get(azu.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alp a() {
      return this.e;
   }

   public fqv b() {
      return this.g;
   }

   static record a(fej a, fej b) {
      static final fqr.a c = new fqr.a(fqx.b, fqx.b);

      fej a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
