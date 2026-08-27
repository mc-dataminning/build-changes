import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cyd extends czs implements cuw, dbt {
   public static final MapCodec<cyd> a = b(cyd::new);
   private static final dhn c = dhm.C;
   private final czt d = new czt(this);

   @Override
   public MapCodec<cyd> a() {
      return a;
   }

   public cyd(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dgw> b(int $$0) {
      return $$1 -> czs.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return !$$1.n().a(cle.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return hx.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return $$0.u().c();
   }

   @Override
   public czt c() {
      return this.d;
   }
}
