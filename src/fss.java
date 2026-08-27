import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class fss<T extends biv, S> extends ftc<T> {
   private final ftb a;

   protected fss(ftd.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   public aez a(T $$0) {
      return fyz.e;
   }

   public void a(T $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      biv.k $$6 = $$0.q();
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

   private Quaternionf a(biv.k $$0, T $$1, float $$2, Quaternionf $$3) {
      eqa $$4 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case c -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$1, $$2), (float) (Math.PI / 180.0) * b($$4), 0.0F);
         case b -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$1, $$2), 0.0F);
         case d -> $$3.rotationYXZ((float) (-Math.PI / 180.0) * a($$4), (float) (Math.PI / 180.0) * b($$4), 0.0F);
      };
   }

   private static float a(eqa $$0) {
      return $$0.e() - 180.0F;
   }

   private static float b(eqa $$0) {
      return -$$0.d();
   }

   private static <T extends biv> float a(T $$0, float $$1) {
      return asb.j($$1, $$0.N, $$0.dB());
   }

   private static <T extends biv> float b(T $$0, float $$1) {
      return asb.i($$1, $$0.O, $$0.dD());
   }

   @Nullable
   protected abstract S b(T var1);

   protected abstract void a(T var1, S var2, elj var3, foa var4, int var5, float var6);

   public static class a extends fss<biv.b, biv.b.a> {
      private final fou a;

      protected a(ftd.a $$0) {
         super($$0);
         this.a = $$0.c();
      }

      @Nullable
      protected biv.b.a a(biv.b $$0) {
         return $$0.s();
      }

      public void a(biv.b $$0, biv.b.a $$1, elj $$2, foa $$3, int $$4, float $$5) {
         this.a.a($$1.a(), $$2, $$3, $$4, fyr.d);
      }
   }

   public static class b extends fss<biv.g, biv.g.a> {
      private final fub a;

      protected b(ftd.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      @Nullable
      protected biv.g.a a(biv.g $$0) {
         return $$0.s();
      }

      public void a(biv.g $$0, biv.g.a $$1, elj $$2, foa $$3, int $$4, float $$5) {
         $$2.a(a.d.rotation((float) Math.PI));
         this.a.a($$1.a(), $$1.b(), $$4, fyr.d, $$2, $$3, $$0.dL(), $$0.ah());
      }
   }

   public static class c extends fss<biv.l, biv.l.e> {
      private final erx a;

      protected c(ftd.a $$0) {
         super($$0);
         this.a = $$0.h();
      }

      private biv.l.b a(tl $$0, int $$1) {
         List<arn> $$2 = this.a.c($$0, $$1);
         List<biv.l.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (arn $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new biv.l.c($$5, $$6));
         }

         return new biv.l.b($$3, $$4);
      }

      @Nullable
      protected biv.l.e a(biv.l $$0) {
         return $$0.s();
      }

      public void a(biv.l $$0, biv.l.e $$1, elj $$2, foa $$3, int $$4, float $$5) {
         byte $$6 = $$1.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         biv.l.a $$10 = biv.l.a($$6);
         byte $$11 = (byte)$$1.c().get($$5);
         int $$13;
         if ($$8) {
            float $$12 = eqp.O().m.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$1.d().get($$5);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$2.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         biv.l.b $$17 = $$0.a(this::a);
         int $$18 = 9 + 1;
         int $$19 = $$17.b();
         int $$20 = $$17.a().size() * $$18;
         $$16.translate(1.0F - (float)$$19 / 2.0F, (float)(-$$20), 0.0F);
         if ($$13 != 0) {
            eln $$21 = $$3.getBuffer($$7 ? foi.s() : foi.r());
            $$21.a($$16, -1.0F, -1.0F, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, -1.0F, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, (float)$$20, 0.0F).a($$13).b($$4).e();
            $$21.a($$16, (float)$$19, -1.0F, 0.0F).a($$13).b($$4).e();
         }

         for (biv.l.c $$22 : $$17.a()) {
            float $$23 = switch ($$10) {
               case b -> 0.0F;
               case c -> (float)($$19 - $$22.b());
               case a -> (float)$$19 / 2.0F - (float)$$22.b() / 2.0F;
            };
            this.a.a($$22.a(), $$23, $$15, $$11 << 24 | 16777215, $$9, $$16, $$3, $$7 ? erx.a.b : erx.a.c, 0, $$4);
            $$15 += (float)$$18;
         }
      }
   }
}
