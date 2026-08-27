import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dbr extends cwz implements cwt {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ahf.a(ke.aw).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dbr::new)
   );
   protected static final float b = 3.0F;
   protected static final emm c = cwq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ahf<drh<?, ?>> d;

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(ahf<drh<?, ?>> $$0, djg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (hx $$6 : hx.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         hx $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      djh $$4 = $$1.a_($$3);
      return $$4.a(ash.aZ) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(and $$0, hx $$1, djh $$2, auv $$3) {
      Optional<? extends ih<drh<?, ?>>> $$4 = $$0.I_().d(ke.aw).b(this.d);
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
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
