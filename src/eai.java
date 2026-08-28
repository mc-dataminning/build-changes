import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class eai implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<eah> c = new Long2ObjectLinkedOpenHashMap();
   private final eak d;
   private final Path e;
   private final boolean f;

   eai(eak $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private eah b(dfn $$0) throws IOException {
      long $$1 = dfn.c($$0.h(), $$0.i());
      eah $$2 = (eah)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((eah)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         eah $$4 = new eah(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public tq a(dfn $$0) throws IOException {
      eah $$1 = this.b($$0);

      tq var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ud.a($$2);
      }

      return var4;
   }

   public void a(dfn $$0, uk $$1) throws IOException {
      eah $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ud.a((DataInput)$$3, $$1, tz.a());
         }
      }
   }

   protected void a(dfn $$0, @Nullable tq $$1) throws IOException {
      eah $$2 = this.b($$0);
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
      ayh<IOException> $$0 = new ayh<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         eah $$1 = (eah)var2.next();

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
         eah $$0 = (eah)var1.next();
         $$0.b();
      }
   }

   public eak b() {
      return this.d;
   }
}
