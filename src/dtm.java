import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtm extends dsu {
   public static final MapCodec<dtm> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dtm::new));
   public static final dyo<jn> e = dod.e;
   private static final Map<jn, fcr> f = fco.c(dke.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<dtm> a() {
      return d;
   }

   protected dtm(lx $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(e, jn.c));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return o($$0);
   }

   public static fcr o(dxq $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(dhc $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2.g());
      dxq $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m();
      dhc $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dkg.a.m() : $$0;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      jn $$4 = $$0.c(e);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jn $$10 = $$4.g();
      $$1.a(lt.ah, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e);
   }
}
