import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsv extends dob implements drj {
   public static final MapCodec<dsv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dsv::new)
   );
   public static final dyf b = dye.z;
   public static final dyl<dym> c = dye.ai;
   public static final dyf d = dye.B;
   public static final dyf e = dye.J;
   protected static final int f = 3;
   protected static final fcl g = dkd.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcl h = dkd.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcl i = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcl j = dkd.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcl k = dkd.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fcl l = dkd.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dyd m;

   @Override
   public MapCodec<? extends dsv> a() {
      return a;
   }

   protected dsv(dyd $$0, dxn.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dym.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dym.a ? l : k;
      } else {
         switch ((jm)$$0.c(aF)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!this.m.c()) {
         return bta.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bta.a;
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dxo $$0, dgz $$1, jh $$2, @Nullable cpo $$3) {
      dxo $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, etr.c, etr.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cpo $$0, dgz $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), aww.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eck.h : eck.d, $$2);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, etr.c, etr.c.a($$1));
            }
         }
      }
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m();
      etq $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dym.a : dym.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dym.b : dym.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == etr.c));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(e) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dyd q() {
      return this.m;
   }
}
