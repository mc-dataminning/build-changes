import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fmf extends flv implements fld, fnv {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xd e = xd.c("narration.tab_navigation.usage");
   private final fns f = fns.e();
   private int g;
   private final fme h;
   private final ImmutableList<fmd> i;
   private final ImmutableList<flj> j;

   fmf(int $$0, fme $$1, Iterable<fmd> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<flj> $$3 = ImmutableList.builder();

      for (fmd $$4 : $$2) {
         $$3.add(this.f.a(new flj($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fmf.a a(fme $$0, int $$1) {
      return new fmf.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aN_() != null) {
         this.aN_().a($$0);
      }
   }

   @Override
   public void a(@Nullable flx $$0) {
      super.a($$0);
      if ($$0 instanceof flj $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fjk a(fod $$0) {
      if (!this.aO_()) {
         flj $$1 = this.d();
         if ($$1 != null) {
            return fjk.a(this, fjk.a($$1));
         }
      }

      return $$0 instanceof fod.c ? null : super.a($$0);
   }

   @Override
   public List<? extends flx> aK_() {
      return this.j;
   }

   @Override
   public fnv.a u() {
      return this.j.stream().map(fjy::u).max(Comparator.naturalOrder()).orElse(fnv.a.a);
   }

   @Override
   public void b(fnx $$0) {
      Optional<flj> $$1 = this.j.stream().filter(fjy::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aO_()) {
         $$0.a(fnw.d, e);
      }
   }

   protected void a(fnx $$0, flj $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fnw.b, xd.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      $$0.a(ghe::C, fpt.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((flj)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((flj)this.j.get(this.j.size() - 1)).F();
      $$0.a(ghe::C, fpt.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         flj $$5 = (flj)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public foh H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azc.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         flj $$2 = (flj)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azc.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aO_()) {
         this.a((flx)this.j.get($$0));
      } else {
         this.h.a((fmd)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fpt.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azc.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fpt.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fmd $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private flj d() {
      int $$0 = this.c();
      return $$0 != -1 ? (flj)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fme b;
      private final List<fmd> c = new ArrayList<>();

      a(fme $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fmf.a a(fmd... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fmf a() {
         return new fmf(this.a, this.b, this.c);
      }
   }
}
