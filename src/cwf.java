import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwf extends cxo {
   public static final MapCodec<cwf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, cwf::new)
   );
   private final cut b;

   @Override
   public MapCodec<cwf> a() {
      return a;
   }

   public cwf(cut $$0, dgv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, dgw $$3, cae $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dgw a(cnj $$0) {
      cqy $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cqy $$0, ht $$1, dgw $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cqy $$0, ht $$1) {
      boolean $$2 = false;
      ht.a $$3 = $$1.j();

      for (hx $$4 : hx.values()) {
         dgw $$5 = $$0.a_($$3);
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

   private static boolean n(dgw $$0) {
      return $$0.u().a(arh.a);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
