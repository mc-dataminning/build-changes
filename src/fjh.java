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

public class fjh extends fix implements fig, fkx {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xo e = xo.c("narration.tab_navigation.usage");
   private final fku f = fku.e();
   private int g;
   private final fjg h;
   private final ImmutableList<fjf> i;
   private final ImmutableList<fim> j;

   fjh(int $$0, fjg $$1, Iterable<fjf> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fim> $$3 = ImmutableList.builder();

      for (fjf $$4 : $$2) {
         $$3.add(this.f.a(new fim($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjh.a a(fjg $$0, int $$1) {
      return new fjh.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aG_() != null) {
         this.aG_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fiz $$0) {
      super.a($$0);
      if ($$0 instanceof fim $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fgn a(flf $$0) {
      if (!this.aH_()) {
         fim $$1 = this.d();
         if ($$1 != null) {
            return fgn.a(this, fgn.a($$1));
         }
      }

      return $$0 instanceof flf.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fiz> aD_() {
      return this.j;
   }

   @Override
   public fkx.a t() {
      return this.j.stream().map(fhb::t).max(Comparator.naturalOrder()).orElse(fkx.a.a);
   }

   @Override
   public void b(fkz $$0) {
      Optional<fim> $$1 = this.j.stream().filter(fhb::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aH_()) {
         $$0.a(fky.d, e);
      }
   }

   protected void a(fkz $$0, fim $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fky.b, xo.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnc.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fim)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fim)this.j.get(this.j.size() - 1)).E();
      $$0.a(fnc.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fim $$5 = (fim)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public flj G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayy.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fim $$2 = (fim)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayy.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aH_()) {
         this.a((fiz)this.j.get($$0));
      } else {
         this.h.a((fjf)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnc.s()) {
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
               int $$2 = fnc.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fjf $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fim d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fim)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjg b;
      private final List<fjf> c = new ArrayList<>();

      a(fjg $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjh.a a(fjf... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjh a() {
         return new fjh(this.a, this.b, this.c);
      }
   }
}
