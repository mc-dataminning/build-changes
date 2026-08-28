import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doe extends dpp {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, doe::new)
   );
   private final dmr b;

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dmr $$0, eas.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, eat $$3, cnq $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public eat a(ddg $$0) {
      diq $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(diq $$0, iv $$1, eat $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(diq $$0, iv $$1) {
      boolean $$2 = false;
      iv.a $$3 = $$1.k();

      for (jb $$4 : jb.values()) {
         eat $$5 = $$0.a_($$3);
         if ($$4 != jb.a || o($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (o($$5) && !$$5.c($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean o(eat $$0) {
      return $$0.y().a(axh.a);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(eat $$0, diq $$1, iv $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
