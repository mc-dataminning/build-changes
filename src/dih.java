import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dih extends djr {
   public static final MapCodec<dih> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dih::new)
   );
   private final dgv b;

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dgv $$0, dtz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, dua $$3, cjy $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dua a(cyw $$0) {
      dcx $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(dcx $$0, je $$1, dua $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dcx $$0, je $$1) {
      boolean $$2 = false;
      je.a $$3 = $$1.k();

      for (jj $$4 : jj.values()) {
         dua $$5 = $$0.a_($$3);
         if ($$4 != jj.a || o($$5)) {
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

   private static boolean o(dua $$0) {
      return $$0.y().a(awy.a);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dua $$0, dcx $$1, je $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
