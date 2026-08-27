import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cxj extends cyy implements cud, daz {
   public static final MapCodec<cxj> a = b(cxj::new);
   private static final dgs c = dgr.C;
   private final cyz d = new cyz(this);

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   public cxj(dga.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dgb> b(int $$0) {
      return $$1 -> cyy.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      return !$$1.n().a(ckm.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return hx.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return $$0.u().c();
   }

   @Override
   public cyz c() {
      return this.d;
   }
}
