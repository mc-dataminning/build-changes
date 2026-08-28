import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class amd extends fgx {
   public static final ezd<fgy> a = new ezd<>("scoreboard", $$0 -> $$0.a().g().h(), $$0 -> {
      amd $$1 = $$0.a().g();
      return fgy.a.a.xmap($$1::a, fgy::a);
   }, bbf.n);
   private final MinecraftServer c;
   private final Set<fgp> d = Sets.newHashSet();
   private final List<Runnable> e = Lists.newArrayList();

   public amd(MinecraftServer $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(fgw $$0, fgp $$1, fgu $$2) {
      super.a($$0, $$1, $$2);
      if (this.d.contains($$1)) {
         this.c.ag().a(new afs($$0.cI(), $$1.c(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fgw $$0, fgp $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fgw $$0) {
      super.a($$0);
      this.c.ag().a(new aep($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fgw $$0, fgp $$1) {
      super.b($$0, $$1);
      if (this.d.contains($$1)) {
         this.c.ag().a(new aep($$0.cI(), $$1.c()));
      }

      this.a();
   }

   @Override
   public void a(fgo $$0, @Nullable fgp $$1) {
      fgp $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.c.ag().a(new afg($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.d.contains($$1)) {
            this.c.ag().a(new afg($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fgs $$1) {
      if (super.a($$0, $$1)) {
         this.c.ag().a(afr.a($$1, $$0, afr.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fgs $$1) {
      super.b($$0, $$1);
      this.c.ag().a(afr.a($$1, $$0, afr.a.b));
      this.a();
   }

   @Override
   public void a(fgp $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fgp $$0) {
      super.b($$0);
      if (this.d.contains($$0)) {
         this.c.ag().a(new afo($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fgp $$0) {
      super.c($$0);
      if (this.d.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fgs $$0) {
      super.a($$0);
      this.c.ag().a(afr.a($$0, true));
      this.a();
   }

   @Override
   public void b(fgs $$0) {
      super.b($$0);
      this.c.ag().a(afr.a($$0, false));
      this.a();
   }

   @Override
   public void c(fgs $$0) {
      super.c($$0);
      this.c.ag().a(afr.a($$0));
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

   public List<zj<?>> d(fgp $$0) {
      List<zj<?>> $$1 = Lists.newArrayList();
      $$1.add(new afo($$0, 0));

      for (fgo $$2 : fgo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afg($$2, $$0));
         }
      }

      for (fgq $$3 : this.i($$0)) {
         $$1.add(new afs($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fgp $$0) {
      List<zj<?>> $$1 = this.d($$0);

      for (arv $$2 : this.c.ag().t()) {
         for (zj<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.add($$0);
   }

   public List<zj<?>> f(fgp $$0) {
      List<zj<?>> $$1 = Lists.newArrayList();
      $$1.add(new afo($$0, 1));

      for (fgo $$2 : fgo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afg($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fgp $$0) {
      List<zj<?>> $$1 = this.f($$0);

      for (arv $$2 : this.c.ag().t()) {
         for (zj<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.remove($$0);
   }

   public int h(fgp $$0) {
      int $$1 = 0;

      for (fgo $$2 : fgo.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   private fgy h() {
      fgy $$0 = new fgy(this);
      this.a($$0::f);
      return $$0;
   }

   private fgy a(fgy.a $$0) {
      fgy $$1 = this.h();
      $$1.a($$0);
      return $$1;
   }

   public static enum a {
      a,
      b;
   }
}
