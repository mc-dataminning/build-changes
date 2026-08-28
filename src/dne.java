import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dne extends doc {
   public static final MapCodec<dne> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyz.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dne::new)
   );
   public static final dye b = dyd.v;
   public static final dye c = dyd.x;
   public static final dye d = dyd.q;
   protected static final fcm e = dke.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fcm f = dke.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fcm g = dke.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fcm h = dke.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fcm i = dke.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fcm j = dke.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fcm k = dke.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fcm l = dke.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fcm m = fcj.a(dke.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dke.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fcm n = fcj.a(dke.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dke.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fcm o = fcj.a(dke.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dke.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fcm G = fcj.a(dke.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dke.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dyz H;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dyz $$0, dxm.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jm.a.a ? f : e;
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      jm.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      if ($$0.c(b)) {
         return fcj.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? k : l;
      }
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$0.c(b)) {
         return fcj.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? i : j;
      }
   }

   @Override
   protected fcm d_(dxn $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jm.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
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
   public dxn a(dbb $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jm $$4 = $$0.g();
      jm.a $$5 = $$4.o();
      boolean $$6 = $$5 == jm.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jm.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dxn $$0) {
      return $$0.a(axu.N);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ecj.h : ecj.d, $$2);
      return bte.a;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ecj.d : ecj.h, $$2, ecj.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ecj.h : ecj.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dxn $$0, jm $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
