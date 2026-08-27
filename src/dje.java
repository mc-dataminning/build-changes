import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dje implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<djd> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dje(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private djd b(cqg $$0) throws IOException {
      long $$1 = cqg.c($$0.h(), $$0.i());
      djd $$2 = (djd)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((djd)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         djd $$4 = new djd($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public rt a(cqg $$0) throws IOException {
      djd $$1 = this.b($$0);

      rt var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = se.a((DataInput)$$2);
      }

      return var4;
   }

   public void a(cqg $$0, sk $$1) throws IOException {
      djd $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            se.a((DataInput)$$3, $$1, sc.a());
         }
      }
   }

   protected void a(cqg $$0, @Nullable rt $$1) throws IOException {
      djd $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            se.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      asf<IOException> $$0 = new asf<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         djd $$1 = (djd)var2.next();

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
         djd $$0 = (djd)var1.next();
         $$0.a();
      }
   }
}
