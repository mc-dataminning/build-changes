import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class afo extends eim {
   private final MinecraftServer a;
   private final Set<eij> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public afo(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eil $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ac().a(new aah(afo.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ac().a(new aah(afo.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, eij $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ac().a(new aah(afo.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(eii $$0, @Nullable eij $$1) {
      eij $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ac().a(new zx($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ac().a(new zx($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eik $$1) {
      if (super.a($$0, $$1)) {
         this.a.ac().a(aag.a($$1, $$0, aag.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eik $$1) {
      super.b($$0, $$1);
      this.a.ac().a(aag.a($$1, $$0, aag.a.b));
      this.a();
   }

   @Override
   public void a(eij $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eij $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ac().a(new aae($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eij $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eik $$0) {
      super.a($$0);
      this.a.ac().a(aag.a($$0, true));
      this.a();
   }

   @Override
   public void b(eik $$0) {
      super.b($$0);
      this.a.ac().a(aag.a($$0, false));
      this.a();
   }

   @Override
   public void c(eik $$0) {
      super.c($$0);
      this.a.ac().a(aag.a($$0));
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

   public List<ve<?>> d(eij $$0) {
      List<ve<?>> $$1 = Lists.newArrayList();
      $$1.add(new aae($$0, 0));

      for (eii $$2 : eii.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zx($$2, $$0));
         }
      }

      for (eil $$3 : this.i($$0)) {
         $$1.add(new aah(afo.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(eij $$0) {
      List<ve<?>> $$1 = this.d($$0);

      for (aks $$2 : this.a.ac().t()) {
         for (ve<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<ve<?>> f(eij $$0) {
      List<ve<?>> $$1 = Lists.newArrayList();
      $$1.add(new aae($$0, 1));

      for (eii $$2 : eii.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zx($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eij $$0) {
      List<ve<?>> $$1 = this.f($$0);

      for (aks $$2 : this.a.ac().t()) {
         for (ve<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(eij $$0) {
      int $$1 = 0;

      for (eii $$2 : eii.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ebr.a<ein> b() {
      return new ebr.a<>(this::i, this::a, ata.n);
   }

   private ein i() {
      ein $$0 = new ein(this);
      this.a($$0::c);
      return $$0;
   }

   private ein a(qy $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
