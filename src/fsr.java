import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class fsr<T extends bik, S> extends ftb<T> {
   private final fta a;

   protected fsr(ftc.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public aeu a(T $$0) {
      return fyy.e;
   }

   public void a(T $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      bik.k $$6 = $$0.j();
      if ($$6 != null) {
         S $$7 = this.b($$0);
         if ($$7 != null) {
            float $$8 = $$0.a($$2);
            this.d = $$6.d().get($$8);
            this.e = $$6.e().get($$8);
            int $$9 = $$6.c();
            int $$10 = $$9 != -1 ? $$9 : $$5;
            super.a($$0, $$1, $$2, $$3, $$4, $$10);
            $$3.a();
            $$3.a(this.a($$6, $$0, $$2, new Quaternionf()));
            j $$11 = $$6.a().get($$8);
            $$3.a($$11.c());
            $$3.c().b().rotate($$11.e()).rotate($$11.g());
            this.a($$0, $$7, $$3, $$4, $$10, $$8);
            $$3.b();
         }
      }
   }

   private Quaternionf a(bik.k $$0, T $$1, float $$2, Quaternionf $$3) {
      eqb $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(eqb $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(eqb $$0) {
      return -$$0.d();
   }

   private static <T extends bik> float a(T $$0, float $$1) {
      return ars.j($$1, $$0.N, $$0.dA());
   }

   private static <T extends bik> float b(T $$0, float $$1) {
      return ars.i($$1, $$0.O, $$0.dC());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, elk var3, fnz var4, int var5, float var6);

   public static class a extends fsr<bik.b, bik.b.a> {
      private final fot a;

      protected a(ftc.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected bik.b.a a(bik.b $$0) {
         return $$0.m();
      }

      public void a(bik.b $$0, bik.b.a $$1, elk $$2, fnz $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, fyq.d);
      }
   }

   public static class b extends fsr<bik.g, bik.g.a> {
      private final fua a;

      protected b(ftc.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected bik.g.a a(bik.g $$0) {
         return $$0.m();
      }

      public void a(bik.g $$0, bik.g.a $$1, elk $$2, fnz $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, fyq.d, $$2, $$3, $$0.dK(), $$0.ah());
      }
   }

   public static class c extends fsr<bik.l, bik.l.e> {
      private final ery a;

      protected c(ftc.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private bik.l.b a(ti $$0, int $$1) {
         List<arf> $$2 = this.a.c($$0, $$1);
         List<bik.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (arf $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bik.l.c($$5, $$6));
         }

         return new bik.l.b($$3, $$4);
      }

      @Nullable
      protected bik.l.e a(bik.l $$0) {
         return $$0.m();
      }

      public void a(bik.l $$0, bik.l.e $$1, elk $$2, fnz $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bik.l.a $$10 = bik.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = eqq.O().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bik.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            elo $$21 = $$3.getBuffer($$7 ? foh.s() : foh.r());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (bik.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? ery.a.b : ery.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
