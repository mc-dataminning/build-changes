import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvb extends dnc {
   public static final MapCodec<dvb> a = b(dvb::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jb[] d = jb.values();

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   protected dvb(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(djx $$0, iv $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dne.aW.m(), 2);
         $$0.a(null, $$1, awp.Aa, awq.e, 1.0F, 1.0F);
      }
   }

   private boolean b(djx $$0, iv $$1) {
      return iv.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jb $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iv.b.a;
         } else {
            ebe $$3 = $$0.a_($$2);
            exo $$4 = $$0.b_($$2);
            if (!$$4.a(axj.a)) {
               return iv.b.b;
            } else {
               if ($$3.b() instanceof dnk $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iv.b.a;
               }

               if ($$3.b() instanceof dry) {
                  $$0.a($$2, dne.a.m(), 3);
               } else {
                  if (!$$3.a(dne.mI) && !$$3.a(dne.mJ) && !$$3.a(dne.bG) && !$$3.a(dne.bH)) {
                     return iv.b.b;
                  }

                  dyc $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dne.a.m(), 3);
               }

               return iv.b.a;
            }
         }
      }) > 1;
   }
}
