import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class ajx extends aot {
   private final aiy h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public ajx(aiy $$0, vq $$1) {
      super($$1, blm.a.g, blm.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public aiy a() {
      return this.h;
   }

   @Override
   public void a(aox $$0) {
      super.a($$0);
      this.i.add($$0.cw());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(aox $$0) {
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
      this.a(awi.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(awi.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final vq e() {
      return vt.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new vw(vw.a.a, vq.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<aox> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<aox> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (aox $$5 : $$0) {
            if ($$5.cw().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (aox $$6 : $$0) {
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
         for (aox $$10 : this.h()) {
            if ($$10.cw().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (aox $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public sw f() {
      sw $$0 = new sw();
      $$0.a("Name", vq.a.a(this.a));
      $$0.a("Visible", this.g());
      $$0.a("Value", this.j);
      $$0.a("Max", this.k);
      $$0.a("Color", this.l().b());
      $$0.a("Overlay", this.m().a());
      $$0.a("DarkenScreen", this.n());
      $$0.a("PlayBossMusic", this.o());
      $$0.a("CreateWorldFog", this.p());
      tc $$1 = new tc();

      for (UUID $$2 : this.i) {
         $$1.add(tl.a($$2));
      }

      $$0.a("Players", $$1);
      return $$0;
   }

   public static ajx a(sw $$0, aiy $$1) {
      ajx $$2 = new ajx($$1, vq.a.a($$0.l("Name")));
      $$2.d($$0.q("Visible"));
      $$2.a($$0.h("Value"));
      $$2.b($$0.h("Max"));
      $$2.a(blm.a.a($$0.l("Color")));
      $$2.a(blm.b.a($$0.l("Overlay")));
      $$2.a($$0.q("DarkenScreen"));
      $$2.b($$0.q("PlayBossMusic"));
      $$2.c($$0.q("CreateWorldFog"));

      for (tt $$4 : $$0.c("Players", 11)) {
         $$2.a(tl.a($$4));
      }

      return $$2;
   }

   public void c(aox $$0) {
      if (this.i.contains($$0.cw())) {
         this.a($$0);
      }
   }

   public void d(aox $$0) {
      super.b($$0);
   }
}
