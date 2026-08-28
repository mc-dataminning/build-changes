import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dno extends dpg implements dkg, drj {
   public static final MapCodec<dno> a = b(dno::new);
   private static final dyf d = dye.J;
   private final dph e = new dph(this);

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dxo> b(int $$0) {
      return $$1 -> dpf.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      return !$$1.n().a(cxk.gl) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return jm.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(d) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxo $$0) {
      return $$0.y().c();
   }

   @Override
   public dph c() {
      return this.e;
   }
}
