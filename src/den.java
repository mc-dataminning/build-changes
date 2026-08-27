import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class den extends daa implements dha {
   public static final MapCodec<den> a = b(den::new);
   public static final int b = 15;
   public static final dnz c = dnp.aP;
   public static final dnq d = dnp.C;
   public static final ToIntFunction<dmz> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if (!$$1.B && $$3.gw()) {
         $$1.a($$2, $$0.a(c), 2);
         return bnc.a;
      } else {
         return bnc.b;
      }
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return $$3.a(cqn.hB) ? eqh.b() : eqh.a();
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return true;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.a;
   }

   @Override
   protected float d(dmz $$0, cwf $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(d) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cqk a(cqk $$0, int $$1) {
      if ($$1 != 15) {
         ta $$2 = new ta();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
