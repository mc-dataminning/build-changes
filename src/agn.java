import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class agn extends eje {
   private final MinecraftServer a;
   private final Set<ejb> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public agn(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ejd $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ac().a(new abe(agn.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ac().a(new abe(agn.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, ejb $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ac().a(new abe(agn.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(eja $$0, @Nullable ejb $$1) {
      ejb $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ac().a(new aau($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ac().a(new aau($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ejc $$1) {
      if (super.a($$0, $$1)) {
         this.a.ac().a(abd.a($$1, $$0, abd.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ejc $$1) {
      super.b($$0, $$1);
      this.a.ac().a(abd.a($$1, $$0, abd.a.b));
      this.a();
   }

   @Override
   public void a(ejb $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ejb $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ac().a(new abb($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ejb $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ejc $$0) {
      super.a($$0);
      this.a.ac().a(abd.a($$0, true));
      this.a();
   }

   @Override
   public void b(ejc $$0) {
      super.b($$0);
      this.a.ac().a(abd.a($$0, false));
      this.a();
   }

   @Override
   public void c(ejc $$0) {
      super.c($$0);
      this.a.ac().a(abd.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.c.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.c) {
         $$0.run();
      }
   }

   public List<wb<?>> d(ejb $$0) {
      List<wb<?>> $$1 = Lists.newArrayList();
      $$1.add(new abb($$0, 0));

      for (eja $$2 : eja.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aau($$2, $$0));
         }
      }

      for (ejd $$3 : this.i($$0)) {
         $$1.add(new abe(agn.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(ejb $$0) {
      List<wb<?>> $$1 = this.d($$0);

      for (alr $$2 : this.a.ac().t()) {
         for (wb<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<wb<?>> f(ejb $$0) {
      List<wb<?>> $$1 = Lists.newArrayList();
      $$1.add(new abb($$0, 1));

      for (eja $$2 : eja.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aau($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ejb $$0) {
      List<wb<?>> $$1 = this.f($$0);

      for (alr $$2 : this.a.ac().t()) {
         for (wb<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(ejb $$0) {
      int $$1 = 0;

      for (eja $$2 : eja.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ecj.a<ejf> b() {
      return new ecj.a<>(this::i, this::a, aud.n);
   }

   private ejf i() {
      ejf $$0 = new ejf(this);
      this.a($$0::c);
      return $$0;
   }

   private ejf a(rt $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
