import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fss extends fsi implements frq, fui {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wv e = wv.c("narration.tab_navigation.usage");
   private final fuf f = fuf.e();
   private int g;
   private final fsr h;
   private final ImmutableList<fsq> i;
   private final ImmutableList<frw> j;

   fss(int $$0, fsr $$1, Iterable<fsq> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<frw> $$3 = ImmutableList.builder();

      for (fsq $$4 : $$2) {
         $$3.add(this.f.a(new frw($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fss.a a(fsr $$0, int $$1) {
      return new fss.a($$0, $$1);
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
      if (this.aH_() != null) {
         this.aH_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fsk $$0) {
      super.a($$0);
      if ($$0 instanceof frw $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fpw a(fuq $$0) {
      if (!this.aI_()) {
         frw $$1 = this.g();
         if ($$1 != null) {
            return fpw.a(this, fpw.a($$1));
         }
      }

      return $$0 instanceof fuq.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fsk> aD_() {
      return this.j;
   }

   @Override
   public fui.a w() {
      return this.j.stream().map(fql::w).max(Comparator.naturalOrder()).orElse(fui.a.a);
   }

   @Override
   public void b(fuk $$0) {
      Optional<frw> $$1 = this.j.stream().filter(fql::C).findFirst().or(() -> Optional.ofNullable(this.g()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fuj.d, e);
      }
   }

   protected void a(fuk $$0, frw $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fuj.b, wv.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      $$0.a(goi::H, fwf.h, 0, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, ((frw)this.j.get(0)).F(), 2, 32, 2);
      int $$4 = ((frw)this.j.get(this.j.size() - 1)).H();
      $$0.a(goi::H, fwf.h, $$4, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         frw $$5 = (frw)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fuu J() {
      return this.f.J();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azk.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         frw $$2 = (frw)var3.next();
         $$2.h($$1);
      }

      this.f.a();
      this.f.j(azk.d((this.g - $$0) / 2, 2));
      this.f.k(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((fsk)this.j.get($$0));
      } else {
         this.h.a((fsq)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fwf.s()) {
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
               int $$2 = fwf.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fsq $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private frw g() {
      int $$0 = this.c();
      return $$0 != -1 ? (frw)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fsr b;
      private final List<fsq> c = new ArrayList<>();

      a(fsr $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fss.a a(fsq... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fss a() {
         return new fss(this.a, this.b, this.c);
      }
   }
}
