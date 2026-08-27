import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fdk extends fda implements fcj, ffa {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vu e = vu.c("narration.tab_navigation.usage");
   private final fes f;
   private int g;
   private final fdj h;
   private final ImmutableList<fdi> i;
   private final ImmutableList<fcp> j;

   fdk(int $$0, fdj $$1, Iterable<fdi> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fes(0, 0);
      this.f.c().b();
      Builder<fcp> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (fdi $$5 : $$2) {
         $$3.add(this.f.a(new fcp($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static fdk.a a(fdj $$0, int $$1) {
      return new fdk.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aI_() != null) {
         this.aI_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fdc $$0) {
      super.a($$0);
      if ($$0 instanceof fcp $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public faq a(ffi $$0) {
      if (!this.aJ_()) {
         fcp $$1 = this.c();
         if ($$1 != null) {
            return faq.a(this, faq.a($$1));
         }
      }

      return $$0 instanceof ffi.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fdc> l() {
      return this.j;
   }

   @Override
   public ffa.a s() {
      return this.j.stream().map(fbe::s).max(Comparator.naturalOrder()).orElse(ffa.a.a);
   }

   @Override
   public void b(ffc $$0) {
      Optional<fcp> $$1 = this.j.stream().filter(fbe::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(ffb.d, e);
      }
   }

   protected void a(ffc $$0, fcp $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(ffb.b, vu.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(flv.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         fcp $$4 = (fcp)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ffm F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aww.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fcp $$2 = (fcp)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(aww.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((fdc)this.j.get($$0));
      } else {
         this.h.a((fdi)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fhf.t()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aww.a($$1, 0, this.i.size() - 1), true);
            return true;
         }
      }

      return false;
   }

   private int c(int $$0) {
      if ($$0 >= 49 && $$0 <= 57) {
         return $$0 - 49;
      } else {
         if ($$0 == 258) {
            int $$1 = this.b();
            if ($$1 != -1) {
               int $$2 = fhf.v() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      fdi $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fcp c() {
      int $$0 = this.b();
      return $$0 != -1 ? (fcp)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fdj b;
      private final List<fdi> c = new ArrayList<>();

      a(fdj $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fdk.a a(fdi... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fdk a() {
         return new fdk(this.a, this.b, this.c);
      }
   }
}
