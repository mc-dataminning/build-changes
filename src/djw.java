import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djw extends dfd implements dex {
   public static final MapCodec<djw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, djw::new)
   );
   protected static final float b = 3.0F;
   protected static final ewf c = deu.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ala<eag<?, ?>> d;

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(ala<eag<?, ?>> $$0, drw.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (iz $$6 : iz.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         iz $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      drx $$4 = $$1.a_($$3);
      return $$4.a(awl.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arb $$0, iz $$1, drx $$2, azc $$3) {
      Optional<? extends ji<eag<?, ?>>> $$4 = $$0.H_().d(lq.aC).b(this.d);
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
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
