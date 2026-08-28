import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtp extends dlu {
   public static final MapCodec<dtp> a = b(dtp::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ja[] d = ja.values();

   @Override
   public MapCodec<dtp> a() {
      return a;
   }

   protected dtp(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dip $$0, iu $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dlw.aW.m(), 2);
         $$0.a(null, $$1, awl.zU, awm.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dip $$0, iu $$1) {
      return iu.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ja $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iu.b.a;
         } else {
            dzo $$3 = $$0.a_($$2);
            evv $$4 = $$0.b_($$2);
            if (!$$4.a(axf.a)) {
               return iu.b.b;
            } else {
               if ($$3.b() instanceof dmc $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iu.b.a;
               }

               if ($$3.b() instanceof dqo) {
                  $$0.a($$2, dlw.a.m(), 3);
               } else {
                  if (!$$3.a(dlw.mE) && !$$3.a(dlw.mF) && !$$3.a(dlw.bD) && !$$3.a(dlw.bE)) {
                     return iu.b.b;
                  }

                  dwn $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dlw.a.m(), 3);
               }

               return iu.b.a;
            }
         }
      }) > 1;
   }
}
