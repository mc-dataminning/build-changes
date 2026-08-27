import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfk extends dgu {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dfk::new)
   );
   private final ddy b;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(ddy $$0, dra.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, drb $$3, cif $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public drb a(cwz $$0) {
      dad $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(dad $$0, io $$1, drb $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dad $$0, io $$1) {
      boolean $$2 = false;
      io.a $$3 = $$1.j();

      for (it $$4 : it.values()) {
         drb $$5 = $$0.a_($$3);
         if ($$4 != it.a || n($$5)) {
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

   private static boolean n(drb $$0) {
      return $$0.u().a(awb.a);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(drb $$0, dad $$1, io $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
