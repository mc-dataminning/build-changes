import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class agz extends ekt {
   private final MinecraftServer a;
   private final Set<ekq> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public agz(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eks $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ae().a(new abn(agz.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ae().a(new abn(agz.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, ekq $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ae().a(new abn(agz.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(ekp $$0, @Nullable ekq $$1) {
      ekq $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ae().a(new abd($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ae().a(new abd($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ekr $$1) {
      if (super.a($$0, $$1)) {
         this.a.ae().a(abm.a($$1, $$0, abm.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ekr $$1) {
      super.b($$0, $$1);
      this.a.ae().a(abm.a($$1, $$0, abm.a.b));
      this.a();
   }

   @Override
   public void a(ekq $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ekq $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ae().a(new abk($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ekq $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ekr $$0) {
      super.a($$0);
      this.a.ae().a(abm.a($$0, true));
      this.a();
   }

   @Override
   public void b(ekr $$0) {
      super.b($$0);
      this.a.ae().a(abm.a($$0, false));
      this.a();
   }

   @Override
   public void c(ekr $$0) {
      super.c($$0);
      this.a.ae().a(abm.a($$0));
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

   public List<wk<?>> d(ekq $$0) {
      List<wk<?>> $$1 = Lists.newArrayList();
      $$1.add(new abk($$0, 0));

      for (ekp $$2 : ekp.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abd($$2, $$0));
         }
      }

      for (eks $$3 : this.i($$0)) {
         $$1.add(new abn(agz.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(ekq $$0) {
      List<wk<?>> $$1 = this.d($$0);

      for (amf $$2 : this.a.ae().t()) {
         for (wk<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<wk<?>> f(ekq $$0) {
      List<wk<?>> $$1 = Lists.newArrayList();
      $$1.add(new abk($$0, 1));

      for (ekp $$2 : ekp.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abd($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ekq $$0) {
      List<wk<?>> $$1 = this.f($$0);

      for (amf $$2 : this.a.ae().t()) {
         for (wk<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(ekq $$0) {
      int $$1 = 0;

      for (ekp $$2 : ekp.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public edx.a<eku> b() {
      return new edx.a<>(this::i, this::a, aus.n);
   }

   private eku i() {
      eku $$0 = new eku(this);
      this.a($$0::c);
      return $$0;
   }

   private eku a(rz $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
