import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class afp extends akh {
   private final aer h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public afp(aer $$0, tf $$1) {
      super($$1, bgg.a.g, bgg.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public aer a() {
      return this.h;
   }

   @Override
   public void a(akl $$0) {
      super.a($$0);
      this.i.add($$0.cv());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(akl $$0) {
      super.b($$0);
      this.i.remove($$0.cv());
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
      this.a(arp.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(arp.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final tf e() {
      return th.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new tk(tk.a.a, tf.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<akl> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<akl> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (akl $$5 : $$0) {
            if ($$5.cv().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (akl $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.i) {
            if ($$6.cv().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (akl $$10 : this.h()) {
            if ($$10.cv().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (akl $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public qr f() {
      qr $$0 = new qr();
      $$0.a("Name", tf.a.a(this.a));
      $$0.a("Visible", this.g());
      $$0.a("Value", this.j);
      $$0.a("Max", this.k);
      $$0.a("Color", this.l().b());
      $$0.a("Overlay", this.m().a());
      $$0.a("DarkenScreen", this.n());
      $$0.a("PlayBossMusic", this.o());
      $$0.a("CreateWorldFog", this.p());
      qx $$1 = new qx();

      for (UUID $$2 : this.i) {
         $$1.add(rd.a($$2));
      }

      $$0.a("Players", $$1);
      return $$0;
   }

   public static afp a(qr $$0, aer $$1) {
      afp $$2 = new afp($$1, tf.a.a($$0.l("Name")));
      $$2.d($$0.q("Visible"));
      $$2.a($$0.h("Value"));
      $$2.b($$0.h("Max"));
      $$2.a(bgg.a.a($$0.l("Color")));
      $$2.a(bgg.b.a($$0.l("Overlay")));
      $$2.a($$0.q("DarkenScreen"));
      $$2.b($$0.q("PlayBossMusic"));
      $$2.c($$0.q("CreateWorldFog"));

      for (rk $$4 : $$0.c("Players", 11)) {
         $$2.a(rd.a($$4));
      }

      return $$2;
   }

   public void c(akl $$0) {
      if (this.i.contains($$0.cv())) {
         this.a($$0);
      }
   }

   public void d(akl $$0) {
      super.b($$0);
   }
}
