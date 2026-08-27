import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddt extends dfd {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kt.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, ddt::new)
   );
   private final dch b;

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddt(dch $$0, dph.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, dpi $$3, cgj $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public dpi a(cux $$0) {
      cym $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(cym $$0, id $$1, dpi $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cym $$0, id $$1) {
      boolean $$2 = false;
      id.a $$3 = $$1.j();

      for (ij $$4 : ij.values()) {
         dpi $$5 = $$0.a_($$3);
         if ($$4 != ij.a || n($$5)) {
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

   private static boolean n(dpi $$0) {
      return $$0.u().a(avj.a);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dpi $$0, cym $$1, id $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
