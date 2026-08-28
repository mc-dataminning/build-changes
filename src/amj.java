import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amj extends arj {
   private final alh h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public amj(alh $$0, xh $$1) {
      super($$1, bro.a.g, bro.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public alh a() {
      return this.h;
   }

   @Override
   public void a(arn $$0) {
      super.a($$0);
      this.i.add($$0.cH());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(arn $$0) {
      super.b($$0);
      this.i.remove($$0.cH());
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
      this.a(azj.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(azj.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final xh e() {
      return xk.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xn(xn.a.a, xh.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<arn> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<arn> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (arn $$5 : $$0) {
            if ($$5.cH().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (arn $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cH().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (arn $$10 : this.g()) {
            if ($$10.cH().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (arn $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public uj a(jr.a $$0) {
      uj $$1 = new uj();
      $$1.a("Name", xh.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      up $$2 = new up();

      for (UUID $$3 : this.i) {
         $$2.add(uy.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static amj a(uj $$0, alh $$1, jr.a $$2) {
      amj $$3 = new amj($$1, xh.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bro.a.a($$0.l("Color")));
      $$3.a(bro.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (vg $$5 : $$0.c("Players", 11)) {
         $$3.a(uy.a($$5));
      }

      return $$3;
   }

   public void c(arn $$0) {
      if (this.i.contains($$0.cH())) {
         this.a($$0);
      }
   }

   public void d(arn $$0) {
      super.b($$0);
   }
}
