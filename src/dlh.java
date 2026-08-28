import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dlh extends dmx implements dib, doz {
   public static final MapCodec<dlh> a = b(dlh::new);
   private static final dvu c = dvt.C;
   private final dmy d = new dmy(this);

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dvd> b(int $$0) {
      return $$1 -> dmx.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return !$$1.n().a(cwb.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return jl.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvd $$0) {
      return $$0.y().c();
   }

   @Override
   public dmy c() {
      return this.d;
   }
}
