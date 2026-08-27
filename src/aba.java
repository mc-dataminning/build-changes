import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class aba implements wu<yo> {
   private static final int a = 12;
   private final ix b;
   private final short[] c;
   private final dip[] d;

   public aba(ix $$0, ShortSet $$1, dkx $$2) {
      this.b = $$0;
      int $$3 = $$1.size();
      this.c = new short[$$3];
      this.d = new dip[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.c[$$4] = $$5;
         this.d[$$4] = $$2.a(ix.a($$5), ix.b($$5), ix.c($$5));
      }
   }

   public aba(ue $$0) {
      this.b = ix.a($$0.readLong());
      int $$1 = $$0.n();
      this.c = new short[$$1];
      this.d = new dip[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.o();
         this.c[$$2] = (short)((int)($$3 & 4095L));
         this.d[$$2] = cvz.q.a((int)($$3 >>> 12));
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.b(this.b.s());
      $$0.c(this.c.length);

      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         $$0.a((long)cvz.i(this.d[$$1]) << 12 | (long)this.c[$$1]);
      }
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<hv, dip> $$0) {
      hv.a $$1 = new hv.a();

      for (int $$2 = 0; $$2 < this.c.length; $$2++) {
         short $$3 = this.c[$$2];
         $$1.d(this.b.d($$3), this.b.e($$3), this.b.f($$3));
         $$0.accept($$1, this.d[$$2]);
      }
   }
}
