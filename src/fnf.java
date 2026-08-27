import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class fnf {
   private final iz a;
   private final List<cvl<?>> b;
   private final boolean c;
   private final Set<cvl<?>> d = Sets.newHashSet();
   private final Set<cvl<?>> e = Sets.newHashSet();
   private final Set<cvl<?>> f = Sets.newHashSet();

   public fnf(iz $$0, List<cvl<?>> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      if ($$1.size() <= 1) {
         this.c = true;
      } else {
         this.c = a($$0, $$1);
      }
   }

   private static boolean a(iz $$0, List<cvl<?>> $$1) {
      int $$2 = $$1.size();
      crj $$3 = $$1.get(0).b().a($$0);

      for (int $$4 = 1; $$4 < $$2; $$4++) {
         crj $$5 = $$1.get($$4).b().a($$0);
         if (!crj.c($$3, $$5)) {
            return false;
         }
      }

      return true;
   }

   public iz a() {
      return this.a;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public void a(aup $$0) {
      for (cvl<?> $$1 : this.b) {
         if ($$0.b($$1)) {
            this.f.add($$1);
         }
      }
   }

   public void a(cjx $$0, int $$1, int $$2, aup $$3) {
      for (cvl<?> $$4 : this.b) {
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

   public boolean a(cvl<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean c() {
      return !this.d.isEmpty();
   }

   public boolean d() {
      return !this.e.isEmpty();
   }

   public List<cvl<?>> e() {
      return this.b;
   }

   public List<cvl<?>> a(boolean $$0) {
      List<cvl<?>> $$1 = Lists.newArrayList();
      Set<cvl<?>> $$2 = $$0 ? this.d : this.e;

      for (cvl<?> $$3 : this.b) {
         if ($$2.contains($$3)) {
            $$1.add($$3);
         }
      }

      return $$1;
   }

   public List<cvl<?>> b(boolean $$0) {
      List<cvl<?>> $$1 = Lists.newArrayList();

      for (cvl<?> $$2 : this.b) {
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
