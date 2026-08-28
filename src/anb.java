import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class anb extends asd {
   private final alz h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public anb(alz $$0, xv $$1) {
      super($$1, bsy.a.g, bsy.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public alz a() {
      return this.h;
   }

   @Override
   public void a(asi $$0) {
      super.a($$0);
      this.i.add($$0.cG());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(asi $$0) {
      super.b($$0);
      this.i.remove($$0.cG());
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
      this.a(bae.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(bae.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final xv e() {
      return xy.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new yb(yb.a.a, xv.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<asi> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<asi> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (asi $$5 : $$0) {
            if ($$5.cG().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (asi $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cG().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (asi $$10 : this.g()) {
            if ($$10.cG().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (asi $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public ux a(js.a $$0) {
      ux $$1 = new ux();
      $$1.a("Name", xv.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      vd $$2 = new vd();

      for (UUID $$3 : this.i) {
         $$2.add(vm.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static anb a(ux $$0, alz $$1, js.a $$2) {
      anb $$3 = new anb($$1, xv.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bsy.a.a($$0.l("Color")));
      $$3.a(bsy.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (vu $$5 : $$0.c("Players", 11)) {
         $$3.a(vm.a($$5));
      }

      return $$3;
   }

   public void c(asi $$0) {
      if (this.i.contains($$0.cG())) {
         this.a($$0);
      }
   }

   public void d(asi $$0) {
      super.b($$0);
   }
}
