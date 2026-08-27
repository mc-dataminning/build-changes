import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cuo extends cvw {
   public static final MapCodec<cuo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jb.f.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, cuo::new)
   );
   private final ctc b;

   @Override
   public MapCodec<cuo> a() {
      return a;
   }

   public cuo(ctc $$0, dfc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, dfd $$3, bys $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dfd a(clt $$0) {
      cph $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cph $$0, gw $$1, dfd $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cph $$0, gw $$1) {
      boolean $$2 = false;
      gw.a $$3 = $$1.j();

      for (ha $$4 : ha.values()) {
         dfd $$5 = $$0.a_($$3);
         if ($$4 != ha.a || n($$5)) {
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

   private static boolean n(dfd $$0) {
      return $$0.u().a(aqa.a);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dfd $$0, cph $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
