import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class eah implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<eag> c = new Long2ObjectLinkedOpenHashMap();
   private final eaj d;
   private final Path e;
   private final boolean f;

   eah(eaj $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private eag b(dfm $$0) throws IOException {
      long $$1 = dfm.c($$0.h(), $$0.i());
      eag $$2 = (eag)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((eag)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         eag $$4 = new eag(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public tq a(dfm $$0) throws IOException {
      eag $$1 = this.b($$0);

      tq var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ud.a($$2);
      }

      return var4;
   }

   public void a(dfm $$0, uk $$1) throws IOException {
      eag $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ud.a((DataInput)$$3, $$1, tz.a());
         }
      }
   }

   protected void a(dfm $$0, @Nullable tq $$1) throws IOException {
      eag $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            ud.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayg<IOException> $$0 = new ayg<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         eag $$1 = (eag)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         eag $$0 = (eag)var1.next();
         $$0.b();
      }
   }

   public eaj b() {
      return this.d;
   }
}
