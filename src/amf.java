import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amf extends arj {
   private final ald h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public amf(ald $$0, wv $$1) {
      super($$1, btg.a.g, btg.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public ald a() {
      return this.h;
   }

   @Override
   public void a(aro $$0) {
      super.a($$0);
      this.i.add($$0.cG());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(aro $$0) {
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
      this.a(azk.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(azk.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wv e() {
      return wy.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xb.e(wv.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<aro> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<aro> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (aro $$5 : $$0) {
            if ($$5.cG().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (aro $$6 : $$0) {
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
         for (aro $$10 : this.g()) {
            if ($$10.cG().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (aro $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public tw a(ju.a $$0) {
      tw $$1 = new tw();
      $$1.a("Name", (ut)wx.a.encodeStart($$0.a(uk.a), this.a).getOrThrow());
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      uc $$2 = new uc();

      for (UUID $$3 : this.i) {
         $$2.add(ul.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static amf a(tw $$0, ald $$1, ju.a $$2) {
      alb<ut> $$3 = $$2.a(uk.a);
      wv $$4 = (wv)wx.a.parse($$3, $$0.c("Name")).getOrThrow();
      amf $$5 = new amf($$1, $$4);
      $$5.d($$0.q("Visible"));
      $$5.a($$0.h("Value"));
      $$5.b($$0.h("Max"));
      $$5.a(btg.a.a($$0.l("Color")));
      $$5.a(btg.b.a($$0.l("Overlay")));
      $$5.a($$0.q("DarkenScreen"));
      $$5.b($$0.q("PlayBossMusic"));
      $$5.c($$0.q("CreateWorldFog"));

      for (ut $$7 : $$0.c("Players", 11)) {
         $$5.a(ul.a($$7));
      }

      return $$5;
   }

   public void c(aro $$0) {
      if (this.i.contains($$0.cG())) {
         this.a($$0);
      }
   }

   public void d(aro $$0) {
      super.b($$0);
   }
}
