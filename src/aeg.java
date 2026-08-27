import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class aeg implements ze<abq> {
   public static final yv<vx, aeg> a = ze.a(aeg::a, aeg::new);
   private static final int b = 12;
   private final jq c;
   private final short[] d;
   private final drd[] e;

   public aeg(jq $$0, ShortSet $$1, dtk $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new drd[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(jq.a($$5), jq.b($$5), jq.c($$5));
      }
   }

   private aeg(vx $$0) {
      this.c = jq.a($$0.readLong());
      int $$1 = $$0.l();
      this.d = new short[$$1];
      this.e = new drd[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.m();
         this.d[$$2] = (short)((int)($$3 & 4095L));
         this.e[$$2] = dea.q.a((int)($$3 >>> 12));
      }
   }

   private void a(vx $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)dea.i(this.e[$$1]) << 12 | (long)this.d[$$1]);
      }
   }

   @Override
   public zg<aeg> a() {
      return agc.an;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<io, drd> $$0) {
      io.a $$1 = new io.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
