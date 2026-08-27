import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgo extends dib {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lh.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dgo::new)
   );
   private final dfc b;

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(dfc $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, dtc $$3, cif $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      dbg $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(dbg $$0, ir $$1, dtc $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dbg $$0, ir $$1) {
      boolean $$2 = false;
      ir.a $$3 = $$1.j();

      for (iw $$4 : iw.values()) {
         dtc $$5 = $$0.a_($$3);
         if ($$4 != iw.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(dtc $$0) {
      return $$0.u().a(awj.a);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.d($$1, $$2).al;
   }
}
