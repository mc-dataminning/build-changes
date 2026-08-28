import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpy extends dij {
   public static final MapCodec<dpy> a = b(dpy::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   protected dpy(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dff $$0, jh $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dil.aP.m(), 2);
         $$0.a(null, $$1, awo.za, awp.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dff $$0, jh $$1) {
      return jh.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jm $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dvo $$3 = $$0.a_($$2);
            ero $$4 = $$0.b_($$2);
            if (!$$4.a(axj.a)) {
               return false;
            } else {
               if ($$3.b() instanceof diq $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dmy) {
                  $$0.a($$2, dil.a.m(), 3);
               } else {
                  if (!$$3.a(dil.mc) && !$$3.a(dil.md) && !$$3.a(dil.bw) && !$$3.a(dil.bx)) {
                     return false;
                  }

                  dsr $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dil.a.m(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
