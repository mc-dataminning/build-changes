import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class dos extends dke implements drl {
   public static final MapCodec<dos> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.m.fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.g), lt.bj.fieldOf("leaf_particle").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dos::new)
   );
   public static final int b = 7;
   public static final dyq c = dyg.aF;
   public static final dyh d = dyg.z;
   public static final dyh e = dyg.I;
   protected final lr f;
   protected final int g;
   private static final int h = 1;

   @Override
   public MapCodec<? extends dos> a() {
      return a;
   }

   public dos(int $$0, lr $$1, dxp.d $$2) {
      super($$2);
      this.g = $$0;
      this.f = $$1;
      this.l(this.B.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      return fco.a();
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dxq $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dxq $$0) {
      return 1;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dxq a(dxq $$0, dha $$1, ji $$2) {
      int $$3 = 7;
      ji.a $$4 = new ji.a();

      for (jn $$5 : jn.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(c, Integer.valueOf($$3));
   }

   private static int r(dxq $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dxq $$0) {
      if ($$0.a(awp.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      ji $$4 = $$2.e();
      dxq $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(dgz $$0, ji $$1, azh $$2, dxq $$3, ji $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jn.b)) {
               azd.a($$0, $$1, $$2, lt.l);
            }
         }
      }
   }

   private void b(dgz $$0, ji $$1, azh $$2, dxq $$3, ji $$4) {
      if ($$2.a(this.g) == 0) {
         if (!a($$3.g($$0, $$4), jn.b)) {
            azd.a($$0, $$1, $$2, this.f);
         }
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      dxq $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == etx.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
