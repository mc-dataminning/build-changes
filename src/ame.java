import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ame extends faw {
   private final MinecraftServer b;
   private final Set<fao> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ame(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fav $$0, fao $$1, fat $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afy($$0.cK(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fav $$0, fao $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fav $$0) {
      super.a($$0);
      this.b.ag().a(new aev($$0.cK(), null));
      this.a();
   }

   @Override
   public void b(fav $$0, fao $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aev($$0.cK(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fan $$0, @Nullable fao $$1) {
      fao $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new afm($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new afm($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, far $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(afx.a($$1, $$0, afx.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, far $$1) {
      super.b($$0, $$1);
      this.b.ag().a(afx.a($$1, $$0, afx.a.b));
      this.a();
   }

   @Override
   public void a(fao $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fao $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afu($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fao $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(far $$0) {
      super.a($$0);
      this.b.ag().a(afx.a($$0, true));
      this.a();
   }

   @Override
   public void b(far $$0) {
      super.b($$0);
      this.b.ag().a(afx.a($$0, false));
      this.a();
   }

   @Override
   public void c(far $$0) {
      super.c($$0);
      this.b.ag().a(afx.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.d.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.d) {
         $$0.run();
      }
   }

   public List<zs<?>> d(fao $$0) {
      List<zs<?>> $$1 = Lists.newArrayList();
      $$1.add(new afu($$0, 0));

      for (fan $$2 : fan.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afm($$2, $$0));
         }
      }

      for (fap $$3 : this.i($$0)) {
         $$1.add(new afy($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fao $$0) {
      List<zs<?>> $$1 = this.d($$0);

      for (arr $$2 : this.b.ag().t()) {
         for (zs<?> $$3 : $$1) {
            $$2.g.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zs<?>> f(fao $$0) {
      List<zs<?>> $$1 = Lists.newArrayList();
      $$1.add(new afu($$0, 1));

      for (fan $$2 : fan.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afm($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fao $$0) {
      List<zs<?>> $$1 = this.f($$0);

      for (arr $$2 : this.b.ag().t()) {
         for (zs<?> $$3 : $$1) {
            $$2.g.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fao $$0) {
      int $$1 = 0;

      for (fan $$2 : fan.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eta.a<fax> b() {
      return new eta.a<>(this::h, this::a, bax.n);
   }

   private fax h() {
      fax $$0 = new fax(this);
      this.a($$0::c);
      return $$0;
   }

   private fax a(un $$0, js.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
