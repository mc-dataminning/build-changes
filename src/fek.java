import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Matrix4f;

public class fek implements AutoCloseable {
   private static final akf a = new akf("textures/map/map_icons.png");
   static final gbm b = gbm.t(a);
   private static final int c = 128;
   private static final int d = 128;
   final gmp e;
   private final Int2ObjectMap<fek.a> f = new Int2ObjectOpenHashMap();

   public fek(gmp $$0) {
      this.e = $$0;
   }

   public void a(enc $$0, ene $$1) {
      this.b($$0, $$1).a();
   }

   public void a(exn $$0, gbe $$1, enc $$2, ene $$3, boolean $$4, int $$5) {
      this.b($$2, $$3).a($$0, $$1, $$4, $$5);
   }

   private fek.a b(enc $$0, ene $$1) {
      return (fek.a)this.f.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new fek.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   public void a() {
      ObjectIterator var1 = this.f.values().iterator();

      while (var1.hasNext()) {
         fek.a $$0 = (fek.a)var1.next();
         $$0.close();
      }

      this.f.clear();
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private ene b;
      private final gmb c;
      private final gbm d;
      private boolean e = true;

      a(int $$0, ene $$1) {
         this.b = $$1;
         this.c = new gmb(128, 128, true);
         akf $$2 = fek.this.e.a("map/" + $$0, this.c);
         this.d = gbm.t($$2);
      }

      void a(ene $$0) {
         boolean $$1 = this.b != $$0;
         this.b = $$0;
         this.e |= $$1;
      }

      public void a() {
         this.e = true;
      }

      private void b() {
         for (int $$0 = 0; $$0 < 128; $$0++) {
            for (int $$1 = 0; $$1 < 128; $$1++) {
               int $$2 = $$1 + $$0 * 128;
               this.c.e().a($$1, $$0, elv.b(this.b.g[$$2]));
            }
         }

         this.c.d();
      }

      void a(exn $$0, gbe $$1, boolean $$2, int $$3) {
         if (this.e) {
            this.b();
            this.e = false;
         }

         int $$4 = 0;
         int $$5 = 0;
         float $$6 = 0.0F;
         Matrix4f $$7 = $$0.c().a();
         exr $$8 = $$1.getBuffer(this.d);
         $$8.a($$7, 0.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 0.0F).b($$3).e();
         $$8.a($$7, 0.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 0.0F).b($$3).e();
         int $$9 = 0;

         for (ena $$10 : this.b.h()) {
            if (!$$2 || $$10.b()) {
               $$0.a();
               $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F, -0.02F);
               $$0.a(a.f.rotationDegrees((float)($$10.f() * 360) / 16.0F));
               $$0.b(4.0F, 4.0F, 3.0F);
               $$0.a(-0.125F, 0.125F, 0.0F);
               byte $$11 = $$10.a();
               float $$12 = (float)($$11 % 16 + 0) / 16.0F;
               float $$13 = (float)($$11 / 16 + 0) / 16.0F;
               float $$14 = (float)($$11 % 16 + 1) / 16.0F;
               float $$15 = (float)($$11 / 16 + 1) / 16.0F;
               Matrix4f $$16 = $$0.c().a();
               float $$17 = -0.001F;
               exr $$18 = $$1.getBuffer(fek.b);
               $$18.a($$16, -1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$12, $$13).b($$3).e();
               $$18.a($$16, 1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$13).b($$3).e();
               $$18.a($$16, 1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$15).b($$3).e();
               $$18.a($$16, -1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$12, $$15).b($$3).e();
               $$0.b();
               if ($$10.g().isPresent()) {
                  fef $$19 = fcu.Q().h;
                  ws $$20 = $$10.g().get();
                  float $$21 = (float)$$19.a($$20);
                  float $$22 = axw.a(25.0F / $$21, 0.0F, 6.0F / 9.0F);
                  $$0.a();
                  $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F - $$21 * $$22 / 2.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F + 4.0F, -0.025F);
                  $$0.b($$22, $$22, 1.0F);
                  $$0.a(0.0F, 0.0F, -0.1F);
                  $$19.a($$20, 0.0F, 0.0F, -1, false, $$0.c().a(), $$1, fef.a.a, Integer.MIN_VALUE, $$3);
                  $$0.b();
               }

               $$9++;
            }
         }
      }

      @Override
      public void close() {
         this.c.close();
      }
   }
}
