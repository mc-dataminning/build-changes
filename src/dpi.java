import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class dpi extends dku implements dsb {
   public static final MapCodec<dpi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.m.fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.g), lv.bj.fieldOf("leaf_particle").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dpi::new)
   );
   public static final int b = 7;
   public static final dzm c = dzc.aF;
   public static final dzd d = dzc.z;
   public static final dzd e = dzc.I;
   protected final lt f;
   protected final int g;
   private static final int h = 1;

   @Override
   public MapCodec<? extends dpi> a() {
      return a;
   }

   public dpi(int $$0, lt $$1, dyl.d $$2) {
      super($$2);
      this.g = $$0;
      this.f = $$1;
      this.l(this.B.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return fdl.a();
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dym $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dym $$0) {
      return 1;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dym a(dym $$0, dhq $$1, jj $$2) {
      int $$3 = 7;
      jj.a $$4 = new jj.a();

      for (jo $$5 : jo.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(c, Integer.valueOf($$3));
   }

   private static int r(dym $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dym $$0) {
      if ($$0.a(awz.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(e) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      super.a($$0, $$1, $$2, $$3);
      jj $$4 = $$2.e();
      dym $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(dhp $$0, jj $$1, azs $$2, dym $$3, jj $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jo.b)) {
               azo.a($$0, $$1, $$2, lv.l);
            }
         }
      }
   }

   private void b(dhp $$0, jj $$1, azs $$2, dym $$3, jj $$4) {
      if ($$2.a(this.g) == 0) {
         if (!a($$3.g($$0, $$4), jo.b)) {
            azo.a($$0, $$1, $$2, this.f);
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      dym $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == euu.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
