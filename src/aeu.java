import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class aeu implements zo<acd> {
   public static final zf<we, aeu> a = zo.a(aeu::a, aeu::new);
   private static final int b = 12;
   private final ki c;
   private final short[] d;
   private final dvd[] e;

   public aeu(ki $$0, ShortSet $$1, dxk $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new dvd[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(ki.a($$5), ki.b($$5), ki.c($$5));
      }
   }

   private aeu(we $$0) {
      this.c = ki.a($$0.readLong());
      int $$1 = $$0.l();
      this.d = new short[$$1];
      this.e = new dvd[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.m();
         this.d[$$2] = (short)((int)($$3 & 4095L));
         this.e[$$2] = dhy.q.a((int)($$3 >>> 12));
      }
   }

   private void a(we $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)dhy.j(this.e[$$1]) << 12 | (long)this.d[$$1]);
      }
   }

   @Override
   public zq<aeu> a() {
      return ags.ao;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<jg, dvd> $$0) {
      jg.a $$1 = new jg.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
