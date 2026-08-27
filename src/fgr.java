import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class fgr {
   private final iu a;
   private final List<cqd<?>> b;
   private final boolean c;
   private final Set<cqd<?>> d = Sets.newHashSet();
   private final Set<cqd<?>> e = Sets.newHashSet();
   private final Set<cqd<?>> f = Sets.newHashSet();

   public fgr(iu $$0, List<cqd<?>> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      if ($$1.size() <= 1) {
         this.c = true;
      } else {
         this.c = a($$0, $$1);
      }
   }

   private static boolean a(iu $$0, List<cqd<?>> $$1) {
      int $$2 = $$1.size();
      cmx $$3 = $$1.get(0).b().a($$0);

      for (int $$4 = 1; $$4 < $$2; $$4++) {
         cmx $$5 = $$1.get($$4).b().a($$0);
         if (!cmx.c($$3, $$5)) {
            return false;
         }
      }

      return true;
   }

   public iu a() {
      return this.a;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public void a(aru $$0) {
      for (cqd<?> $$1 : this.b) {
         if ($$0.b($$1)) {
            this.f.add($$1);
         }
      }
   }

   public void a(cfl $$0, int $$1, int $$2, aru $$3) {
      for (cqd<?> $$4 : this.b) {
         boolean $$5 = $$4.b().a($$1, $$2) && $$3.b($$4);
         if ($$5) {
            this.e.add($$4);
         } else {
            this.e.remove($$4);
         }

         if ($$5 && $$0.a($$4.b(), null)) {
            this.d.add($$4);
         } else {
            this.d.remove($$4);
         }
      }
   }

   public boolean a(cqd<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean c() {
      return !this.d.isEmpty();
   }

   public boolean d() {
      return !this.e.isEmpty();
   }

   public List<cqd<?>> e() {
      return this.b;
   }

   public List<cqd<?>> a(boolean $$0) {
      List<cqd<?>> $$1 = Lists.newArrayList();
      Set<cqd<?>> $$2 = $$0 ? this.d : this.e;

      for (cqd<?> $$3 : this.b) {
         if ($$2.contains($$3)) {
            $$1.add($$3);
         }
      }

      return $$1;
   }

   public List<cqd<?>> b(boolean $$0) {
      List<cqd<?>> $$1 = Lists.newArrayList();

      for (cqd<?> $$2 : this.b) {
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
