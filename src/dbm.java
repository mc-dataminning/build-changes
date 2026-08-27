import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbm extends cww implements dab {
   public static final MapCodec<dbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dbm::new)
   );
   public static final dfu b = dft.u;
   public static final dgb<dgc> c = dft.af;
   public static final dfu d = dft.w;
   public static final dfu e = dft.C;
   protected static final int f = 3;
   protected static final eia g = ctc.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eia h = ctc.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eia i = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eia j = ctc.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eia k = ctc.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eia l = ctc.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dfs m;

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   protected dbm(dfs $$0, dfc.d $$1) {
      super($$1.a($$0.f()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ha.c).a(b, Boolean.valueOf(false)).a(c, dgc.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dgc.a ? l : k;
      } else {
         switch ((ha)$$0.c(aE)) {
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
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
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
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!this.m.c()) {
         return bhe.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 2);
         if ($$0.c(e)) {
            $$1.a($$2, eah.c, eah.c.a((cqe)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(b));
         return bhe.a($$1.B);
      }
   }

   protected void a(@Nullable cca $$0, cqb $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.j() : this.m.i(), aph.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? djn.h : djn.d, $$2);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eah.c, eah.c.a((cqe)$$1));
            }
         }
      }
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = this.o();
      eag $$2 = $$0.q().b_($$0.a());
      ha $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dgc.a : dgc.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ha.b ? dgc.b : dgc.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eah.c));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(e) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
