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

public class fhi extends fgy implements fgh, fiy {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wu e = wu.c("narration.tab_navigation.usage");
   private final fiv f = fiv.e();
   private int g;
   private final fhh h;
   private final ImmutableList<fhg> i;
   private final ImmutableList<fgn> j;

   fhi(int $$0, fhh $$1, Iterable<fhg> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fgn> $$3 = ImmutableList.builder();

      for (fhg $$4 : $$2) {
         $$3.add(this.f.a(new fgn($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fhi.a a(fhh $$0, int $$1) {
      return new fhi.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aH_() != null) {
         this.aH_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fha $$0) {
      super.a($$0);
      if ($$0 instanceof fgn $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public feo a(fjg $$0) {
      if (!this.aI_()) {
         fgn $$1 = this.d();
         if ($$1 != null) {
            return feo.a(this, feo.a($$1));
         }
      }

      return $$0 instanceof fjg.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fha> aE_() {
      return this.j;
   }

   @Override
   public fiy.a t() {
      return this.j.stream().map(ffc::t).max(Comparator.naturalOrder()).orElse(fiy.a.a);
   }

   @Override
   public void b(fja $$0) {
      Optional<fgn> $$1 = this.j.stream().filter(ffc::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fiz.d, e);
      }
   }

   protected void a(fja $$0, fgn $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fiz.b, wu.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fld.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fgn)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fgn)this.j.get(this.j.size() - 1)).E();
      $$0.a(fld.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fgn $$5 = (fgn)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fjk G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = axz.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fgn $$2 = (fgn)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(axz.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((fha)this.j.get($$0));
      } else {
         this.h.a((fhg)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fld.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(axz.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fld.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fhg $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fgn d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fgn)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fhh b;
      private final List<fhg> c = new ArrayList<>();

      a(fhh $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fhi.a a(fhg... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fhi a() {
         return new fhi(this.a, this.b, this.c);
      }
   }
}
