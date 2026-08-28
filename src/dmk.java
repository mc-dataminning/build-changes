import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmk extends dni {
   public static final MapCodec<dmk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dmk::new)
   );
   public static final dxm b = dxl.z;
   public static final dxm c = dxl.B;
   public static final dxm d = dxl.u;
   protected static final fbs e = djk.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbs f = djk.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fbs g = djk.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fbs h = djk.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fbs i = djk.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbs j = djk.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbs k = djk.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbs l = djk.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbs m = fbp.a(djk.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), djk.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fbs n = fbp.a(djk.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), djk.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fbs o = fbp.a(djk.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), djk.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fbs G = fbp.a(djk.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), djk.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dyh H;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(dyh $$0, dwu.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jn.a.a ? f : e;
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      jn.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      if ($$0.c(b)) {
         return fbp.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? k : l;
      }
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$0.c(b)) {
         return fbp.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? i : j;
      }
   }

   @Override
   protected fbs d_(dwv $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jn.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
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
   public dwv a(dae $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jn $$4 = $$0.g();
      jn.a $$5 = $$4.o();
      boolean $$6 = $$5 == jn.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jn.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dwv $$0) {
      return $$0.a(awo.N);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jn $$5 = $$3.cO();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awa.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ebr.h : ebr.d, $$2);
      return bsi.a;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awa.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ebr.d : ebr.h, $$2, ebr.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awa.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ebr.h : ebr.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dwv $$0, jn $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
