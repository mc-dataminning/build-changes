import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class aer implements zl<aca> {
   public static final zc<wb, aer> a = zl.a(aer::a, aer::new);
   private static final int b = 12;
   private final kh c;
   private final short[] d;
   private final dus[] e;

   public aer(kh $$0, ShortSet $$1, dwz $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new dus[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(kh.a($$5), kh.b($$5), kh.c($$5));
      }
   }

   private aer(wb $$0) {
      this.c = kh.a($$0.readLong());
      int $$1 = $$0.l();
      this.d = new short[$$1];
      this.e = new dus[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.m();
         this.d[$$2] = (short)((int)($$3 & 4095L));
         this.e[$$2] = dhm.q.a((int)($$3 >>> 12));
      }
   }

   private void a(wb $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)dhm.j(this.e[$$1]) << 12 | (long)this.d[$$1]);
      }
   }

   @Override
   public zn<aer> a() {
      return agp.ao;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<jf, dus> $$0) {
      jf.a $$1 = new jf.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
