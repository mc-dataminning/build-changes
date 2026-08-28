import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fqv extends fql implements fpt, fsl {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wo e = wo.c("narration.tab_navigation.usage");
   private final fsi f = fsi.e();
   private int g;
   private final fqu h;
   private final ImmutableList<fqt> i;
   private final ImmutableList<fpz> j;

   fqv(int $$0, fqu $$1, Iterable<fqt> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fpz> $$3 = ImmutableList.builder();

      for (fqt $$4 : $$2) {
         $$3.add(this.f.a(new fpz($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fqv.a a(fqu $$0, int $$1) {
      return new fqv.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return $$0 >= (double)this.f.F() && $$1 >= (double)this.f.G() && $$0 < (double)(this.f.F() + this.f.A()) && $$1 < (double)(this.f.G() + this.f.y());
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aL_() != null) {
         this.aL_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fqn $$0) {
      super.a($$0);
      if ($$0 instanceof fpz $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fny a(fst $$0) {
      if (!this.aM_()) {
         fpz $$1 = this.g();
         if ($$1 != null) {
            return fny.a(this, fny.a($$1));
         }
      }

      return $$0 instanceof fst.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fqn> aH_() {
      return this.j;
   }

   @Override
   public fsl.a w() {
      return this.j.stream().map(fon::w).max(Comparator.naturalOrder()).orElse(fsl.a.a);
   }

   @Override
   public void b(fsn $$0) {
      Optional<fpz> $$1 = this.j.stream().filter(fon::C).findFirst().or(() -> Optional.ofNullable(this.g()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aM_()) {
         $$0.a(fsm.d, e);
      }
   }

   protected void a(fsn $$0, fpz $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fsm.b, wo.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      $$0.a(gmf::H, fui.h, 0, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, ((fpz)this.j.get(0)).F(), 2, 32, 2);
      int $$4 = ((fpz)this.j.get(this.j.size() - 1)).H();
      $$0.a(gmf::H, fui.h, $$4, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fpz $$5 = (fpz)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fsx J() {
      return this.f.J();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayy.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fpz $$2 = (fpz)var3.next();
         $$2.h($$1);
      }

      this.f.a();
      this.f.j(ayy.d((this.g - $$0) / 2, 2));
      this.f.k(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aM_()) {
         this.a((fqn)this.j.get($$0));
      } else {
         this.h.a((fqt)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fui.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayy.a($$1, 0, this.i.size() - 1), true);
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
            int $$1 = this.c();
            if ($$1 != -1) {
               int $$2 = fui.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fqt $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fpz g() {
      int $$0 = this.c();
      return $$0 != -1 ? (fpz)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fqu b;
      private final List<fqt> c = new ArrayList<>();

      a(fqu $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fqv.a a(fqt... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fqv a() {
         return new fqv(this.a, this.b, this.c);
      }
   }
}
