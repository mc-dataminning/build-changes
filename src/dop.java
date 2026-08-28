import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dqa {
   public static final MapCodec<dop> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dop::new)
   );
   private final dnc b;

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(dnc $$0, ebd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, ebe $$3, cob $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public ebe a(ddr $$0) {
      djb $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(djb $$0, iv $$1, ebe $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(djb $$0, iv $$1) {
      boolean $$2 = false;
      iv.a $$3 = $$1.k();

      for (jb $$4 : jb.values()) {
         ebe $$5 = $$0.a_($$3);
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

   private static boolean o(ebe $$0) {
      return $$0.y().a(axj.a);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
