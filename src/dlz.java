import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dlz extends dnp implements dit, dpr {
   public static final MapCodec<dlz> a = b(dlz::new);
   private static final dwm c = dwl.C;
   private final dnq d = new dnq(this);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dvv> b(int $$0) {
      return $$1 -> dnp.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      return !$$1.n().a(cwq.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return jm.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvv $$0) {
      return $$0.y().c();
   }

   @Override
   public dnq c() {
      return this.d;
   }
}
