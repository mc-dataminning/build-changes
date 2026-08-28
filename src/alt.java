import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alt extends ewq {
   private final MinecraftServer b;
   private final Set<ewi> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alt(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(ewp $$0, ewi $$1, ewn $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afs($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(ewp $$0, ewi $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(ewp $$0) {
      super.a($$0);
      this.b.ah().a(new aer($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(ewp $$0, ewi $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aer($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(ewh $$0, @Nullable ewi $$1) {
      ewi $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new afi($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new afi($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ewl $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afr.a($$1, $$0, afr.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ewl $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afr.a($$1, $$0, afr.a.b));
      this.a();
   }

   @Override
   public void a(ewi $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ewi $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new afp($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ewi $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ewl $$0) {
      super.a($$0);
      this.b.ah().a(afr.a($$0, true));
      this.a();
   }

   @Override
   public void b(ewl $$0) {
      super.b($$0);
      this.b.ah().a(afr.a($$0, false));
      this.a();
   }

   @Override
   public void c(ewl $$0) {
      super.c($$0);
      this.b.ah().a(afr.a($$0));
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

   public List<zs<?>> d(ewi $$0) {
      List<zs<?>> $$1 = Lists.newArrayList();
      $$1.add(new afp($$0, 0));

      for (ewh $$2 : ewh.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afi($$2, $$0));
         }
      }

      for (ewj $$3 : this.i($$0)) {
         $$1.add(new afs($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ewi $$0) {
      List<zs<?>> $$1 = this.d($$0);

      for (arc $$2 : this.b.ah().t()) {
         for (zs<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zs<?>> f(ewi $$0) {
      List<zs<?>> $$1 = Lists.newArrayList();
      $$1.add(new afp($$0, 1));

      for (ewh $$2 : ewh.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afi($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ewi $$0) {
      List<zs<?>> $$1 = this.f($$0);

      for (arc $$2 : this.b.ah().t()) {
         for (zs<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(ewi $$0) {
      int $$1 = 0;

      for (ewh $$2 : ewh.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eox.a<ewr> b() {
      return new eox.a<>(this::h, this::a, bab.n);
   }

   private ewr h() {
      ewr $$0 = new ewr(this);
      this.a($$0::c);
      return $$0;
   }

   private ewr a(ur $$0, jk.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
