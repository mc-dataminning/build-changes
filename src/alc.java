import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alc extends exd {
   private final MinecraftServer b;
   private final Set<ewv> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alc(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(exc $$0, ewv $$1, exa $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afb($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(exc $$0, ewv $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(exc $$0) {
      super.a($$0);
      this.b.ah().a(new aea($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(exc $$0, ewv $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aea($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(ewu $$0, @Nullable ewv $$1) {
      ewv $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aer($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aer($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ewy $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afa.a($$1, $$0, afa.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ewy $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afa.a($$1, $$0, afa.a.b));
      this.a();
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ewv $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aey($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ewv $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ewy $$0) {
      super.a($$0);
      this.b.ah().a(afa.a($$0, true));
      this.a();
   }

   @Override
   public void b(ewy $$0) {
      super.b($$0);
      this.b.ah().a(afa.a($$0, false));
      this.a();
   }

   @Override
   public void c(ewy $$0) {
      super.c($$0);
      this.b.ah().a(afa.a($$0));
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

   public List<zb<?>> d(ewv $$0) {
      List<zb<?>> $$1 = Lists.newArrayList();
      $$1.add(new aey($$0, 0));

      for (ewu $$2 : ewu.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aer($$2, $$0));
         }
      }

      for (eww $$3 : this.i($$0)) {
         $$1.add(new afb($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ewv $$0) {
      List<zb<?>> $$1 = this.d($$0);

      for (aql $$2 : this.b.ah().t()) {
         for (zb<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zb<?>> f(ewv $$0) {
      List<zb<?>> $$1 = Lists.newArrayList();
      $$1.add(new aey($$0, 1));

      for (ewu $$2 : ewu.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aer($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ewv $$0) {
      List<zb<?>> $$1 = this.f($$0);

      for (aql $$2 : this.b.ah().t()) {
         for (zb<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(ewv $$0) {
      int $$1 = 0;

      for (ewu $$2 : ewu.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public epi.a<exe> b() {
      return new epi.a<>(this::h, this::a, azl.n);
   }

   private exe h() {
      exe $$0 = new exe(this);
      this.a($$0::c);
      return $$0;
   }

   private exe a(tx $$0, jl.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
