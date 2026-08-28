import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class ami extends arm {
   private final alg h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public ami(alg $$0, wy $$1) {
      super($$1, btt.a.g, btt.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public alg a() {
      return this.h;
   }

   @Override
   public void a(arr $$0) {
      super.a($$0);
      this.i.add($$0.cG());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(arr $$0) {
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
      this.a(azm.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(azm.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wy e() {
      return xb.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xe.e(wy.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<arr> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<arr> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (arr $$5 : $$0) {
            if ($$5.cG().equals($$3)) {
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
         for (arr $$10 : this.g()) {
            if ($$10.cG().equals($$9)) {
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

   public tz a(jg.a $$0) {
      tz $$1 = new tz();
      $$1.a("Name", xa.a, $$0.a(un.a), this.a);
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      uf $$2 = new uf();

      for (UUID $$3 : this.i) {
         $$2.add(uo.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static ami a(tz $$0, alg $$1, jg.a $$2) {
      ale<uw> $$3 = $$2.a(un.a);
      wy $$4 = $$0.<wy>a("Name", xa.a, $$3).orElseThrow();
      ami $$5 = new ami($$1, $$4);
      $$5.d($$0.q("Visible"));
      $$5.a($$0.h("Value"));
      $$5.b($$0.h("Max"));
      $$5.a(btt.a.a($$0.l("Color")));
      $$5.a(btt.b.a($$0.l("Overlay")));
      $$5.a($$0.q("DarkenScreen"));
      $$5.b($$0.q("PlayBossMusic"));
      $$5.c($$0.q("CreateWorldFog"));

      for (uw $$7 : $$0.c("Players", 11)) {
         $$5.a(uo.a($$7));
      }

      return $$5;
   }

   public void c(arr $$0) {
      if (this.i.contains($$0.cG())) {
         this.a($$0);
      }
   }

   public void d(arr $$0) {
      super.b($$0);
   }
}
