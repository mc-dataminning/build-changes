import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class div extends dkf {
   public static final MapCodec<div> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, div::new)
   );
   private final dhj b;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(dhj $$0, dun.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, duo $$3, ckd $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public duo a(czk $$0) {
      ddl $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(ddl $$0, je $$1, duo $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(ddl $$0, je $$1) {
      boolean $$2 = false;
      je.a $$3 = $$1.k();

      for (jj $$4 : jj.values()) {
         duo $$5 = $$0.a_($$3);
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

   private static boolean o(duo $$0) {
      return $$0.y().a(awz.a);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(duo $$0, ddl $$1, je $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
