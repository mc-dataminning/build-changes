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

public class fjd extends fit implements fic, fkt {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xl e = xl.c("narration.tab_navigation.usage");
   private final fkq f = fkq.e();
   private int g;
   private final fjc h;
   private final ImmutableList<fjb> i;
   private final ImmutableList<fii> j;

   fjd(int $$0, fjc $$1, Iterable<fjb> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fii> $$3 = ImmutableList.builder();

      for (fjb $$4 : $$2) {
         $$3.add(this.f.a(new fii($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjd.a a(fjc $$0, int $$1) {
      return new fjd.a($$0, $$1);
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
   public void a(@Nullable fiv $$0) {
      super.a($$0);
      if ($$0 instanceof fii $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fgj a(flb $$0) {
      if (!this.aJ_()) {
         fii $$1 = this.d();
         if ($$1 != null) {
            return fgj.a(this, fgj.a($$1));
         }
      }

      return $$0 instanceof flb.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fiv> aF_() {
      return this.j;
   }

   @Override
   public fkt.a t() {
      return this.j.stream().map(fgx::t).max(Comparator.naturalOrder()).orElse(fkt.a.a);
   }

   @Override
   public void b(fkv $$0) {
      Optional<fii> $$1 = this.j.stream().filter(fgx::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(fku.d, e);
      }
   }

   protected void a(fkv $$0, fii $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fku.b, xl.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fmy.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fii)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fii)this.j.get(this.j.size() - 1)).E();
      $$0.a(fmy.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fii $$5 = (fii)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public flf G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayu.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fii $$2 = (fii)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayu.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((fiv)this.j.get($$0));
      } else {
         this.h.a((fjb)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fmy.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayu.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fmy.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fjb $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fii d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fii)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjc b;
      private final List<fjb> c = new ArrayList<>();

      a(fjc $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjd.a a(fjb... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjd a() {
         return new fjd(this.a, this.b, this.c);
      }
   }
}
