import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class aeb implements zb<abm> {
   public static final ys<vu, aeb> a = zb.a(aeb::a, aeb::new);
   private static final int b = 12;
   private final jp c;
   private final short[] d;
   private final dqh[] e;

   public aeb(jp $$0, ShortSet $$1, dso $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new dqh[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(jp.a($$5), jp.b($$5), jp.c($$5));
      }
   }

   private aeb(vu $$0) {
      this.c = jp.a($$0.readLong());
      int $$1 = $$0.l();
      this.d = new short[$$1];
      this.e = new dqh[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.m();
         this.d[$$2] = (short)((int)($$3 & 4095L));
         this.e[$$2] = dde.q.a((int)($$3 >>> 12));
      }
   }

   private void a(vu $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)dde.i(this.e[$$1]) << 12 | (long)this.d[$$1]);
      }
   }

   @Override
   public zd<aeb> a() {
      return afx.an;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<in, dqh> $$0) {
      in.a $$1 = new in.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
