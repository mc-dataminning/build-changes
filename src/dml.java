import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dml extends dhs implements dhm {
   public static final MapCodec<dml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a(lv.aJ).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dml::new)
   );
   protected static final float b = 3.0F;
   protected static final ezm c = dhj.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final alb<edc<?, ?>> d;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(alb<edc<?, ?>> $$0, dun.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (je $$6 : je.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         je $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.u($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.u($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      duo $$4 = $$1.a_($$3);
      return $$4.a(awt.bb) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arh $$0, je $$1, duo $$2, azl $$3) {
      Optional<? extends jn<edc<?, ?>>> $$4 = $$0.F_().d(lv.aJ).b(this.d);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.l().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return true;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
