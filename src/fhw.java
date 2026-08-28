import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Matrix4f;

public class fhw implements AutoCloseable {
   private static final int a = 128;
   private static final int b = 128;
   final gqg c;
   final grc d;
   private final Int2ObjectMap<fhw.a> e = new Int2ObjectOpenHashMap();

   public fhw(gqg $$0, grc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(eql $$0, eqn $$1) {
      this.b($$0, $$1).a();
   }

   public void a(fbc $$0, get $$1, eql $$2, eqn $$3, boolean $$4, int $$5) {
      this.b($$2, $$3).a($$0, $$1, $$4, $$5);
   }

   private fhw.a b(eql $$0, eqn $$1) {
      return (fhw.a)this.e.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new fhw.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   public void a() {
      ObjectIterator var1 = this.e.values().iterator();

      while (var1.hasNext()) {
         fhw.a $$0 = (fhw.a)var1.next();
         $$0.close();
      }

      this.e.clear();
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private eqn b;
      private final gps c;
      private final gfb d;
      private boolean e = true;

      a(final int $$0, final eqn $$1) {
         this.b = $$1;
         this.c = new gps(128, 128, true);
         akq $$2 = fhw.this.c.a("map/" + $$0, this.c);
         this.d = gfb.t($$2);
      }

      void a(eqn $$0) {
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
               this.c.e().a($$1, $$0, epc.b(this.b.g[$$2]));
            }
         }

         this.c.d();
      }

      void a(fbc $$0, get $$1, boolean $$2, int $$3) {
         if (this.e) {
            this.b();
            this.e = false;
         }

         int $$4 = 0;
         int $$5 = 0;
         float $$6 = 0.0F;
         Matrix4f $$7 = $$0.c().a();
         fbg $$8 = $$1.getBuffer(this.d);
         $$8.a($$7, 0.0F, 128.0F, -0.01F).a(-1).a(0.0F, 1.0F).c($$3);
         $$8.a($$7, 128.0F, 128.0F, -0.01F).a(-1).a(1.0F, 1.0F).c($$3);
         $$8.a($$7, 128.0F, 0.0F, -0.01F).a(-1).a(1.0F, 0.0F).c($$3);
         $$8.a($$7, 0.0F, 0.0F, -0.01F).a(-1).a(0.0F, 0.0F).c($$3);
         int $$9 = 0;

         for (eqh $$10 : this.b.h()) {
            if (!$$2 || $$10.b()) {
               $$0.a();
               $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F, -0.02F);
               $$0.a(a.f.rotationDegrees((float)($$10.f() * 360) / 16.0F));
               $$0.b(4.0F, 4.0F, 3.0F);
               $$0.a(-0.125F, 0.125F, 0.0F);
               Matrix4f $$11 = $$0.c().a();
               float $$12 = -0.001F;
               gqf $$13 = fhw.this.d.a($$10);
               float $$14 = $$13.c();
               float $$15 = $$13.g();
               float $$16 = $$13.d();
               float $$17 = $$13.h();
               fbg $$18 = $$1.getBuffer(gfb.t($$13.i()));
               $$18.a($$11, -1.0F, 1.0F, (float)$$9 * -0.001F).a(-1).a($$14, $$15).c($$3);
               $$18.a($$11, 1.0F, 1.0F, (float)$$9 * -0.001F).a(-1).a($$16, $$15).c($$3);
               $$18.a($$11, 1.0F, -1.0F, (float)$$9 * -0.001F).a(-1).a($$16, $$17).c($$3);
               $$18.a($$11, -1.0F, -1.0F, (float)$$9 * -0.001F).a(-1).a($$14, $$17).c($$3);
               $$0.b();
               if ($$10.g().isPresent()) {
                  fhr $$19 = fgi.Q().h;
                  wy $$20 = $$10.g().get();
                  float $$21 = (float)$$19.a($$20);
                  float $$22 = ayn.a(25.0F / $$21, 0.0F, 6.0F / 9.0F);
                  $$0.a();
                  $$0.a(0.0F + (float)$$10.d() / 2.0F + 64.0F - $$21 * $$22 / 2.0F, 0.0F + (float)$$10.e() / 2.0F + 64.0F + 4.0F, -0.025F);
                  $$0.b($$22, $$22, 1.0F);
                  $$0.a(0.0F, 0.0F, -0.1F);
                  $$19.a($$20, 0.0F, 0.0F, -1, false, $$0.c().a(), $$1, fhr.a.a, Integer.MIN_VALUE, $$3);
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
