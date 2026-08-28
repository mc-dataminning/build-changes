import com.mojang.serialization.MapCodec;

public class dmt extends dpk implements dmr {
   public static final MapCodec<dmt> c = b(dmt::new);

   @Override
   public MapCodec<dmt> a() {
      return c;
   }

   public dmt(dzn.d $$0) {
      super($$0, ja.a, s_, false);
      this.l(this.B.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dpl c() {
      return (dpl)dlw.sZ;
   }

   @Override
   protected dzo a(dzo $$0, dzo $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(cyw.xA);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      return dmr.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
