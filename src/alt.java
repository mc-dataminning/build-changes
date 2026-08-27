import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class alt extends aqq {
   private final akt j;
   private final Set<UUID> k = Sets.newHashSet();
   private int l;
   private int m = 100;

   public alt(akt $$0, xe $$1) {
      super($$1, bpq.a.g, bpq.b.a);
      this.j = $$0;
      this.a(0.0F);
   }

   public akt a() {
      return this.j;
   }

   @Override
   public void a(aqu $$0) {
      super.a($$0);
      this.k.add($$0.cE());
   }

   public void a(UUID $$0) {
      this.k.add($$0);
   }

   @Override
   public void b(aqu $$0) {
      super.b($$0);
      this.k.remove($$0.cE());
   }

   @Override
   public void b() {
      super.b();
      this.k.clear();
   }

   public int c() {
      return this.l;
   }

   public int d() {
      return this.m;
   }

   public void a(int $$0) {
      this.l = $$0;
      this.a(aym.a((float)$$0 / (float)this.m, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.m = $$0;
      this.a(aym.a((float)this.l / (float)$$0, 0.0F, 1.0F));
   }

   public final xe e() {
      return xh.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xk(xk.a.a, xe.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<aqu> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<aqu> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.k) {
         boolean $$4 = false;

         for (aqu $$5 : $$0) {
            if ($$5.cE().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (aqu $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.k) {
            if ($$6.cE().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (aqu $$10 : this.g()) {
            if ($$10.cE().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.k.remove($$9);
      }

      for (aqu $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public uk a(jc.a $$0) {
      uk $$1 = new uk();
      $$1.a("Name", xe.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.l);
      $$1.a("Max", this.m);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      uq $$2 = new uq();

      for (UUID $$3 : this.k) {
         $$2.add(uz.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static alt a(uk $$0, akt $$1, jc.a $$2) {
      alt $$3 = new alt($$1, xe.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bpq.a.a($$0.l("Color")));
      $$3.a(bpq.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (vh $$5 : $$0.c("Players", 11)) {
         $$3.a(uz.a($$5));
      }

      return $$3;
   }

   public void c(aqu $$0) {
      if (this.k.contains($$0.cE())) {
         this.a($$0);
      }
   }

   public void d(aqu $$0) {
      super.b($$0);
   }
}
