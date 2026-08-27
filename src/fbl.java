import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class fbl {
   private final ht a;
   private final List<clz<?>> b;
   private final boolean c;
   private final Set<clz<?>> d = Sets.newHashSet();
   private final Set<clz<?>> e = Sets.newHashSet();
   private final Set<clz<?>> f = Sets.newHashSet();

   public fbl(ht $$0, List<clz<?>> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      if ($$1.size() <= 1) {
         this.c = true;
      } else {
         this.c = a($$0, $$1);
      }
   }

   private static boolean a(ht $$0, List<clz<?>> $$1) {
      int $$2 = $$1.size();
      ciw $$3 = $$1.get(0).a($$0);

      for (int $$4 = 1; $$4 < $$2; $$4++) {
         ciw $$5 = $$1.get($$4).a($$0);
         if (!ciw.c($$3, $$5)) {
            return false;
         }
      }

      return true;
   }

   public ht a() {
      return this.a;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public void a(aox $$0) {
      for (clz<?> $$1 : this.b) {
         if ($$0.b($$1)) {
            this.f.add($$1);
         }
      }
   }

   public void a(cbp $$0, int $$1, int $$2, aox $$3) {
      for (clz<?> $$4 : this.b) {
         boolean $$5 = $$4.a($$1, $$2) && $$3.b($$4);
         if ($$5) {
            this.e.add($$4);
         } else {
            this.e.remove($$4);
         }

         if ($$5 && $$0.a($$4, null)) {
            this.d.add($$4);
         } else {
            this.d.remove($$4);
         }
      }
   }

   public boolean a(clz<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean c() {
      return !this.d.isEmpty();
   }

   public boolean d() {
      return !this.e.isEmpty();
   }

   public List<clz<?>> e() {
      return this.b;
   }

   public List<clz<?>> a(boolean $$0) {
      List<clz<?>> $$1 = Lists.newArrayList();
      Set<clz<?>> $$2 = $$0 ? this.d : this.e;

      for (clz<?> $$3 : this.b) {
         if ($$2.contains($$3)) {
            $$1.add($$3);
         }
      }

      return $$1;
   }

   public List<clz<?>> b(boolean $$0) {
      List<clz<?>> $$1 = Lists.newArrayList();

      for (clz<?> $$2 : this.b) {
         if (this.e.contains($$2) && this.d.contains($$2) == $$0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public boolean f() {
      return this.c;
   }
}
