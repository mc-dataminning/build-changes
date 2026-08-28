import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkp extends dmz {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dyc.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dkp::new)
   );
   public static final dye b = dyd.x;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fcm e = dke.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fcm f = dke.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fcm g = dke.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fcm h = dke.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fcm i = dke.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fcm j = dke.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fcm k = dke.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcm l = dke.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fcm m = dke.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fcm n = dke.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fcm o = dke.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fcm G = dke.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fcm H = dke.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fcm I = dke.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fcm J = dke.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcm K = dke.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dyc O;
   private final int P;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(dyc $$0, int $$1, dxm.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dxy.b));
      this.P = $$1;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      jm $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dxy)$$0.c(L)) {
         case a:
            if ($$4.o() == jm.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? G : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? K : l;
               case e -> $$5 ? J : k;
               case d -> $$5 ? I : j;
               case c, b, a -> $$5 ? H : i;
            };
         case c:
         default:
            if ($$4.o() == jm.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$0.c(b)) {
         return bte.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bte.a;
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dxn $$0, dha $$1, jh $$2, @Nullable cps $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ecj.a, $$2);
   }

   protected void a(@Nullable cps $$0, dhb $$1, jh $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), axg.e);
   }

   protected axe a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dxn $$0, dha $$1, jh $$2) {
      cpz $$3 = this.O.e() ? $$1.a(cpz.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ecj.a : ecj.e, $$2);
      }

      if ($$4) {
         $$1.a(new jh($$2), this, this.P);
      }
   }

   private void e(dxn $$0, dha $$1, jh $$2) {
      jm $$3 = n($$0).g();
      eux $$4 = eut.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF, b, L);
   }
}
