import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alz extends fgc {
   public static final eyi<fgd> a = new eyi<>("scoreboard", $$0 -> $$0.a().g().h(), $$0 -> {
      alz $$1 = $$0.a().g();
      return fgd.a.a.xmap($$1::a, fgd::a);
   }, bbb.n);
   private final MinecraftServer c;
   private final Set<ffu> d = Sets.newHashSet();
   private final List<Runnable> e = Lists.newArrayList();

   public alz(MinecraftServer $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(fgb $$0, ffu $$1, ffz $$2) {
      super.a($$0, $$1, $$2);
      if (this.d.contains($$1)) {
         this.c.ag().a(new afo($$0.cH(), $$1.c(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fgb $$0, ffu $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fgb $$0) {
      super.a($$0);
      this.c.ag().a(new ael($$0.cH(), null));
      this.a();
   }

   @Override
   public void b(fgb $$0, ffu $$1) {
      super.b($$0, $$1);
      if (this.d.contains($$1)) {
         this.c.ag().a(new ael($$0.cH(), $$1.c()));
      }

      this.a();
   }

   @Override
   public void a(fft $$0, @Nullable ffu $$1) {
      ffu $$2 = this.a($$0);
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
   public boolean a(String $$0, ffx $$1) {
      if (super.a($$0, $$1)) {
         this.c.ag().a(afn.a($$1, $$0, afn.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ffx $$1) {
      super.b($$0, $$1);
      this.c.ag().a(afn.a($$1, $$0, afn.a.b));
      this.a();
   }

   @Override
   public void a(ffu $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ffu $$0) {
      super.b($$0);
      if (this.d.contains($$0)) {
         this.c.ag().a(new afk($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ffu $$0) {
      super.c($$0);
      if (this.d.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ffx $$0) {
      super.a($$0);
      this.c.ag().a(afn.a($$0, true));
      this.a();
   }

   @Override
   public void b(ffx $$0) {
      super.b($$0);
      this.c.ag().a(afn.a($$0, false));
      this.a();
   }

   @Override
   public void c(ffx $$0) {
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

   public List<zf<?>> d(ffu $$0) {
      List<zf<?>> $$1 = Lists.newArrayList();
      $$1.add(new afk($$0, 0));

      for (fft $$2 : fft.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afc($$2, $$0));
         }
      }

      for (ffv $$3 : this.i($$0)) {
         $$1.add(new afo($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ffu $$0) {
      List<zf<?>> $$1 = this.d($$0);

      for (arr $$2 : this.c.ag().t()) {
         for (zf<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.add($$0);
   }

   public List<zf<?>> f(ffu $$0) {
      List<zf<?>> $$1 = Lists.newArrayList();
      $$1.add(new afk($$0, 1));

      for (fft $$2 : fft.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afc($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ffu $$0) {
      List<zf<?>> $$1 = this.f($$0);

      for (arr $$2 : this.c.ag().t()) {
         for (zf<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.remove($$0);
   }

   public int h(ffu $$0) {
      int $$1 = 0;

      for (fft $$2 : fft.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   private fgd h() {
      fgd $$0 = new fgd(this);
      this.a($$0::f);
      return $$0;
   }

   private fgd a(fgd.a $$0) {
      fgd $$1 = this.h();
      $$1.a($$0);
      return $$1;
   }

   public static enum a {
      a,
      b;
   }
}
