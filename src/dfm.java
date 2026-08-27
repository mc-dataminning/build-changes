import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfm extends dgw {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dfm::new)
   );
   private final dea b;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(dea $$0, drc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, drd $$3, cih $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public drd a(cxb $$0) {
      daf $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(daf $$0, io $$1, drd $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(daf $$0, io $$1) {
      boolean $$2 = false;
      io.a $$3 = $$1.j();

      for (it $$4 : it.values()) {
         drd $$5 = $$0.a_($$3);
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

   private static boolean n(drd $$0) {
      return $$0.u().a(awc.a);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(drd $$0, daf $$1, io $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
