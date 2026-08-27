import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class ddk extends dez implements dad, dha {
   public static final MapCodec<ddk> a = b(ddk::new);
   private static final dnq c = dnp.C;
   private final dfa d = new dfa(this);

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddk(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dmz> b(int $$0) {
      return $$1 -> dez.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      return !$$1.n().a(cqn.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return ih.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   public dfa c() {
      return this.d;
   }
}
