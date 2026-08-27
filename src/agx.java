import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class agx extends ekh {
   private final MinecraftServer a;
   private final Set<eke> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public agx(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ekg $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ac().a(new abn(agx.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ac().a(new abn(agx.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, eke $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ac().a(new abn(agx.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(ekd $$0, @Nullable eke $$1) {
      eke $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ac().a(new abd($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ac().a(new abd($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ekf $$1) {
      if (super.a($$0, $$1)) {
         this.a.ac().a(abm.a($$1, $$0, abm.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ekf $$1) {
      super.b($$0, $$1);
      this.a.ac().a(abm.a($$1, $$0, abm.a.b));
      this.a();
   }

   @Override
   public void a(eke $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eke $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ac().a(new abk($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eke $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ekf $$0) {
      super.a($$0);
      this.a.ac().a(abm.a($$0, true));
      this.a();
   }

   @Override
   public void b(ekf $$0) {
      super.b($$0);
      this.a.ac().a(abm.a($$0, false));
      this.a();
   }

   @Override
   public void c(ekf $$0) {
      super.c($$0);
      this.a.ac().a(abm.a($$0));
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

   public List<wk<?>> d(eke $$0) {
      List<wk<?>> $$1 = Lists.newArrayList();
      $$1.add(new abk($$0, 0));

      for (ekd $$2 : ekd.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abd($$2, $$0));
         }
      }

      for (ekg $$3 : this.i($$0)) {
         $$1.add(new abn(agx.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(eke $$0) {
      List<wk<?>> $$1 = this.d($$0);

      for (amb $$2 : this.a.ac().t()) {
         for (wk<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<wk<?>> f(eke $$0) {
      List<wk<?>> $$1 = Lists.newArrayList();
      $$1.add(new abk($$0, 1));

      for (ekd $$2 : ekd.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abd($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eke $$0) {
      List<wk<?>> $$1 = this.f($$0);

      for (amb $$2 : this.a.ac().t()) {
         for (wk<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(eke $$0) {
      int $$1 = 0;

      for (ekd $$2 : ekd.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public edl.a<eki> b() {
      return new edl.a<>(this::i, this::a, aun.n);
   }

   private eki i() {
      eki $$0 = new eki(this);
      this.a($$0::c);
      return $$0;
   }

   private eki a(rz $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
