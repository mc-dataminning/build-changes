import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvm extends cwu {
   public static final MapCodec<cvm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, cvm::new)
   );
   private final cua b;

   @Override
   public MapCodec<cvm> a() {
      return a;
   }

   public cvm(cua $$0, dga.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, dgb $$3, bzp $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dgb a(cmr $$0) {
      cqf $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cqf $$0, ht $$1, dgb $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cqf $$0, ht $$1) {
      boolean $$2 = false;
      ht.a $$3 = $$1.j();

      for (hx $$4 : hx.values()) {
         dgb $$5 = $$0.a_($$3);
         if ($$4 != hx.a || n($$5)) {
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

   private static boolean n(dgb $$0) {
      return $$0.u().a(aqx.a);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
