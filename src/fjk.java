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

public class fjk extends fja implements fij, fla {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xp e = xp.c("narration.tab_navigation.usage");
   private final fkx f = fkx.e();
   private int g;
   private final fjj h;
   private final ImmutableList<fji> i;
   private final ImmutableList<fip> j;

   fjk(int $$0, fjj $$1, Iterable<fji> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fip> $$3 = ImmutableList.builder();

      for (fji $$4 : $$2) {
         $$3.add(this.f.a(new fip($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjk.a a(fjj $$0, int $$1) {
      return new fjk.a($$0, $$1);
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
   public void a(@Nullable fjc $$0) {
      super.a($$0);
      if ($$0 instanceof fip $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fgq a(fli $$0) {
      if (!this.aH_()) {
         fip $$1 = this.d();
         if ($$1 != null) {
            return fgq.a(this, fgq.a($$1));
         }
      }

      return $$0 instanceof fli.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fjc> aD_() {
      return this.j;
   }

   @Override
   public fla.a t() {
      return this.j.stream().map(fhe::t).max(Comparator.naturalOrder()).orElse(fla.a.a);
   }

   @Override
   public void b(flc $$0) {
      Optional<fip> $$1 = this.j.stream().filter(fhe::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aH_()) {
         $$0.a(flb.d, e);
      }
   }

   protected void a(flc $$0, fip $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(flb.b, xp.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnf.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fip)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fip)this.j.get(this.j.size() - 1)).E();
      $$0.a(fnf.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fip $$5 = (fip)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public flm G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayz.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fip $$2 = (fip)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayz.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aH_()) {
         this.a((fjc)this.j.get($$0));
      } else {
         this.h.a((fji)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnf.s()) {
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
               int $$2 = fnf.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fji $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fip d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fip)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjj b;
      private final List<fji> c = new ArrayList<>();

      a(fjj $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjk.a a(fji... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjk a() {
         return new fjk(this.a, this.b, this.c);
      }
   }
}
