import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class eph {
   private static final acq a = new acq("textures/gui/bars.png");
   private static final int b = 182;
   private static final int c = 5;
   private static final int d = 80;
   private final enn e;
   final Map<UUID, epv> f = Maps.newLinkedHashMap();

   public eph(enn $$0) {
      this.e = $$0;
   }

   public void a(eox $$0) {
      if (!this.f.isEmpty()) {
         int $$1 = $$0.a();
         int $$2 = 12;

         for (epv $$3 : this.f.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            sw $$6 = $$3.j();
            int $$7 = this.e.h.a($$6);
            int $$8 = $$1 / 2 - $$7 / 2;
            int $$9 = $$2 - 9;
            $$0.b(this.e.h, $$6, $$8, $$9, 16777215);
            $$2 += 10 + 9;
            if ($$2 >= $$0.b() / 3) {
               break;
            }
         }
      }
   }

   private void a(eox $$0, int $$1, int $$2, bdn $$3) {
      this.a($$0, $$1, $$2, $$3, 182, 0);
      int $$4 = (int)($$3.k() * 183.0F);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, 5);
      }
   }

   private void a(eox $$0, int $$1, int $$2, bdn $$3, int $$4, int $$5) {
      $$0.a(a, $$1, $$2, 0, $$3.l().ordinal() * 5 * 2 + $$5, $$4, 5);
      if ($$3.m() != bdn.b.a) {
         RenderSystem.enableBlend();
         $$0.a(a, $$1, $$2, 0, 80 + ($$3.m().ordinal() - 1) * 5 * 2 + $$5, $$4, 5);
         RenderSystem.disableBlend();
      }
   }

   public void a(vc $$0) {
      $$0.a(new vc.b() {
         @Override
         public void a(UUID $$0, sw $$1, float $$2, bdn.a $$3, bdn.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            eph.this.f.put($$0, new epv($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            eph.this.f.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            eph.this.f.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, sw $$1) {
            eph.this.f.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bdn.a $$1, bdn.b $$2) {
            epv $$3 = eph.this.f.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            epv $$4 = eph.this.f.get($$0);
            $$4.a($$1);
            $$4.b($$2);
            $$4.c($$3);
         }
      });
   }

   public void a() {
      this.f.clear();
   }

   public boolean b() {
      if (!this.f.isEmpty()) {
         for (bdn $$0 : this.f.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.f.isEmpty()) {
         for (bdn $$0 : this.f.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.f.isEmpty()) {
         for (bdn $$0 : this.f.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
