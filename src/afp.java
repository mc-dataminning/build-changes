import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class afp extends eio {
   private final MinecraftServer a;
   private final Set<eil> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public afp(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ein $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ac().a(new aai(afp.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ac().a(new aai(afp.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, eil $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ac().a(new aai(afp.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(eik $$0, @Nullable eil $$1) {
      eil $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ac().a(new zy($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ac().a(new zy($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eim $$1) {
      if (super.a($$0, $$1)) {
         this.a.ac().a(aah.a($$1, $$0, aah.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eim $$1) {
      super.b($$0, $$1);
      this.a.ac().a(aah.a($$1, $$0, aah.a.b));
      this.a();
   }

   @Override
   public void a(eil $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eil $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ac().a(new aaf($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eil $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eim $$0) {
      super.a($$0);
      this.a.ac().a(aah.a($$0, true));
      this.a();
   }

   @Override
   public void b(eim $$0) {
      super.b($$0);
      this.a.ac().a(aah.a($$0, false));
      this.a();
   }

   @Override
   public void c(eim $$0) {
      super.c($$0);
      this.a.ac().a(aah.a($$0));
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

   public List<vf<?>> d(eil $$0) {
      List<vf<?>> $$1 = Lists.newArrayList();
      $$1.add(new aaf($$0, 0));

      for (eik $$2 : eik.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zy($$2, $$0));
         }
      }

      for (ein $$3 : this.i($$0)) {
         $$1.add(new aai(afp.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(eil $$0) {
      List<vf<?>> $$1 = this.d($$0);

      for (akt $$2 : this.a.ac().t()) {
         for (vf<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<vf<?>> f(eil $$0) {
      List<vf<?>> $$1 = Lists.newArrayList();
      $$1.add(new aaf($$0, 1));

      for (eik $$2 : eik.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zy($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eil $$0) {
      List<vf<?>> $$1 = this.f($$0);

      for (akt $$2 : this.a.ac().t()) {
         for (vf<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(eil $$0) {
      int $$1 = 0;

      for (eik $$2 : eik.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ebt.a<eip> b() {
      return new ebt.a<>(this::i, this::a, atc.n);
   }

   private eip i() {
      eip $$0 = new eip(this);
      this.a($$0::c);
      return $$0;
   }

   private eip a(qy $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
