import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dla extends ddm implements dlb {
   public static final dru f = drt.C;
   protected static final float g = 4.0F;
   protected static final evf h = dea.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dsq a;

   protected dla(dsq $$0, drc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dla> a();

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return h;
   }

   @Override
   public boolean a(drd $$0) {
      return true;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dps($$0, $$1);
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.c_($$3) instanceof dps $$7) {
         cus $$10 = $$0.g() instanceof cus $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avs.c.b($$0.g()));
                  $$2.a(dvw.c, $$7.aA_(), dvw.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bpy.a;
               } else {
                  return bpy.d;
               }
            } else {
               return bpy.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bpy.b : bpy.a;
         }
      } else {
         return bpy.e;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.c_($$2) instanceof dps $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aA_(), $$5.d(), avj.e);
            return bpw.a;
         } else if ($$8) {
            return bpw.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bpw.a;
         } else {
            return bpw.d;
         }
      } else {
         return bpw.d;
      }
   }

   private boolean b(cly $$0, dps $$1, boolean $$2) {
      dpt $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(ww.a) || $$0x.b() instanceof ye);
   }

   public abstract float g(drd var1);

   public eum m(drd $$0) {
      return new eum(0.5, 0.5, 0.5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(f) ? emx.c.a(false) : super.b_($$0);
   }

   public dsq d() {
      return this.a;
   }

   public static dsq a(dea $$0) {
      dsq $$1;
      if ($$0 instanceof dla) {
         $$1 = ((dla)$$0).d();
      } else {
         $$1 = dsq.b;
      }

      return $$1;
   }

   public void a(cly $$0, dps $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(cly $$0, dps $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.h, dps::a);
   }
}
