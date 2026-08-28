import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alx extends ewx {
   private final MinecraftServer b;
   private final Set<ewp> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alx(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(eww $$0, ewp $$1, ewu $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afw($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(eww $$0, ewp $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(eww $$0) {
      super.a($$0);
      this.b.ah().a(new aev($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(eww $$0, ewp $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aev($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(ewo $$0, @Nullable ewp $$1) {
      ewp $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new afm($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new afm($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ews $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afv.a($$1, $$0, afv.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ews $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afv.a($$1, $$0, afv.a.b));
      this.a();
   }

   @Override
   public void a(ewp $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ewp $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aft($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ewp $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ews $$0) {
      super.a($$0);
      this.b.ah().a(afv.a($$0, true));
      this.a();
   }

   @Override
   public void b(ews $$0) {
      super.b($$0);
      this.b.ah().a(afv.a($$0, false));
      this.a();
   }

   @Override
   public void c(ews $$0) {
      super.c($$0);
      this.b.ah().a(afv.a($$0));
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

   public List<zw<?>> d(ewp $$0) {
      List<zw<?>> $$1 = Lists.newArrayList();
      $$1.add(new aft($$0, 0));

      for (ewo $$2 : ewo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afm($$2, $$0));
         }
      }

      for (ewq $$3 : this.i($$0)) {
         $$1.add(new afw($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ewp $$0) {
      List<zw<?>> $$1 = this.d($$0);

      for (arg $$2 : this.b.ah().t()) {
         for (zw<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zw<?>> f(ewp $$0) {
      List<zw<?>> $$1 = Lists.newArrayList();
      $$1.add(new aft($$0, 1));

      for (ewo $$2 : ewo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afm($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ewp $$0) {
      List<zw<?>> $$1 = this.f($$0);

      for (arg $$2 : this.b.ah().t()) {
         for (zw<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(ewp $$0) {
      int $$1 = 0;

      for (ewo $$2 : ewo.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public epe.a<ewy> b() {
      return new epe.a<>(this::h, this::a, bag.n);
   }

   private ewy h() {
      ewy $$0 = new ewy(this);
      this.a($$0::c);
      return $$0;
   }

   private ewy a(us $$0, jk.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
