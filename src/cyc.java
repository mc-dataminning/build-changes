import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyc extends czm {
   public static final MapCodec<cyc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, cyc::new)
   );
   private final cwq b;

   @Override
   public MapCodec<cyc> a() {
      return a;
   }

   public cyc(cwq $$0, djg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, djh $$3, cbt $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public djh a(cph $$0) {
      csv $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(csv $$0, hx $$1, djh $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(csv $$0, hx $$1) {
      boolean $$2 = false;
      hx.a $$3 = $$1.j();

      for (ic $$4 : ic.values()) {
         djh $$5 = $$0.a_($$3);
         if ($$4 != ic.a || n($$5)) {
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

   private static boolean n(djh $$0) {
      return $$0.u().a(asm.a);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
