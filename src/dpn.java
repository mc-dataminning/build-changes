import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpn extends dhy {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jl[] d = jl.values();

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   protected dpn(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dev $$0, jg $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dia.aP.m(), 2);
         $$0.a(null, $$1, awk.za, awl.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dev $$0, jg $$1) {
      return jg.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jl $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dvd $$3 = $$0.a_($$2);
            ere $$4 = $$0.b_($$2);
            if (!$$4.a(axf.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dif $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dmn) {
                  $$0.a($$2, dia.a.m(), 3);
               } else {
                  if (!$$3.a(dia.mc) && !$$3.a(dia.md) && !$$3.a(dia.bw) && !$$3.a(dia.bx)) {
                     return false;
                  }

                  dsg $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dia.a.m(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
