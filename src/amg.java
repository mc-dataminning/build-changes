import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amg extends ark {
   private final ale h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public amg(ale $$0, ww $$1) {
      super($$1, bto.a.g, bto.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public ale a() {
      return this.h;
   }

   @Override
   public void a(arp $$0) {
      super.a($$0);
      this.i.add($$0.cG());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(arp $$0) {
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

   public final ww e() {
      return wz.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xc.e(ww.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<arp> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<arp> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (arp $$5 : $$0) {
            if ($$5.cG().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (arp $$6 : $$0) {
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
         for (arp $$10 : this.g()) {
            if ($$10.cG().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (arp $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public tx a(jg.a $$0) {
      tx $$1 = new tx();
      $$1.a("Name", (uu)wy.a.encodeStart($$0.a(ul.a), this.a).getOrThrow());
      $$1.a("Visible", this.f());
      $$1.a("Value", this.j);
      $$1.a("Max", this.k);
      $$1.a("Color", this.k().b());
      $$1.a("Overlay", this.l().a());
      $$1.a("DarkenScreen", this.m());
      $$1.a("PlayBossMusic", this.n());
      $$1.a("CreateWorldFog", this.o());
      ud $$2 = new ud();

      for (UUID $$3 : this.i) {
         $$2.add(um.a($$3));
      }

      $$1.a("Players", $$2);
      return $$1;
   }

   public static amg a(tx $$0, ale $$1, jg.a $$2) {
      alc<uu> $$3 = $$2.a(ul.a);
      ww $$4 = (ww)wy.a.parse($$3, $$0.c("Name")).getOrThrow();
      amg $$5 = new amg($$1, $$4);
      $$5.d($$0.q("Visible"));
      $$5.a($$0.h("Value"));
      $$5.b($$0.h("Max"));
      $$5.a(bto.a.a($$0.l("Color")));
      $$5.a(bto.b.a($$0.l("Overlay")));
      $$5.a($$0.q("DarkenScreen"));
      $$5.b($$0.q("PlayBossMusic"));
      $$5.c($$0.q("CreateWorldFog"));

      for (uu $$7 : $$0.c("Players", 11)) {
         $$5.a(um.a($$7));
      }

      return $$5;
   }

   public void c(arp $$0) {
      if (this.i.contains($$0.cG())) {
         this.a($$0);
      }
   }

   public void d(arp $$0) {
      super.b($$0);
   }
}
