import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alx extends ffb {
   private final MinecraftServer b;
   private final Set<fet> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alx(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(ffa $$0, fet $$1, fey $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afm($$0.cI(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(ffa $$0, fet $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(ffa $$0) {
      super.a($$0);
      this.b.ag().a(new aej($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(ffa $$0, fet $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aej($$0.cI(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fes $$0, @Nullable fet $$1) {
      fet $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new afa($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new afa($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, few $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(afl.a($$1, $$0, afl.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, few $$1) {
      super.b($$0, $$1);
      this.b.ag().a(afl.a($$1, $$0, afl.a.b));
      this.a();
   }

   @Override
   public void a(fet $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fet $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afi($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fet $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(few $$0) {
      super.a($$0);
      this.b.ag().a(afl.a($$0, true));
      this.a();
   }

   @Override
   public void b(few $$0) {
      super.b($$0);
      this.b.ag().a(afl.a($$0, false));
      this.a();
   }

   @Override
   public void c(few $$0) {
      super.c($$0);
      this.b.ag().a(afl.a($$0));
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

   public List<zd<?>> d(fet $$0) {
      List<zd<?>> $$1 = Lists.newArrayList();
      $$1.add(new afi($$0, 0));

      for (fes $$2 : fes.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afa($$2, $$0));
         }
      }

      for (feu $$3 : this.i($$0)) {
         $$1.add(new afm($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fet $$0) {
      List<zd<?>> $$1 = this.d($$0);

      for (arp $$2 : this.b.ag().t()) {
         for (zd<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zd<?>> f(fet $$0) {
      List<zd<?>> $$1 = Lists.newArrayList();
      $$1.add(new afi($$0, 1));

      for (fes $$2 : fes.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afa($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fet $$0) {
      List<zd<?>> $$1 = this.f($$0);

      for (arp $$2 : this.b.ag().t()) {
         for (zd<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fet $$0) {
      int $$1 = 0;

      for (fes $$2 : fes.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public exh.a<ffc> b() {
      return new exh.a<>(this::h, this::a, baz.n);
   }

   private ffc h() {
      ffc $$0 = new ffc(this);
      this.a($$0::g);
      return $$0;
   }

   private ffc a(tx $$0, jg.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
