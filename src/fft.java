import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fft extends ffj implements fes, fhj {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wg e = wg.c("narration.tab_navigation.usage");
   private final fhg f = fhg.e();
   private int g;
   private final ffs h;
   private final ImmutableList<ffr> i;
   private final ImmutableList<fey> j;

   fft(int $$0, ffs $$1, Iterable<ffr> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fey> $$3 = ImmutableList.builder();

      for (ffr $$4 : $$2) {
         $$3.add(this.f.a(new fey($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fft.a a(ffs $$0, int $$1) {
      return new fft.a($$0, $$1);
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
   public void a(@Nullable ffl $$0) {
      super.a($$0);
      if ($$0 instanceof fey $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fcz a(fhr $$0) {
      if (!this.aJ_()) {
         fey $$1 = this.d();
         if ($$1 != null) {
            return fcz.a(this, fcz.a($$1));
         }
      }

      return $$0 instanceof fhr.c ? null : super.a($$0);
   }

   @Override
   public List<? extends ffl> aF_() {
      return this.j;
   }

   @Override
   public fhj.a t() {
      return this.j.stream().map(fdn::t).max(Comparator.naturalOrder()).orElse(fhj.a.a);
   }

   @Override
   public void b(fhl $$0) {
      Optional<fey> $$1 = this.j.stream().filter(fdn::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(fhk.d, e);
      }
   }

   protected void a(fhl $$0, fey $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fhk.b, wg.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fod.a, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fey)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fey)this.j.get(this.j.size() - 1)).E();
      $$0.a(fod.a, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fey $$5 = (fey)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fhv G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = axk.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fey $$2 = (fey)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(axk.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((ffl)this.j.get($$0));
      } else {
         this.h.a((ffr)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fjo.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(axk.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fjo.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      ffr $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fey d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fey)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final ffs b;
      private final List<ffr> c = new ArrayList<>();

      a(ffs $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fft.a a(ffr... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fft a() {
         return new fft(this.a, this.b, this.c);
      }
   }
}
