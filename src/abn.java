import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class abn implements xf<za> {
   private static final int a = 12;
   private final iz b;
   private final short[] c;
   private final djh[] d;

   public abn(iz $$0, ShortSet $$1, dlp $$2) {
      this.b = $$0;
      int $$3 = $$1.size();
      this.c = new short[$$3];
      this.d = new djh[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.c[$$4] = $$5;
         this.d[$$4] = $$2.a(iz.a($$5), iz.b($$5), iz.c($$5));
      }
   }

   public abn(ui $$0) {
      this.b = iz.a($$0.readLong());
      int $$1 = $$0.n();
      this.c = new short[$$1];
      this.d = new djh[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.o();
         this.c[$$2] = (short)((int)($$3 & 4095L));
         this.d[$$2] = cwq.q.a((int)($$3 >>> 12));
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.b(this.b.s());
      $$0.c(this.c.length);

      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         $$0.a((long)cwq.i(this.d[$$1]) << 12 | (long)this.c[$$1]);
      }
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<hx, djh> $$0) {
      hx.a $$1 = new hx.a();

      for (int $$2 = 0; $$2 < this.c.length; $$2++) {
         short $$3 = this.c[$$2];
         $$1.d(this.b.d($$3), this.b.e($$3), this.b.f($$3));
         $$0.accept($$1, this.d[$$2]);
      }
   }
}
