import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alx extends eww {
   private final MinecraftServer b;
   private final Set<ewo> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alx(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(ewv $$0, ewo $$1, ewt $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afw($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(ewv $$0, ewo $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);
      this.b.ah().a(new aev($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(ewv $$0, ewo $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aev($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(ewn $$0, @Nullable ewo $$1) {
      ewo $$2 = this.a($$0);
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
   public boolean a(String $$0, ewr $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afv.a($$1, $$0, afv.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ewr $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afv.a($$1, $$0, afv.a.b));
      this.a();
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ewo $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aft($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ewo $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ewr $$0) {
      super.a($$0);
      this.b.ah().a(afv.a($$0, true));
      this.a();
   }

   @Override
   public void b(ewr $$0) {
      super.b($$0);
      this.b.ah().a(afv.a($$0, false));
      this.a();
   }

   @Override
   public void c(ewr $$0) {
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

   public List<zw<?>> d(ewo $$0) {
      List<zw<?>> $$1 = Lists.newArrayList();
      $$1.add(new aft($$0, 0));

      for (ewn $$2 : ewn.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afm($$2, $$0));
         }
      }

      for (ewp $$3 : this.i($$0)) {
         $$1.add(new afw($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ewo $$0) {
      List<zw<?>> $$1 = this.d($$0);

      for (arg $$2 : this.b.ah().t()) {
         for (zw<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zw<?>> f(ewo $$0) {
      List<zw<?>> $$1 = Lists.newArrayList();
      $$1.add(new aft($$0, 1));

      for (ewn $$2 : ewn.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afm($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ewo $$0) {
      List<zw<?>> $$1 = this.f($$0);

      for (arg $$2 : this.b.ah().t()) {
         for (zw<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(ewo $$0) {
      int $$1 = 0;

      for (ewn $$2 : ewn.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public epd.a<ewx> b() {
      return new epd.a<>(this::h, this::a, bag.n);
   }

   private ewx h() {
      ewx $$0 = new ewx(this);
      this.a($$0::c);
      return $$0;
   }

   private ewx a(us $$0, jk.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
