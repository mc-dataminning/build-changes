import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class adb implements yb<aam> {
   public static final xs<uu, adb> a = yb.a(adb::a, adb::new);
   private static final int b = 12;
   private final je c;
   private final short[] d;
   private final dmz[] e;

   public adb(je $$0, ShortSet $$1, dph $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new dmz[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(je.a($$5), je.b($$5), je.c($$5));
      }
   }

   private adb(uu $$0) {
      this.c = je.a($$0.readLong());
      int $$1 = $$0.l();
      this.d = new short[$$1];
      this.e = new dmz[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.m();
         this.d[$$2] = (short)((int)($$3 & 4095L));
         this.e[$$2] = daa.q.a((int)($$3 >>> 12));
      }
   }

   private void a(uu $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)daa.i(this.e[$$1]) << 12 | (long)this.d[$$1]);
      }
   }

   @Override
   public yd<adb> a() {
      return aex.an;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<ib, dmz> $$0) {
      ib.a $$1 = new ib.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
