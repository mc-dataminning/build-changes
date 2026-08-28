import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqf extends diq {
   public static final MapCodec<dqf> a = b(dqf::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   protected dqf(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dfm $$0, jh $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dis.aP.m(), 2);
         $$0.a(null, $$1, awn.za, awo.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dfm $$0, jh $$1) {
      return jh.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jm $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dvv $$3 = $$0.a_($$2);
            erv $$4 = $$0.b_($$2);
            if (!$$4.a(axi.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dix $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dnf) {
                  $$0.a($$2, dis.a.m(), 3);
               } else {
                  if (!$$3.a(dis.mc) && !$$3.a(dis.md) && !$$3.a(dis.bw) && !$$3.a(dis.bx)) {
                     return false;
                  }

                  dsy $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dis.a.m(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
