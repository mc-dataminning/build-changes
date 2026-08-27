import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cwl extends cya implements ctf, dab {
   public static final MapCodec<cwl> a = b(cwl::new);
   private static final dfu c = dft.C;
   private final cyb d = new cyb(this);

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   public cwl(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dfd> b(int $$0) {
      return $$1 -> cya.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return !$$1.n().a(cjo.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return ha.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return $$0.u().c();
   }

   @Override
   public cyb c() {
      return this.d;
   }
}
