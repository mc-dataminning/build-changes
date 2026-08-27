import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dhi extends diy implements deb, dkz {
   public static final MapCodec<dhi> a = b(dhi::new);
   private static final drs c = drr.C;
   private final diz d = new diz(this);

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dra.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<drb> b(int $$0) {
      return $$1 -> diy.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return !$$1.n().a(ctr.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return it.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return $$0.u().c();
   }

   @Override
   public diz c() {
      return this.d;
   }
}
