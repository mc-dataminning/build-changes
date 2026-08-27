import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dde extends cyo implements dbt {
   public static final MapCodec<dde> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dde::new)
   );
   public static final dhn b = dhm.u;
   public static final dhu<dhv> c = dhm.af;
   public static final dhn d = dhm.w;
   public static final dhn e = dhm.C;
   protected static final int f = 3;
   protected static final ekb g = cut.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ekb h = cut.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekb i = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ekb j = cut.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ekb k = cut.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ekb l = cut.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dhl m;

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   protected dde(dhl $$0, dgv.d $$1) {
      super($$1.a($$0.f()));
      this.m = $$0;
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(c, dhv.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dhv.a ? l : k;
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
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
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
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!this.m.c()) {
         return biq.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 2);
         if ($$0.c(e)) {
            $$1.a($$2, ech.c, ech.c.a((crv)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(b));
         return biq.a($$1.B);
      }
   }

   protected void a(@Nullable cdm $$0, crs $$1, ht $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.j() : this.m.i(), aqo.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dlg.h : dlg.d, $$2);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ech.c, ech.c.a((crv)$$1));
            }
         }
      }
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = this.o();
      ecg $$2 = $$0.q().b_($$0.a());
      hx $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dhv.a : dhv.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == hx.b ? dhv.b : dhv.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ech.c));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(e) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
