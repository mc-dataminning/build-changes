import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class amb extends fgv {
   public static final ezb<fgw> a = new ezb<>("scoreboard", $$0 -> $$0.a().g().h(), $$0 -> {
      amb $$1 = $$0.a().g();
      return fgw.a.a.xmap($$1::a, fgw::a);
   }, bbd.n);
   private final MinecraftServer c;
   private final Set<fgn> d = Sets.newHashSet();
   private final List<Runnable> e = Lists.newArrayList();

   public amb(MinecraftServer $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(fgu $$0, fgn $$1, fgs $$2) {
      super.a($$0, $$1, $$2);
      if (this.d.contains($$1)) {
         this.c.ag().a(new afq($$0.cI(), $$1.c(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fgu $$0, fgn $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fgu $$0) {
      super.a($$0);
      this.c.ag().a(new aen($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fgu $$0, fgn $$1) {
      super.b($$0, $$1);
      if (this.d.contains($$1)) {
         this.c.ag().a(new aen($$0.cI(), $$1.c()));
      }

      this.a();
   }

   @Override
   public void a(fgm $$0, @Nullable fgn $$1) {
      fgn $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.c.ag().a(new afe($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.d.contains($$1)) {
            this.c.ag().a(new afe($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fgq $$1) {
      if (super.a($$0, $$1)) {
         this.c.ag().a(afp.a($$1, $$0, afp.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fgq $$1) {
      super.b($$0, $$1);
      this.c.ag().a(afp.a($$1, $$0, afp.a.b));
      this.a();
   }

   @Override
   public void a(fgn $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fgn $$0) {
      super.b($$0);
      if (this.d.contains($$0)) {
         this.c.ag().a(new afm($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fgn $$0) {
      super.c($$0);
      if (this.d.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fgq $$0) {
      super.a($$0);
      this.c.ag().a(afp.a($$0, true));
      this.a();
   }

   @Override
   public void b(fgq $$0) {
      super.b($$0);
      this.c.ag().a(afp.a($$0, false));
      this.a();
   }

   @Override
   public void c(fgq $$0) {
      super.c($$0);
      this.c.ag().a(afp.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.e.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.e) {
         $$0.run();
      }
   }

   public List<zh<?>> d(fgn $$0) {
      List<zh<?>> $$1 = Lists.newArrayList();
      $$1.add(new afm($$0, 0));

      for (fgm $$2 : fgm.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afe($$2, $$0));
         }
      }

      for (fgo $$3 : this.i($$0)) {
         $$1.add(new afq($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fgn $$0) {
      List<zh<?>> $$1 = this.d($$0);

      for (art $$2 : this.c.ag().t()) {
         for (zh<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.add($$0);
   }

   public List<zh<?>> f(fgn $$0) {
      List<zh<?>> $$1 = Lists.newArrayList();
      $$1.add(new afm($$0, 1));

      for (fgm $$2 : fgm.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afe($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fgn $$0) {
      List<zh<?>> $$1 = this.f($$0);

      for (art $$2 : this.c.ag().t()) {
         for (zh<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.remove($$0);
   }

   public int h(fgn $$0) {
      int $$1 = 0;

      for (fgm $$2 : fgm.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   private fgw h() {
      fgw $$0 = new fgw(this);
      this.a($$0::f);
      return $$0;
   }

   private fgw a(fgw.a $$0) {
      fgw $$1 = this.h();
      $$1.a($$0);
      return $$1;
   }

   public static enum a {
      a,
      b;
   }
}
