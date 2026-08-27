import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddm extends cyv implements dca {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, ddm::new)
   );
   public static final dhz b = dhy.u;
   public static final dig<dih> c = dhy.af;
   public static final dhz d = dhy.w;
   public static final dhz e = dhy.C;
   protected static final int f = 3;
   protected static final ekn g = cva.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ekn h = cva.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekn i = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ekn j = cva.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ekn k = cva.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ekn l = cva.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dhx m;

   @Override
   public MapCodec<? extends ddm> a() {
      return a;
   }

   protected ddm(dhx $$0, dhh.d $$1) {
      super($$1.a($$0.f()));
      this.m = $$0;
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(c, dih.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dih.a ? l : k;
      } else {
         switch ((hx)$$0.c(aE)) {
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
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
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
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!this.m.c()) {
         return bix.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 2);
         if ($$0.c(e)) {
            $$1.a($$2, ect.c, ect.c.a((csd)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(b));
         return bix.a($$1.B);
      }
   }

   protected void a(@Nullable cdu $$0, csa $$1, ht $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.j() : this.m.i(), aqs.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dls.h : dls.d, $$2);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ect.c, ect.c.a((csd)$$1));
            }
         }
      }
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = this.o();
      ecs $$2 = $$0.q().b_($$0.a());
      hx $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dih.a : dih.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == hx.b ? dih.b : dih.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ect.c));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(e) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dhx g() {
      return this.m;
   }
}
