import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class ale extends aqb {
   private final akf h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public ale(akf $$0, ws $$1) {
      super($$1, bog.a.g, bog.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public akf a() {
      return this.h;
   }

   @Override
   public void a(aqf $$0) {
      super.a($$0);
      this.i.add($$0.cx());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(aqf $$0) {
      super.b($$0);
      this.i.remove($$0.cx());
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
      this.a(axw.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(axw.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final ws e() {
      return wv.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new wy(wy.a.a, ws.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<aqf> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<aqf> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (aqf $$5 : $$0) {
            if ($$5.cx().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (aqf $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cx().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (aqf $$10 : this.g()) {
            if ($$10.cx().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (aqf $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public ty a(ix.a $$0) {
      ty $$1 = new ty();
      $$1.a("Name", ws.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      ue $$2 = new ue();

      for (UUID $$3 : this.i) {
         $$2.add(un.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static ale a(ty $$0, akf $$1, ix.a $$2) {
      ale $$3 = new ale($$1, ws.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bog.a.a($$0.l("Color")));
      $$3.a(bog.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (uv $$5 : $$0.c("Players", 11)) {
         $$3.a(un.a($$5));
      }

      return $$3;
   }

   public void c(aqf $$0) {
      if (this.i.contains($$0.cx())) {
         this.a($$0);
      }
   }

   public void d(aqf $$0) {
      super.b($$0);
   }
}
