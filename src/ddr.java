import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddr extends cza implements dcf {
   public static final MapCodec<ddr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, ddr::new)
   );
   public static final die b = did.u;
   public static final dil<dim> c = did.af;
   public static final die d = did.w;
   public static final die e = did.C;
   protected static final int f = 3;
   protected static final eks g = cvf.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eks h = cvf.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eks i = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eks j = cvf.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eks k = cvf.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eks l = cvf.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dic m;

   @Override
   public MapCodec<? extends ddr> a() {
      return a;
   }

   protected ddr(dic $$0, dhm.d $$1) {
      super($$1.a($$0.f()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ib.c).a(b, Boolean.valueOf(false)).a(c, dim.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dim.a ? l : k;
      } else {
         switch ((ib)$$0.c(aE)) {
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
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      switch ($$3) {
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
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!this.m.c()) {
         return bjb.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 2);
         if ($$0.c(e)) {
            $$1.a($$2, ecy.c, ecy.c.a((csi)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(b));
         return bjb.a($$1.B);
      }
   }

   protected void a(@Nullable cdz $$0, csf $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.j() : this.m.i(), aqw.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dlx.h : dlx.d, $$2);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ecy.c, ecy.c.a((csi)$$1));
            }
         }
      }
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = this.o();
      ecx $$2 = $$0.q().b_($$0.a());
      ib $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dim.a : dim.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ib.b ? dim.b : dim.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ecy.c));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(e) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dic g() {
      return this.m;
   }
}
