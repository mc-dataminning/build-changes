import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ahy extends eng {
   private final MinecraftServer b;
   private final Set<emy> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ahy(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(enf $$0, emy $$1, end $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ae().a(new acm($$0.cy(), $$1.b(), $$2.a(), $$2.d(), $$2.c()));
      }

      this.a();
   }

   @Override
   protected void a(enf $$0, emy $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(enf $$0) {
      super.a($$0);
      this.b.ae().a(new abl($$0.cy(), null));
      this.a();
   }

   @Override
   public void b(enf $$0, emy $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ae().a(new abl($$0.cy(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(emx $$0, @Nullable emy $$1) {
      emy $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ae().a(new acc($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ae().a(new acc($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, enb $$1) {
      if (super.a($$0, $$1)) {
         this.b.ae().a(acl.a($$1, $$0, acl.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, enb $$1) {
      super.b($$0, $$1);
      this.b.ae().a(acl.a($$1, $$0, acl.a.b));
      this.a();
   }

   @Override
   public void a(emy $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(emy $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ae().a(new acj($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(emy $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(enb $$0) {
      super.a($$0);
      this.b.ae().a(acl.a($$0, true));
      this.a();
   }

   @Override
   public void b(enb $$0) {
      super.b($$0);
      this.b.ae().a(acl.a($$0, false));
      this.a();
   }

   @Override
   public void c(enb $$0) {
      super.c($$0);
      this.b.ae().a(acl.a($$0));
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

   public List<xg<?>> d(emy $$0) {
      List<xg<?>> $$1 = Lists.newArrayList();
      $$1.add(new acj($$0, 0));

      for (emx $$2 : emx.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new acc($$2, $$0));
         }
      }

      for (emz $$3 : this.i($$0)) {
         $$1.add(new acm($$3.c(), $$0.b(), $$3.d(), $$3.e(), $$3.f()));
      }

      return $$1;
   }

   public void e(emy $$0) {
      List<xg<?>> $$1 = this.d($$0);

      for (anf $$2 : this.b.ae().t()) {
         for (xg<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<xg<?>> f(emy $$0) {
      List<xg<?>> $$1 = Lists.newArrayList();
      $$1.add(new acj($$0, 1));

      for (emx $$2 : emx.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new acc($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(emy $$0) {
      List<xg<?>> $$1 = this.f($$0);

      for (anf $$2 : this.b.ae().t()) {
         for (xg<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(emy $$0) {
      int $$1 = 0;

      for (emx $$2 : emx.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ege.a<enh> b() {
      return new ege.a<>(this::i, this::a, avx.n);
   }

   private enh i() {
      enh $$0 = new enh(this);
      this.a($$0::c);
      return $$0;
   }

   private enh a(so $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
