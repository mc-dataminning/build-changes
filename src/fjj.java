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

public class fjj extends fiz implements fii, fkz {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xp e = xp.c("narration.tab_navigation.usage");
   private final fkw f = fkw.e();
   private int g;
   private final fji h;
   private final ImmutableList<fjh> i;
   private final ImmutableList<fio> j;

   fjj(int $$0, fji $$1, Iterable<fjh> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fio> $$3 = ImmutableList.builder();

      for (fjh $$4 : $$2) {
         $$3.add(this.f.a(new fio($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjj.a a(fji $$0, int $$1) {
      return new fjj.a($$0, $$1);
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
   public void a(@Nullable fjb $$0) {
      super.a($$0);
      if ($$0 instanceof fio $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fgp a(flh $$0) {
      if (!this.aH_()) {
         fio $$1 = this.d();
         if ($$1 != null) {
            return fgp.a(this, fgp.a($$1));
         }
      }

      return $$0 instanceof flh.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fjb> aD_() {
      return this.j;
   }

   @Override
   public fkz.a t() {
      return this.j.stream().map(fhd::t).max(Comparator.naturalOrder()).orElse(fkz.a.a);
   }

   @Override
   public void b(flb $$0) {
      Optional<fio> $$1 = this.j.stream().filter(fhd::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aH_()) {
         $$0.a(fla.d, e);
      }
   }

   protected void a(flb $$0, fio $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fla.b, xp.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fne.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fio)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fio)this.j.get(this.j.size() - 1)).E();
      $$0.a(fne.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fio $$5 = (fio)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fll G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayz.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fio $$2 = (fio)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayz.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aH_()) {
         this.a((fjb)this.j.get($$0));
      } else {
         this.h.a((fjh)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fne.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayz.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fne.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fjh $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fio d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fio)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fji b;
      private final List<fjh> c = new ArrayList<>();

      a(fji $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjj.a a(fjh... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjj a() {
         return new fjj(this.a, this.b, this.c);
      }
   }
}
