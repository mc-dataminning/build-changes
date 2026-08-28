import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alz extends ffn {
   public static final ext<ffo> a = new ext<>("scoreboard", $$0 -> $$0.a().g().h(), $$0 -> {
      alz $$1 = $$0.a().g();
      return ffo.a.a.xmap($$1::a, ffo::a);
   }, bbb.n);
   private final MinecraftServer c;
   private final Set<fff> d = Sets.newHashSet();
   private final List<Runnable> e = Lists.newArrayList();

   public alz(MinecraftServer $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(ffm $$0, fff $$1, ffk $$2) {
      super.a($$0, $$1, $$2);
      if (this.d.contains($$1)) {
         this.c.ag().a(new afo($$0.cI(), $$1.c(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(ffm $$0, fff $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(ffm $$0) {
      super.a($$0);
      this.c.ag().a(new ael($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(ffm $$0, fff $$1) {
      super.b($$0, $$1);
      if (this.d.contains($$1)) {
         this.c.ag().a(new ael($$0.cI(), $$1.c()));
      }

      this.a();
   }

   @Override
   public void a(ffe $$0, @Nullable fff $$1) {
      fff $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.c.ag().a(new afc($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.d.contains($$1)) {
            this.c.ag().a(new afc($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ffi $$1) {
      if (super.a($$0, $$1)) {
         this.c.ag().a(afn.a($$1, $$0, afn.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ffi $$1) {
      super.b($$0, $$1);
      this.c.ag().a(afn.a($$1, $$0, afn.a.b));
      this.a();
   }

   @Override
   public void a(fff $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fff $$0) {
      super.b($$0);
      if (this.d.contains($$0)) {
         this.c.ag().a(new afk($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fff $$0) {
      super.c($$0);
      if (this.d.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ffi $$0) {
      super.a($$0);
      this.c.ag().a(afn.a($$0, true));
      this.a();
   }

   @Override
   public void b(ffi $$0) {
      super.b($$0);
      this.c.ag().a(afn.a($$0, false));
      this.a();
   }

   @Override
   public void c(ffi $$0) {
      super.c($$0);
      this.c.ag().a(afn.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.e.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.e) {
         $$0.run();
      }
   }

   public List<zf<?>> d(fff $$0) {
      List<zf<?>> $$1 = Lists.newArrayList();
      $$1.add(new afk($$0, 0));

      for (ffe $$2 : ffe.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afc($$2, $$0));
         }
      }

      for (ffg $$3 : this.i($$0)) {
         $$1.add(new afo($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fff $$0) {
      List<zf<?>> $$1 = this.d($$0);

      for (arr $$2 : this.c.ag().t()) {
         for (zf<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.add($$0);
   }

   public List<zf<?>> f(fff $$0) {
      List<zf<?>> $$1 = Lists.newArrayList();
      $$1.add(new afk($$0, 1));

      for (ffe $$2 : ffe.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afc($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fff $$0) {
      List<zf<?>> $$1 = this.f($$0);

      for (arr $$2 : this.c.ag().t()) {
         for (zf<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.remove($$0);
   }

   public int h(fff $$0) {
      int $$1 = 0;

      for (ffe $$2 : ffe.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   private ffo h() {
      ffo $$0 = new ffo(this);
      this.a($$0::f);
      return $$0;
   }

   private ffo a(ffo.a $$0) {
      ffo $$1 = this.h();
      $$1.a($$0);
      return $$1;
   }

   public static enum a {
      a,
      b;
   }
}
