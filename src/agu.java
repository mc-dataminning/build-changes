import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class agu extends aln {
   private final afw h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public agu(afw $$0, ui $$1) {
      super($$1, bhr.a.g, bhr.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public afw a() {
      return this.h;
   }

   @Override
   public void a(alr $$0) {
      super.a($$0);
      this.i.add($$0.cv());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(alr $$0) {
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
      this.a(asy.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(asy.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final ui e() {
      return ul.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new uo(uo.a.a, ui.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<alr> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<alr> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (alr $$5 : $$0) {
            if ($$5.cv().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (alr $$6 : $$0) {
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
         for (alr $$10 : this.h()) {
            if ($$10.cv().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (alr $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public rt f() {
      rt $$0 = new rt();
      $$0.a("Name", ui.a.a(this.a));
      $$0.a("Visible", this.g());
      $$0.a("Value", this.j);
      $$0.a("Max", this.k);
      $$0.a("Color", this.l().b());
      $$0.a("Overlay", this.m().a());
      $$0.a("DarkenScreen", this.n());
      $$0.a("PlayBossMusic", this.o());
      $$0.a("CreateWorldFog", this.p());
      rz $$1 = new rz();

      for (UUID $$2 : this.i) {
         $$1.add(sg.a($$2));
      }

      $$0.a("Players", $$1);
      return $$0;
   }

   public static agu a(rt $$0, afw $$1) {
      agu $$2 = new agu($$1, ui.a.a($$0.l("Name")));
      $$2.d($$0.q("Visible"));
      $$2.a($$0.h("Value"));
      $$2.b($$0.h("Max"));
      $$2.a(bhr.a.a($$0.l("Color")));
      $$2.a(bhr.b.a($$0.l("Overlay")));
      $$2.a($$0.q("DarkenScreen"));
      $$2.b($$0.q("PlayBossMusic"));
      $$2.c($$0.q("CreateWorldFog"));

      for (sn $$4 : $$0.c("Players", 11)) {
         $$2.a(sg.a($$4));
      }

      return $$2;
   }

   public void c(alr $$0) {
      if (this.i.contains($$0.cv())) {
         this.a($$0);
      }
   }

   public void d(alr $$0) {
      super.b($$0);
   }
}
