import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Matrix4f;

public class feu implements AutoCloseable {
   private static final int a = 128;
   private static final int b = 128;
   final gmz c;
   final gnv d;
   private final Int2ObjectMap<feu.a> e = new Int2ObjectOpenHashMap();

   public feu(gmz $$0, gnv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(enn $$0, enp $$1) {
      this.b($$0, $$1).a();
   }

   public void a(exx $$0, gbo $$1, enn $$2, enp $$3, boolean $$4, int $$5) {
      this.b($$2, $$3).a($$0, $$1, $$4, $$5);
   }

   private feu.a b(enn $$0, enp $$1) {
      return (feu.a)this.e.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new feu.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   public void a() {
      ObjectIterator var1 = this.e.values().iterator();

      while (var1.hasNext()) {
         feu.a $$0 = (feu.a)var1.next();
         $$0.close();
      }

      this.e.clear();
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private enp b;
      private final gml c;
      private final gbw d;
      private boolean e = true;

      a(int $$0, enp $$1) {
         this.b = $$1;
         this.c = new gml(128, 128, true);
         akh $$2 = feu.this.c.a("map/" + $$0, this.c);
         this.d = gbw.t($$2);
      }

      void a(enp $$0) {
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
               this.c.e().a($$1, $$0, eme.b(this.b.g[$$2]));
            }
         }

         this.c.d();
      }

      void a(exx $$0, gbo $$1, boolean $$2, int $$3) {
         if (this.e) {
            this.b();
            this.e = false;
         }

         int $$4 = 0;
         int $$5 = 0;
         float $$6 = 0.0F;
         Matrix4f $$7 = $$0.c().a();
         eyb $$8 = $$1.getBuffer(this.d);
         $$8.a($$7, 0.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 1.0F).b($$3).e();
         $$8.a($$7, 128.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 0.0F).b($$3).e();
         $$8.a($$7, 0.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 0.0F).b($$3).e();
         int $$9 = 0;

         for (enj $$10 : this.b.h()) {
            if (!$$2 || $$10.b()) {
               $$0.a();
               $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F, -0.02F);
               $$0.a(a.f.rotationDegrees((float)($$10.f() * 360) / 16.0F));
               $$0.b(4.0F, 4.0F, 3.0F);
               $$0.a(-0.125F, 0.125F, 0.0F);
               Matrix4f $$11 = $$0.c().a();
               float $$12 = -0.001F;
               gmy $$13 = feu.this.d.a($$10);
               float $$14 = $$13.c();
               float $$15 = $$13.g();
               float $$16 = $$13.d();
               float $$17 = $$13.h();
               eyb $$18 = $$1.getBuffer(gbw.t($$13.i()));
               $$18.a($$11, -1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$15).b($$3).e();
               $$18.a($$11, 1.0F, 1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$16, $$15).b($$3).e();
               $$18.a($$11, 1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$16, $$17).b($$3).e();
               $$18.a($$11, -1.0F, -1.0F, (float)$$9 * -0.001F).a(255, 255, 255, 255).a($$14, $$17).b($$3).e();
               $$0.b();
               if ($$10.g().isPresent()) {
                  fep $$19 = fde.Q().h;
                  wu $$20 = $$10.g().get();
                  float $$21 = (float)$$19.a($$20);
                  float $$22 = axz.a(25.0F / $$21, 0.0F, 6.0F / 9.0F);
                  $$0.a();
                  $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F - $$21 * $$22 / 2.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F + 4.0F, -0.025F);
                  $$0.b($$22, $$22, 1.0F);
                  $$0.a(0.0F, 0.0F, -0.1F);
                  $$19.a($$20, 0.0F, 0.0F, -1, false, $$0.c().a(), $$1, fep.a.a, Integer.MIN_VALUE, $$3);
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
