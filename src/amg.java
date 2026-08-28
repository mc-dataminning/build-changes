import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amg extends arg {
   private final ale h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public amg(ale $$0, xe $$1) {
      super($$1, bri.a.g, bri.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public ale a() {
      return this.h;
   }

   @Override
   public void a(ark $$0) {
      super.a($$0);
      this.i.add($$0.cD());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(ark $$0) {
      super.b($$0);
      this.i.remove($$0.cD());
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
      this.a(azf.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(azf.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final xe e() {
      return xh.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xk(xk.a.a, xe.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<ark> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<ark> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (ark $$5 : $$0) {
            if ($$5.cD().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (ark $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cD().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (ark $$10 : this.g()) {
            if ($$10.cD().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (ark $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public ug a(jq.a $$0) {
      ug $$1 = new ug();
      $$1.a("Name", xe.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      um $$2 = new um();

      for (UUID $$3 : this.i) {
         $$2.add(uv.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static amg a(ug $$0, ale $$1, jq.a $$2) {
      amg $$3 = new amg($$1, xe.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bri.a.a($$0.l("Color")));
      $$3.a(bri.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (vd $$5 : $$0.c("Players", 11)) {
         $$3.a(uv.a($$5));
      }

      return $$3;
   }

   public void c(ark $$0) {
      if (this.i.contains($$0.cD())) {
         this.a($$0);
      }
   }

   public void d(ark $$0) {
      super.b($$0);
   }
}
