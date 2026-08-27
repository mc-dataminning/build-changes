import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class aku extends apr {
   private final ajv h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public aku(ajv $$0, wi $$1) {
      super($$1, bnv.a.g, bnv.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public ajv a() {
      return this.h;
   }

   @Override
   public void a(apv $$0) {
      super.a($$0);
      this.i.add($$0.cw());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(apv $$0) {
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
      this.a(axm.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(axm.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wi e() {
      return wl.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new wo(wo.a.a, wi.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<apv> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<apv> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (apv $$5 : $$0) {
            if ($$5.cw().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (apv $$6 : $$0) {
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
         for (apv $$10 : this.g()) {
            if ($$10.cw().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (apv $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public to a(ip.a $$0) {
      to $$1 = new to();
      $$1.a("Name", wi.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      tu $$2 = new tu();

      for (UUID $$3 : this.i) {
         $$2.add(ud.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static aku a(to $$0, ajv $$1, ip.a $$2) {
      aku $$3 = new aku($$1, wi.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bnv.a.a($$0.l("Color")));
      $$3.a(bnv.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (ul $$5 : $$0.c("Players", 11)) {
         $$3.a(ud.a($$5));
      }

      return $$3;
   }

   public void c(apv $$0) {
      if (this.i.contains($$0.cw())) {
         this.a($$0);
      }
   }

   public void d(apv $$0) {
      super.b($$0);
   }
}
