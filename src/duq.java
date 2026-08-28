import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duq extends dmr {
   public static final MapCodec<duq> a = b(duq::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jb[] d = jb.values();

   @Override
   public MapCodec<duq> a() {
      return a;
   }

   protected duq(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(djm $$0, iv $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dmt.aW.m(), 2);
         $$0.a(null, $$1, awn.Aa, awo.e, 1.0F, 1.0F);
      }
   }

   private boolean b(djm $$0, iv $$1) {
      return iv.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jb $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iv.b.a;
         } else {
            eat $$3 = $$0.a_($$2);
            exa $$4 = $$0.b_($$2);
            if (!$$4.a(axh.a)) {
               return iv.b.b;
            } else {
               if ($$3.b() instanceof dmz $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iv.b.a;
               }

               if ($$3.b() instanceof drn) {
                  $$0.a($$2, dmt.a.m(), 3);
               } else {
                  if (!$$3.a(dmt.mI) && !$$3.a(dmt.mJ) && !$$3.a(dmt.bG) && !$$3.a(dmt.bH)) {
                     return iv.b.b;
                  }

                  dxr $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dmt.a.m(), 3);
               }

               return iv.b.a;
            }
         }
      }) > 1;
   }
}
