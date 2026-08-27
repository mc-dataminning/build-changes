import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ahu extends emq {
   private final MinecraftServer b;
   private final Set<emi> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ahu(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(emp $$0, emi $$1, emn $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ae().a(new aci($$0.cy(), $$1.b(), $$2.a(), $$2.d(), $$2.c()));
      }

      this.a();
   }

   @Override
   protected void a(emp $$0, emi $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(emp $$0) {
      super.a($$0);
      this.b.ae().a(new abh($$0.cy(), null));
      this.a();
   }

   @Override
   public void b(emp $$0, emi $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ae().a(new abh($$0.cy(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(emh $$0, @Nullable emi $$1) {
      emi $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ae().a(new aby($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ae().a(new aby($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eml $$1) {
      if (super.a($$0, $$1)) {
         this.b.ae().a(ach.a($$1, $$0, ach.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eml $$1) {
      super.b($$0, $$1);
      this.b.ae().a(ach.a($$1, $$0, ach.a.b));
      this.a();
   }

   @Override
   public void a(emi $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(emi $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ae().a(new acf($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(emi $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eml $$0) {
      super.a($$0);
      this.b.ae().a(ach.a($$0, true));
      this.a();
   }

   @Override
   public void b(eml $$0) {
      super.b($$0);
      this.b.ae().a(ach.a($$0, false));
      this.a();
   }

   @Override
   public void c(eml $$0) {
      super.c($$0);
      this.b.ae().a(ach.a($$0));
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

   public List<xd<?>> d(emi $$0) {
      List<xd<?>> $$1 = Lists.newArrayList();
      $$1.add(new acf($$0, 0));

      for (emh $$2 : emh.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aby($$2, $$0));
         }
      }

      for (emj $$3 : this.i($$0)) {
         $$1.add(new aci($$3.c(), $$0.b(), $$3.d(), $$3.e(), $$3.f()));
      }

      return $$1;
   }

   public void e(emi $$0) {
      List<xd<?>> $$1 = this.d($$0);

      for (ana $$2 : this.b.ae().t()) {
         for (xd<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<xd<?>> f(emi $$0) {
      List<xd<?>> $$1 = Lists.newArrayList();
      $$1.add(new acf($$0, 1));

      for (emh $$2 : emh.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aby($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(emi $$0) {
      List<xd<?>> $$1 = this.f($$0);

      for (ana $$2 : this.b.ae().t()) {
         for (xd<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(emi $$0) {
      int $$1 = 0;

      for (emh $$2 : emh.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public efp.a<emr> b() {
      return new efp.a<>(this::i, this::a, avq.n);
   }

   private emr i() {
      emr $$0 = new emr(this);
      this.a($$0::c);
      return $$0;
   }

   private emr a(sl $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
