import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alu extends ezi {
   private final MinecraftServer b;
   private final Set<eza> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alu(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(ezh $$0, eza $$1, ezf $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afq($$0.cF(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(ezh $$0, eza $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(ezh $$0) {
      super.a($$0);
      this.b.ag().a(new aen($$0.cF(), null));
      this.a();
   }

   @Override
   public void b(ezh $$0, eza $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aen($$0.cF(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(eyz $$0, @Nullable eza $$1) {
      eza $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new afe($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new afe($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ezd $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(afp.a($$1, $$0, afp.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ezd $$1) {
      super.b($$0, $$1);
      this.b.ag().a(afp.a($$1, $$0, afp.a.b));
      this.a();
   }

   @Override
   public void a(eza $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eza $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afm($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eza $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ezd $$0) {
      super.a($$0);
      this.b.ag().a(afp.a($$0, true));
      this.a();
   }

   @Override
   public void b(ezd $$0) {
      super.b($$0);
      this.b.ag().a(afp.a($$0, false));
      this.a();
   }

   @Override
   public void c(ezd $$0) {
      super.c($$0);
      this.b.ag().a(afp.a($$0));
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

   public List<zk<?>> d(eza $$0) {
      List<zk<?>> $$1 = Lists.newArrayList();
      $$1.add(new afm($$0, 0));

      for (eyz $$2 : eyz.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afe($$2, $$0));
         }
      }

      for (ezb $$3 : this.i($$0)) {
         $$1.add(new afq($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(eza $$0) {
      List<zk<?>> $$1 = this.d($$0);

      for (arh $$2 : this.b.ag().t()) {
         for (zk<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zk<?>> f(eza $$0) {
      List<zk<?>> $$1 = Lists.newArrayList();
      $$1.add(new afm($$0, 1));

      for (eyz $$2 : eyz.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afe($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eza $$0) {
      List<zk<?>> $$1 = this.f($$0);

      for (arh $$2 : this.b.ag().t()) {
         for (zk<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(eza $$0) {
      int $$1 = 0;

      for (eyz $$2 : eyz.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ern.a<ezj> b() {
      return new ern.a<>(this::h, this::a, bal.n);
   }

   private ezj h() {
      ezj $$0 = new ezj(this);
      this.a($$0::c);
      return $$0;
   }

   private ezj a(uf $$0, jp.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
