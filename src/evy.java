import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Matrix4f;

public class evy implements AutoCloseable {
   private static final agt a = new agt("textures/map/map_icons.png");
   static final fsq b = fsq.t(a);
   private static final int c = 128;
   private static final int d = 128;
   final gdp e;
   private final Int2ObjectMap<evy.a> f = new Int2ObjectOpenHashMap();

   public evy(gdp $$0) {
      this.e = $$0;
   }

   public void a(int $$0, efj $$1) {
      this.b($$0, $$1).a();
   }

   public void a(epd $$0, fsi $$1, int $$2, efj $$3, boolean $$4, int $$5) {
      this.b($$2, $$3).a($$0, $$1, $$4, $$5);
   }

   private evy.a b(int $$0, efj $$1) {
      return (evy.a)this.f.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            return new evy.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   public void a() {
      ObjectIterator var1 = this.f.values().iterator();

      while (var1.hasNext()) {
         evy.a $$0 = (evy.a)var1.next();
         $$0.close();
      }

      this.f.clear();
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private efj b;
      private final gdb c;
      private final fsq d;
      private boolean e = true;

      a(int $$0, efj $$1) {
         this.b = $$1;
         this.c = new gdb(128, 128, true);
         agt $$2 = evy.this.e.a("map/" + $$0, this.c);
         this.d = fsq.t($$2);
      }

      void a(efj $$0) {
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
               this.c.e().a($$1, $$0, eed.b(this.b.g[$$2]));
            }
         }

         this.c.d();
      }

      void a(epd $$0, fsi $$1, boolean $$2, int $$3) {
         if (this.e) {
            this.b();
            this.e = false;
         }

         int $$4 = 0;
         int $$5 = 0;
         float $$6 = 0.0F;
         Matrix4f $$7 = $$0.c().a();
         eph $$8 = $$1.getBuffer(this.d);
         $$8.a($$7, 0.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 0.0F).b($$3).e();
         $$8.a($$7, 0.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 0.0F).b($$3).e();
         int $$9 = 0;

         for (efg $$10 : this.b.g()) {
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
               eph $$18 = $$1.getBuffer(evy.b);
               $$18.a($$16, -1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$12, $$13).b($$3).e();
               $$18.a($$16, 1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$13).b($$3).e();
               $$18.a($$16, 1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$15).b($$3).e();
               $$18.a($$16, -1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$12, $$15).b($$3).e();
               $$0.b();
               if ($$10.g() != null) {
                  evu $$19 = euk.N().h;
                  vb $$20 = $$10.g();
                  float $$21 = (float)$$19.a($$20);
                  float $$22 = aty.a(25.0F / $$21, 0.0F, 6.0F / 9.0F);
                  $$0.a();
                  $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F - $$21 * $$22 / 2.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F + 4.0F, -0.025F);
                  $$0.b($$22, $$22, 1.0F);
                  $$0.a(0.0F, 0.0F, -0.1F);
                  $$19.a($$20, 0.0F, 0.0F, -1, false, $$0.c().a(), $$1, evu.a.a, Integer.MIN_VALUE, $$3);
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
