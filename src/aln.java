import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class aln extends fcd {
   private final MinecraftServer b;
   private final Set<fbv> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public aln(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fcc $$0, fbv $$1, fca $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aff($$0.cI(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fcc $$0, fbv $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fcc $$0) {
      super.a($$0);
      this.b.ag().a(new aec($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fcc $$0, fbv $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aec($$0.cI(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fbu $$0, @Nullable fbv $$1) {
      fbv $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new aet($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new aet($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fby $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(afe.a($$1, $$0, afe.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fby $$1) {
      super.b($$0, $$1);
      this.b.ag().a(afe.a($$1, $$0, afe.a.b));
      this.a();
   }

   @Override
   public void a(fbv $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fbv $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afb($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fbv $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fby $$0) {
      super.a($$0);
      this.b.ag().a(afe.a($$0, true));
      this.a();
   }

   @Override
   public void b(fby $$0) {
      super.b($$0);
      this.b.ag().a(afe.a($$0, false));
      this.a();
   }

   @Override
   public void c(fby $$0) {
      super.c($$0);
      this.b.ag().a(afe.a($$0));
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

   public List<yv<?>> d(fbv $$0) {
      List<yv<?>> $$1 = Lists.newArrayList();
      $$1.add(new afb($$0, 0));

      for (fbu $$2 : fbu.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aet($$2, $$0));
         }
      }

      for (fbw $$3 : this.i($$0)) {
         $$1.add(new aff($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fbv $$0) {
      List<yv<?>> $$1 = this.d($$0);

      for (ard $$2 : this.b.ag().t()) {
         for (yv<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<yv<?>> f(fbv $$0) {
      List<yv<?>> $$1 = Lists.newArrayList();
      $$1.add(new afb($$0, 1));

      for (fbu $$2 : fbu.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aet($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fbv $$0) {
      List<yv<?>> $$1 = this.f($$0);

      for (ard $$2 : this.b.ag().t()) {
         for (yv<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fbv $$0) {
      int $$1 = 0;

      for (fbu $$2 : fbu.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public euj.a<fce> b() {
      return new euj.a<>(this::h, this::a, bam.n);
   }

   private fce h() {
      fce $$0 = new fce(this);
      this.a($$0::c);
      return $$0;
   }

   private fce a(tq $$0, jt.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
