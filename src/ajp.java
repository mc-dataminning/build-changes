import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ajp extends eow {
   private final MinecraftServer b;
   private final Set<eoo> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ajp(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(eov $$0, eoo $$1, eot $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ae().a(new ads($$0.cy(), $$1.b(), $$2.a(), $$2.d(), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(eov $$0, eoo $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(eov $$0) {
      super.a($$0);
      this.b.ae().a(new acr($$0.cy(), null));
      this.a();
   }

   @Override
   public void b(eov $$0, eoo $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ae().a(new acr($$0.cy(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(eon $$0, @Nullable eoo $$1) {
      eoo $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ae().a(new adi($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ae().a(new adi($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eor $$1) {
      if (super.a($$0, $$1)) {
         this.b.ae().a(adr.a($$1, $$0, adr.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eor $$1) {
      super.b($$0, $$1);
      this.b.ae().a(adr.a($$1, $$0, adr.a.b));
      this.a();
   }

   @Override
   public void a(eoo $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eoo $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ae().a(new adp($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eoo $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eor $$0) {
      super.a($$0);
      this.b.ae().a(adr.a($$0, true));
      this.a();
   }

   @Override
   public void b(eor $$0) {
      super.b($$0);
      this.b.ae().a(adr.a($$0, false));
      this.a();
   }

   @Override
   public void c(eor $$0) {
      super.c($$0);
      this.b.ae().a(adr.a($$0));
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

   public List<xx<?>> d(eoo $$0) {
      List<xx<?>> $$1 = Lists.newArrayList();
      $$1.add(new adp($$0, 0));

      for (eon $$2 : eon.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new adi($$2, $$0));
         }
      }

      for (eop $$3 : this.i($$0)) {
         $$1.add(new ads($$3.c(), $$0.b(), $$3.d(), $$3.e(), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(eoo $$0) {
      List<xx<?>> $$1 = this.d($$0);

      for (aow $$2 : this.b.ae().t()) {
         for (xx<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<xx<?>> f(eoo $$0) {
      List<xx<?>> $$1 = Lists.newArrayList();
      $$1.add(new adp($$0, 1));

      for (eon $$2 : eon.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new adi($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eoo $$0) {
      List<xx<?>> $$1 = this.f($$0);

      for (aow $$2 : this.b.ae().t()) {
         for (xx<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(eoo $$0) {
      int $$1 = 0;

      for (eon $$2 : eon.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ehu.a<eox> b() {
      return new ehu.a<>(this::i, this::a, axo.n);
   }

   private eox i() {
      eox $$0 = new eox(this);
      this.a($$0::c);
      return $$0;
   }

   private eox a(sw $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
