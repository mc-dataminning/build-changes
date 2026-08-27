import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class all extends exy {
   private final MinecraftServer b;
   private final Set<exq> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public all(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(exx $$0, exq $$1, exv $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afk($$0.cG(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(exx $$0, exq $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(exx $$0) {
      super.a($$0);
      this.b.ah().a(new aej($$0.cG(), null));
      this.a();
   }

   @Override
   public void b(exx $$0, exq $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aej($$0.cG(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(exp $$0, @Nullable exq $$1) {
      exq $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new afa($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new afa($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ext $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afj.a($$1, $$0, afj.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ext $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afj.a($$1, $$0, afj.a.b));
      this.a();
   }

   @Override
   public void a(exq $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(exq $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new afh($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(exq $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ext $$0) {
      super.a($$0);
      this.b.ah().a(afj.a($$0, true));
      this.a();
   }

   @Override
   public void b(ext $$0) {
      super.b($$0);
      this.b.ah().a(afj.a($$0, false));
      this.a();
   }

   @Override
   public void c(ext $$0) {
      super.c($$0);
      this.b.ah().a(afj.a($$0));
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

   public List<zl<?>> d(exq $$0) {
      List<zl<?>> $$1 = Lists.newArrayList();
      $$1.add(new afh($$0, 0));

      for (exp $$2 : exp.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afa($$2, $$0));
         }
      }

      for (exr $$3 : this.i($$0)) {
         $$1.add(new afk($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(exq $$0) {
      List<zl<?>> $$1 = this.d($$0);

      for (aqu $$2 : this.b.ah().t()) {
         for (zl<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zl<?>> f(exq $$0) {
      List<zl<?>> $$1 = Lists.newArrayList();
      $$1.add(new afh($$0, 1));

      for (exp $$2 : exp.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afa($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(exq $$0) {
      List<zl<?>> $$1 = this.f($$0);

      for (aqu $$2 : this.b.ah().t()) {
         for (zl<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(exq $$0) {
      int $$1 = 0;

      for (exp $$2 : exp.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eql.a<exz> b() {
      return new eql.a<>(this::h, this::a, azs.n);
   }

   private exz h() {
      exz $$0 = new exz(this);
      this.a($$0::c);
      return $$0;
   }

   private exz a(uk $$0, jc.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
