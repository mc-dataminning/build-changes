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

public class fji extends fiy implements fih, fky {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xp e = xp.c("narration.tab_navigation.usage");
   private final fkv f = fkv.e();
   private int g;
   private final fjh h;
   private final ImmutableList<fjg> i;
   private final ImmutableList<fin> j;

   fji(int $$0, fjh $$1, Iterable<fjg> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fin> $$3 = ImmutableList.builder();

      for (fjg $$4 : $$2) {
         $$3.add(this.f.a(new fin($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fji.a a(fjh $$0, int $$1) {
      return new fji.a($$0, $$1);
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
   public void a(@Nullable fja $$0) {
      super.a($$0);
      if ($$0 instanceof fin $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fgo a(flg $$0) {
      if (!this.aH_()) {
         fin $$1 = this.d();
         if ($$1 != null) {
            return fgo.a(this, fgo.a($$1));
         }
      }

      return $$0 instanceof flg.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fja> aD_() {
      return this.j;
   }

   @Override
   public fky.a t() {
      return this.j.stream().map(fhc::t).max(Comparator.naturalOrder()).orElse(fky.a.a);
   }

   @Override
   public void b(fla $$0) {
      Optional<fin> $$1 = this.j.stream().filter(fhc::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aH_()) {
         $$0.a(fkz.d, e);
      }
   }

   protected void a(fla $$0, fin $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fkz.b, xp.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnd.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fin)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fin)this.j.get(this.j.size() - 1)).E();
      $$0.a(fnd.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fin $$5 = (fin)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public flk G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayz.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fin $$2 = (fin)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayz.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aH_()) {
         this.a((fja)this.j.get($$0));
      } else {
         this.h.a((fjg)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnd.s()) {
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
               int $$2 = fnd.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fjg $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fin d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fin)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjh b;
      private final List<fjg> c = new ArrayList<>();

      a(fjh $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fji.a a(fjg... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fji a() {
         return new fji(this.a, this.b, this.c);
      }
   }
}
