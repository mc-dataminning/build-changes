import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ama extends fam {
   private final MinecraftServer b;
   private final Set<fae> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ama(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fal $$0, fae $$1, faj $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afu($$0.cJ(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fal $$0, fae $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fal $$0) {
      super.a($$0);
      this.b.ag().a(new aer($$0.cJ(), null));
      this.a();
   }

   @Override
   public void b(fal $$0, fae $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aer($$0.cJ(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fad $$0, @Nullable fae $$1) {
      fae $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new afi($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new afi($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fah $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(aft.a($$1, $$0, aft.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fah $$1) {
      super.b($$0, $$1);
      this.b.ag().a(aft.a($$1, $$0, aft.a.b));
      this.a();
   }

   @Override
   public void a(fae $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fae $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afq($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fae $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fah $$0) {
      super.a($$0);
      this.b.ag().a(aft.a($$0, true));
      this.a();
   }

   @Override
   public void b(fah $$0) {
      super.b($$0);
      this.b.ag().a(aft.a($$0, false));
      this.a();
   }

   @Override
   public void c(fah $$0) {
      super.c($$0);
      this.b.ag().a(aft.a($$0));
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

   public List<zo<?>> d(fae $$0) {
      List<zo<?>> $$1 = Lists.newArrayList();
      $$1.add(new afq($$0, 0));

      for (fad $$2 : fad.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afi($$2, $$0));
         }
      }

      for (faf $$3 : this.i($$0)) {
         $$1.add(new afu($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fae $$0) {
      List<zo<?>> $$1 = this.d($$0);

      for (arn $$2 : this.b.ag().t()) {
         for (zo<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zo<?>> f(fae $$0) {
      List<zo<?>> $$1 = Lists.newArrayList();
      $$1.add(new afq($$0, 1));

      for (fad $$2 : fad.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afi($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fae $$0) {
      List<zo<?>> $$1 = this.f($$0);

      for (arn $$2 : this.b.ag().t()) {
         for (zo<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fae $$0) {
      int $$1 = 0;

      for (fad $$2 : fad.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public esq.a<fan> b() {
      return new esq.a<>(this::h, this::a, bas.n);
   }

   private fan h() {
      fan $$0 = new fan(this);
      this.a($$0::c);
      return $$0;
   }

   private fan a(uj $$0, jr.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
