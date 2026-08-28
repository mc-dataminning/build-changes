import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class alk extends aqh {
   private final akk h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public alk(akk $$0, wu $$1) {
      super($$1, bpt.a.g, bpt.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public akk a() {
      return this.h;
   }

   @Override
   public void a(aql $$0) {
      super.a($$0);
      this.i.add($$0.cz());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(aql $$0) {
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
      this.a(aye.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(aye.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final wu e() {
      return wx.a(this.i()).a($$0 -> $$0.a(this.k().a()).a(new xa(xa.a.a, wu.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<aql> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<aql> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.i) {
         boolean $$4 = false;

         for (aql $$5 : $$0) {
            if ($$5.cz().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (aql $$6 : $$0) {
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
         for (aql $$10 : this.g()) {
            if ($$10.cz().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for (aql $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public tx a(jl.a $$0) {
      tx $$1 = new tx();
      $$1.a("Name", wu.a.a(this.a, $$0));
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

   public static alk a(tx $$0, akk $$1, jl.a $$2) {
      alk $$3 = new alk($$1, wu.a.a($$0.l("Name"), $$2));
      $$3.d($$0.q("Visible"));
      $$3.a($$0.h("Value"));
      $$3.b($$0.h("Max"));
      $$3.a(bpt.a.a($$0.l("Color")));
      $$3.a(bpt.b.a($$0.l("Overlay")));
      $$3.a($$0.q("DarkenScreen"));
      $$3.b($$0.q("PlayBossMusic"));
      $$3.c($$0.q("CreateWorldFog"));

      for (uu $$5 : $$0.c("Players", 11)) {
         $$3.a(um.a($$5));
      }

      return $$3;
   }

   public void c(aql $$0) {
      if (this.i.contains($$0.cz())) {
         this.a($$0);
      }
   }

   public void d(aql $$0) {
      super.b($$0);
   }
}
