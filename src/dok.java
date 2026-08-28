import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dok extends djs implements dmy {
   public static final MapCodec<dok> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dok::new)
   );
   public static final dtr b = dtq.u;
   public static final dty<dtz> c = dtq.af;
   public static final dtr d = dtq.w;
   public static final dtr e = dtq.C;
   protected static final int f = 3;
   protected static final exp g = dfw.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exp h = dfw.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exp i = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exp j = dfw.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final exp k = dfw.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final exp l = dfw.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dtp m;

   @Override
   public MapCodec<? extends dok> a() {
      return a;
   }

   protected dok(dtp $$0, dsz.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ji.c).a(b, Boolean.valueOf(false)).a(c, dtz.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtz.a ? l : k;
      } else {
         switch ((ji)$$0.c(aE)) {
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
   protected boolean a(dta $$0, epn $$1) {
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
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if (!this.m.c()) {
         return bqq.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqq.a($$1.B);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dcm $$3, BiConsumer<cuo, jd> $$4) {
      if ($$3.n() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dta $$0, dcu $$1, jd $$2, @Nullable cmv $$3) {
      dta $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eoz.c, eoz.c.a((dcx)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmv $$0, dcu $$1, jd $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dxw.h : dxw.d, $$2);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eoz.c, eoz.c.a((dcx)$$1));
            }
         }
      }
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = this.o();
      eoy $$2 = $$0.q().b_($$0.a());
      ji $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtz.a : dtz.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ji.b ? dtz.b : dtz.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eoz.c));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(e) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dtp m() {
      return this.m;
   }
}
