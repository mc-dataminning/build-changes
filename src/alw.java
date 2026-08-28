import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class alw extends aqz {
   private final aku h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public alw(aku $$0, wp $$1) {
      super($$1, bso.a.g, bso.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public aku a() {
      return this.h;
   }

   @Override
   public void a(are $$0) {
      super.a($$0);
      this.i.add($$0.cF());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(are $$0) {
      super.b($$0);
      this.i.remove($$0.cF());
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
      this.a(ayz.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(ayz.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wp e() {
      return ws.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new wv.e(wp.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<are> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<are> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (are $$5 : $$0) {
            if ($$5.cF().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (are $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cF().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (are $$10 : this.g()) {
            if ($$10.cF().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (are $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();
      $$1.a("Name", (un)wr.a.encodeStart($$0.a(ue.a), this.a).getOrThrow());
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      tw $$2 = new tw();

      for (UUID $$3 : this.i) {
         $$2.add(uf.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static alw a(tq $$0, aku $$1, jt.a $$2) {
      aks<un> $$3 = $$2.a(ue.a);
      wp $$4 = (wp)wr.a.parse($$3, $$0.c("Name")).getOrThrow();
      alw $$5 = new alw($$1, $$4);
      $$5.d($$0.q("Visible"));
      $$5.a($$0.h("Value"));
      $$5.b($$0.h("Max"));
      $$5.a(bso.a.a($$0.l("Color")));
      $$5.a(bso.b.a($$0.l("Overlay")));
      $$5.a($$0.q("DarkenScreen"));
      $$5.b($$0.q("PlayBossMusic"));
      $$5.c($$0.q("CreateWorldFog"));

      for (un $$7 : $$0.c("Players", 11)) {
         $$5.a(uf.a($$7));
      }

      return $$5;
   }

   public void c(are $$0) {
      if (this.i.contains($$0.cF())) {
         this.a($$0);
      }
   }

   public void d(are $$0) {
      super.b($$0);
   }
}
