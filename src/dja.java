import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dja extends deh implements deb {
   public static final MapCodec<dja> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akl.a(lf.aC).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dja::new)
   );
   protected static final float b = 3.0F;
   protected static final evd c = ddy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final akl<dzk<?, ?>> d;

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(akl<dzk<?, ?>> $$0, dra.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (io $$6 : io.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         io $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      drb $$4 = $$1.a_($$3);
      return $$4.a(avw.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aqm $$0, io $$1, drb $$2, ayk $$3) {
      Optional<? extends ix<dzk<?, ?>>> $$4 = $$0.H_().d(lf.aC).b(this.d);
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
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
