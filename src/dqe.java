import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dqe implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dqd> c = new Long2ObjectLinkedOpenHashMap();
   private final dqg d;
   private final Path e;
   private final boolean f;

   dqe(dqg $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dqd b(cwg $$0) throws IOException {
      long $$1 = cwg.c($$0.h(), $$0.i());
      dqd $$2 = (dqd)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dqd)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dqd $$4 = new dqd(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ta a(cwg $$0) throws IOException {
      dqd $$1 = this.b($$0);

      ta var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = tn.a($$2);
      }

      return var4;
   }

   public void a(cwg $$0, tu $$1) throws IOException {
      dqd $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            tn.a((DataInput)$$3, $$1, tj.a());
         }
      }
   }

   protected void a(cwg $$0, @Nullable ta $$1) throws IOException {
      dqd $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            tn.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      awd<IOException> $$0 = new awd<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dqd $$1 = (dqd)var2.next();

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
         dqd $$0 = (dqd)var1.next();
         $$0.b();
      }
   }
}
