import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnd extends dob {
   public static final MapCodec<dnd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dza.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dnd::new)
   );
   public static final dyf b = dye.z;
   public static final dyf c = dye.B;
   public static final dyf d = dye.u;
   protected static final fcl e = dkd.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fcl f = dkd.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fcl g = dkd.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fcl h = dkd.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fcl i = dkd.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fcl j = dkd.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fcl k = dkd.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fcl l = dkd.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fcl m = fci.a(dkd.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dkd.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fcl n = fci.a(dkd.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dkd.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fcl o = fci.a(dkd.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dkd.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fcl G = fci.a(dkd.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dkd.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dza H;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dza $$0, dxn.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jm.a.a ? f : e;
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      jm.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      if ($$0.c(b)) {
         return fci.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? k : l;
      }
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$0.c(b)) {
         return fci.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? i : j;
      }
   }

   @Override
   protected fcl d_(dxo $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jm.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dxo a(dax $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jm $$4 = $$0.g();
      jm.a $$5 = $$4.o();
      boolean $$6 = $$5 == jm.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jm.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dxo $$0) {
      return $$0.a(axk.N);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jm $$5 = $$3.cO();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), aww.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? eck.h : eck.d, $$2);
      return bta.a;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), aww.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eck.d : eck.h, $$2, eck.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), aww.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eck.h : eck.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dxo $$0, jm $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
