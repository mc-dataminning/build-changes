import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class acu implements xx<aag> {
   public static final xo<uq, acu> a = xx.a(acu::a, acu::new);
   private static final int b = 12;
   private final jb c;
   private final short[] d;
   private final dlf[] e;

   public acu(jb $$0, ShortSet $$1, dnn $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new dlf[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(jb.a($$5), jb.b($$5), jb.c($$5));
      }
   }

   private acu(uq $$0) {
      this.c = jb.a($$0.readLong());
      int $$1 = $$0.n();
      this.d = new short[$$1];
      this.e = new dlf[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.o();
         this.d[$$2] = (short)((int)($$3 & 4095L));
         this.e[$$2] = cyo.q.a((int)($$3 >>> 12));
      }
   }

   private void a(uq $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)cyo.i(this.e[$$1]) << 12 | (long)this.d[$$1]);
      }
   }

   @Override
   public xz<acu> a() {
      return aeq.am;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<hz, dlf> $$0) {
      hz.a $$1 = new hz.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
