import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class aks extends app {
   private final ajt h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public aks(ajt $$0, wg $$1) {
      super($$1, bnq.a.g, bnq.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public ajt a() {
      return this.h;
   }

   @Override
   public void a(apt $$0) {
      super.a($$0);
      this.i.add($$0.cw());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(apt $$0) {
      super.b($$0);
      this.i.remove($$0.cw());
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
      this.a(axk.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(axk.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wg e() {
      return wj.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new wm(wm.a.a, wg.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<apt> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<apt> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (apt $$5 : $$0) {
            if ($$5.cw().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (apt $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cw().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (apt $$10 : this.g()) {
            if ($$10.cw().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (apt $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public tm a(in.a $$0) {
      tm $$1 = new tm();
      $$1.a("Name", wg.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      ts $$2 = new ts();

      for (UUID $$3 : this.i) {
         $$2.add(ub.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static aks a(tm $$0, ajt $$1, in.a $$2) {
      aks $$3 = new aks($$1, wg.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bnq.a.a($$0.l("Color")));
      $$3.a(bnq.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (uj $$5 : $$0.c("Players", 11)) {
         $$3.a(ub.a($$5));
      }

      return $$3;
   }

   public void c(apt $$0) {
      if (this.i.contains($$0.cw())) {
         this.a($$0);
      }
   }

   public void d(apt $$0) {
      super.b($$0);
   }
}
