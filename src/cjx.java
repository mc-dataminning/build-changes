import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cjx extends bme, bmp {
   eov dh();

   eoq cE();

   @Nullable
   ajc C();

   void a(@Nullable ajc var1);

   long D();

   void a(long var1);

   iu<cpq> E();

   void G();

   cwe dJ();

   boolean dE();

   @Override
   default boolean aj_() {
      return this.g();
   }

   default void c(sy $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         bmf.a($$0, this.E());
      }
   }

   default void b_(sy $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new ajc($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bmf.b($$0, this.E());
      }
   }

   default void a(bne $$0, cwe $$1, bof $$2) {
      if ($$1.Z().b(cwa.i)) {
         bmh.a($$1, $$2, this);
         if (!$$1.B) {
            bof $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bol.bw) {
               cgr.a((cia)$$3, true);
            }
         }
      }
   }

   default bml c_(cia $$0) {
      $$0.a(this);
      return !$$0.dJ().B ? bml.b : bml.a;
   }

   default void f(@Nullable cia $$0) {
      MinecraftServer $$1 = this.dJ().o();
      if (this.C() != null && $$1 != null) {
         ekg $$2 = $$1.aM().getLootTable(this.C());
         if ($$0 != null) {
            am.Q.a((apb)$$0, this.C());
         }

         this.a(null);
         eke.a $$3 = new eke.a((apa)this.dJ()).a(emj.f, this.dh());
         if ($$0 != null) {
            $$3.a($$0.gr()).a(emj.a, $$0);
         }

         $$2.a(this, $$3.a(emi.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cpq $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cpq e_(int $$0) {
      this.f(null);
      cpq $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cpq.h;
      } else {
         this.E().set($$0, cpq.h);
         return $$1;
      }
   }

   default cpq f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cpq b(int $$0, int $$1) {
      this.f(null);
      return bmf.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cpq $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   default bpo g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bpo() {
         @Override
         public cpq a() {
            return cjx.this.f_($$0);
         }

         @Override
         public boolean a(cpq $$0x) {
            cjx.this.c($$0, $$0);
            return true;
         }
      } : bpo.b;
   }

   default boolean g(cia $$0) {
      return !this.dE() && $$0.a(this.cE(), 4.0);
   }
}
