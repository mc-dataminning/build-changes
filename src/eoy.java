import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Matrix4f;

public class eoy implements AutoCloseable {
   private static final acq a = new acq("textures/map/map_icons.png");
   static final fkf b = fkf.r(a);
   private static final int c = 128;
   private static final int d = 128;
   final fuw e;
   private final Int2ObjectMap<eoy.a> f = new Int2ObjectOpenHashMap();

   public eoy(fuw $$0) {
      this.e = $$0;
   }

   public void a(int $$0, dyo $$1) {
      this.b($$0, $$1).a();
   }

   public void a(eij $$0, fjx $$1, int $$2, dyo $$3, boolean $$4, int $$5) {
      this.b($$2, $$3).a($$0, $$1, $$4, $$5);
   }

   private eoy.a b(int $$0, dyo $$1) {
      return (eoy.a)this.f.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            return new eoy.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   public void a() {
      ObjectIterator var1 = this.f.values().iterator();

      while (var1.hasNext()) {
         eoy.a $$0 = (eoy.a)var1.next();
         $$0.close();
      }

      this.f.clear();
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private dyo b;
      private final fui c;
      private final fkf d;
      private boolean e = true;

      a(int $$0, dyo $$1) {
         this.b = $$1;
         this.c = new fui(128, 128, true);
         acq $$2 = eoy.this.e.a("map/" + $$0, this.c);
         this.d = fkf.r($$2);
      }

      void a(dyo $$0) {
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
               this.c.e().a($$1, $$0, dxi.b(this.b.g[$$2]));
            }
         }

         this.c.d();
      }

      void a(eij $$0, fjx $$1, boolean $$2, int $$3) {
         if (this.e) {
            this.b();
            this.e = false;
         }

         int $$4 = 0;
         int $$5 = 0;
         float $$6 = 0.0F;
         Matrix4f $$7 = $$0.c().a();
         ein $$8 = $$1.getBuffer(this.d);
         $$8.a($$7, 0.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 0.0F).b($$3).e();
         $$8.a($$7, 0.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 0.0F).b($$3).e();
         int $$9 = 0;

         for (dyl $$10 : this.b.f()) {
            if (!$$2 || $$10.f()) {
               $$0.a();
               $$0.a(0.0F + (float)$$10.c() / 2.0F + 64.0F, 0.0F + (float)$$10.d() / 2.0F + 64.0F, -0.02F);
               $$0.a(a.f.rotationDegrees((float)($$10.e() * 360) / 16.0F));
               $$0.b(4.0F, 4.0F, 3.0F);
               $$0.a(-0.125F, 0.125F, 0.0F);
               byte $$11 = $$10.a();
               float $$12 = (float)($$11 % 16 + 0) / 16.0F;
               float $$13 = (float)($$11 / 16 + 0) / 16.0F;
               float $$14 = (float)($$11 % 16 + 1) / 16.0F;
               float $$15 = (float)($$11 / 16 + 1) / 16.0F;
               Matrix4f $$16 = $$0.c().a();
               float $$17 = -0.001F;
               ein $$18 = $$1.getBuffer(eoy.b);
               $$18.a($$16, -1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$12, $$13).b($$3).e();
               $$18.a($$16, 1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$13).b($$3).e();
               $$18.a($$16, 1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$15).b($$3).e();
               $$18.a($$16, -1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$12, $$15).b($$3).e();
               $$0.b();
               if ($$10.g() != null) {
                  eov $$19 = enn.N().h;
                  sw $$20 = $$10.g();
                  float $$21 = (float)$$19.a($$20);
                  float $$22 = apa.a(25.0F / $$21, 0.0F, 6.0F / 9.0F);
                  $$0.a();
                  $$0.a(0.0F + (float)$$10.c() / 2.0F + 64.0F - $$21 * $$22 / 2.0F, 0.0F + (float)$$10.d() / 2.0F + 64.0F + 4.0F, -0.025F);
                  $$0.b($$22, $$22, 1.0F);
                  $$0.a(0.0F, 0.0F, -0.1F);
                  $$19.a($$20, 0.0F, 0.0F, -1, false, $$0.c().a(), $$1, eov.a.a, Integer.MIN_VALUE, $$3);
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
