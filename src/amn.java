import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amn extends arn {
   private final all h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public amn(all $$0, xl $$1) {
      super($$1, brx.a.g, brx.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public all a() {
      return this.h;
   }

   @Override
   public void a(arr $$0) {
      super.a($$0);
      this.i.add($$0.cI());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(arr $$0) {
      super.b($$0);
      this.i.remove($$0.cI());
   }

   @Override
   public void b() {
      super.b();
      this.i.clear();
   }

   public int c() {
      return this.j;
   }

   public int d() {
      return this.k;
   }

   public void a(int $$0) {
      this.j = $$0;
      this.a(azn.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(azn.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final xl e() {
      return xo.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xr(xr.a.a, xl.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<arr> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<arr> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (arr $$5 : $$0) {
            if ($$5.cI().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (arr $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cI().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (arr $$10 : this.g()) {
            if ($$10.cI().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (arr $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public un a(js.a $$0) {
      un $$1 = new un();
      $$1.a("Name", xl.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      ut $$2 = new ut();

      for (UUID $$3 : this.i) {
         $$2.add(vc.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static amn a(un $$0, all $$1, js.a $$2) {
      amn $$3 = new amn($$1, xl.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(brx.a.a($$0.l("Color")));
      $$3.a(brx.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (vk $$5 : $$0.c("Players", 11)) {
         $$3.a(vc.a($$5));
      }

      return $$3;
   }

   public void c(arr $$0) {
      if (this.i.contains($$0.cI())) {
         this.a($$0);
      }
   }

   public void d(arr $$0) {
      super.b($$0);
   }
}
