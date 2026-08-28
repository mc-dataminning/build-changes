import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fnm extends fnc implements fmk, fpd {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xi e = xi.c("narration.tab_navigation.usage");
   private final fpa f = fpa.e();
   private int g;
   private final fnl h;
   private final ImmutableList<fnk> i;
   private final ImmutableList<fmq> j;

   fnm(int $$0, fnl $$1, Iterable<fnk> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fmq> $$3 = ImmutableList.builder();

      for (fnk $$4 : $$2) {
         $$3.add(this.f.a(new fmq($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fnm.a a(fnl $$0, int $$1) {
      return new fnm.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aL_() != null) {
         this.aL_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fne $$0) {
      super.a($$0);
      if ($$0 instanceof fmq $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fkr a(fpl $$0) {
      if (!this.aM_()) {
         fmq $$1 = this.d();
         if ($$1 != null) {
            return fkr.a(this, fkr.a($$1));
         }
      }

      return $$0 instanceof fpl.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fne> aI_() {
      return this.j;
   }

   @Override
   public fpd.a u() {
      return this.j.stream().map(flf::u).max(Comparator.naturalOrder()).orElse(fpd.a.a);
   }

   @Override
   public void b(fpf $$0) {
      Optional<fmq> $$1 = this.j.stream().filter(flf::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aM_()) {
         $$0.a(fpe.d, e);
      }
   }

   protected void a(fpf $$0, fmq $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fpe.b, xi.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      $$0.a(gir::B, fra.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fmq)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fmq)this.j.get(this.j.size() - 1)).F();
      $$0.a(gir::B, fra.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fmq $$5 = (fmq)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fpp H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azk.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fmq $$2 = (fmq)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azk.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aM_()) {
         this.a((fne)this.j.get($$0));
      } else {
         this.h.a((fnk)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fra.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azk.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fra.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fnk $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fmq d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fmq)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fnl b;
      private final List<fnk> c = new ArrayList<>();

      a(fnl $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fnm.a a(fnk... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fnm a() {
         return new fnm(this.a, this.b, this.c);
      }
   }
}
