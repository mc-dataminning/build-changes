import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alc extends exj {
   private final MinecraftServer b;
   private final Set<exb> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alc(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(exi $$0, exb $$1, exg $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ai().a(new afb($$0.cC(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(exi $$0, exb $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(exi $$0) {
      super.a($$0);
      this.b.ai().a(new aea($$0.cC(), null));
      this.a();
   }

   @Override
   public void b(exi $$0, exb $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ai().a(new aea($$0.cC(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(exa $$0, @Nullable exb $$1) {
      exb $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ai().a(new aer($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ai().a(new aer($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, exe $$1) {
      if (super.a($$0, $$1)) {
         this.b.ai().a(afa.a($$1, $$0, afa.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, exe $$1) {
      super.b($$0, $$1);
      this.b.ai().a(afa.a($$1, $$0, afa.a.b));
      this.a();
   }

   @Override
   public void a(exb $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(exb $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ai().a(new aey($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(exb $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(exe $$0) {
      super.a($$0);
      this.b.ai().a(afa.a($$0, true));
      this.a();
   }

   @Override
   public void b(exe $$0) {
      super.b($$0);
      this.b.ai().a(afa.a($$0, false));
      this.a();
   }

   @Override
   public void c(exe $$0) {
      super.c($$0);
      this.b.ai().a(afa.a($$0));
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

   public List<zb<?>> d(exb $$0) {
      List<zb<?>> $$1 = Lists.newArrayList();
      $$1.add(new aey($$0, 0));

      for (exa $$2 : exa.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aer($$2, $$0));
         }
      }

      for (exc $$3 : this.i($$0)) {
         $$1.add(new afb($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(exb $$0) {
      List<zb<?>> $$1 = this.d($$0);

      for (aqn $$2 : this.b.ai().t()) {
         for (zb<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zb<?>> f(exb $$0) {
      List<zb<?>> $$1 = Lists.newArrayList();
      $$1.add(new aey($$0, 1));

      for (exa $$2 : exa.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aer($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(exb $$0) {
      List<zb<?>> $$1 = this.f($$0);

      for (aqn $$2 : this.b.ai().t()) {
         for (zb<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(exb $$0) {
      int $$1 = 0;

      for (exa $$2 : exa.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public epo.a<exk> b() {
      return new epo.a<>(this::h, this::a, azo.n);
   }

   private exk h() {
      exk $$0 = new exk(this);
      this.a($$0::c);
      return $$0;
   }

   private exk a(tx $$0, jl.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
