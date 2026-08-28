import com.mojang.serialization.MapCodec;

public class dms extends dpl implements dmr {
   public static final MapCodec<dms> c = b(dms::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dms> a() {
      return c;
   }

   public dms(dzn.d $$0) {
      super($$0, ja.a, s_, false, 0.1);
      this.l(this.B.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azt $$0) {
      return 1;
   }

   @Override
   protected boolean h(dzo $$0) {
      return $$0.l();
   }

   @Override
   protected dlu b() {
      return dlw.ta;
   }

   @Override
   protected dzo a(dzo $$0, dzo $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dzo a(dzo $$0, azt $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
