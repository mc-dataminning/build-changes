import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dml extends dnj {
   public static final MapCodec<dml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dml::new)
   );
   public static final dxn b = dxm.z;
   public static final dxn c = dxm.B;
   public static final dxn d = dxm.u;
   protected static final fbt e = djl.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbt f = djl.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fbt g = djl.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fbt h = djl.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fbt i = djl.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbt j = djl.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbt k = djl.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbt l = djl.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbt m = fbq.a(djl.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), djl.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fbt n = fbq.a(djl.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), djl.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fbt o = fbq.a(djl.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), djl.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fbt G = fbq.a(djl.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), djl.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dyi H;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dyi $$0, dwv.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jn.a.a ? f : e;
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      if ($$0.c(b)) {
         return fbq.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? k : l;
      }
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$0.c(b)) {
         return fbq.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? i : j;
      }
   }

   @Override
   protected fbt d_(dww $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jn.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
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
   public dww a(daf $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jn $$4 = $$0.g();
      jn.a $$5 = $$4.o();
      boolean $$6 = $$5 == jn.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jn.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dww $$0) {
      return $$0.a(awp.N);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ebs.h : ebs.d, $$2);
      return bsj.a;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ebs.d : ebs.h, $$2, ebs.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ebs.h : ebs.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dww $$0, jn $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
