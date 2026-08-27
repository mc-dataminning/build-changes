import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class akk extends ete {
   private final MinecraftServer b;
   private final Set<esw> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public akk(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(etd $$0, esw $$1, etb $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new ael($$0.cy(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(etd $$0, esw $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(etd $$0) {
      super.a($$0);
      this.b.ah().a(new adk($$0.cy(), null));
      this.a();
   }

   @Override
   public void b(etd $$0, esw $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new adk($$0.cy(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(esv $$0, @Nullable esw $$1) {
      esw $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aeb($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aeb($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, esz $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(aek.a($$1, $$0, aek.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, esz $$1) {
      super.b($$0, $$1);
      this.b.ah().a(aek.a($$1, $$0, aek.a.b));
      this.a();
   }

   @Override
   public void a(esw $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(esw $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aei($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(esw $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);
      this.b.ah().a(aek.a($$0, true));
      this.a();
   }

   @Override
   public void b(esz $$0) {
      super.b($$0);
      this.b.ah().a(aek.a($$0, false));
      this.a();
   }

   @Override
   public void c(esz $$0) {
      super.c($$0);
      this.b.ah().a(aek.a($$0));
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

   public List<yn<?>> d(esw $$0) {
      List<yn<?>> $$1 = Lists.newArrayList();
      $$1.add(new aei($$0, 0));

      for (esv $$2 : esv.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aeb($$2, $$0));
         }
      }

      for (esx $$3 : this.i($$0)) {
         $$1.add(new ael($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(esw $$0) {
      List<yn<?>> $$1 = this.d($$0);

      for (apt $$2 : this.b.ah().t()) {
         for (yn<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<yn<?>> f(esw $$0) {
      List<yn<?>> $$1 = Lists.newArrayList();
      $$1.add(new aei($$0, 1));

      for (esv $$2 : esv.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aeb($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(esw $$0) {
      List<yn<?>> $$1 = this.f($$0);

      for (apt $$2 : this.b.ah().t()) {
         for (yn<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(esw $$0) {
      int $$1 = 0;

      for (esv $$2 : esv.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public elz.a<etf> b() {
      return new elz.a<>(this::h, this::a, ayq.n);
   }

   private etf h() {
      etf $$0 = new etf(this);
      this.a($$0::c);
      return $$0;
   }

   private etf a(tm $$0, in.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
