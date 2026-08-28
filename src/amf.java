import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amf extends arc {
   private final alf h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public amf(alf $$0, xp $$1) {
      super($$1, bqk.a.g, bqk.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public alf a() {
      return this.h;
   }

   @Override
   public void a(arg $$0) {
      super.a($$0);
      this.i.add($$0.cz());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(arg $$0) {
      super.b($$0);
      this.i.remove($$0.cz());
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

   public final xp e() {
      return xs.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xv(xv.a.a, xp.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<arg> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<arg> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (arg $$5 : $$0) {
            if ($$5.cz().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (arg $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cz().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (arg $$10 : this.g()) {
            if ($$10.cz().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (arg $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public us a(jk.a $$0) {
      us $$1 = new us();
      $$1.a("Name", xp.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      uy $$2 = new uy();

      for (UUID $$3 : this.i) {
         $$2.add(vh.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static amf a(us $$0, alf $$1, jk.a $$2) {
      amf $$3 = new amf($$1, xp.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bqk.a.a($$0.l("Color")));
      $$3.a(bqk.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (vp $$5 : $$0.c("Players", 11)) {
         $$3.a(vh.a($$5));
      }

      return $$3;
   }

   public void c(arg $$0) {
      if (this.i.contains($$0.cz())) {
         this.a($$0);
      }
   }

   public void d(arg $$0) {
      super.b($$0);
   }
}
