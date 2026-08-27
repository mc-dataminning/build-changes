import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class alh extends aqe {
   private final akh h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public alh(akh $$0, wu $$1) {
      super($$1, bpc.a.g, bpc.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public akh a() {
      return this.h;
   }

   @Override
   public void a(aqi $$0) {
      super.a($$0);
      this.i.add($$0.cx());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(aqi $$0) {
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
      this.a(axz.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(axz.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wu e() {
      return wx.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xa(xa.a.a, wu.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<aqi> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<aqi> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (aqi $$5 : $$0) {
            if ($$5.cx().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (aqi $$6 : $$0) {
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
         for (aqi $$10 : this.g()) {
            if ($$10.cx().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (aqi $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public ua a(iy.a $$0) {
      ua $$1 = new ua();
      $$1.a("Name", wu.a.a(this.a, $$0));
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      ug $$2 = new ug();

      for (UUID $$3 : this.i) {
         $$2.add(up.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static alh a(ua $$0, akh $$1, iy.a $$2) {
      alh $$3 = new alh($$1, wu.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bpc.a.a($$0.l("Color")));
      $$3.a(bpc.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (ux $$5 : $$0.c("Players", 11)) {
         $$3.a(up.a($$5));
      }

      return $$3;
   }

   public void c(aqi $$0) {
      if (this.i.contains($$0.cx())) {
         this.a($$0);
      }
   }

   public void d(aqi $$0) {
      super.b($$0);
   }
}
