import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class afi extends eic {
   private final MinecraftServer a;
   private final Set<ehz> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public afi(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eib $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ac().a(new aaa(afi.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ac().a(new aaa(afi.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, ehz $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ac().a(new aaa(afi.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(ehy $$0, @Nullable ehz $$1) {
      ehz $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ac().a(new zq($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ac().a(new zq($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eia $$1) {
      if (super.a($$0, $$1)) {
         this.a.ac().a(zz.a($$1, $$0, zz.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eia $$1) {
      super.b($$0, $$1);
      this.a.ac().a(zz.a($$1, $$0, zz.a.b));
      this.a();
   }

   @Override
   public void a(ehz $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ehz $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ac().a(new zx($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ehz $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eia $$0) {
      super.a($$0);
      this.a.ac().a(zz.a($$0, true));
      this.a();
   }

   @Override
   public void b(eia $$0) {
      super.b($$0);
      this.a.ac().a(zz.a($$0, false));
      this.a();
   }

   @Override
   public void c(eia $$0) {
      super.c($$0);
      this.a.ac().a(zz.a($$0));
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

   public List<ux<?>> d(ehz $$0) {
      List<ux<?>> $$1 = Lists.newArrayList();
      $$1.add(new zx($$0, 0));

      for (ehy $$2 : ehy.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zq($$2, $$0));
         }
      }

      for (eib $$3 : this.i($$0)) {
         $$1.add(new aaa(afi.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(ehz $$0) {
      List<ux<?>> $$1 = this.d($$0);

      for (akl $$2 : this.a.ac().t()) {
         for (ux<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<ux<?>> f(ehz $$0) {
      List<ux<?>> $$1 = Lists.newArrayList();
      $$1.add(new zx($$0, 1));

      for (ehy $$2 : ehy.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zq($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ehz $$0) {
      List<ux<?>> $$1 = this.f($$0);

      for (akl $$2 : this.a.ac().t()) {
         for (ux<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(ehz $$0) {
      int $$1 = 0;

      for (ehy $$2 : ehy.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ebh.a<eid> b() {
      return new ebh.a<>(this::i, this::a, ass.n);
   }

   private eid i() {
      eid $$0 = new eid(this);
      this.a($$0::c);
      return $$0;
   }

   private eid a(qr $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
