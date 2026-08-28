import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alw extends fdz {
   private final MinecraftServer b;
   private final Set<fdr> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alw(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fdy $$0, fdr $$1, fdw $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afl($$0.cI(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fdy $$0, fdr $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fdy $$0) {
      super.a($$0);
      this.b.ag().a(new aei($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fdy $$0, fdr $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aei($$0.cI(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fdq $$0, @Nullable fdr $$1) {
      fdr $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new aez($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new aez($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fdu $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(afk.a($$1, $$0, afk.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fdu $$1) {
      super.b($$0, $$1);
      this.b.ag().a(afk.a($$1, $$0, afk.a.b));
      this.a();
   }

   @Override
   public void a(fdr $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fdr $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afh($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fdr $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fdu $$0) {
      super.a($$0);
      this.b.ag().a(afk.a($$0, true));
      this.a();
   }

   @Override
   public void b(fdu $$0) {
      super.b($$0);
      this.b.ag().a(afk.a($$0, false));
      this.a();
   }

   @Override
   public void c(fdu $$0) {
      super.c($$0);
      this.b.ag().a(afk.a($$0));
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

   public List<zc<?>> d(fdr $$0) {
      List<zc<?>> $$1 = Lists.newArrayList();
      $$1.add(new afh($$0, 0));

      for (fdq $$2 : fdq.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aez($$2, $$0));
         }
      }

      for (fds $$3 : this.i($$0)) {
         $$1.add(new afl($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fdr $$0) {
      List<zc<?>> $$1 = this.d($$0);

      for (aro $$2 : this.b.ag().t()) {
         for (zc<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zc<?>> f(fdr $$0) {
      List<zc<?>> $$1 = Lists.newArrayList();
      $$1.add(new afh($$0, 1));

      for (fdq $$2 : fdq.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aez($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fdr $$0) {
      List<zc<?>> $$1 = this.f($$0);

      for (aro $$2 : this.b.ag().t()) {
         for (zc<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fdr $$0) {
      int $$1 = 0;

      for (fdq $$2 : fdq.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ewf.a<fea> b() {
      return new ewf.a<>(this::h, this::a, bax.n);
   }

   private fea h() {
      fea $$0 = new fea(this);
      this.a($$0::g);
      return $$0;
   }

   private fea a(tw $$0, ju.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
