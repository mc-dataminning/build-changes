import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ajy extends eqv {
   private final MinecraftServer b;
   private final Set<eqn> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ajy(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(equ $$0, eqn $$1, eqs $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new adz($$0.cy(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(equ $$0, eqn $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);
      this.b.ah().a(new acy($$0.cy(), null));
      this.a();
   }

   @Override
   public void b(equ $$0, eqn $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new acy($$0.cy(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(eqm $$0, @Nullable eqn $$1) {
      eqn $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new adp($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new adp($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eqq $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(ady.a($$1, $$0, ady.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eqq $$1) {
      super.b($$0, $$1);
      this.b.ah().a(ady.a($$1, $$0, ady.a.b));
      this.a();
   }

   @Override
   public void a(eqn $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eqn $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new adw($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eqn $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);
      this.b.ah().a(ady.a($$0, true));
      this.a();
   }

   @Override
   public void b(eqq $$0) {
      super.b($$0);
      this.b.ah().a(ady.a($$0, false));
      this.a();
   }

   @Override
   public void c(eqq $$0) {
      super.c($$0);
      this.b.ah().a(ady.a($$0));
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

   public List<yb<?>> d(eqn $$0) {
      List<yb<?>> $$1 = Lists.newArrayList();
      $$1.add(new adw($$0, 0));

      for (eqm $$2 : eqm.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new adp($$2, $$0));
         }
      }

      for (eqo $$3 : this.i($$0)) {
         $$1.add(new adz($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(eqn $$0) {
      List<yb<?>> $$1 = this.d($$0);

      for (apg $$2 : this.b.ah().t()) {
         for (yb<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<yb<?>> f(eqn $$0) {
      List<yb<?>> $$1 = Lists.newArrayList();
      $$1.add(new adw($$0, 1));

      for (eqm $$2 : eqm.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new adp($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eqn $$0) {
      List<yb<?>> $$1 = this.f($$0);

      for (apg $$2 : this.b.ah().t()) {
         for (yb<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(eqn $$0) {
      int $$1 = 0;

      for (eqm $$2 : eqm.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ejs.a<eqw> b() {
      return new ejs.a<>(this::i, this::a, ayc.n);
   }

   private eqw i() {
      eqw $$0 = new eqw(this);
      this.a($$0::c);
      return $$0;
   }

   private eqw a(ta $$0, in.a $$1) {
      return this.i().a($$0);
   }

   public static enum a {
      a,
      b;
   }
}
