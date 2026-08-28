import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alk extends eye {
   private final MinecraftServer b;
   private final Set<exw> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alk(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(eyd $$0, exw $$1, eyb $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afi($$0.cC(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(eyd $$0, exw $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(eyd $$0) {
      super.a($$0);
      this.b.ah().a(new aeh($$0.cC(), null));
      this.a();
   }

   @Override
   public void b(eyd $$0, exw $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aeh($$0.cC(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(exv $$0, @Nullable exw $$1) {
      exw $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aey($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aey($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, exz $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afh.a($$1, $$0, afh.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, exz $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afh.a($$1, $$0, afh.a.b));
      this.a();
   }

   @Override
   public void a(exw $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(exw $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aff($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(exw $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(exz $$0) {
      super.a($$0);
      this.b.ah().a(afh.a($$0, true));
      this.a();
   }

   @Override
   public void b(exz $$0) {
      super.b($$0);
      this.b.ah().a(afh.a($$0, false));
      this.a();
   }

   @Override
   public void c(exz $$0) {
      super.c($$0);
      this.b.ah().a(afh.a($$0));
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

   public List<zg<?>> d(exw $$0) {
      List<zg<?>> $$1 = Lists.newArrayList();
      $$1.add(new aff($$0, 0));

      for (exv $$2 : exv.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aey($$2, $$0));
         }
      }

      for (exx $$3 : this.i($$0)) {
         $$1.add(new afi($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(exw $$0) {
      List<zg<?>> $$1 = this.d($$0);

      for (aqv $$2 : this.b.ah().t()) {
         for (zg<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zg<?>> f(exw $$0) {
      List<zg<?>> $$1 = Lists.newArrayList();
      $$1.add(new aff($$0, 1));

      for (exv $$2 : exv.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aey($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(exw $$0) {
      List<zg<?>> $$1 = this.f($$0);

      for (aqv $$2 : this.b.ah().t()) {
         for (zg<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(exw $$0) {
      int $$1 = 0;

      for (exv $$2 : exv.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eqj.a<eyf> b() {
      return new eqj.a<>(this::h, this::a, azw.n);
   }

   private eyf h() {
      eyf $$0 = new eyf(this);
      this.a($$0::c);
      return $$0;
   }

   private eyf a(ub $$0, jo.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
