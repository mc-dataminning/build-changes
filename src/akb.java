import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class akb extends aox {
   private final ajc h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public akb(ajc $$0, vs $$1) {
      super($$1, bmb.a.g, bmb.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public ajc a() {
      return this.h;
   }

   @Override
   public void a(apb $$0) {
      super.a($$0);
      this.i.add($$0.ct());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(apb $$0) {
      super.b($$0);
      this.i.remove($$0.ct());
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
      this.a(awm.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(awm.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final vs e() {
      return vv.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new vy(vy.a.a, vs.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<apb> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<apb> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (apb $$5 : $$0) {
            if ($$5.ct().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (apb $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.ct().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (apb $$10 : this.h()) {
            if ($$10.ct().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (apb $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public sy f() {
      sy $$0 = new sy();
      $$0.a("Name", vs.a.a(this.a));
      $$0.a("Visible", this.g());
      $$0.a("Value", this.j);
      $$0.a("Max", this.k);
      $$0.a("Color", this.l().b());
      $$0.a("Overlay", this.m().a());
      $$0.a("DarkenScreen", this.n());
      $$0.a("PlayBossMusic", this.o());
      $$0.a("CreateWorldFog", this.p());
      te $$1 = new te();

      for (UUID $$2 : this.i) {
         $$1.add(tn.a($$2));
      }

      $$0.a("Players", $$1);
      return $$0;
   }

   public static akb a(sy $$0, ajc $$1) {
      akb $$2 = new akb($$1, vs.a.a($$0.l("Name")));
      $$2.d($$0.q("Visible"));
      $$2.a($$0.h("Value"));
      $$2.b($$0.h("Max"));
      $$2.a(bmb.a.a($$0.l("Color")));
      $$2.a(bmb.b.a($$0.l("Overlay")));
      $$2.a($$0.q("DarkenScreen"));
      $$2.b($$0.q("PlayBossMusic"));
      $$2.c($$0.q("CreateWorldFog"));

      for (tv $$4 : $$0.c("Players", 11)) {
         $$2.a(tn.a($$4));
      }

      return $$2;
   }

   public void c(apb $$0) {
      if (this.i.contains($$0.ct())) {
         this.a($$0);
      }
   }

   public void d(apb $$0) {
      super.b($$0);
   }
}
