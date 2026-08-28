import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alj extends eya {
   private final MinecraftServer b;
   private final Set<exs> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alj(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(exz $$0, exs $$1, exx $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afh($$0.cC(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(exz $$0, exs $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(exz $$0) {
      super.a($$0);
      this.b.ah().a(new aeg($$0.cC(), null));
      this.a();
   }

   @Override
   public void b(exz $$0, exs $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aeg($$0.cC(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(exr $$0, @Nullable exs $$1) {
      exs $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aex($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aex($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, exv $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afg.a($$1, $$0, afg.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, exv $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afg.a($$1, $$0, afg.a.b));
      this.a();
   }

   @Override
   public void a(exs $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(exs $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new afe($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(exs $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(exv $$0) {
      super.a($$0);
      this.b.ah().a(afg.a($$0, true));
      this.a();
   }

   @Override
   public void b(exv $$0) {
      super.b($$0);
      this.b.ah().a(afg.a($$0, false));
      this.a();
   }

   @Override
   public void c(exv $$0) {
      super.c($$0);
      this.b.ah().a(afg.a($$0));
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

   public List<zf<?>> d(exs $$0) {
      List<zf<?>> $$1 = Lists.newArrayList();
      $$1.add(new afe($$0, 0));

      for (exr $$2 : exr.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aex($$2, $$0));
         }
      }

      for (ext $$3 : this.i($$0)) {
         $$1.add(new afh($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(exs $$0) {
      List<zf<?>> $$1 = this.d($$0);

      for (aqu $$2 : this.b.ah().t()) {
         for (zf<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zf<?>> f(exs $$0) {
      List<zf<?>> $$1 = Lists.newArrayList();
      $$1.add(new afe($$0, 1));

      for (exr $$2 : exr.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aex($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(exs $$0) {
      List<zf<?>> $$1 = this.f($$0);

      for (aqu $$2 : this.b.ah().t()) {
         for (zf<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(exs $$0) {
      int $$1 = 0;

      for (exr $$2 : exr.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eqf.a<eyb> b() {
      return new eqf.a<>(this::h, this::a, azv.n);
   }

   private eyb h() {
      eyb $$0 = new eyb(this);
      this.a($$0::c);
      return $$0;
   }

   private eyb a(ua $$0, jo.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
