import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class fsw<T extends bip, S> extends ftg<T> {
   private final ftf a;

   protected fsw(fth.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public aew a(T $$0) {
      return fzd.e;
   }

   public void a(T $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      bip.k $$6 = $$0.q();
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

   private Quaternionf a(bip.k $$0, T $$1, float $$2, Quaternionf $$3) {
      eqg $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(eqg $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(eqg $$0) {
      return -$$0.d();
   }

   private static <T extends bip> float a(T $$0, float $$1) {
      return arw.j($$1, $$0.N, $$0.dB());
   }

   private static <T extends bip> float b(T $$0, float $$1) {
      return arw.i($$1, $$0.O, $$0.dD());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, elp var3, foe var4, int var5, float var6);

   public static class a extends fsw<bip.b, bip.b.a> {
      private final foy a;

      protected a(fth.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected bip.b.a a(bip.b $$0) {
         return $$0.s();
      }

      public void a(bip.b $$0, bip.b.a $$1, elp $$2, foe $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, fyv.d);
      }
   }

   public static class b extends fsw<bip.g, bip.g.a> {
      private final fuf a;

      protected b(fth.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected bip.g.a a(bip.g $$0) {
         return $$0.s();
      }

      public void a(bip.g $$0, bip.g.a $$1, elp $$2, foe $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, fyv.d, $$2, $$3, $$0.dL(), $$0.ah());
      }
   }

   public static class c extends fsw<bip.l, bip.l.e> {
      private final esd a;

      protected c(fth.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private bip.l.b a(tl $$0, int $$1) {
         List<arj> $$2 = this.a.c($$0, $$1);
         List<bip.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (arj $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bip.l.c($$5, $$6));
         }

         return new bip.l.b($$3, $$4);
      }

      @Nullable
      protected bip.l.e a(bip.l $$0) {
         return $$0.s();
      }

      public void a(bip.l $$0, bip.l.e $$1, elp $$2, foe $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bip.l.a $$10 = bip.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = eqv.O().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bip.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            elt $$21 = $$3.getBuffer($$7 ? fom.s() : fom.r());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (bip.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? esd.a.b : esd.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
