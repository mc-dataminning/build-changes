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

public class fie extends fhu implements fhd, fju {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wx e = wx.c("narration.tab_navigation.usage");
   private final fjr f = fjr.e();
   private int g;
   private final fid h;
   private final ImmutableList<fic> i;
   private final ImmutableList<fhj> j;

   fie(int $$0, fid $$1, Iterable<fic> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fhj> $$3 = ImmutableList.builder();

      for (fic $$4 : $$2) {
         $$3.add(this.f.a(new fhj($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fie.a a(fid $$0, int $$1) {
      return new fie.a($$0, $$1);
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
   public void a(@Nullable fhw $$0) {
      super.a($$0);
      if ($$0 instanceof fhj $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ffk a(fkc $$0) {
      if (!this.aJ_()) {
         fhj $$1 = this.d();
         if ($$1 != null) {
            return ffk.a(this, ffk.a($$1));
         }
      }

      return $$0 instanceof fkc.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fhw> aF_() {
      return this.j;
   }

   @Override
   public fju.a t() {
      return this.j.stream().map(ffy::t).max(Comparator.naturalOrder()).orElse(fju.a.a);
   }

   @Override
   public void b(fjw $$0) {
      Optional<fhj> $$1 = this.j.stream().filter(ffy::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(fjv.d, e);
      }
   }

   protected void a(fjw $$0, fhj $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fjv.b, wx.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(flz.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fhj)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fhj)this.j.get(this.j.size() - 1)).E();
      $$0.a(flz.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fhj $$5 = (fhj)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fkg G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayf.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fhj $$2 = (fhj)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayf.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((fhw)this.j.get($$0));
      } else {
         this.h.a((fic)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (flz.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayf.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = flz.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fic $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fhj d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fhj)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fid b;
      private final List<fic> c = new ArrayList<>();

      a(fid $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fie.a a(fic... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fie a() {
         return new fie(this.a, this.b, this.c);
      }
   }
}
